package com.akucera.codeadvent;

import com.akucera.codeadvent.advent01.CaptchaSolver;
import com.akucera.codeadvent.advent02.SpreadsheetChecksum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeAdventApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CodeAdventApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		final CaptchaSolver solver = new CaptchaSolver();
		final String captchaInput = "61697637962276641366442297247367117738114719863473648131982449728688116728695866572989524473392982963976411147683588415878214189996163533584547175794158118148724298832798898333399786561459152644144669959887341481968319172987357989785791366732849932788343772112176614723858474959919713855398876956427631354172668133549845585632211935573662181331613137869866693259374322169811683635325321597242889358147123358117774914653787371368574784376721652181792371635288376729784967526824915192526744935187989571347746222113625577963476141923187534658445615596987614385911513939292257263723518774888174635963254624769684533531443745729344341973746469326838186248448483587477563285867499956446218775232374383433921835993136463383628861115573142854358943291148766299653633195582135934544964657663198387794442443531964615169655243652696782443394639169687847463721585527947839992182415393199964893658322757634675274422993237955354185194868638454891442893935694454324235968155913963282642649968153284626154111478389914316765783434365458352785868895582488312334931317935669453447478936938533669921165437373741448378477391812779971528975478298688754939216421429251727555596481943322266289527996672856387648674166997731342558986575258793261986817177487197512282162964167151259485744835854547513341322647732662443512251886771887651614177679229984271191292374755915457372775856178539965131319568278252326242615151412772254257847413799811417287481321745372879513766235745347872632946776538173667371228977212143996391617974367923439923774388523845589769341351167311398787797583543434725374343611724379399566197432154146881344528319826434554239373666962546271299717743591225567564655511353255197516515213963862383762258959957474789718564758843367325794589886852413314713698911855183778978722558742329429867239261464773646389484318446574375323674136638452173815176732385468675215264736786242866295648997365412637499692817747937982628518926381939279935993712418938567488289246779458432179335139731952167527521377546376518126276";
		System.out.println("Captcha result is:");
		System.out.println(solver.solve(captchaInput));


		final SpreadsheetChecksum checksum = new SpreadsheetChecksum();
		final String spreadsheetInput = "104\t240\t147\t246\t123\t175\t372\t71\t116\t230\t260\t118\t202\t270\t277\t292\n" +
				"740\t755\t135\t205\t429\t822\t844\t90\t828\t115\t440\t805\t526\t91\t519\t373\n" +
				"1630\t991\t1471\t1294\t52\t1566\t50\t1508\t1367\t1489\t55\t547\t342\t512\t323\t51\n" +
				"1356\t178\t1705\t119\t1609\t1409\t245\t292\t1434\t694\t405\t1692\t247\t193\t1482\t1407\n" +
				"2235\t3321\t3647\t212\t1402\t3711\t3641\t1287\t2725\t692\t1235\t3100\t123\t144\t104\t101\n" +
				"1306\t1224\t1238\t186\t751\t734\t1204\t1275\t366\t149\t1114\t166\t1118\t239\t153\t943\n" +
				"132\t1547\t1564\t512\t2643\t2376\t2324\t2159\t1658\t107\t1604\t145\t2407\t131\t2073\t1878\n" +
				"1845\t91\t1662\t108\t92\t1706\t1815\t1797\t1728\t1150\t1576\t83\t97\t547\t1267\t261\n" +
				"78\t558\t419\t435\t565\t107\t638\t173\t93\t580\t338\t52\t633\t256\t377\t73\n" +
				"1143\t3516\t4205\t3523\t148\t401\t3996\t3588\t300\t1117\t2915\t1649\t135\t134\t182\t267\n" +
				"156\t2760\t1816\t2442\t2985\t990\t2598\t1273\t167\t821\t138\t141\t2761\t2399\t1330\t1276\n" +
				"3746\t3979\t2989\t161\t4554\t156\t3359\t173\t3319\t192\t3707\t264\t762\t2672\t4423\t2924\n" +
				"3098\t4309\t4971\t5439\t131\t171\t5544\t595\t154\t571\t4399\t4294\t160\t6201\t4329\t5244\n" +
				"728\t249\t1728\t305\t2407\t239\t691\t2241\t2545\t1543\t55\t2303\t1020\t753\t193\t1638\n" +
				"260\t352\t190\t877\t118\t77\t1065\t1105\t1085\t1032\t71\t87\t851\t56\t1161\t667\n" +
				"1763\t464\t182\t1932\t1209\t640\t545\t931\t1979\t197\t1774\t174\t2074\t1800\t939\t161";

		System.out.println("Spreadsheet result is:");
		System.out.println(checksum.calculateChecksum(spreadsheetInput));
	}
}
