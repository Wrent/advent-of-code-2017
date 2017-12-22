package com.akucera.codeadvent;

import com.akucera.codeadvent.advent01.CaptchaSolver;
import com.akucera.codeadvent.advent02.SpreadsheetChecksum;
import com.akucera.codeadvent.advent03.SpiralData;
import com.akucera.codeadvent.advent04.PassPhraseChecker;
import com.akucera.codeadvent.advent05.RelativeJumper;
import com.akucera.codeadvent.advent06.MemoryBlocks;
import com.akucera.codeadvent.advent07.ProgramTower;
import com.akucera.codeadvent.advent08.RegisterInstructions;
import com.akucera.codeadvent.advent09.GarbageStream;
import com.akucera.codeadvent.advent10.KnotHash;
import com.akucera.codeadvent.advent11.HexagonGrid;
import com.akucera.codeadvent.advent12.PipeCommunication;
import com.akucera.codeadvent.advent13.Firewall;
import com.akucera.codeadvent.advent14.DiskDefragmenter;
import com.akucera.codeadvent.advent15.Generator;
import com.akucera.codeadvent.advent15.Generators;
import com.akucera.codeadvent.advent16.ProgramsDance;
import com.akucera.codeadvent.advent17.SpinLock;
import com.akucera.codeadvent.advent18.Duet;
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
	/*	final CaptchaSolver solver = new CaptchaSolver();
		final String captchaInput = "61697637962276641366442297247367117738114719863473648131982449728688116728695866572989524473392982963976411147683588415878214189996163533584547175794158118148724298832798898333399786561459152644144669959887341481968319172987357989785791366732849932788343772112176614723858474959919713855398876956427631354172668133549845585632211935573662181331613137869866693259374322169811683635325321597242889358147123358117774914653787371368574784376721652181792371635288376729784967526824915192526744935187989571347746222113625577963476141923187534658445615596987614385911513939292257263723518774888174635963254624769684533531443745729344341973746469326838186248448483587477563285867499956446218775232374383433921835993136463383628861115573142854358943291148766299653633195582135934544964657663198387794442443531964615169655243652696782443394639169687847463721585527947839992182415393199964893658322757634675274422993237955354185194868638454891442893935694454324235968155913963282642649968153284626154111478389914316765783434365458352785868895582488312334931317935669453447478936938533669921165437373741448378477391812779971528975478298688754939216421429251727555596481943322266289527996672856387648674166997731342558986575258793261986817177487197512282162964167151259485744835854547513341322647732662443512251886771887651614177679229984271191292374755915457372775856178539965131319568278252326242615151412772254257847413799811417287481321745372879513766235745347872632946776538173667371228977212143996391617974367923439923774388523845589769341351167311398787797583543434725374343611724379399566197432154146881344528319826434554239373666962546271299717743591225567564655511353255197516515213963862383762258959957474789718564758843367325794589886852413314713698911855183778978722558742329429867239261464773646389484318446574375323674136638452173815176732385468675215264736786242866295648997365412637499692817747937982628518926381939279935993712418938567488289246779458432179335139731952167527521377546376518126276";
		System.out.println("Captcha result is:");
		System.out.println(solver.solve(captchaInput));
		System.out.println("Second part of captcha result is:");
		System.out.println(solver.solveHalfWay(captchaInput));


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
		System.out.println("Divisible spreadsheet result is:");
		System.out.println(checksum.calculateDivisibleChecksum(spreadsheetInput));

		final SpiralData spiralData = new SpiralData();
		final int spiralInput = 312051;
		System.out.println("Spiral data result is:");
		System.out.println(spiralData.calculatePath(spiralInput));
		System.out.println("Sum spiral data result is:");
		System.out.println(spiralData.greaterThanSum(spiralInput));

		final String passPhrases = "kvvfl kvvfl olud wjqsqa olud frc\n" +
				"slhm rdfm yxb rsobyt rdfm\n" +
				"pib wzfr xyoakcu zoapeze rtdxt rikc jyeps wdyo hawr xyoakcu hawr\n" +
				"ismtq qwoi kzt ktgzoc gnxblp dzfayil ftfx asscba ionxi dzfayil qwoi\n" +
				"dzuhys kfekxe nvdhdtj hzusdy xzhehgc dhtvdnj oxwlvef\n" +
				"gxg qahl aaipx tkmckn hcsuhy jsudcmy kcefhpn kiasaj tkmckn\n" +
				"roan kqnztj edc zpjwb\n" +
				"yzc roc qrygby rsvts nyijgwr xnpqz\n" +
				"jqgj hhgtw tmychia whkm vvxoq tfbzpe ska ldjmvmo\n" +
				"nyeeg omn geyen ngyee rcjt rjuxh\n" +
				"qpq udci tnp fdfk kffd eyzvmg ufppf wfuodj toamfn tkze jzsb\n" +
				"rrcgxyp rbufd tfjmok vpyhej hcnz ftkojm\n" +
				"jnmomfc jnmomfc bkluz izn ovvm flsch bkluz\n" +
				"odisl hzwv hiasrhi hez ihihsra qpbmi ltwjj iknkwxf nbdtq gbo\n" +
				"gjtszl gjtszl fruo fruo\n" +
				"rdapv gaik cqboix sxnizhh uxmpali jdd usqnz advrp dze\n" +
				"flooz flooz qad tcrq yze bnoijff qpqu vup hyagwll\n" +
				"lnazok dze foi tqwjsk hpx qcql euzpj mwfrk\n" +
				"ilb fmviby ivybmf gtx xtg\n" +
				"rpauuu timere gyg wcolt ireetm safi\n" +
				"croe szwmq bbhd lciird vhcci pdax\n" +
				"hnc ykswt qqqmei goe bri wmyai hnc qpgqc pberqf bzs\n" +
				"hsnrb wdvh iezzrq iezzrq rdbmpta iezzrq kemnptg alkjnp wymmz\n" +
				"ngw don ddvyds nlhkoa aaf gptumum ugtpmmu\n" +
				"vmccke qbpag kvf kvf tgrfghb kvf bhpd sglgx\n" +
				"obomgk bkcgo yso ttft vbw ckl wjgk\n" +
				"fli qvw zhin dfpgfjb udsin nihz ovr tiewo\n" +
				"tgmzmph hauzieo jmg tdbtl lvfr qpaayq qapaqy ausioeu jun piygx\n" +
				"jkp guqrnx asdqmxf vmfvtqb tloqgyo ioix gajowri tmek ilc puhipb\n" +
				"uycn zxqm znft ayal znacus kvcyd ekv qqfpnh\n" +
				"fqghur xtbtdd ztjrylr bpuikb ziyk\n" +
				"rvakn uqbl ozitpdh uqbl dsej xehj\n" +
				"laxp haz jyd xnkrb ijldth woy xapl iqgg alpx gnupa ukptmmh\n" +
				"dyiy dyiy ihb qcyxr\n" +
				"wbwkd hdwu zvgkn hdwu wjc sakwhn zxujdo npllzp uyr uyr\n" +
				"fxczpmn cininu akcxs ggslxr riyxe ojisxe\n" +
				"ppbch sampq dnct afikor dnct edsqy pnzyzmc afikor\n" +
				"jnvygtn hijqjxl vsd jnvygtn nqcqv zns odq gkboxrv kolnq wrvd\n" +
				"mroq mroq flsbu flsbu\n" +
				"fyshor xvpaunj qmktlo xoce wkiyfu ukcl srndc ugwylwm ozcwdw mtqcste kpokr\n" +
				"cfh cxjvx cfh cfh uewshh\n" +
				"bpspbap bpspbap fquj mxmn bwls iirhvuk dmpkyt exrn mxmn\n" +
				"tvyvzk ezszod ntxr xtnr och\n" +
				"knfxhy kbnyl knfxhy xhkssx lxru uprh nkxpbx oodolxr tpvyf\n" +
				"nblmysu iwoffs upgof tyagwf aan vovji ajk ywzq oyfi sfulz\n" +
				"aushzkm lcaeki mkuzsah ynxvte rsntd refk pcm\n" +
				"mgguob gobmug dzenpty gmogbu\n" +
				"yvq eepof rgnree nerger fpb stfrln ernger\n" +
				"hrgkbl mzwvswk rsrsbk ieru holco pajvvn ztgsr qkyp fyeg owpcmoj\n" +
				"fowda gmsqdca yugj mcrroxv mqcbojd fjnqfji qdfsc jqs\n" +
				"qnc rvjfz vvxk sjd xrma ucdjvq sbw zydyt dfzww\n" +
				"ocajazv cozaajv tqunkla udwf ecnnmbz lsakqg bki njnda zsdu ccfqw rxpc\n" +
				"qqm qdfya qxyx qmq qfday uqnfttt\n" +
				"rnbirb iapor qet iapor hxkhz dfvzig pedl ybyb\n" +
				"mkgamxg xkniv meb hbzmxjn dhbj zhbxjmn hdjb\n" +
				"ilteux pyutyfx mau lrr bacak\n" +
				"sjjonmn dbbbgs crxyuu jztstgd ezb uiabyaa\n" +
				"tra fle ufzlvf nnaw kec hiwnnlj tei wld iyt syk hjdczb\n" +
				"qmd jtlud dgh dbanock fzp dsjgqru wwvo jwvxwgv xlemfij jcacd\n" +
				"rpkx oxesil snazcgx fly miiyc ikmtmp oefyyn egbw\n" +
				"ypfpeu wldnyd acchppb yqwcaw wldnyd turbz megci nbgxq xkc ypfpeu\n" +
				"iqqv iqqv neui iqqv\n" +
				"ypsxm icqyup zyetrwq nbisrv\n" +
				"viommi toszx dpueq eyy cunjou ffcjc jaeez djefra pxvkj liudlig yye\n" +
				"fhnacbg jghchh ghjhhc iue hwqmo\n" +
				"vbjw lpn cizba ltnsfpz tzoweml irewlc uzckhpd mszal obd\n" +
				"yeos utxkft hflxkfe fxczge qpgigkc ksgr vuumql vhlvv\n" +
				"xzmkv xzmkv krecdi klpem jsbu nwcmik emfzxf cjmpgnj\n" +
				"vtkjo pmiv zou gxo qdiyxsf hwyinjk jhkgf rjq\n" +
				"dyuoc ywiyvch irfgl ywiyvch fxb fxb\n" +
				"tuz onhr syu rqya abkaf bcfx mbknex juwoor zmksl\n" +
				"oheg spjorx ksdy vwtq fxz phvtazk tcze lrxg\n" +
				"hew lbup botaj ltr jpd\n" +
				"dxgc tzinkej gnz hxvvub adsqmc dxgc asgpp rqbdcra goy pmamdua bhiacva\n" +
				"xqv ygb kihxqz vyv pjcny vmyvsdv cgsi nfyx\n" +
				"tqga ssshrw ndq qlbvwh huyd pxbgj qbxk dkkbf jxy chsobw pph\n" +
				"hxl iwph iwph xnr otifm ljhre\n" +
				"zlgvpd kapxpoc dve rklk ogh hgnp rbrmc zzkz hhmcx aklmo\n" +
				"sar gfor nkf hek nkf aql shc aql\n" +
				"dtcrw kfjzcjx qyhi bldson whwdayo mqtgt xhqzp ttqmg\n" +
				"omspdml isze jdl nvwo qrkm wztfg ssfgyh dryj jhp unsmty\n" +
				"jxt cszylng ifht ixtuna azoi xutqlv jtx tjx\n" +
				"usgm azuayp fgkby ezpyq jqwl ezofj\n" +
				"tnhvil nrvg moyrpqs sldx qymoff megflxh pyhqwms xmdw\n" +
				"zomy zcquwnv lzx bvcna yods mjp dgsez\n" +
				"blklyf xokd gpit tiysj yrwfhm tofx\n" +
				"dtig vhdp omuj vhpd\n" +
				"fogwxim qvdwig emdiv jvhl euwbzkg xvxb hwmqo ujdmlp epmykj\n" +
				"sjxll sjxll pedvgb sjxll\n" +
				"drvay gtzhgtx yrt okz nqf\n" +
				"haxfazn pvkovwb pgu tgshw mxcjf pbe nwoymzc mxcjf pbe hydwy jradcr\n" +
				"prjsloa ahylvj okbsj qbdcdjt pmfo pagyoeg vkmhjzt khzmjvt opfm xfrji gyjqyel\n" +
				"lzypt jdbtrad ogr jdbtrad heink\n" +
				"rcoucuq gdxewa rcoucuq whlw zhhm rcoucuq azaqohe mzyli rdvaf\n" +
				"yuag ebcf yuag nsotg qqzuxr jfmao vyucw wmoye\n" +
				"qwvk xemm hgqrr wyxkpp tojndm xlvzypw jus bgnu bgnu nklfwhs\n" +
				"daqi knenmku ccm xkiuy vkexsbc kvvdagx umopitw yaocnx yoakqql mllmsp\n" +
				"mrxgl gywit mfopia ncnsvw vdxek axuiot rsejua nei prndudz mnu\n" +
				"egqn gaa qgen urs mix zbn rhn\n" +
				"ewharq aihy udkdaob kgrdd kgrdd kugbjtj fcef llqb pduxaq wcexmm\n" +
				"dwtiw nelq hppad algxgf gcc upou akm efnb mxmhrud\n" +
				"yxqaa ups okbhgt iet qns tqn rnjqxgp\n" +
				"npmhdm cgds ldexvr typi jyivoqk zkgq vfyxu xgfo\n" +
				"dkwnmr umm dkwnmr okpjw wqx jpztebl eqsib dkwnmr\n" +
				"dxbild wpbup evscivq dxbild dxbild geqp ojfbpl jshvqej\n" +
				"cxdntxs csfocjd pyy tuhws teb boyloz xfw scxh pxhonky\n" +
				"lteucke xrgwy hszgzu hnyrcvb\n" +
				"pfgsgwg dxzh fworek qbstod\n" +
				"usemcrf psczxu gcjtr brls\n" +
				"hjol efxczux bqdn gvrnpey yyoqse gbam ndzyj lbwb bhzn unsezg\n" +
				"bapw xifz blupk qqdk bofvqpp wnbuwyt rnwocu lzwgtt zucag pov\n" +
				"xkre lqvd juf lqvd xio xyg xyg\n" +
				"tzdao ztheib aymcf aorg iyawrch hetcxa iyawrch czdymc ccv\n" +
				"ucgl azlppu jvxqlj pest\n" +
				"dvwlw fuuy mnhmm okrp ualnqlm uyuznba fzyejk yaq crl ctprp\n" +
				"odfq knox mkbcku pxucmuf lpjpol phl\n" +
				"ixongh hfs ruorbd auy qyssl kykwcix aytsm rlj aytsm duq segpqhk\n" +
				"izufsk wedpzh podjkor eamo vqvev ifnz podjkor xrnuqe\n" +
				"twyfps bmdbgtu qye qkwjms\n" +
				"wlav htym vhsnu cocphsj mdsuq vhsnu jflgmrp\n" +
				"opajag itwjhfu purnnvk opajag\n" +
				"hpkopqp vnj aialpt lzrkzfs nwucez nwuezc\n" +
				"mcx hzcjxq zbxr dsx tpknx fva\n" +
				"rlvgm xrejsvn ghawxb efyos xty wdzdgh olahbtn rga efyos vhtm nsr\n" +
				"cni mbab qtgeiow ulttn rckc kmiaju jvbq emyvpew cdlxldn ulttn brhkprx\n" +
				"eykpffp rapik qki fhjgdyu tome ehjuy bibjk htxd vexvag\n" +
				"wrk dpxt gwkuiov gbkif ike gbkif pcd wpj toywyf qzsa aol\n" +
				"yqwzh uujn ujun ujnu\n" +
				"srs ralwxrz yxvvmgp sjhbhk waasid cqtxoxf whcladv jkmaq khjbsh dlavcwh\n" +
				"mdvsjh xaj etvxlsy fxgiy rgjesel rlegesj ptriz ebdyhkp kugxm dxv egljser\n" +
				"lhehwrs mqevb ygmv gri izop qgb ivm\n" +
				"loqqam alojlwg hgen hbyw qlwpun loqqam worgnwk kope\n" +
				"phozre todsknr todsknr ibj mvllsar\n" +
				"wuripy ruwlfbh wukbkey qhq iishw tvtvci xawvxc vxacwx hsiwi ogq\n" +
				"xryq vxwupqa zhqex aquxpwv bnvxrba dtbxki\n" +
				"yvvwh zvsm vqskhp vqskhp ggqqlw bpn wbuv\n" +
				"kqz tdy goqwge ygn jgd\n" +
				"szjjhdk zkpoo nxexz ebicc\n" +
				"wzuemcj oyd qupulju iaakzmt vzkvz\n" +
				"nppahov umm wpzev wxkgfxd owgekp bhhb bbhh dgviiw kdfgxwx wryb\n" +
				"bnc rhes lmbuhhy kwbefga bnc rtxnvz bnc\n" +
				"ani mggxf mcoixh zdd nai hbhzl mes bdpqr\n" +
				"mjn uinoty jjegvze bjgqg yhqsxbt coj obylb hddude xqi rhfbhha alood\n" +
				"cbjzj drmihy tfkrhsd nuhav hihzx bvblqpl tdd szmp gjgfv box\n" +
				"uumhdxd cmwgyf vepr rwqdkj exwk\n" +
				"hwvr ydvw bqefu kghes gvbhp awms iqsqes khgse\n" +
				"mrey jqfw fwvzhps komj dayvs fbui zmtd cofn mrey\n" +
				"dsjds fdpx irjj usndok qcctsvf fgk wvg txwxcl dxs llp zyilwtq\n" +
				"xmkelgk fdukc cye legkxkm wwly\n" +
				"enlny eynln cccku brkz dpof mwfoxcd yftmnqh wpebvyc\n" +
				"ggdn jnysl dsacffw ukj hdae cmzxku\n" +
				"uqhm gcachmn kxndfrl htmfis jfnajz fiqiypr kekho kekho ndcw ckrndub dejfna\n" +
				"keazuq ertql rauwl keazuq obmh rauwl ksrotm\n" +
				"jppp poigqhv repfsje grjk xwkyuh pkx ayzcj hoxzv\n" +
				"yhjw pcuyad icie icie icie hwcsuy wcd yihjh jnrxs\n" +
				"gaug ivvx ceb xujonak hbtfkeb ttciml cctoz\n" +
				"dggyyi dggyyi gqlyumf yasu fwdfa cbb nncn verhq\n" +
				"rhgcw gpcyct kiuhbg kiuhbg gpcyct jlmleo nhumm\n" +
				"wulxxu jyjek hclcp ogob viex wiqcupq\n" +
				"tthu nxgzpid kcnj mss ukapgkp nnc bxjocv qwxs oejwsif aywqtu brahkb\n" +
				"dtde bgvb smu vbbg zhlu\n" +
				"lyo nwjjmep ldbok wgxhto wwuh qfgjknk wnsl\n" +
				"lleyr onha hkwulbm jfg\n" +
				"bybjwd uoxvbh mvj iqfpnxs bybjwd zqtszp wvc lbazjr zkzenja cev\n" +
				"rbuyyr divtslq yuqmyt ajyveb smxsjb nlk tzqhq ims fewg wpjhr gqh\n" +
				"kpewfd beq klilis klisli eeezut\n" +
				"euqh hueq ldoo crqurv lvrwh tmaewp oodl\n" +
				"bqi lzrf jyhvxfh bqi jyhvxfh nbztd lwpdn cuzi\n" +
				"srjylou phavzjd wost uxkaq byh sluryoj\n" +
				"ihrdk bcegkpq nygrs qbcq wyjg dvzme pgzhjl vibg kvv\n" +
				"ijsx iedemek ktlz gtga tbal lbki gtga\n" +
				"vmiaxn kefig kefig vngxz\n" +
				"vrdmfvi qts vlvhq vlvhq dihmq\n" +
				"cfz dyrz zlw qnt vok fwvahg skshbqf hbwozdc ntana jdb uflp\n" +
				"rimbj bxemw sfps krtk umta vnk ewmbx nrlje ymrtqrz mxewb kjxunbt\n" +
				"egnuti ozat eltl ngueti\n" +
				"qtcwoxq rmaf qtcwoxq qtcwoxq\n" +
				"zws gcoa pydruw qsrk lrkybdf ugr wkrxoj nyvf vitwn\n" +
				"tmr hhd dojid zwrj bhsim righ keqlep flzunou\n" +
				"lwoquvy acjowxk tqudk oenvioh nyavyl\n" +
				"rgh dfhgyke iff cpxhuz hui koe iff hui dmukrei\n" +
				"bjiumig lcbmbgh vleipx sfawua rnf\n" +
				"gftfh qwb tfdroe xbno qhgofm vqfoe mux\n" +
				"ljdrr gyfggai iun nju xrucbis mhrcrh fukr obvuqc whlalfe xrucbis nju\n" +
				"nxjmjr egqwg arllu xqaahri lzc ivt uhsti\n" +
				"sqiepba rcmts kvesv nvp\n" +
				"tiksw tiksw rjni gbhvzm ctbq zuqfyvz\n" +
				"ibsnm kfka aoqigwo sqouih rxz\n" +
				"jmymq lxio adtmk umyu sxvzquq bporqnb heol fow\n" +
				"mepa eckq rqviawv dkqoei ifmngpp jiava rtklseu\n" +
				"yuycd jiufjci yuycd uowg yuycd udq izkicbr csxobh\n" +
				"nwu tfsjavb rruoxbn oepcov elxf rruoxbn rruoxbn azglwth jcjm ksqiqpv\n" +
				"dthfwip zqnwa zqnwa zqnwa\n" +
				"gso wruece ufl crgnlxv vllsm dpyfm wpa ctxko\n" +
				"wvpze seodz lpq lpq pmtp wsxs ffppx\n" +
				"yfxquj phvjn rtwieq rtwieq kgxztyu vbjvkc prqqd lyzmdo ojbrt ojbrt qiqjz\n" +
				"esaezr rpggiy jey kbzrhu uthus osr xxaiijd qfxlf auhzbx gkigoqw\n" +
				"yfhcj uvgck cds gjhhrg cmempgj yfhcj cjb\n" +
				"yxi voxvtuw unwg jqqm\n" +
				"igvjr ljz rus sru gbjtjt qfeg ztu zjl\n" +
				"leof ocxns hbkoysh hbkoysh leof\n" +
				"hab lyxmf yhh qeks fwhfxki xmbcak okqjii nfgzyg bhtfgdj lpmjn\n" +
				"mgognh tad herere lvwnzx ixwqs zphmuuc etdjz kczsf\n" +
				"mtej rlolsnn zbl uykek dpkan gmz etxtgj\n" +
				"mihuieo emjgbp jgks mihuieo iexrfw mjdnr bvp mcuzea xkbusvi\n" +
				"jvqpj bwt jvqpj bwt gxr\n" +
				"qpnd fpt tpor bibbpcg hmvguez wqc afl ckviua gpi\n" +
				"dntmcg jglm sxtnu sxtnu sxtnu\n" +
				"fzkbptw cbfwo ozvwov wbv gcdd izqo ovwzov lolewo xikqpw\n" +
				"nkxyxzd kpn datf fki werq mwidqx oiibor zizcjph\n" +
				"xvgyxym zor ijoy lvwsf fjuara idvvq rreit mqyyy ctio tzwqqhj rnpee\n" +
				"maqkfpk maqkfpk xukg sfdmnlg xjopvr xjopvr irf\n" +
				"liujcd vnlkouy dxkwc gto vhjvtw\n" +
				"swhqhj cas aupsd swhqhj cas bvbooii jquck dtdm\n" +
				"igh iqicicf ghi pcxt srcrjx gmf gyscphv\n" +
				"drplj drplj wopgpnk wytag wopgpnk\n" +
				"zexe ilcqoh qiefb txkuv lirfzv\n" +
				"ovvpn ovvpn uqeurqx uwzn hgmucj ovvpn sjxulms\n" +
				"rox silka irhsvym kutus otasof tdneav pcagds\n" +
				"mkja omu tyshbfq onp trxs lxa tftbv bnpl djhnc zdqfs muo\n" +
				"tjj rmmqas cbbkxs qio pikk ykyew gxlxt nhsyl ykyew\n" +
				"frcprg njrz oaxcmhc qben pedm ecvtga nzxwpb ior gaklot dpem\n" +
				"zyt kncau spoe qlchg sqys wkpbng yflju qlchg vkve bzadbpa\n" +
				"qtq pkaicl qtq mfkfqvr dnleiq brrjxsx uoyxh pkaicl yvmlug\n" +
				"firwy imtlp ywl qfa dqrbazz ztzb pcsbwhn zesmlag\n" +
				"ivey ivey mtvc mtvc\n" +
				"lhize acwf moa cdeoazd voktshy qmvqq jvmuvk ljfmq tsanygc\n" +
				"xreiqkc aawrovl pofcsg xreiqkc xreiqkc\n" +
				"cjbzvn ozds iniqu sdoz gqmki bablvll krs vjzcbn\n" +
				"izsod htkeqz entxn qtns prpcwu omfnmoy\n" +
				"kwfb tctzda aztctd tadtcz gyt wunbcub ydiwdin xxk\n" +
				"epnl ijcp giq ltfk zjcabve zfksmz epnl giq xxxbsom\n" +
				"ulyukpa mdjsbn dydko uhkdt qms aaaj hustlwu\n" +
				"zlsbu ohx jcwovf egf zlvpqgx qhejm wrywdmw\n" +
				"uhxqrzr mmu kjxcalj unuohiq rri yzngnb ikvlxry mfiym qbksdx\n" +
				"khqciz som yklmm jceb khqciz jspy jceb\n" +
				"ncwggv njvi nqox krtsn lnm\n" +
				"bgtqme xaxcoq qbtgme obqual vorfk baoqul lgrb\n" +
				"jli tsbb nlxjc pkwzmz dlxrj hmho gzguko ilj iyaasm\n" +
				"wlmw grkumg dynwtyo emxhhqr huluk slpqu uhqcmd absmr ufirmwr\n" +
				"pbs pcammxv dplfr tzvmav nccyy blvyq ffhnz bccutq\n" +
				"hgge ghge vxmvz hqxgjdg zab guo gheg\n" +
				"ylj bucoyoq udndc wpgyrbx ueh udndc gxdsdh hdoz wwgqlg\n" +
				"cjdeh gttyqe kdkm ltzd lfeozse quvjq mnwhokm kdv oojxm nxt\n" +
				"mfkzus knqxt saxkqww njx zumsfk sbmcyad cpt agvbuv\n" +
				"tukn vyco yobvsn bzgnn klrnzy kea thzk pxpwq ryfff nxzm\n" +
				"ylbm lxlz lybm lzxl\n" +
				"wgtxoij zad slgsi cvnxfg iomswwl vmx\n" +
				"hkm yinhnkj kmh kwkw kayknck chur styjif yknakck\n" +
				"rtfwhkq rtfwhkq zsf zsf\n" +
				"sldq zlntr ueegiw kajivqc ozcbm ceft snvugom pdyc elppeed nnqrp prwwf\n" +
				"lhk xjonc muc tudag tsafx mmivb dvrjbp qgrew\n" +
				"hnzer fbgqp aazta aazta lxaz lmgv aazta\n" +
				"victgxu victgxu mlpd ummrnbx cazjgnw isxcyp efy zfa cyusj\n" +
				"gyojxo onzq gyojxo uxufp awi ilhl wefwfxr gcjlt tmliynw uxufp pdcnxah\n" +
				"wjwachn xkuhfbp oky oky ybaeqkr rbuix yreoaw wepmye brvon aasb\n" +
				"kiidorw vxtxiqx wtqvbrv efdth isel qbom vcssyc vxtxiqx wtqvbrv riafzsw mqzsj\n" +
				"eurpjd vkhdamt tmfx czeoot hiz ykz lmixzq tfur jhzr\n" +
				"ipuftpj qbll sqkkdw fwncmiv bri oeeh lehd ioh wag\n" +
				"suima nanngc imrmc krq atxdo woy atxdo akev qlr aezco qlr\n" +
				"cfc efwbzck ozkmcxv moczkvx ccf\n" +
				"bnekky iakrk sask uwgnjp iyi rynev bdnas ldh kass\n" +
				"sicmw vvjbvv cap nsumc xgvrlm wsoo uoqdu psykckm\n" +
				"ugg mtr wnzhmmh tjxc ehwnji lwhu mdsckk yvmk enubrqo\n" +
				"grb oxmxz ohu ytetedv ssx apzlppg fdkamm sxofc jdt ynmu wyejok\n" +
				"umoep rbyqm eqfk twqnog cptbbi dragna ngqs ffb cexxnc rbyqm\n" +
				"utizi ormkel wvwur bdx ecelqbv xiccama aag glfvmj\n" +
				"znb rsuqoa uxo svc\n" +
				"obs lbifa cffi catpd\n" +
				"qkxwian ajlzjz wewduzp bbyv qmt fsr qgiu epinp ghmf\n" +
				"hatg bfgmb aght ghat\n" +
				"kuq inp dun cknbun wmwsu drlmmg kyxc bdl\n" +
				"bddybth swdbf jhi fva qpobio bjwm wjaztp jywi\n" +
				"mgckz vhveu zkemhp zdf xtiqqew mlx wazgd\n" +
				"umbjq pya lvvxf jeavij rhrxvew bwjqgpr piz\n" +
				"xaycpwo vjcuc qksc yuixhni sfbfb dydyaq gdfvb tggg xidphvf bpjdrl goskxym\n" +
				"agxfoip gguif wvo agxfoip ntkbaw fbyggy ooft zxih\n" +
				"nzvsu ffwq uxvfbl qrql olhmhom qhdltg ymwz krtndtx olhmhom nfsv krtndtx\n" +
				"qdp jqk ustz xjripzv mnk grnodk pjwdsj uug zqxjqj\n" +
				"mufrcox zunisfs ocvcge acamm xua vor bsde kxr vor kxr orccxx\n" +
				"ncycbp anvcxay bmm wndmeaw oso knmk mmb wamenwd kmkv ppdd\n" +
				"motdcn xzagzwu vuzt utffrn yuqxzrh uvzt ujttq\n" +
				"tauoqy coiy ybesz tauoqy wpmr trquyne ahxbj jzhems dsdy\n" +
				"aczq ypw pgmzz srfn quatjgf\n" +
				"cih ypapk bfxvr euvhkk gugru auhqui\n" +
				"vyf pssgfvy dnhvbfl xpacme dnhvbfl mzdv iynq hcqu\n" +
				"lbzvbu hhxiq hdfyiiz iyzihfd xhqih uzdqyxr\n" +
				"iapbdll vdr cprmrkk vdr dfjqse mlry flpqk vdr\n" +
				"grrfkq xcpxd grrfkq dxc bjpr prvwh swoc swoc\n" +
				"bopo chvwuhf qhd ieesl xey ieesl fnjcbe\n" +
				"kic fyq hsucnu agwyl pzzmd hqksh psw\n" +
				"mxf uau iti lcoz lpg zbu ocre wqlocmh mxf nidqj lcoz\n" +
				"bypmix ptzxgmf xmtzgpf hrvzzq\n" +
				"lbfw zwusma lbfw tuyyy\n" +
				"lrf uej unswvh obgsb npbl zajr kenea uej qnyjcu wzufim qpzkgya\n" +
				"qcrxj llyu kligt hlm ehwtbx dda lgsvhdt xewfcv uikn\n" +
				"nfzjx izqdbq mfbxs imiuc yqxb xlmvix izqdbq eflqfq wku omgtuu izqdbq\n" +
				"lasdwg hiy btzt eefd eyoep icn nnmhg otml rek luixac nyzgn\n" +
				"vekteds utsuxdx utsuxdx vekteds\n" +
				"feyov qrij zbebwg ijrq seplram wttkwm zewbgb kzuhuh\n" +
				"dmkgtv wohgqo ddtqmv zatahx mym hqowog tkmvdg\n" +
				"vhha wjrmuyx kqh vyyrj xzchbi ejsdq orlxg vyyrj dlrc\n" +
				"yetngqn zdtuqox hkarjei fqpsgh eaqwbg zsssog ghb gddqqzr hbg\n" +
				"obldb zsrhz zxp uxphnev mwnbc pfjft fms xwslk vjm fxy\n" +
				"nfij dbfykv ttq gyjgac igxuyqi gtiioqx ilhdex dbfykv uyp bdiwya gqf\n" +
				"pffzruz vogfosh dcs wje\n" +
				"pohhf fhpoh oon yyz\n" +
				"xxuam afwm qxl lnt syyr bwxhhf sozauq shlhfmz kwnn milav ochq\n" +
				"wefcqrt gejw cwerqtf fttf gjew\n" +
				"jfsvnmr osca epwtle pgfif sxom\n" +
				"exlfzmq nakp rgdnx rrcvth vhrrct aajjdrt ryyg dsozd jdqlqj pakn iruv\n" +
				"rmcvo txszcs xxhyxz hbsozk wshkocf rmcvo rcbnt\n" +
				"kitz yjgney yvkymef nauj hmllsgl kyhm kqr pzsu rcf pzsu qpte\n" +
				"cdinpx bfur mkj naz ihkheyr nohhoe\n" +
				"ylris xeqcgup wap bbfih tgfoj\n" +
				"ina gnlnm zyeqhij cudfuf ipufae bvkdzni aat teqsg cudfuf bjokrbl teqsg\n" +
				"aedx edax dnfwq qndwf\n" +
				"rdngdy jde wvgkhto bdvngf mdup eskuvg ezli opibo mppoc mdup zrasc\n" +
				"qcnc iaw grjfsxe gnf gnf\n" +
				"zbjm snznt zelswrk gkhlnx dqxqn qqxnd dmro\n" +
				"zisecvx ztezof uzbq otnrtj qsjzkwm ewvcp rlir bfghlq tgapdr qxmr\n" +
				"ipnqj opjf vabyoe wkwnd\n" +
				"wyf mfqxnrf apm snarf jqu aaghx pwecbv lvghayg\n" +
				"acncv jmmbwlg oiphlm ifuo cvt\n" +
				"pvmb egansnd zmh gcuzzci rrxpslv ubith\n" +
				"uoleptg xbouzn xbmg cfh cpn wpqi xbouzn xtxis sxzpns\n" +
				"rilybri kurbpq vfmjpck tjyogho hfyxad svfofx lfbbhxj khaerfs iqr\n" +
				"seaebgz wlmtkre qguv qguv wlmtkre\n" +
				"sgo edkxya zdqgwtt gxu nibuu rairqoq mzxli dci qsv\n" +
				"tsol mdhzqr rmaqnru ggvcq arbwkn hlkcnj ljkcuof\n" +
				"mmliphp ocup puoc eijjv\n" +
				"gmajqpb ijki ijki kvz\n" +
				"pmqss unhlpcj dlkll nuhlcjp expe tlurzmv nsy vlumtzr tgseozl\n" +
				"gkvaoni hsba hsba viuedv phyoclp fdq phyoclp febld nqfs\n" +
				"rxvdtw abn pntv qrqfzz slsvv abn lrxix mnu npot\n" +
				"ghlfjp woy xwkbmv bkahpkj jve cncvk jvdype fwgvoju yrkwjp gwfvln mvkv\n" +
				"kmluh mie bby fwer chsinb ojglqr nqk mie\n" +
				"yzmiu igkgca ybnsqja jpfejtp yjddy xsosxfi ingx qwuhb emrkwpx idqjmmm\n" +
				"btrllw mphm dkvo ewdl dchcul yah btrllw kmqi mtvgk wtb\n" +
				"hxsgard yuikc lykt tdee adprp gpougod klnzk mzsmlb\n" +
				"hdn znblw ifoblur bwzln dbv\n" +
				"smofpbs vjuyiro llk lfzesga tybu tybu\n" +
				"gffnpug xaup iqiyz fjkpnkz drrk fwyxw lwzfskz gslwpmv vjxylva tbkyo nib\n" +
				"evydmb nhwuiiu fkerq nkgbuyy uclrs ydjgglh xhotwbm riirgzt\n" +
				"bsub eavbt uvd dpzwyt rhn khrbptt xszckc djnfxju axofhat powmso nvdffrv\n" +
				"xtuykl fjz mbikc xpnx hmey fjz fjz\n" +
				"rkls nwdcsyx rkls rkls\n" +
				"tygml untequ ybdfumz nqffbq uipc sove hfnqj\n" +
				"ytecew vven koqn royynd qsn ksl qsn sdw\n" +
				"hknlw qwho whoq oqwh\n" +
				"lzmmtqu qvhyeo cnofuj utpwkjz gnirz yhhu aodbnd\n" +
				"zsr axw kwtzcv tydzo kwtzcv lkxsm\n" +
				"rbjtqe nihifd gvdxd bpxzy rxteky vgcgllv vbbua anygiup rqo\n" +
				"dpd wblfwp wblfwp wblfwp ygahc tqjbaq\n" +
				"gsw gsw pacgj xmrcz zmxhmch xmrcz\n" +
				"pdq rhe xqmq lgpkhg fyffrot ovnqh wle\n" +
				"tbjavke ypzzrj jizx gdxoh icjsat otfh fmygumv\n" +
				"snch nxlgjgp jeyn sxoqfj jtage jtage iuice\n" +
				"rtb coefuj grwg grwg rtb krhqnma vfhgbr\n" +
				"vhegtl btorwxg szcev kbvkx itsk nlzpbed\n" +
				"hiukrf ilzkm yllhh xsgwkdp zyy kjbv\n" +
				"rfcg tdorci zcj wzftlv rfcg rfcg\n" +
				"lgbc lzizat vsno pau nvv vsno bbr lzizat qhtb gwp\n" +
				"sfwnio tcugjk bsfsz ykyfwg ibkap fsrvy mygk kzunawx zyhyh\n" +
				"mpavlh qps bylh lttjkz rqabgk vewb bwev tlzkjt gzrbxga ktmso prpkj\n" +
				"gpf ims ynh ffrs vpa iemp gofh cgbauje\n" +
				"secys qks mcnfhwh drog kqs pajy zoltkw lfihnb myb ioxptu\n" +
				"ytq nrta ouk ajqblf yuwwcd zdy blyoxbw dakk nvgi bzrhzaa\n" +
				"nkoych sufiia xkdvw crtldee zycl qblab egqhr qblab\n" +
				"nllno muxaf vds qjnitmw zkpj wskyhft kmqct xamuzpw qcai cdjtbt kaxv\n" +
				"qzdytpe osr fuw osr qzdytpe whperd rydwdcl knoa\n" +
				"zkdznhd peh duoygr zamrgl irnvj otpe pltpq jdkecg\n" +
				"byzgw rece iigdug ehif tpgje\n" +
				"ccnn foqdran gbctca tefdjxh ntcr rjciii xip xlss crl wvvhzqm twyohf\n" +
				"dqyii milqqc qjgkojp qjgkojp ryde\n" +
				"tdkyj tbrcud tsba vqtmb cjwxnf\n" +
				"hqhmq wemvrce nagig pwnw nagig epg nagig vlsi\n" +
				"tqgvw luoplw hccti npjm rytdruq cylrsun rytdruq vjsbjl rytdruq ppti\n" +
				"itgt tuwc itgt rvp itgt tigns eipl ksmru\n" +
				"pdw wdhtkn nbdbpn wff zhuuipg rvemv qxr\n" +
				"qgkwdq cjilayh ymeks mrpuzai dwgs stfstgz ucvqhb yout oiq\n" +
				"vpxik ypfr qytimvu qms oxbmw ppyfx\n" +
				"fwwidn gdhd pyuexk snsz iwndfw\n" +
				"lfcb sllxjna lfcb hpzahfg mmvgaa svny jhuzd\n" +
				"unyg gicmzd fwc spkciy toyq wjupckd vzzx iuqgka ytqycb pxsufj\n" +
				"goj tnrcml eyizngj txa xrkiw zvu igduz\n" +
				"wek xrrlkna clyof rrlnxak\n" +
				"cjm rmyuku vjom gtf\n" +
				"buk cfae awstd dywgqp hxo wcxvf laihqw xdqfes wdbh qceh uzlwj\n" +
				"sudguo dxwplto rlebdh bkamu dxwplto\n" +
				"crwkyxm yuz kjtdhom crwkyxm\n" +
				"trhc sduorxr aizfryh rsudxor gbyc\n" +
				"pczkyl bptp qnn nxmpwsx udrg hhlb rubtrmx twzodlp xygnht\n" +
				"jmqct cden yfajtkz fevcw sxonbxz sxonbxz qkzkm hhngr fbv\n" +
				"sdsnm mwvicr wypfi cty ndbowr woiz mrauwzd qlno mwvicr\n" +
				"vteyo fng lvr lxytn txpj milg\n" +
				"wjx ahtmgo cgwcaj kaxae fhlvlqf\n" +
				"ezj eetqhzu upwda iiefwlk vyvby\n" +
				"imalvy yeghqe jwcu mvrod cwju\n" +
				"bxnmsa yhfu npsdar tsbri hfuy sirbt oofxmy\n" +
				"fkndt elbjtn vepqtxt elvpf fpelv bzkgag qttexpv prblwb\n" +
				"rmq iqs yvprnyy iezqrzm wlqsrr\n" +
				"yviovq lekxghj oey qwhzj lxknxw qiyovv ksnt jptz\n" +
				"tyrg cifxt hugqf tyrg ffuiv jmax qyw fozfosq ffuiv\n" +
				"nmg rsl jpzazd qbtlf yxqtsj czwmdfd bamge lbjdof uqy jssc\n" +
				"cbx boozjip pwgvzlq rjz kxy kxy hszacok fvsq jhnir cnsba gafz\n" +
				"sbcuxb wfur nnnfqjj fdwg huhe sbcuxb\n" +
				"icwk qelbxs uevp qped zsnhh wpuok wddxsln ftnzupr ruxol cgxjb jbhh\n" +
				"izcp htykj xxmndoq amnspe htykj\n" +
				"vverol oixwlny vqd tvfzu henc gnyrwr\n" +
				"ytxio etytsx choynep zqapo hfjit\n" +
				"lkvgr oyzfa taiqr jok djatvy ckif tmdw oyzfa zroy\n" +
				"jlgpyp kkqysg oqjki hjohoug hbhta muilz zft\n" +
				"sumfyu wftcu bwwdcy lezimwa qwvxv zwh mqyv bmfot aii torcol rnt\n" +
				"tpdj xrw ccsbnh fhptv fwkxjfm dmqaokd bjci\n" +
				"zxi vmf vmf dpyg\n" +
				"sfzxysw lcms bkojtv bkojtv\n" +
				"opywo qll ipkitr mtwp tudrr svhyp huz bxsdpn xomfy\n" +
				"gkod luo qrosbp orbd rpsjzyd rlh gdok tze\n" +
				"nusiuq nusiuq zeys ahufexc\n" +
				"veno jntg avtmtdn qojxru zegdcql odfcetz pgehau\n" +
				"uqun vigjm ykac ozlelj danmji bibugox\n" +
				"rpuozh ajwru rbvuevv uhzsq\n" +
				"iawoe tyb aewio ymf byt inijv ctu fcys micsgzl pbby alt\n" +
				"gktyxp ris mqpfm bkqsfl nrg idbbcxg jhcf\n" +
				"qibt invvv qibt luitx rnm eby hrfbmwl wnap sgkzvb qlwc hrfbmwl\n" +
				"jwkv qecsjbw lycgldd wjvk tjcp dycldgl pzrvr zrlcf kji\n" +
				"nzsrmiq nmhse ilivrk kqv\n" +
				"besmyzi imkgpt iekbjax abxeijk uvzs wwv\n" +
				"jdocl uki ltswp tjkljc ymce iuepze qygqxzs tei lkry\n" +
				"hhyfy gvzd mqksxlq czn afe mesnag eep frwgekg mqksxlq phpy\n" +
				"ehg connnza ekt ddgokw\n" +
				"mpbsoms uzhzl xevww ztt uzhzl\n" +
				"lftybr firc awsud dsxdkk ltf ipjv dtx lcymth\n" +
				"vkcpb gxtxq yioeq fexj xxgqt\n" +
				"srvca fslnnvf nfmkpvt egw wemumq jie vznf dzsjw cukf kcvyir\n" +
				"yxjkl lyjkx jyxlk kgc xtz\n" +
				"tpoe xzov csp leleoqo noyre tdhf cyib sjgtdx raehdw nmcxp\n" +
				"qvt uhznqe bpvos vtq ddlebtd tqv\n" +
				"xlw utsxs gpia rvlvnts elkxr dddihy tnrslvv ibf wlx bxg\n" +
				"cwqnnrt rkkqyf dye yde fzl pthanj\n" +
				"boc rqjenpp xjqte jteqx pvoofc pidqe ruoucy gvnro ognrv\n" +
				"qhalb gnazwc fhl iuti\n" +
				"clnbjfo nnfs nnfs heymvr oarew oarew nxu\n" +
				"lwtrotg hiaxwj ymzbly nvhzjhj zlsaheg nvhzjhj ymzbly\n" +
				"rrvi tsjp tsjp tsjp killji\n" +
				"rpx hiclj cmwq ibhj nfd\n" +
				"pvwymn iebkd xmpw vuhhkap ksw zigzy mzzyyxy rmuh iwwhea cglfq\n" +
				"rlwelgy sffml jin qsdzro xlsty mgqzuu etxjuo emzd jgnoyq tkjuy vfvb\n" +
				"tkctdj hhkuc viskmy obw\n" +
				"zvjkuj akeky ikj jqd hfhzbwe bkc\n" +
				"btev nrdo hcyiuph stf qharfg vpmel mpfz nvs ytgbbc\n" +
				"ieepn ndueuw svmdr tcvumw mceyrn mrjwhyl tbdj mgrgvz\n" +
				"uxrs ckyi xpmqm czzrkl cjp\n" +
				"nlliwd wrqkrkz yjmng nlliwd zirde hcjjn wco ysf mgl\n" +
				"dxti lcahe ommare izlwf ramsfb nzgfvo ijvm fwymrdu bndq\n" +
				"isxy jpvuzu tdduyhw dixp cfa fkzbteg ytoi kepk ysf yqcpi\n" +
				"qmeprfj soqo ncgeor cqsuuj grzy wogxy vyblnbg slvtry vdols kka\n" +
				"ltykfp gtzl olrp gxend vapee deq\n" +
				"emywfbn dbfiut rkt wvwe dbfiut bwffhea yuzcxv gogpicp wvwe\n" +
				"vqvmrp ofbk dlfabd jwllzxk obx vqpwjj umvng tqwis fstxy fstxy\n" +
				"miha zgvyux rmraszo xwf\n" +
				"kjaagk btm kjaagk wkewjrg kjaagk\n" +
				"lbmli aizs omrdr gzktnx asiz ptanzpa xlo ljre ckyb wob\n" +
				"svz dlk rijagg avxmg fkzwhk uro gegm\n" +
				"dzplum temdw jqnm tvxcww bmg tftttpp deuw comxey xfimzjx caluczi nqn\n" +
				"uwvhxa ztkd nlsdyt vihl julkwwv uzch dwakhs\n" +
				"wkhuihh ycrc cxff vzcfhpp uegfd gaok kcnvz lhzogq lwa tyrypvu\n" +
				"idp zmrrzp zmrrzp nktp xsnx rjsxn\n" +
				"eybrnib ivgntl vaxsbpi eybrnib\n" +
				"nzvnq xvbfa pbhwwh ylju runvsj imlx vztesn\n" +
				"nfdohd nfdohd gtevnky pivjyct ihvd fzcsrq lko fmqk\n" +
				"kwpkks ecikxu bcxswlt qvrxm sbcqmh\n" +
				"kdjrmj piuh kdjrmj vnaf gyedkg vptxgm xezssxx zsg qjzpo zsg\n" +
				"oqo sley aqx qmpqb fgmylbj egd zivj kepxizv kuakyn lunbnd\n" +
				"hmcf hmcf xlhgc hmcf cdlm buofnx\n" +
				"onjcj yluonz kzmk phqo phqo phqo\n" +
				"ohaafy efl bnkkjww wwjnyoj dxeaig ywnjjwo slk hrbebw ohlyju elf\n" +
				"msohiqz aunk njki bfktdgi htmyrj mgx\n" +
				"numlzrl rmnlulz glb ltt fhbajz gqxpu\n" +
				"gko hco oai ryq xwy sdqosft spjkiu cxfhg ycwpglh noy rah\n" +
				"btzpjem brpk vqr atxu rhlh rqv jmg fvyus\n" +
				"phmxxgj ejx xje qtk hsb kqt npwj gqt\n" +
				"hujyjp nwmsd ant zipuya lrkahww uwqal vzlo qmbo twkjkse ufivi\n" +
				"zfbnyz fwvh xrnrw usn zin daq iwjzj\n" +
				"yykyg iwypfy hehqnl cjvk cevdrec\n" +
				"gui muuto wsta glqmx gfo rdmbv mxwz gffzt eejpw gion\n" +
				"lpng nduid iqbpu nduid knrqd\n" +
				"xwxn oefpckv gjaua ugaaj gjuaa\n" +
				"qxk aeql trqdmqc crzlinj crzlinj trqdmqc rijcne ewyf\n" +
				"rfv qmbe fvr bmeq\n" +
				"upqyfw lowzq wpen upqyfw gfskbil sljuzh wpen\n" +
				"bdcara qyhx rtaez qyq gbyr\n" +
				"evzls qxtxq clzd svbgqi zxlzgss vtrre fko eebo qjyl\n" +
				"zaapeo kpwhz tygknau nyd pch trp xqe\n" +
				"ypzcafg rnqmbh qtteg sncu ssojhhm zonfym thir xmgheb wqj gpjg ssojhhm\n" +
				"wvcwyn xrf muozyya lasdp xpjgu kpqv zkiihiv ifje cbdlavg xbied hfnaa\n" +
				"qqqb rettz rycukl ihpkhh\n" +
				"dnxzxqv znb znb fbxj azxtezb xvxa\n" +
				"peqkd xlzqkov esgnw ucku hrwpfxd xtd vnig vlmfp ajte qswr kqoj\n" +
				"dpwy oavzkk dwyp ehij upqxgii pydw\n" +
				"amfc hfv xmqa nqvn cal rqmcq oej amqx cla ntxj\n" +
				"hqhhe qkbhwli wmhlcq xaczs peywuo\n" +
				"vcr xfv xfv kymo qpszwzo xfv\n" +
				"nmrbur tswo xbo ljlrzo bmhpgc pev zovkznz lok wbbhtkk\n" +
				"tojj lxqgr rhjavrm ndsdup gdbjwaq cqpnl wfaxivl rfry ryfr udspnd\n" +
				"beffod sknlph amb feobdf\n" +
				"mldgn jxovw yuawcvz kzgzwht rxqhzev fsdnvu vluuo eycoh cugf qjugo\n" +
				"tlnd qcxj ker fdir cgkpo nrqhyq raef uqadf iahy rxx\n" +
				"mhvisju lhmdbs tcxied xeidtc ujry cditex gvqpqm\n" +
				"cgc jazrp crgnna uvuokl uvuokl uoiwl sknmc sknmc\n" +
				"rvbu czwpdit vmlihg spz lfaxxev zslfuto oog dvoksub";
		final PassPhraseChecker checker = new PassPhraseChecker();
		System.out.println("Pass phrase checker result is:");
		System.out.println(checker.checkNumberOfValidPassPhrases(passPhrases));
		System.out.println("Second part result is");
		System.out.println(checker.checkNumberOfNonAnagrams(passPhrases));

		final String jumpsInput = "2\n" +
				"1\n" +
				"2\n" +
				"-2\n" +
				"0\n" +
				"0\n" +
				"-5\n" +
				"0\n" +
				"-3\n" +
				"-5\n" +
				"-8\n" +
				"-2\n" +
				"-1\n" +
				"-2\n" +
				"-1\n" +
				"-9\n" +
				"-10\n" +
				"1\n" +
				"-11\n" +
				"-5\n" +
				"-9\n" +
				"-7\n" +
				"-13\n" +
				"-19\n" +
				"-22\n" +
				"1\n" +
				"0\n" +
				"-3\n" +
				"2\n" +
				"-9\n" +
				"-4\n" +
				"-5\n" +
				"-15\n" +
				"-13\n" +
				"-30\n" +
				"-21\n" +
				"-4\n" +
				"0\n" +
				"-34\n" +
				"0\n" +
				"-31\n" +
				"0\n" +
				"-29\n" +
				"-42\n" +
				"-1\n" +
				"2\n" +
				"-24\n" +
				"-16\n" +
				"-16\n" +
				"-12\n" +
				"-22\n" +
				"-37\n" +
				"-16\n" +
				"-34\n" +
				"-46\n" +
				"-12\n" +
				"-53\n" +
				"-12\n" +
				"-23\n" +
				"-44\n" +
				"-1\n" +
				"-29\n" +
				"-9\n" +
				"-52\n" +
				"-17\n" +
				"-30\n" +
				"-60\n" +
				"-5\n" +
				"-29\n" +
				"-26\n" +
				"-48\n" +
				"-55\n" +
				"-10\n" +
				"0\n" +
				"-50\n" +
				"-1\n" +
				"-8\n" +
				"2\n" +
				"-37\n" +
				"-74\n" +
				"-63\n" +
				"-39\n" +
				"-7\n" +
				"-81\n" +
				"-33\n" +
				"-62\n" +
				"-59\n" +
				"-20\n" +
				"-58\n" +
				"-54\n" +
				"-23\n" +
				"-19\n" +
				"-80\n" +
				"-39\n" +
				"0\n" +
				"0\n" +
				"-92\n" +
				"-75\n" +
				"-24\n" +
				"0\n" +
				"-73\n" +
				"-36\n" +
				"-14\n" +
				"1\n" +
				"-102\n" +
				"-97\n" +
				"-30\n" +
				"-105\n" +
				"-99\n" +
				"-84\n" +
				"-46\n" +
				"-67\n" +
				"-88\n" +
				"-86\n" +
				"-94\n" +
				"-53\n" +
				"-88\n" +
				"0\n" +
				"-100\n" +
				"-86\n" +
				"-11\n" +
				"-93\n" +
				"-99\n" +
				"-21\n" +
				"-2\n" +
				"-108\n" +
				"-6\n" +
				"0\n" +
				"-113\n" +
				"-116\n" +
				"-127\n" +
				"-42\n" +
				"-131\n" +
				"-124\n" +
				"-24\n" +
				"-56\n" +
				"-63\n" +
				"-130\n" +
				"-118\n" +
				"-52\n" +
				"-139\n" +
				"-43\n" +
				"-90\n" +
				"-123\n" +
				"-7\n" +
				"-93\n" +
				"-117\n" +
				"-34\n" +
				"-59\n" +
				"-140\n" +
				"-103\n" +
				"-52\n" +
				"-115\n" +
				"-83\n" +
				"-42\n" +
				"-92\n" +
				"-48\n" +
				"-82\n" +
				"-104\n" +
				"-38\n" +
				"-2\n" +
				"-28\n" +
				"-150\n" +
				"-39\n" +
				"-30\n" +
				"-71\n" +
				"-146\n" +
				"-55\n" +
				"-114\n" +
				"-141\n" +
				"-158\n" +
				"-55\n" +
				"-21\n" +
				"-121\n" +
				"-142\n" +
				"-137\n" +
				"-119\n" +
				"-99\n" +
				"-113\n" +
				"-99\n" +
				"-33\n" +
				"-99\n" +
				"-20\n" +
				"-129\n" +
				"-83\n" +
				"-64\n" +
				"-179\n" +
				"-182\n" +
				"-43\n" +
				"-86\n" +
				"-50\n" +
				"-135\n" +
				"-186\n" +
				"-68\n" +
				"-100\n" +
				"-181\n" +
				"-22\n" +
				"-106\n" +
				"-178\n" +
				"-157\n" +
				"-46\n" +
				"-41\n" +
				"-80\n" +
				"-166\n" +
				"-77\n" +
				"-81\n" +
				"-144\n" +
				"-132\n" +
				"-81\n" +
				"-11\n" +
				"-38\n" +
				"-57\n" +
				"-69\n" +
				"-13\n" +
				"-79\n" +
				"-146\n" +
				"-1\n" +
				"-165\n" +
				"-52\n" +
				"-134\n" +
				"-86\n" +
				"-160\n" +
				"-97\n" +
				"-220\n" +
				"-92\n" +
				"-200\n" +
				"-145\n" +
				"-175\n" +
				"-138\n" +
				"-205\n" +
				"-127\n" +
				"-165\n" +
				"-155\n" +
				"-211\n" +
				"-134\n" +
				"-31\n" +
				"-118\n" +
				"-190\n" +
				"-40\n" +
				"-182\n" +
				"-96\n" +
				"-134\n" +
				"-93\n" +
				"-84\n" +
				"-76\n" +
				"-34\n" +
				"-33\n" +
				"-203\n" +
				"-16\n" +
				"-245\n" +
				"-167\n" +
				"-102\n" +
				"-5\n" +
				"-44\n" +
				"-239\n" +
				"-127\n" +
				"-255\n" +
				"-116\n" +
				"-61\n" +
				"-140\n" +
				"-238\n" +
				"-69\n" +
				"-254\n" +
				"-203\n" +
				"-178\n" +
				"-229\n" +
				"-250\n" +
				"-120\n" +
				"-109\n" +
				"-153\n" +
				"-108\n" +
				"-137\n" +
				"-247\n" +
				"2\n" +
				"-151\n" +
				"-270\n" +
				"-164\n" +
				"-62\n" +
				"-186\n" +
				"-272\n" +
				"-190\n" +
				"-180\n" +
				"-70\n" +
				"-179\n" +
				"-38\n" +
				"-208\n" +
				"-215\n" +
				"-151\n" +
				"-156\n" +
				"-62\n" +
				"-57\n" +
				"-275\n" +
				"-182\n" +
				"-169\n" +
				"-264\n" +
				"-70\n" +
				"-279\n" +
				"-55\n" +
				"-287\n" +
				"-57\n" +
				"-3\n" +
				"-67\n" +
				"-155\n" +
				"-213\n" +
				"-17\n" +
				"2\n" +
				"-200\n" +
				"-291\n" +
				"-179\n" +
				"-175\n" +
				"-73\n" +
				"-257\n" +
				"-47\n" +
				"-118\n" +
				"-206\n" +
				"-93\n" +
				"-293\n" +
				"-199\n" +
				"-102\n" +
				"-118\n" +
				"-188\n" +
				"-66\n" +
				"-288\n" +
				"-21\n" +
				"-204\n" +
				"-80\n" +
				"-237\n" +
				"-175\n" +
				"-297\n" +
				"-235\n" +
				"-168\n" +
				"-262\n" +
				"2\n" +
				"-162\n" +
				"-95\n" +
				"1\n" +
				"-286\n" +
				"-318\n" +
				"-9\n" +
				"-213\n" +
				"-159\n" +
				"-127\n" +
				"-175\n" +
				"-266\n" +
				"-240\n" +
				"-268\n" +
				"-245\n" +
				"-196\n" +
				"-281\n" +
				"-86\n" +
				"-202\n" +
				"-127\n" +
				"-144\n" +
				"-157\n" +
				"-333\n" +
				"-122\n" +
				"-230\n" +
				"-182\n" +
				"-38\n" +
				"-296\n" +
				"-12\n" +
				"-224\n" +
				"-123\n" +
				"-40\n" +
				"-6\n" +
				"-324\n" +
				"-135\n" +
				"-289\n" +
				"-85\n" +
				"-179\n" +
				"-37\n" +
				"-58\n" +
				"-125\n" +
				"-228\n" +
				"-124\n" +
				"-250\n" +
				"-73\n" +
				"-35\n" +
				"-286\n" +
				"-267\n" +
				"-257\n" +
				"-348\n" +
				"-83\n" +
				"-3\n" +
				"-98\n" +
				"-99\n" +
				"-273\n" +
				"-118\n" +
				"-310\n" +
				"-23\n" +
				"-299\n" +
				"-96\n" +
				"-51\n" +
				"-273\n" +
				"-79\n" +
				"-112\n" +
				"-355\n" +
				"-48\n" +
				"-219\n" +
				"-10\n" +
				"-103\n" +
				"-18\n" +
				"-201\n" +
				"-108\n" +
				"-34\n" +
				"-362\n" +
				"-165\n" +
				"-359\n" +
				"-347\n" +
				"-157\n" +
				"-148\n" +
				"-20\n" +
				"-344\n" +
				"-66\n" +
				"-337\n" +
				"-387\n" +
				"-62\n" +
				"-125\n" +
				"-4\n" +
				"-355\n" +
				"-322\n" +
				"-263\n" +
				"-381\n" +
				"-108\n" +
				"-25\n" +
				"-262\n" +
				"-425\n" +
				"-100\n" +
				"-54\n" +
				"-315\n" +
				"-221\n" +
				"-268\n" +
				"-211\n" +
				"-321\n" +
				"-89\n" +
				"-124\n" +
				"-297\n" +
				"-22\n" +
				"-162\n" +
				"-117\n" +
				"-430\n" +
				"-152\n" +
				"-373\n" +
				"-256\n" +
				"-37\n" +
				"-61\n" +
				"-59\n" +
				"-436\n" +
				"-377\n" +
				"-346\n" +
				"-245\n" +
				"-167\n" +
				"-451\n" +
				"-392\n" +
				"-382\n" +
				"-248\n" +
				"-254\n" +
				"-382\n" +
				"-249\n" +
				"-267\n" +
				"-216\n" +
				"-205\n" +
				"-310\n" +
				"-326\n" +
				"-144\n" +
				"-107\n" +
				"-65\n" +
				"-382\n" +
				"-79\n" +
				"-401\n" +
				"-370\n" +
				"-221\n" +
				"-283\n" +
				"-269\n" +
				"-64\n" +
				"-207\n" +
				"-262\n" +
				"-181\n" +
				"-146\n" +
				"-52\n" +
				"-169\n" +
				"-147\n" +
				"-225\n" +
				"-179\n" +
				"-215\n" +
				"-116\n" +
				"-115\n" +
				"-37\n" +
				"-227\n" +
				"-250\n" +
				"-228\n" +
				"-132\n" +
				"-414\n" +
				"-425\n" +
				"-230\n" +
				"-224\n" +
				"-319\n" +
				"-42\n" +
				"-353\n" +
				"-285\n" +
				"-38\n" +
				"-145\n" +
				"-263\n" +
				"-25\n" +
				"-142\n" +
				"-296\n" +
				"-267\n" +
				"-43\n" +
				"-315\n" +
				"-352\n" +
				"-105\n" +
				"-275\n" +
				"-354\n" +
				"-66\n" +
				"-414\n" +
				"-464\n" +
				"-215\n" +
				"-107\n" +
				"-267\n" +
				"-394\n" +
				"-10\n" +
				"-27\n" +
				"-315\n" +
				"-286\n" +
				"-113\n" +
				"-454\n" +
				"-400\n" +
				"-468\n" +
				"-245\n" +
				"-18\n" +
				"-427\n" +
				"-479\n" +
				"-281\n" +
				"-43\n" +
				"-29\n" +
				"-15\n" +
				"-371\n" +
				"-127\n" +
				"-371\n" +
				"-251\n" +
				"-343\n" +
				"-267\n" +
				"-355\n" +
				"-271\n" +
				"-68\n" +
				"-454\n" +
				"-532\n" +
				"-264\n" +
				"-513\n" +
				"-170\n" +
				"-484\n" +
				"-85\n" +
				"-329\n" +
				"-389\n" +
				"-317\n" +
				"-382\n" +
				"-535\n" +
				"-169\n" +
				"-395\n" +
				"-53\n" +
				"-429\n" +
				"-394\n" +
				"-465\n" +
				"-250\n" +
				"-419\n" +
				"-434\n" +
				"-84\n" +
				"-130\n" +
				"-229\n" +
				"-496\n" +
				"-336\n" +
				"-388\n" +
				"-412\n" +
				"-123\n" +
				"-502\n" +
				"-205\n" +
				"-367\n" +
				"-224\n" +
				"-40\n" +
				"-551\n" +
				"-99\n" +
				"-394\n" +
				"-321\n" +
				"-515\n" +
				"-260\n" +
				"-410\n" +
				"-518\n" +
				"-22\n" +
				"-23\n" +
				"-259\n" +
				"-397\n" +
				"-306\n" +
				"-199\n" +
				"-157\n" +
				"-49\n" +
				"-298\n" +
				"-176\n" +
				"-564\n" +
				"-271\n" +
				"-6\n" +
				"-297\n" +
				"-514\n" +
				"-432\n" +
				"-455\n" +
				"-192\n" +
				"-95\n" +
				"-447\n" +
				"-237\n" +
				"-571\n" +
				"-543\n" +
				"-229\n" +
				"-405\n" +
				"-282\n" +
				"-235\n" +
				"-380\n" +
				"-25\n" +
				"-603\n" +
				"-335\n" +
				"-94\n" +
				"-533\n" +
				"-463\n" +
				"-396\n" +
				"-421\n" +
				"-393\n" +
				"-588\n" +
				"-376\n" +
				"-152\n" +
				"-328\n" +
				"-460\n" +
				"-90\n" +
				"-315\n" +
				"-533\n" +
				"-207\n" +
				"-590\n" +
				"-100\n" +
				"-588\n" +
				"-574\n" +
				"-259\n" +
				"-183\n" +
				"-522\n" +
				"-424\n" +
				"-272\n" +
				"-341\n" +
				"-443\n" +
				"-217\n" +
				"-143\n" +
				"-26\n" +
				"-196\n" +
				"-632\n" +
				"-520\n" +
				"-606\n" +
				"-277\n" +
				"-176\n" +
				"-547\n" +
				"-564\n" +
				"-444\n" +
				"-228\n" +
				"-223\n" +
				"-115\n" +
				"-200\n" +
				"-616\n" +
				"-576\n" +
				"-398\n" +
				"-157\n" +
				"-78\n" +
				"-586\n" +
				"-12\n" +
				"-650\n" +
				"-239\n" +
				"-152\n" +
				"-20\n" +
				"-366\n" +
				"-100\n" +
				"-478\n" +
				"-666\n" +
				"-247\n" +
				"-105\n" +
				"-230\n" +
				"-218\n" +
				"-48\n" +
				"-238\n" +
				"0\n" +
				"-387\n" +
				"-660\n" +
				"-542\n" +
				"-189\n" +
				"-339\n" +
				"-577\n" +
				"-527\n" +
				"-273\n" +
				"-565\n" +
				"-230\n" +
				"-578\n" +
				"-147\n" +
				"-106\n" +
				"-373\n" +
				"-513\n" +
				"-8\n" +
				"-465\n" +
				"-66\n" +
				"-408\n" +
				"-351\n" +
				"-357\n" +
				"-119\n" +
				"-251\n" +
				"-626\n" +
				"-81\n" +
				"-575\n" +
				"-542\n" +
				"-193\n" +
				"-219\n" +
				"-189\n" +
				"-635\n" +
				"-77\n" +
				"-517\n" +
				"-608\n" +
				"-309\n" +
				"-716\n" +
				"-712\n" +
				"-287\n" +
				"-67\n" +
				"-312\n" +
				"-334\n" +
				"-584\n" +
				"-687\n" +
				"-488\n" +
				"-612\n" +
				"-42\n" +
				"-180\n" +
				"-726\n" +
				"-235\n" +
				"-606\n" +
				"-538\n" +
				"-470\n" +
				"-477\n" +
				"-504\n" +
				"-278\n" +
				"-24\n" +
				"-435\n" +
				"-610\n" +
				"-540\n" +
				"-646\n" +
				"-503\n" +
				"-151\n" +
				"-350\n" +
				"-43\n" +
				"-699\n" +
				"-459\n" +
				"-516\n" +
				"-424\n" +
				"-343\n" +
				"-297\n" +
				"-460\n" +
				"-592\n" +
				"-30\n" +
				"-614\n" +
				"-125\n" +
				"-425\n" +
				"-180\n" +
				"-73\n" +
				"-550\n" +
				"-361\n" +
				"-390\n" +
				"-380\n" +
				"-518\n" +
				"-418\n" +
				"-305\n" +
				"-326\n" +
				"-84\n" +
				"-675\n" +
				"-320\n" +
				"-557\n" +
				"-486\n" +
				"-457\n" +
				"-414\n" +
				"-69\n" +
				"-228\n" +
				"-683\n" +
				"-610\n" +
				"-188\n" +
				"-608\n" +
				"-480\n" +
				"-225\n" +
				"-186\n" +
				"-374\n" +
				"-256\n" +
				"-672\n" +
				"-145\n" +
				"-323\n" +
				"-453\n" +
				"-252\n" +
				"-214\n" +
				"-600\n" +
				"-49\n" +
				"-652\n" +
				"-593\n" +
				"-93\n" +
				"-42\n" +
				"-101\n" +
				"-600\n" +
				"-422\n" +
				"-146\n" +
				"-191\n" +
				"-474\n" +
				"-725\n" +
				"-568\n" +
				"-572\n" +
				"-498\n" +
				"-506\n" +
				"-702\n" +
				"-120\n" +
				"-210\n" +
				"-340\n" +
				"-482\n" +
				"-210\n" +
				"-666\n" +
				"-520\n" +
				"-647\n" +
				"-219\n" +
				"-435\n" +
				"-455\n" +
				"-814\n" +
				"-304\n" +
				"-610\n" +
				"-224\n" +
				"-95\n" +
				"-425\n" +
				"-456\n" +
				"-761\n" +
				"-339\n" +
				"-256\n" +
				"-793\n" +
				"-49\n" +
				"-317\n" +
				"-274\n" +
				"-374\n" +
				"-620\n" +
				"-730\n" +
				"-130\n" +
				"-128\n" +
				"-420\n" +
				"-315\n" +
				"-47\n" +
				"-92\n" +
				"-467\n" +
				"-269\n" +
				"-563\n" +
				"-495\n" +
				"-501\n" +
				"-32\n" +
				"-755\n" +
				"-774\n" +
				"-154\n" +
				"1\n" +
				"-685\n" +
				"-657\n" +
				"-38\n" +
				"-727\n" +
				"-428\n" +
				"-293\n" +
				"-68\n" +
				"-203\n" +
				"-850\n" +
				"-775\n" +
				"-545\n" +
				"-740\n" +
				"-683\n" +
				"-728\n" +
				"-502\n" +
				"-520\n" +
				"-44\n" +
				"-53\n" +
				"-826\n" +
				"-555\n" +
				"-539\n" +
				"-291\n" +
				"-435\n" +
				"-673\n" +
				"-865\n" +
				"-114\n" +
				"-467\n" +
				"-679\n" +
				"-598\n" +
				"-611\n" +
				"-566\n" +
				"-606\n" +
				"-320\n" +
				"-124\n" +
				"-430\n" +
				"-240\n" +
				"-85\n" +
				"-549\n" +
				"-847\n" +
				"-481\n" +
				"-444\n" +
				"-792\n" +
				"-695\n" +
				"-405\n" +
				"-427\n" +
				"-292\n" +
				"-533\n" +
				"-91\n" +
				"-5\n" +
				"-546\n" +
				"-181\n" +
				"-156\n" +
				"-488\n" +
				"-29\n" +
				"-17\n" +
				"-572\n" +
				"-510\n" +
				"-663\n" +
				"-321\n" +
				"-177\n" +
				"-516\n" +
				"-85\n" +
				"-829\n" +
				"-109\n" +
				"-236\n" +
				"-876\n" +
				"-141\n" +
				"-427\n" +
				"-180\n" +
				"-576\n" +
				"-45\n" +
				"-178\n" +
				"-6\n" +
				"-236\n" +
				"-381\n" +
				"-638\n" +
				"-144\n" +
				"-391\n" +
				"-739\n" +
				"-43\n" +
				"-898\n" +
				"-896\n" +
				"-395\n" +
				"-280\n" +
				"-712\n" +
				"-127\n" +
				"-823\n" +
				"-130\n" +
				"-783\n" +
				"-324\n" +
				"-29\n" +
				"-136\n" +
				"-941\n" +
				"-816\n" +
				"-712\n" +
				"-120\n" +
				"-639\n" +
				"-209\n" +
				"-522\n" +
				"-618\n" +
				"-205\n" +
				"-557\n" +
				"-153\n" +
				"-451\n" +
				"-280\n" +
				"-214\n" +
				"-683\n" +
				"-134\n" +
				"-329\n" +
				"-403\n" +
				"-156\n" +
				"-645\n" +
				"-194\n" +
				"-811\n" +
				"-377\n" +
				"-161\n" +
				"-620\n" +
				"-920\n" +
				"-225\n" +
				"-632\n" +
				"-543\n" +
				"-658\n" +
				"-864\n" +
				"-137\n" +
				"-928\n" +
				"-616\n" +
				"-728\n" +
				"-145\n" +
				"-182\n" +
				"-879\n" +
				"-595\n" +
				"-598\n" +
				"-409\n" +
				"-934\n" +
				"-23\n" +
				"-58\n" +
				"-301\n" +
				"-427\n" +
				"-599\n" +
				"-562\n" +
				"-373\n" +
				"-656\n" +
				"-360\n" +
				"-783\n" +
				"-68\n" +
				"-228\n" +
				"-712\n" +
				"-912\n" +
				"-260\n" +
				"-490\n" +
				"-588\n" +
				"-481\n" +
				"-610\n" +
				"-615\n" +
				"-180\n" +
				"-914\n" +
				"-960\n" +
				"-462\n" +
				"-522\n" +
				"-782\n" +
				"-617\n" +
				"-687\n" +
				"-477\n" +
				"-934\n" +
				"-54\n" +
				"-201\n" +
				"-279\n" +
				"-101\n" +
				"-27\n" +
				"-759\n" +
				"-407\n" +
				"-187\n" +
				"-202\n" +
				"-715\n" +
				"-488\n" +
				"-206\n" +
				"-802\n" +
				"-737\n" +
				"-18\n" +
				"-364\n" +
				"-325\n" +
				"-155\n" +
				"-573\n" +
				"-536\n" +
				"-769\n" +
				"-747\n" +
				"-669\n" +
				"-856\n" +
				"-521\n" +
				"-24\n" +
				"-921\n" +
				"-394\n" +
				"-726\n" +
				"-251\n" +
				"-5\n" +
				"-533\n" +
				"-923\n" +
				"-752\n" +
				"-28\n" +
				"-775\n" +
				"-100\n" +
				"-801\n" +
				"-22\n" +
				"-723\n" +
				"-383\n" +
				"-952\n" +
				"-355\n" +
				"-1058\n" +
				"-975\n" +
				"-975\n" +
				"-706\n" +
				"-843\n" +
				"-75\n" +
				"-124\n" +
				"-150\n" +
				"-98\n" +
				"-1019\n" +
				"-195\n" +
				"-342\n" +
				"-915";
		final RelativeJumper jumper = new RelativeJumper();
		System.out.println("Relative jumper result is:");
		System.out.println(jumper.escapeMaze(jumpsInput));
		System.out.println("Relative jumper second part is:");
		System.out.println(jumper.escapeComplicatedMaze(jumpsInput));

		final String memoryBlocksInput = "2\t8\t8\t5\t4\t2\t3\t1\t5\t5\t1\t2\t15\t13\t5\t14";
		final MemoryBlocks memoryBlocks = new MemoryBlocks();
		System.out.println("Memory blocks result is: ");
		System.out.println(memoryBlocks.countBlockJumps(memoryBlocksInput));
		System.out.println("Loop size result is: ");
		System.out.println(memoryBlocks.countLoopSize(memoryBlocksInput));

		final String programTowerInput = "tqefb (40)\n" +
				"lhrml (164) -> ecblhee, sdjshz\n" +
				"ykntwjm (16)\n" +
				"fbebcq (233) -> ilzfg, vqbvnf, idyiyg, tifpswp\n" +
				"rqjpza (1043) -> xszbzi, zafhcbb, qoouyiw\n" +
				"zazkyd (203) -> vzylhou, ndvkjn\n" +
				"ndfxn (48) -> brxmlaa, nlbvsaj\n" +
				"pfjpsxf (1714) -> uchxwm, ohpvb\n" +
				"tnuvu (395)\n" +
				"ccxsuk (12)\n" +
				"rrhbmgi (98)\n" +
				"vfkeogg (58)\n" +
				"xfbvid (86)\n" +
				"muburl (57)\n" +
				"xxpnqpc (224) -> ksuydd, pmxdc\n" +
				"ilkrxa (9)\n" +
				"lkjkrj (81)\n" +
				"lcuhsxu (75)\n" +
				"flcyx (32)\n" +
				"nuuvgid (23)\n" +
				"ltweydr (11)\n" +
				"pafuvtn (72)\n" +
				"simlgvw (88)\n" +
				"npjbfxb (94)\n" +
				"ilzfg (31)\n" +
				"ingzgv (199) -> brxtyug, nfexc\n" +
				"cejlti (341)\n" +
				"boslv (10868) -> ygeeepa, asiigv, jiorqgn, fnbpxoq\n" +
				"dqkxvd (112) -> wkbqh, dnirvcs\n" +
				"sczzyjo (167) -> euaku, ytgdbn\n" +
				"uwnwx (171) -> czmxofi, tmmbh, engsa\n" +
				"gxlcwkl (34)\n" +
				"suwehi (15)\n" +
				"gkpirl (162) -> vbrwu, tnjkbcd\n" +
				"dpahgkv (52)\n" +
				"pbebtfc (114) -> bubcg, vaiqef\n" +
				"ymnissn (47)\n" +
				"mltftcq (21)\n" +
				"rejewfv (71) -> rfuqci, oyuep, lfveq\n" +
				"grbnbad (199) -> mltftcq, gepue\n" +
				"kuwuy (97)\n" +
				"rzhwl (1936) -> vmlmrk, ushmwu, tziitox\n" +
				"dbqujc (87)\n" +
				"texjaoa (104) -> mpkijdc, lyqbnl\n" +
				"wpxaup (975) -> jijmyu, ejjdfwk, jsrmk, ofshfcn\n" +
				"exqxh (31)\n" +
				"fmtzdw (37)\n" +
				"vmbeqe (33)\n" +
				"fxaom (41)\n" +
				"ewowmhn (63) -> xyioev, qbepv, rqbld\n" +
				"lgpsy (73)\n" +
				"fjgns (149) -> tmbuahz, wvtlu\n" +
				"cyyjrf (56) -> gmobt, hlsvyhx, ngwdz, hrrzu\n" +
				"dntxe (99)\n" +
				"nafrtm (2458) -> gpkgkv, vuqcpir, jvegsv, xhorr, rzsxtev, xksfmz\n" +
				"lebuxmo (14)\n" +
				"fbfqvq (29)\n" +
				"zcegp (98)\n" +
				"clfvfbd (167) -> wnbbrab, bdmmi\n" +
				"wfaus (13)\n" +
				"gepue (21)\n" +
				"lmrhhj (27)\n" +
				"roprp (6)\n" +
				"itimbmg (71)\n" +
				"fepdsz (16)\n" +
				"phcizz (93) -> olmzxu, efkixrq\n" +
				"vuqcpir (1823) -> uljiu, qignfgc\n" +
				"sbvopw (49)\n" +
				"vebuhzt (136) -> eyfds, nhylqxq\n" +
				"rdssp (44)\n" +
				"lipbj (68)\n" +
				"mjfnukc (83) -> sbvopw, kgclit\n" +
				"ltfxsl (97)\n" +
				"wkbqh (81)\n" +
				"xbnbi (32)\n" +
				"vgffruy (98) -> yaueae, lpflvwn, qirikp, xzjcbwa, kshtume, voanano\n" +
				"lcxeysi (275) -> pfqyoho, mnjhqkb\n" +
				"nadgwb (87)\n" +
				"lycks (6)\n" +
				"nyghbkz (10)\n" +
				"racbcat (78)\n" +
				"hhtpv (19)\n" +
				"kjonnd (128) -> vfuywa, zttbwuj\n" +
				"dnpbek (219) -> cbwrev, nrtmf\n" +
				"wrrdy (55)\n" +
				"khumo (37)\n" +
				"xhoytye (85)\n" +
				"wpulnl (98)\n" +
				"uxmjz (38)\n" +
				"oqpxd (56)\n" +
				"iztdlnf (7)\n" +
				"mofllk (131) -> lyfsi, rybovf\n" +
				"fmzpc (21)\n" +
				"yysvm (89)\n" +
				"boropxd (4285) -> slzaeep, hiotqxu, qppggd, iahug, cwwwj, upfhsu, jjlodie\n" +
				"hqbunkc (88)\n" +
				"dteoa (52)\n" +
				"dhugaw (145) -> gdbut, gkbmdh\n" +
				"izvfjt (89)\n" +
				"nfomnyt (9)\n" +
				"gbyblhe (75)\n" +
				"mjkgsg (97)\n" +
				"vkgbz (79)\n" +
				"ldfun (87)\n" +
				"ttfhrp (82)\n" +
				"vjaffbt (391) -> cdqpv, pavbfb\n" +
				"jgrigjx (24)\n" +
				"upjvowk (87)\n" +
				"dfmrhz (31)\n" +
				"qqrqid (82)\n" +
				"kbqpd (30)\n" +
				"wqtcnyz (63)\n" +
				"kwfghyi (7)\n" +
				"ajacjz (174) -> mthaau, ifogeft\n" +
				"pglsa (129) -> wimpgm, wtcuxsp\n" +
				"eakfc (45)\n" +
				"jlhly (16)\n" +
				"vbrpgbe (96)\n" +
				"ydpxkx (8)\n" +
				"zpqlfyn (80) -> skxcsro, uelcs\n" +
				"pbonnr (208) -> kpxdh, izgkl, nquecpp\n" +
				"obxki (9)\n" +
				"drenb (85)\n" +
				"vozeer (10879) -> rejewfv, fnkxzn, xxardb\n" +
				"yixmif (84)\n" +
				"psdcvl (202) -> lgbltl, oriskzl, zazkyd, synlyuo, mwtqk, oryvzmp\n" +
				"spnkurd (66)\n" +
				"rxcyz (80) -> nbonyx, hmrbytx\n" +
				"kjbps (23)\n" +
				"qkbflxg (94)\n" +
				"hywytz (162) -> amrvw, gzxpx\n" +
				"sknxjo (59)\n" +
				"cnnajhy (80)\n" +
				"uiqzhqu (84)\n" +
				"omtrskm (17)\n" +
				"pnbzj (60) -> vbrpgbe, cuupma, yddiq\n" +
				"jiybk (49) -> nnmcrj, vsyhi\n" +
				"cnyyygq (54)\n" +
				"tekqjru (6)\n" +
				"qgnkn (66)\n" +
				"qvstpyq (89)\n" +
				"ntgdq (48)\n" +
				"phltmve (13)\n" +
				"anprhpf (70)\n" +
				"epnfp (39)\n" +
				"lxdlq (48)\n" +
				"yuiqntx (55)\n" +
				"oyuep (270) -> xsdlmg, xvbezu\n" +
				"hobchva (97)\n" +
				"qtwaod (228) -> tdxve, dsoipkq\n" +
				"draxijw (67)\n" +
				"evkyf (15)\n" +
				"sipdbpd (82)\n" +
				"vlxqvi (266) -> dzbqu, qnmgp\n" +
				"eelrlu (36)\n" +
				"opilymx (35)\n" +
				"buzsiye (16)\n" +
				"sabkxwy (189) -> zddnqld, gomrr\n" +
				"fwwvg (88)\n" +
				"teafht (87)\n" +
				"zzlgja (27) -> boclo, eywfs, tskeqa, gbyblhe\n" +
				"ajjyaog (327)\n" +
				"worqvps (32)\n" +
				"illzp (29)\n" +
				"tifpswp (31)\n" +
				"jzeeng (88)\n" +
				"havmool (10)\n" +
				"wnbbrab (61)\n" +
				"dwtgak (1742) -> yolqpau, paetkc, wjpvpg\n" +
				"ieejg (255) -> islbpsv, fcfujgr\n" +
				"pjrtj (64)\n" +
				"idqfawa (1327) -> osfsey, mfhtd, owbhv\n" +
				"dntzv (9)\n" +
				"ihmixw (93)\n" +
				"upvzg (45)\n" +
				"cvmlcyx (65) -> lkjkrj, dslabn\n" +
				"cjhxpn (9)\n" +
				"hjhaae (44)\n" +
				"axstuln (9)\n" +
				"tcymb (93)\n" +
				"hmrbytx (46)\n" +
				"jwrcrra (37)\n" +
				"ltfsqn (95)\n" +
				"vktrdf (79)\n" +
				"xyioev (67)\n" +
				"wdjpqq (43)\n" +
				"lukls (78)\n" +
				"rhinivh (56)\n" +
				"yxxrv (49)\n" +
				"rodfe (116) -> svxrmhl, fpqfvd\n" +
				"wtcuxsp (31)\n" +
				"ewlryhh (5)\n" +
				"lqorouz (721) -> kgxmev, zrrklpo, lazovhv, cajloqp, jstihz\n" +
				"anendx (90)\n" +
				"ghbmnod (61)\n" +
				"pkhhbp (452)\n" +
				"owaqfb (84)\n" +
				"uwgomw (260)\n" +
				"wxcas (256) -> qrzofif, vdexe\n" +
				"tvzbk (66)\n" +
				"jmpyaib (69) -> rhinivh, uplalh\n" +
				"ffzpfp (64)\n" +
				"clxasb (66)\n" +
				"dnaclwb (12)\n" +
				"ixdxwhj (89)\n" +
				"jzklwrz (1218) -> ocspnqg, zrmtgk, dfxox, qpbqzwi, uwgomw, hobrps\n" +
				"pmkcwxd (81) -> ksizuia, ayrmwy, uutzk\n" +
				"utsyk (5)\n" +
				"zttbwuj (43)\n" +
				"vzhrt (9)\n" +
				"poywgwi (419)\n" +
				"eelwu (83) -> ttfhrp, sxagng, lgpqna, qqrqid\n" +
				"mgmmqpf (50)\n" +
				"ecrkcs (66)\n" +
				"nmlmm (97)\n" +
				"akzwfo (11)\n" +
				"zxymd (206) -> gyxopp, ychlsfn\n" +
				"lxeeq (26)\n" +
				"pkrbgb (88)\n" +
				"hnfjb (13)\n" +
				"koqnz (95)\n" +
				"aowql (5)\n" +
				"engsa (81)\n" +
				"gmobt (96)\n" +
				"nexgspx (78)\n" +
				"humrsd (35)\n" +
				"bwpvsv (8)\n" +
				"tuxctb (97)\n" +
				"iqefm (211) -> vftol, haphukg\n" +
				"llmhaad (156) -> bkzfd, irxbhi\n" +
				"pdyjzd (142) -> zfjuv, hqbunkc, ghkyui\n" +
				"sjvdfk (89) -> zvefixb, ftomb\n" +
				"hfhqvb (2026) -> sqsyxpe, iaeemxc, vuzuq\n" +
				"puzsftr (67)\n" +
				"gachpm (41)\n" +
				"fhifg (1924) -> lkfcgw, magml, tjrdifv, sefzkr\n" +
				"nzwdyjh (48)\n" +
				"idfja (47)\n" +
				"kiueoo (181)\n" +
				"yhmclb (87)\n" +
				"riuhtpn (101) -> ydapn, wuqhqm\n" +
				"tsasgm (13)\n" +
				"mjnjzet (153) -> mopevhs, hvyscq, ugtpfof, qnbxo, qerhwfp, xojyah\n" +
				"tfwcyid (293) -> ajqaniw, accqde, fwzkvc\n" +
				"hvigowx (97) -> hujizfz, eoyva, sknxjo\n" +
				"bdudb (50)\n" +
				"jocdav (91)\n" +
				"egoaw (5)\n" +
				"fuaaot (91)\n" +
				"suslpgz (116) -> zvldmx, bjtca\n" +
				"htxwgxj (36)\n" +
				"alsrt (189) -> dvpjab, ipwdq\n" +
				"ndgra (135) -> ukzms, hrrxs, cilwhdb\n" +
				"cyzobwd (21)\n" +
				"nozqe (42)\n" +
				"boclo (75)\n" +
				"niiwne (50)\n" +
				"otsaip (35)\n" +
				"ljpyq (32)\n" +
				"wvtlu (93)\n" +
				"oryvzmp (227) -> mcihl, buhmvt\n" +
				"oijissd (23)\n" +
				"uzowuwt (44)\n" +
				"vmvnrq (97)\n" +
				"qwqenwn (96) -> rrhiz, pqeso, evliz, uvvsl\n" +
				"tmmbh (81)\n" +
				"accqde (92) -> kdbbkg, vzcyoxl\n" +
				"oufzuw (89)\n" +
				"hqgbfvn (68)\n" +
				"rxmxfno (76)\n" +
				"ozmoirq (107) -> oitkdg, xsbjwz\n" +
				"mefsxl (5015) -> ixlerg, uoujbtv, khjbclb\n" +
				"qirikp (91) -> koqnz, mbora, ltfsqn\n" +
				"jlpfu (144) -> avrfz, ywuqf\n" +
				"dkuds (97)\n" +
				"inggl (261) -> qgudtwk, myfcqxe\n" +
				"tixcp (14140) -> qoyhxl, jgvsp, zwtnf\n" +
				"kyspusd (25)\n" +
				"vdxdq (68)\n" +
				"qiqvce (72)\n" +
				"ehgnylr (8)\n" +
				"nrtmf (15)\n" +
				"xavay (8) -> fibcigx, omvflhe\n" +
				"socuv (6510) -> tjvry, ybqehu, mapirt\n" +
				"sdhtcgx (388)\n" +
				"ogksb (78)\n" +
				"tuytxy (65) -> nteuv, jsdzajv\n" +
				"hyvhosf (25)\n" +
				"kpdms (44)\n" +
				"mswjlev (107) -> jfdud, knpefcs\n" +
				"ckrqr (30)\n" +
				"jeejn (82)\n" +
				"idgrh (20)\n" +
				"dnirvcs (81)\n" +
				"jbutmk (109) -> qgnkn, tswgpqg\n" +
				"lwuxii (25)\n" +
				"uhmypt (39)\n" +
				"swkfz (92)\n" +
				"ugzxbjw (72)\n" +
				"ccyflwf (111) -> spnkurd, slbun\n" +
				"xxcpmu (89)\n" +
				"gworrlc (14712) -> aaizfj, nqayozt, xftjd, whpjefc, dnpbek\n" +
				"qdkcyj (40)\n" +
				"erzpzd (66)\n" +
				"alpoep (51) -> wammii, svpwz\n" +
				"nteuv (89)\n" +
				"uwmocg (72774) -> npwjod, fmqxggg, tkaax, tbpyoxy, mefsxl, hhxofiu\n" +
				"odpuf (15)\n" +
				"sxagng (82)\n" +
				"fcxag (57)\n" +
				"kebxaum (31)\n" +
				"ahxse (331) -> qwtss, stqsnlz, bgibn, vjrrptz, ehqap, pdawj\n" +
				"wvyht (26)\n" +
				"ockjo (29)\n" +
				"aiqug (46)\n" +
				"ejehv (1135) -> owxcxd, nvbococ, pmkcwxd\n" +
				"invkz (94)\n" +
				"yrdsxpn (12)\n" +
				"gvjwj (23)\n" +
				"itfiqj (163)\n" +
				"gimjz (201) -> vaxierg, feope\n" +
				"ekzro (71)\n" +
				"zbscr (378) -> myfkdkl, wtpgz\n" +
				"jmrry (87)\n" +
				"xfwju (45) -> wnteyab, zxmpvm\n" +
				"jpsoy (1570) -> sewtbk, mofllk, txhcyqf, tkntd, oqqnazv\n" +
				"efmrpp (78)\n" +
				"odqkxi (6) -> gvjuwwn, quhyxh, dqkxvd, misjd, vmnys, rtgpmf, lhrml\n" +
				"blafijn (262) -> lwuxii, qfmofym\n" +
				"yqcwdh (80) -> rfmbo, frvqvlo\n" +
				"hhjgskh (7)\n" +
				"idxgock (23)\n" +
				"ipgrte (66)\n" +
				"zpxbc (118) -> cletkls, krvtfsj, budohp\n" +
				"yjqdgq (30)\n" +
				"vgfve (9)\n" +
				"uclzjin (73)\n" +
				"pqeso (116) -> xgxea, gvjwj, grksx\n" +
				"fmqxggg (6539) -> jzlquwl, oipjur, slvkou, pjpfvqe, gcjdpx, ebtkonx\n" +
				"ytjuerk (23)\n" +
				"vpgxh (85)\n" +
				"mnepu (75)\n" +
				"zwjuqr (26)\n" +
				"mtjcqtg (52)\n" +
				"djzbom (89)\n" +
				"iwgtul (79)\n" +
				"hwvkbv (47)\n" +
				"olmzxu (10)\n" +
				"buplvox (42) -> xzxsnus, azpwos\n" +
				"fscqnmn (77)\n" +
				"xeblqw (55)\n" +
				"lazovhv (153) -> deagdif, jasamk\n" +
				"mopos (62)\n" +
				"sewtbk (123) -> zddbivo, esyatlt\n" +
				"ifhntf (8)\n" +
				"uxxwj (215) -> gkuqwak, qqesw\n" +
				"hqesnp (58)\n" +
				"ncdnc (34)\n" +
				"psmlok (55) -> hbabeiy, xcfvrz, lujwkxl, tgtwgnl, ueacv, fqorpj, ennlusa\n" +
				"awnos (97)\n" +
				"ojlgsc (74)\n" +
				"kshtume (300) -> jatvuw, uxmjz\n" +
				"qidhm (4140) -> svgfqs, zyuuri, ylysm, psdcvl, pfjpsxf, pduiy\n" +
				"pfsgds (86)\n" +
				"rzsxtev (419) -> kqiupp, gxgnzi, glveid, iyqzno, fhfcmv, crxpc\n" +
				"jbhoa (52)\n" +
				"pcciu (40)\n" +
				"urvwum (170) -> ytmnrjw, fkcwv\n" +
				"bkzfd (96)\n" +
				"jldxskr (14)\n" +
				"hatujsc (93)\n" +
				"droaqx (29)\n" +
				"fohnt (22)\n" +
				"czwrn (1100) -> ykoyzh, wuavkqo, tvgfdb\n" +
				"kvmjx (850) -> mjryqy, evofre, gfkxqmk\n" +
				"sqdyn (61)\n" +
				"weelykw (46) -> vqmckky, hzxgz\n" +
				"yiipi (27)\n" +
				"dhltapo (98)\n" +
				"qsetl (310) -> isesfdw, fsdvpk\n" +
				"ctpac (68)\n" +
				"ycnqav (5)\n" +
				"uplalh (56)\n" +
				"xpgzx (48) -> zkpghh, eawuhm\n" +
				"hlabv (1742) -> qxvfq, vpesyi, untiezr\n" +
				"ifogeft (21)\n" +
				"vpqmdqf (55)\n" +
				"lzfuzm (32)\n" +
				"gszkqio (79)\n" +
				"gomrr (76)\n" +
				"mzmyto (45)\n" +
				"zcohp (41)\n" +
				"haazrx (21)\n" +
				"eodye (116) -> eaxlxoy, sbovaf, fkawsxk, uvfhx\n" +
				"xxzzr (85)\n" +
				"ybqehu (16) -> qtwaod, uwnwx, vzgkr, aywwpfz, kpbdkq, hbjrjw, sxlkxs\n" +
				"vaale (90) -> idfja, hwvkbv\n" +
				"grqfud (823) -> wopvp, ccyflwf, usmhoj, hlnram, oyyfhxh, bneqef\n" +
				"hrrzu (96)\n" +
				"ceibzne (23)\n" +
				"jmnhj (8)\n" +
				"esyatlt (38)\n" +
				"vhgtr (24)\n" +
				"ffakxgn (58)\n" +
				"dcdxxv (21)\n" +
				"zvefixb (69)\n" +
				"shwph (30)\n" +
				"vuzuq (23) -> tbhdon, suakgk\n" +
				"nmber (37)\n" +
				"pjpfvqe (8) -> arhfcx, hgqsp\n" +
				"arugmz (67) -> eflbhmn, gekwq\n" +
				"tvunonh (89)\n" +
				"ndpweps (99) -> wuuxzqy, jyuvjzz, xdgbnoj\n" +
				"fxrkpax (55)\n" +
				"voanano (320) -> zfavz, smttd\n" +
				"szwdc (8)\n" +
				"bsqbqtw (31)\n" +
				"xvjmz (155) -> aktlwea, jxszqd\n" +
				"azzpq (153) -> ssngqqp, lebuxmo\n" +
				"qndtc (43)\n" +
				"dvsntva (37)\n" +
				"vzgkr (294) -> rguht, lnxxnux\n" +
				"phqtbfn (38)\n" +
				"zhiacn (16)\n" +
				"oseerig (410) -> haazrx, aqcscz\n" +
				"fagsd (303) -> hrciraz, lnnhuld\n" +
				"mpjvq (34) -> pfsgds, xfbvid, iebfp, xmhokd\n" +
				"bgibn (75) -> vmbeqe, ikdpgy\n" +
				"wqbwqi (66)\n" +
				"vpesyi (204)\n" +
				"tvfhovv (20)\n" +
				"tjnerh (2780) -> ahhqrp, rlnee\n" +
				"sjyymi (78)\n" +
				"xgxea (23)\n" +
				"nqayozt (69) -> mruoew, vogdr, ihquo, ngbto\n" +
				"diwwjq (43)\n" +
				"msrlpql (68)\n" +
				"wnteyab (67)\n" +
				"tzumnfw (1029) -> nttyljj, rwmqvs\n" +
				"wammii (44)\n" +
				"ggttj (237) -> ckrqr, kbqpd\n" +
				"zddbivo (38)\n" +
				"ulymdk (84)\n" +
				"qbjpr (41)\n" +
				"wfnrlgo (12)\n" +
				"wxeki (6)\n" +
				"jijmyu (274)\n" +
				"socgh (50)\n" +
				"eiceooz (412)\n" +
				"jauxc (17) -> tuxctb, utnjrpg\n" +
				"klflx (19)\n" +
				"ueacv (192) -> ygzvz, wgbupli\n" +
				"yzfbc (45)\n" +
				"rocyko (218) -> rgzrfak, trabc\n" +
				"djblaef (79)\n" +
				"tdxve (93)\n" +
				"fpwfhqa (317) -> ocxbu, bqzya, wevkbue, roprp\n" +
				"dslabn (81)\n" +
				"eqzjl (185) -> albxmd, fdetm, ctjyra\n" +
				"hjwug (13)\n" +
				"vfuywa (43)\n" +
				"rtjax (93)\n" +
				"tuuqm (128) -> sokar, wtjzsm\n" +
				"xuxuy (224) -> qkbflxg, tvlhxbd\n" +
				"dzbqu (28)\n" +
				"hldjtya (48) -> xxzzr, navzdpq, vgbxwsh, xhoytye\n" +
				"vohmteg (10)\n" +
				"uxuwgmz (8379) -> lhopv, vexiqv, tjnerh\n" +
				"yitoepf (20)\n" +
				"vpmyvzz (11)\n" +
				"sinfhwq (219) -> tsdpmhr, xcaqylz\n" +
				"betkfui (84)\n" +
				"vqanko (399) -> ygcph, dbqlqa, oawaasr, ajacjz\n" +
				"lkfhfri (23)\n" +
				"zpdcajt (44)\n" +
				"ebtkonx (158) -> fmdxpvz, fdgvmi\n" +
				"milnj (9)\n" +
				"ytacid (51) -> upjvowk, sgmtal, ldfun\n" +
				"uzasvyd (66)\n" +
				"cbjyf (15)\n" +
				"clbkb (15)\n" +
				"bqzya (6)\n" +
				"oiyohma (24)\n" +
				"dohxzvo (752) -> vuxcbe, lczpqwp, pglsa, jntictz\n" +
				"qbnwlwe (67)\n" +
				"myfcqxe (67)\n" +
				"uqcjwp (52)\n" +
				"srofdd (90) -> rtjzffy, qbjpr\n" +
				"cprxbbf (1657) -> dpqsg, myaznzp, yonamnd\n" +
				"ibfxt (25)\n" +
				"lhcix (265) -> jxmvpr, lagoq, bwpvsv, ehgnylr\n" +
				"wuluv (27912) -> atgrdn, hdpqtg, qidhm, socuv, boslv, fcakejv\n" +
				"wuuxzqy (45)\n" +
				"sfevya (11)\n" +
				"jjlodie (46) -> jtxvw, cjwnq, mtpbt\n" +
				"vounq (42) -> ounsg, rbhzdm, serls, ygqzh\n" +
				"syzptux (14)\n" +
				"aptrqbk (20)\n" +
				"gznxb (15)\n" +
				"eevia (89)\n" +
				"emdolt (93)\n" +
				"kukkmrx (223)\n" +
				"nmdit (71) -> qcaxee, cmtpu\n" +
				"whfwtio (60)\n" +
				"zwxkyn (85)\n" +
				"mamhdgl (43)\n" +
				"zbtgzh (52) -> zeien, gszkqio, iwgtul\n" +
				"pfqyoho (57)\n" +
				"oawaasr (158) -> jpadrxu, ylepv\n" +
				"gahopg (64)\n" +
				"dobuzav (11) -> tmzvfia, ihmixw, emdolt, hhqks\n" +
				"eieqwo (26)\n" +
				"qvvgle (20)\n" +
				"mcponby (11)\n" +
				"dqabk (41)\n" +
				"zxcjlk (2139) -> llmhaad, oykcbpj, pnbzj\n" +
				"pmosxof (128) -> kgiswh, flspx, qszzvq\n" +
				"bjkfl (96)\n" +
				"fcpmz (21)\n" +
				"maykdnd (86)\n" +
				"idyiyg (31)\n" +
				"vzcyoxl (22)\n" +
				"gwfkzhk (43) -> qbnwlwe, draxijw\n" +
				"qmnjlw (95)\n" +
				"azpwos (54)\n" +
				"slzaeep (1023) -> edshwfr, emuysfg\n" +
				"yusdv (45)\n" +
				"cohgcil (41)\n" +
				"bkjhdgy (72)\n" +
				"nqjsdi (20)\n" +
				"oivlxtz (9)\n" +
				"ocowqvd (7522) -> vgffruy, ykjng, hlabv\n" +
				"lujwkxl (54) -> bkcozk, bcxne, mvhybn, ipgrte\n" +
				"wuqhqm (41)\n" +
				"vaziim (27)\n" +
				"wcgfkq (630) -> zermehr, tfaxln, zvtsnz, rukmtyd\n" +
				"ciwydtl (65) -> ezzzomx, fmele, luxtn, uclzjin\n" +
				"ndvkjn (36)\n" +
				"kunzaag (2592) -> mgvovnb, ftntagd, ggmjft\n" +
				"sopjux (81) -> tddqw, iumspgx, ojsntix, uxuwgmz, ehwofnh, zrtrhph, rujdblh\n" +
				"ifengok (20)\n" +
				"hlsvyhx (96)\n" +
				"amzaq (59) -> jmrry, plexk\n" +
				"ehqap (141)\n" +
				"pzoji (47)\n" +
				"tebbb (25)\n" +
				"oglut (40)\n" +
				"zwtuhb (187) -> opilymx, racquh\n" +
				"brxjw (120) -> bkjhdgy, pafuvtn\n" +
				"hlfvf (53)\n" +
				"gkctmh (31)\n" +
				"glveid (267)\n" +
				"fodfvds (77)\n" +
				"ngffuwc (123) -> jjkyj, xczaehv, xpuly, qqdrox\n" +
				"noksmmp (21)\n" +
				"vhzoa (84)\n" +
				"txhcyqf (91) -> cnyyygq, iuuhcc\n" +
				"aauxa (69)\n" +
				"upfhsu (27) -> jukhdvi, lilufvg, rodfe, hvigowx\n" +
				"brxtyug (71)\n" +
				"ciizgft (55)\n" +
				"ebcls (73)\n" +
				"jsrmk (7) -> yukbvwy, tvunonh, yysvm\n" +
				"cletkls (82)\n" +
				"yaqlguh (9)\n" +
				"jylvi (535) -> kjonnd, fisyh, ayuwm\n" +
				"opkren (49)\n" +
				"mukkakg (33)\n" +
				"xjkzvpn (66)\n" +
				"wbydzcm (686) -> ahtqrem, iwbzsq, jafvw, cyyjrf\n" +
				"gdbut (24)\n" +
				"zcptsvh (1651) -> qmwbv, kiueoo, biner, mjfnukc, anlopt\n" +
				"msajn (129) -> qasbblg, yuiqntx\n" +
				"pvowck (43)\n" +
				"deagdif (96)\n" +
				"cdblpel (97)\n" +
				"ojdlcls (78)\n" +
				"ozackw (51)\n" +
				"lkfcgw (40) -> ckpsa, jqkrk\n" +
				"xhzdo (98)\n" +
				"rlnee (55)\n" +
				"zprakvq (213) -> ixruqck, vohmteg, havmool\n" +
				"jcpbsc (36)\n" +
				"knnmsai (24)\n" +
				"cilwhdb (21)\n" +
				"kkeqyo (47)\n" +
				"kzjdhi (48)\n" +
				"ytvsrny (59)\n" +
				"jfdud (68)\n" +
				"jpyfzy (31) -> xjdxfb, hclhewh\n" +
				"djwizu (46)\n" +
				"vrghbl (94)\n" +
				"qjdzqm (144) -> saflt, whfwtio\n" +
				"mruoew (45)\n" +
				"ptvuev (302) -> yplyevo, dptzp\n" +
				"xnjod (73)\n" +
				"xxardb (1219) -> ifhntf, pulfop\n" +
				"qaosty (9)\n" +
				"qydug (7) -> xhyph, ogksb, efmrpp\n" +
				"igfvkh (45)\n" +
				"hablmj (310) -> jyjvxw, ilkrxa\n" +
				"ugtpfof (302) -> uhmypt, sdhvw\n" +
				"kbclwl (98)\n" +
				"dhhcmdj (1815) -> glwvlc, escef, weelykw\n" +
				"uembj (90)\n" +
				"mvrpr (97)\n" +
				"ahtqrem (358) -> cohgcil, pkejtl\n" +
				"ryxauy (28) -> slaiad, njogs\n" +
				"xhpbaer (32) -> zgjabut, oivlxtz\n" +
				"ygqzh (40)\n" +
				"jxszqd (43)\n" +
				"pgozvs (44)\n" +
				"lislxi (80)\n" +
				"olosbi (28)\n" +
				"fawadg (73)\n" +
				"ssngqqp (14)\n" +
				"xjhfgv (81)\n" +
				"vgtvj (52)\n" +
				"gkuqwak (14)\n" +
				"mnrsu (96) -> dvnzgo, slkkm, xxcpmu, izvfjt\n" +
				"ppmjk (289)\n" +
				"aqviuy (6)\n" +
				"kqiupp (157) -> vbysnql, xyfclte\n" +
				"xzjcbwa (376)\n" +
				"svgfqs (1150) -> lgpgt, ndpweps, qwqwp\n" +
				"fibcigx (82)\n" +
				"vjrrptz (60) -> vwzfk, vaziim, fwoavaz\n" +
				"yolqpau (641) -> nhefqs, pfudc, gdpmx\n" +
				"suzkkr (2330) -> ezilows, ndfxn, vwledx\n" +
				"xvbezu (59)\n" +
				"zgltwud (74)\n" +
				"xojyah (84) -> ojlgsc, ghbhqnl, ztngdq, wwtvhb\n" +
				"tfqel (49) -> vmvnrq, mvrpr, awnos, ezbax\n" +
				"wwwep (20)\n" +
				"tpcmp (87) -> mwnczjf, ylkwbm\n" +
				"ytmnrjw (71)\n" +
				"fqorpj (174) -> cltigxi, ntgdq, lehkqty\n" +
				"vuydl (30)\n" +
				"xtcpynj (31920) -> tixcp, wlkzwch, sclfvp, nafrtm, vozeer, ocowqvd\n" +
				"mvice (298) -> ftnzxce, mkuow\n" +
				"ahotpd (80)\n" +
				"ylkwbm (46)\n" +
				"nxtwjc (17)\n" +
				"eolzkkc (24)\n" +
				"juahc (264) -> vrghbl, bdlkkll\n" +
				"cmuclkp (93)\n" +
				"gfhrh (50)\n" +
				"txbkss (72)\n" +
				"ehpzl (87) -> nzwdyjh, lxdlq\n" +
				"dbqlqa (38) -> csmgexg, djzbom\n" +
				"eiynck (41)\n" +
				"eaxlxoy (84)\n" +
				"izllv (121) -> hohmn, oufzuw, ixdxwhj\n" +
				"ohgyus (42)\n" +
				"adkszk (70)\n" +
				"rxbohqw (75) -> qubxyhi, lipbj, kvfwsoc, vdezdp\n" +
				"ylepv (29)\n" +
				"myfhxk (38) -> cyenkm, elqgxm, uxjzpl, ujdhpxh, ukzcbat, ykphap\n" +
				"jaxczdp (25)\n" +
				"fgjcea (19)\n" +
				"ezcmxxy (245) -> yjffdl, esroty\n" +
				"adzhm (55)\n" +
				"mtpbt (152) -> lrxhito, fvdoc, aauxa\n" +
				"hvche (95)\n" +
				"aywgi (5)\n" +
				"jixdvf (7598) -> dohxzvo, tsjzvs, kvmjx\n" +
				"tjvry (2251) -> mxxvvt, arugmz, umttqu\n" +
				"cptoly (9)\n" +
				"nvdducc (65)\n" +
				"vommsj (42)\n" +
				"ozacwy (66)\n" +
				"qhbwsiu (67)\n" +
				"dgfqg (93)\n" +
				"pmczhb (68)\n" +
				"axbupt (21)\n" +
				"svxrmhl (79)\n" +
				"wxruhqa (16) -> dqbhi, zykjenf, fyvrp, ylxgn\n" +
				"kvztqrg (73)\n" +
				"kpxdh (32)\n" +
				"cdqpv (14)\n" +
				"lilufvg (192) -> qjool, eiynck\n" +
				"lgbltl (110) -> orlkabb, rguvpi, rgewan\n" +
				"iodna (37)\n" +
				"wevkbue (6)\n" +
				"ucntsl (50) -> iakcl, vlpbqn\n" +
				"pfudc (47) -> wdlpc, eoeac\n" +
				"rewfxf (87)\n" +
				"bgcjcd (62)\n" +
				"uggjwfl (1393) -> kvsnv, ksledpc, lzbzre\n" +
				"hvjal (99)\n" +
				"gfkxqmk (44) -> nrufh, zymmhlb\n" +
				"qnmgp (28)\n" +
				"yzvarwz (68)\n" +
				"yyhsmd (26)\n" +
				"ukzms (21)\n" +
				"ytbmfpn (68)\n" +
				"evgddir (44)\n" +
				"jdnia (43)\n" +
				"fdozub (58) -> ytbmfpn, fprpmof, hqgbfvn, yzvarwz\n" +
				"brrvjn (15)\n" +
				"cwqou (69) -> uajllsw, diwwjq, pvowck\n" +
				"wcfgubc (32)\n" +
				"ffimin (22)\n" +
				"ikxcldw (23)\n" +
				"spqvn (12168) -> vwbwicx, vqanko, cqtuah\n" +
				"escef (184) -> akzwfo, ltweydr\n" +
				"bneqef (141) -> iaxvd, aocbwq\n" +
				"hszuim (2409) -> yrdsxpn, nlehenc\n" +
				"bowxedw (144) -> qdoevfi, epnfp\n" +
				"lrxhito (69)\n" +
				"vwzfk (27)\n" +
				"fsdvpk (48)\n" +
				"oyumlz (90)\n" +
				"zfavz (28)\n" +
				"lrhclhk (56)\n" +
				"godqs (64)\n" +
				"krvtfsj (82)\n" +
				"qmtfv (37)\n" +
				"ygcph (126) -> irsrtbm, krvnq\n" +
				"vaiqef (42)\n" +
				"hrciraz (43)\n" +
				"vkzhxfv (20)\n" +
				"omvflhe (82)\n" +
				"wwtvhb (74)\n" +
				"kloow (11)\n" +
				"ydxsq (6)\n" +
				"mgboos (385) -> lxeeq, wvyht\n" +
				"iaeemxc (155) -> pnxmraq, aqviuy\n" +
				"cyenkm (1226) -> gkpirl, alvji, orofe\n" +
				"sdhvw (39)\n" +
				"tjqiwyw (50)\n" +
				"bphpr (25)\n" +
				"qwqwp (160) -> dvsntva, qmtfv\n" +
				"ehyzqx (70) -> havmcsf, xhzdo\n" +
				"ygzvz (63)\n" +
				"qqesw (14)\n" +
				"llpifh (45)\n" +
				"konmvry (135) -> kwonpn, mklrsr\n" +
				"vwledx (142)\n" +
				"showzx (51)\n" +
				"iefjz (6)\n" +
				"gvajepy (7)\n" +
				"svpwz (44)\n" +
				"oitkdg (35)\n" +
				"wpgdv (168) -> wcfgubc, akwdkl, skvcg\n" +
				"mxxvvt (69) -> rxmxfno, hjibopk\n" +
				"movvd (66)\n" +
				"ydndqy (98)\n" +
				"uelcs (71)\n" +
				"glcbz (87)\n" +
				"pvqmab (78)\n" +
				"nezlnj (90)\n" +
				"zzjgcli (85)\n" +
				"vmdwgiy (45) -> itpjbr, mxtcb\n" +
				"hrrxs (21)\n" +
				"atgrdn (90) -> hfhqvb, cprxbbf, eqrmhiv, rzhwl, mzbvwk, bncbco\n" +
				"rruyk (14)\n" +
				"nquecpp (32)\n" +
				"mvjii (41) -> rffho, rjuizk, dbqujc, nadgwb\n" +
				"tmejjp (45) -> rvgcgd, leccfrx, pyfps, dnqxg, uxpirup, mvice, kwikqd\n" +
				"oxpur (53)\n" +
				"tkjff (96)\n" +
				"yqigck (264)\n" +
				"oriskzl (20) -> jyffs, jncodb, zzjgcli\n" +
				"bmckl (78)\n" +
				"rlfno (208) -> okian, cptoly, vzhrt, akbciz\n" +
				"jasamk (96)\n" +
				"lqnskaj (84)\n" +
				"tgxpafk (107) -> hivkyyy, vdxdq\n" +
				"whpjefc (231) -> oglqg, jpyaa, lycks\n" +
				"ezilows (80) -> osaofz, bdnrzjl\n" +
				"eywfs (75)\n" +
				"vrbpoms (35) -> nezlnj, pysmz, wctwj, oyumlz\n" +
				"nblsqm (43)\n" +
				"efkixrq (10)\n" +
				"pyaco (84)\n" +
				"phzap (70) -> xnjod, bydub, lgpsy\n" +
				"xhidor (64)\n" +
				"fphhjt (32)\n" +
				"qlbapm (6)\n" +
				"xqyyotm (58)\n" +
				"sxlkxs (314) -> vclbj, tjqiwyw\n" +
				"wyujf (15)\n" +
				"gabcawj (159) -> gxlcwkl, vnrwmwp\n" +
				"csmgexg (89)\n" +
				"suakgk (72)\n" +
				"xcfvrz (226) -> vcjhxmu, ikefepo\n" +
				"xppxn (191) -> btsvt, duckgf, hnfjb, hjwug\n" +
				"mgetjw (57)\n" +
				"togddow (53)\n" +
				"unjxp (10)\n" +
				"hkcuo (89)\n" +
				"irsrtbm (45)\n" +
				"mtypps (48)\n" +
				"ayuwm (214)\n" +
				"rgzrfak (52)\n" +
				"epaztgn (74)\n" +
				"myytdk (98)\n" +
				"enbtzt (62) -> xxrcw, teuku\n" +
				"vgqxpp (38)\n" +
				"qfmofym (25)\n" +
				"chihy (108) -> mxbid, iayol, ceibzne\n" +
				"lratbc (73)\n" +
				"zafhcbb (865) -> rlfno, xpgzx, hwssny\n" +
				"afejk (23)\n" +
				"ftdkcfr (163)\n" +
				"ocxbu (6)\n" +
				"vwbwicx (285) -> yjsminx, wfnzaoj, aaavm, ftdkcfr, itfiqj, xzmnjz\n" +
				"fwoavaz (27)\n" +
				"mwmguqn (19)\n" +
				"gwdrk (72)\n" +
				"jfakaii (209) -> azxmib, dmayk\n" +
				"zjlqjvv (91)\n" +
				"fdetm (89)\n" +
				"bncbco (1876) -> fdbnn, fiqgcz, tcyqi\n" +
				"zjthm (59)\n" +
				"beqyys (57)\n" +
				"lagoq (8)\n" +
				"ftimasv (1482) -> ibszdcc, mohlj, srsuyk, zprakvq, xppxn, mswjlev, tuytxy\n" +
				"ytxlw (51)\n" +
				"knpefcs (68)\n" +
				"mozuwfi (23)\n" +
				"nhttnio (78)\n" +
				"zrrklpo (345)\n" +
				"zcszxf (368) -> fmnil, mjoctb\n" +
				"rqbld (67)\n" +
				"rrohj (49)\n" +
				"zxmpvm (67)\n" +
				"gzsltcw (33)\n" +
				"swoxpas (49)\n" +
				"mpkijdc (47)\n" +
				"reyaoo (185) -> dpahgkv, uqcjwp\n" +
				"odvasfk (26)\n" +
				"xfvxqr (27) -> bmckl, nexgspx\n" +
				"llpllm (63)\n" +
				"wimpgm (31)\n" +
				"ocstme (1659) -> terrhqm, jdpncg, jlpfu\n" +
				"tkaax (7058) -> msajn, czsnue, kfgafaq\n" +
				"ngbto (45)\n" +
				"sfopk (65)\n" +
				"pklfpox (781) -> tnuvu, irtey, inggl, nlztkoh, vrbpoms\n" +
				"navzdpq (85)\n" +
				"wohmy (46)\n" +
				"fumcav (205)\n" +
				"buhoxvf (184) -> jcalbf, anendx\n" +
				"irtey (395)\n" +
				"vpdbtl (62) -> dgebx, nmber, iodna\n" +
				"uyflsu (87)\n" +
				"fprpmof (68)\n" +
				"bzeyrs (80)\n" +
				"fgfhom (22) -> gbjzyvh, fgxaf, tvfhovv\n" +
				"rthyaa (65)\n" +
				"nttyljj (74)\n" +
				"hdpqtg (10989) -> nzbmqoj, ppxmvic, ngzrfo\n" +
				"eaemp (7) -> rdssp, evgddir, sdfdasw\n" +
				"uhjzmx (21)\n" +
				"tswgpqg (66)\n" +
				"cajloqp (327) -> milnj, dsycw\n" +
				"vexiqv (2359) -> ncsglzf, gwfkzhk, ozmoirq\n" +
				"eoyva (59)\n" +
				"vuxcbe (17) -> tznvgv, yiqiioh\n" +
				"sgmtal (87)\n" +
				"ghkyui (88)\n" +
				"rwelv (86)\n" +
				"uoezmkf (66) -> kiismq, rycova, nozqe\n" +
				"yjsminx (19) -> txbkss, psisfe\n" +
				"ngbnryz (85) -> okvaid, djblaef\n" +
				"tcksxcj (12)\n" +
				"ksuydd (20)\n" +
				"ztngdq (74)\n" +
				"bnbvm (44)\n" +
				"cbwrev (15)\n" +
				"rwmqvs (74)\n" +
				"glwvlc (74) -> wqbwqi, hjjfc\n" +
				"sdvzj (12)\n" +
				"fiqgcz (217)\n" +
				"wobzkg (99)\n" +
				"wtpgz (17)\n" +
				"tkxots (9)\n" +
				"vvbijk (212) -> eznjfl, zjthm\n" +
				"cagiues (101) -> ffakxgn, derfr\n" +
				"vczbfs (8)\n" +
				"pxgfxbt (19)\n" +
				"zrovx (52) -> nvdducc, sfopk\n" +
				"xtojoy (70)\n" +
				"svypeua (94) -> dpcpy, phxuazm, txdyn\n" +
				"xmhokd (86)\n" +
				"vftol (62)\n" +
				"magml (150) -> pyklnj, gfdyw\n" +
				"anqaz (72)\n" +
				"mwtqk (125) -> lcuhsxu, mnepu\n" +
				"zgjabut (9)\n" +
				"mfngva (6)\n" +
				"uiges (14517) -> tetbx, hhexmn, ytgqzq, dakenrk, uwscgd, yyauqx\n" +
				"lchstmy (319) -> hhtpv, fgjcea\n" +
				"lxyirze (38)\n" +
				"znqux (302) -> rocyko, guaqgw, operlbg, yzmeb, ukedg, vlxqvi, mveyx\n" +
				"rpnlu (34)\n" +
				"sifvsqc (56)\n" +
				"jatvuw (38)\n" +
				"jtwfdu (3727) -> pavabvy, lqorouz, wbydzcm, bqggi, vtzgyeg\n" +
				"pnejfr (122) -> humrsd, fxrtldx\n" +
				"kgxmev (215) -> rthyaa, zvzzst\n" +
				"iqvvnfr (40)\n" +
				"cfcdlh (96088) -> dwtgak, whuak, rqjpza, qpdufu\n" +
				"zbbyckg (14)\n" +
				"ezzzomx (73)\n" +
				"dgzcgr (70)\n" +
				"kvfwsoc (68)\n" +
				"xvbro (62)\n" +
				"hkqulxp (81)\n" +
				"xinyot (75) -> hdtplwx, tzehi, aeylapx, zcwclwc, dobuzav, prfyjj, kuycibx\n" +
				"dxtne (44)\n" +
				"yceabf (14) -> hnoakdg, zcegp, myytdk, ewfpgoj\n" +
				"mohlj (185) -> ockjo, fbfqvq\n" +
				"aqbybws (315) -> ydxsq, tekqjru\n" +
				"kptbzl (41)\n" +
				"gyxopp (61)\n" +
				"smttd (28)\n" +
				"yaeee (43)\n" +
				"bdmmi (61)\n" +
				"eedcta (45)\n" +
				"wmjxypj (151) -> ykntwjm, fepdsz\n" +
				"orlkabb (55)\n" +
				"qppggd (171) -> oxcth, enbtzt, ntidj, hmibku\n" +
				"gfrdgnq (135) -> aiqug, eelcez\n" +
				"fdgvmi (24)\n" +
				"nddzkn (271) -> hoiju, hroegp\n" +
				"ijhzbaa (14)\n" +
				"fqfdw (87)\n" +
				"uoujbtv (32) -> bowxedw, eberpkh, zqignj, qzhgmb\n" +
				"brsgom (111) -> hatujsc, cmuclkp\n" +
				"igjmm (132) -> qndtc, vjmhzau, nblsqm, fdwlwr\n" +
				"cibabc (181) -> neihdi, yaqlguh, cjhxpn, obxki\n" +
				"duckgf (13)\n" +
				"jgdqth (89)\n" +
				"ganlaq (1168) -> tuuqm, kwiiccw, ydnsh\n" +
				"ahaan (23)\n" +
				"cnvce (88)\n" +
				"ccaeaw (98)\n" +
				"cltigxi (48)\n" +
				"rduns (60) -> gfhrh, sxonkbq\n" +
				"gkbmdh (24)\n" +
				"ghbhqnl (74)\n" +
				"dqbhi (78)\n" +
				"tmbuahz (93)\n" +
				"jektqvn (6)\n" +
				"isxqmc (34)\n" +
				"hohmn (89)\n" +
				"bdnrzjl (31)\n" +
				"fwssgyj (126) -> ncdnc, isxqmc\n" +
				"qdnmni (482) -> sjvdfk, gabcawj, qxvpaqr, gfrdgnq, joutwz, jfakaii, cvmlcyx\n" +
				"qpkxs (20)\n" +
				"qygtd (6)\n" +
				"evofre (192) -> cbjyf, eifitp\n" +
				"wpwzlpm (98)\n" +
				"njhtc (80) -> gozszri, exqxh, gkctmh\n" +
				"hlnram (31) -> cdcdck, wnjdsq, nfpawkr, vybjgy\n" +
				"wctwj (90)\n" +
				"gvjuwwn (244) -> evkyf, dvispjs\n" +
				"fcfujgr (82)\n" +
				"mveyx (190) -> hjhaae, bnbvm, gsxxi\n" +
				"kvopnl (99) -> nddzkn, lcxeysi, mvjii, fagsd, sylbpy, uriyyc\n" +
				"wemcfwy (38)\n" +
				"azxmib (9)\n" +
				"qjvtm (82986) -> myfhxk, boropxd, jixdvf\n" +
				"mrucj (211)\n" +
				"dsycw (9)\n" +
				"mjjvkh (55)\n" +
				"tddqw (11164) -> tzumnfw, ahxse, iixhucd, flywvww, jylvi\n" +
				"nyqht (16) -> qmryr, kljfbe, fqfdw, rewfxf\n" +
				"fpenvio (262) -> gwdrk, ugzxbjw\n" +
				"zykjenf (78)\n" +
				"lgpqna (82)\n" +
				"icojter (76)\n" +
				"vjhja (43)\n" +
				"irxpuis (89) -> rjxxk, jbbpzze\n" +
				"nfgme (81)\n" +
				"pedazr (40)\n" +
				"mxbid (23)\n" +
				"weiik (74)\n" +
				"ixruqck (10)\n" +
				"afiqx (38)\n" +
				"zqignj (136) -> mamhdgl, fesyd\n" +
				"dakenrk (222) -> axstuln, tkxots\n" +
				"nrufh (89)\n" +
				"rjfiqcz (66) -> tcujev, ycmhi, ldehas\n" +
				"kgjmfr (1582) -> ooixr, amzaq, hrdvx\n" +
				"bavhssu (23)\n" +
				"ydwtc (219) -> gxpdbf, otsaip\n" +
				"eelcez (46)\n" +
				"jyffs (85)\n" +
				"xvwkwsk (211)\n" +
				"vbysnql (55)\n" +
				"fpuuwxw (184) -> aowql, ycnqav\n" +
				"fvbygj (419)\n" +
				"qskjee (24)\n" +
				"uxpirup (318) -> bbojh, ghobjvb\n" +
				"fnjqvc (150) -> jlhly, buzsiye\n" +
				"kvsnv (134) -> oaiipqw, wohmy\n" +
				"ejjdfwk (82) -> tkjff, ncfpaw\n" +
				"jpcais (21)\n" +
				"hmibku (44) -> njlxjg, cdblpel\n" +
				"fbmcsl (27)\n" +
				"zcwclwc (289) -> jdvwj, oqixvwe\n" +
				"qosoqk (29)\n" +
				"nnysyj (34)\n" +
				"pkejtl (41)\n" +
				"dplpd (82)\n" +
				"dvoylt (45)\n" +
				"tetbx (120) -> shwph, vuydl, dqxhlmf, yjqdgq\n" +
				"cuupma (96)\n" +
				"qdoevfi (39)\n" +
				"xczaehv (14)\n" +
				"yddiq (96)\n" +
				"neihdi (9)\n" +
				"qebjnbs (25)\n" +
				"vlzoz (32)\n" +
				"psisfe (72)\n" +
				"eppcdr (23)\n" +
				"kazqqf (88)\n" +
				"bqggi (1915) -> ilsvcl, czksrye, chihy\n" +
				"qfjnebk (86) -> hlfvf, qcyua\n" +
				"fvdoc (69)\n" +
				"lhopv (48) -> uuxwz, byxxgzt, fpenvio, pdyjzd, qsetl, rhhlps, yceabf\n" +
				"uwisk (32)\n" +
				"mkisdq (74)\n" +
				"ncfpaw (96)\n" +
				"hldolxr (241)\n" +
				"ounuwsx (78)\n" +
				"slkkm (89)\n" +
				"qzhgmb (222)\n" +
				"vppppj (141) -> gamtq, fbmcsl\n" +
				"yjxmv (8)\n" +
				"uljiu (99)\n" +
				"qmnykar (244) -> aurya, rpnlu\n" +
				"ylxgn (78)\n" +
				"elhde (30)\n" +
				"qljqbt (25)\n" +
				"csyuq (16)\n" +
				"phyop (11)\n" +
				"dbxgdw (46)\n" +
				"dsnwpy (330)\n" +
				"ljcjmur (38)\n" +
				"kskmxw (56)\n" +
				"rjxxk (53)\n" +
				"aaizfj (105) -> qiqvce, pwqisw\n" +
				"jyuvjzz (45)\n" +
				"hzxgz (80)\n" +
				"qcsqz (86)\n" +
				"igjhbnk (19)\n" +
				"eupya (67)\n" +
				"kuycibx (236) -> opkren, muztqt, swoxpas\n" +
				"jvegsv (701) -> wpgdv, xxpnqpc, yqcwdh, brxjw, yqigck\n" +
				"edcrp (141) -> lxyirze, hfqij\n" +
				"cmtpu (54)\n" +
				"iakcl (60)\n" +
				"cdcdck (53)\n" +
				"ujdhpxh (78) -> wxcas, sdhtcgx, vxbas, izllv, hldjtya\n" +
				"osdwzw (330)\n" +
				"mthaau (21)\n" +
				"lczpqwp (111) -> nvvnxlx, qdkcyj\n" +
				"lhurwx (55) -> wrwqsw, bgcjcd\n" +
				"yiqiioh (87)\n" +
				"qpbqzwi (84) -> pkrbgb, hxhkfs\n" +
				"zyneso (51)\n" +
				"dvpjab (76)\n" +
				"otdcfi (24)\n" +
				"jvaqrl (87) -> drenb, vpgxh\n" +
				"sxrjnm (128) -> msrlpql, pmczhb\n" +
				"misjd (92) -> fuaaot, jocdav\n" +
				"phxuazm (62)\n" +
				"txdyn (62)\n" +
				"fkawsxk (84)\n" +
				"pyfps (184) -> csvhlkb, simlgvw\n" +
				"nbonyx (46)\n" +
				"vgwkv (93) -> tuzpg, zzgvh\n" +
				"fxucung (63) -> hkcuo, qvstpyq\n" +
				"operlbg (322)\n" +
				"wymlcoj (205) -> rovaby, hyvhosf, ibfxt\n" +
				"osaofz (31)\n" +
				"pgmctro (45)\n" +
				"kmmng (68)\n" +
				"raaqp (34)\n" +
				"jhrxncw (20) -> jeejn, fylvsj\n" +
				"zfufrfx (21)\n" +
				"gfdyw (29)\n" +
				"texqz (53)\n" +
				"ngbourw (45) -> kmmng, vyiufa\n" +
				"ijhvxea (347)\n" +
				"qpdufu (3326) -> mbmsvws, qwqenwn, dnodp\n" +
				"vclbj (50)\n" +
				"wuwnzr (15)\n" +
				"sokar (62)\n" +
				"gcbrstj (97)\n" +
				"tjrdifv (98) -> sybqi, errqggj\n" +
				"tbpyoxy (5672) -> tfwcyid, szqdnd, lkmcvop\n" +
				"fmele (73)\n" +
				"xhorr (2011) -> egoaw, twbcuh\n" +
				"zwtnf (108) -> zhhhbv, qpkxs\n" +
				"bdlkkll (94)\n" +
				"dtjuno (53)\n" +
				"mlkbqhk (90)\n" +
				"racquh (35)\n" +
				"nvvnxlx (40)\n" +
				"crxpc (153) -> beqyys, empap\n" +
				"xxsxwrm (15) -> eonodgj, eulpqss\n" +
				"ykphap (920) -> ehpzl, jhahcgn, wmjxypj, izkcvii, riuhtpn, xfvxqr\n" +
				"letus (9)\n" +
				"abnzhwd (55)\n" +
				"waznyo (20) -> rrhbmgi, dhltapo, wpwzlpm, kbclwl\n" +
				"hroegp (59)\n" +
				"mapirt (2822) -> djwizu, dbxgdw\n" +
				"ykdkp (25)\n" +
				"tgtwgnl (272) -> hkjbbs, nuuvgid\n" +
				"yzmeb (74) -> bouvy, ziaty, uamdcy, xvbro\n" +
				"utnjrpg (97)\n" +
				"wacijzk (202)\n" +
				"nfexc (71)\n" +
				"snpwaur (82)\n" +
				"fwzkvc (66) -> lrkttbz, dwuakz\n" +
				"lliow (117) -> pbdoak, rwelv\n" +
				"tsjzvs (39) -> grrmgdv, sczzyjo, jauxc, cqhxddr, vnxrh, mrucj, xvwkwsk\n" +
				"ixlerg (852) -> nnysyj, shdht\n" +
				"nnmcrj (35)\n" +
				"xdgbnoj (45)\n" +
				"jyjvxw (9)\n" +
				"czksrye (51) -> uphktul, llpllm\n" +
				"thdermn (50) -> uzasvyd, zgnyiz\n" +
				"uajllsw (43)\n" +
				"xlgffbd (59)\n" +
				"ldehas (66)\n" +
				"ctbubmz (134) -> tebbb, qljqbt\n" +
				"qnovi (140) -> bykcfy, qosoqk\n" +
				"qcaxee (54)\n" +
				"dtgnqs (67)\n" +
				"jqmpf (90)\n" +
				"jlcvhl (6)\n" +
				"xhyph (78)\n" +
				"iyqzno (59) -> jbhoa, dteoa, qemad, mtjcqtg\n" +
				"zkpghh (98)\n" +
				"rsebscc (109) -> clxasb, ozacwy\n" +
				"zrmtgk (62) -> wobzkg, hvjal\n" +
				"vybjgy (53)\n" +
				"uvfhx (84)\n" +
				"yonamnd (58) -> knyhb, byhqi, vfkeogg, zoagmd\n" +
				"jukhdvi (116) -> vkgbz, vktrdf\n" +
				"hujizfz (59)\n" +
				"uokfe (12)\n" +
				"trwyel (41)\n" +
				"tskeqa (75)\n" +
				"ikefepo (46)\n" +
				"qumhu (24)\n" +
				"wtjzsm (62)\n" +
				"muztqt (49)\n" +
				"fqpfnc (876) -> wymlcoj, rhsqn, rpcczq, vhdbfe, novtxck, svypeua\n" +
				"dntft (7)\n" +
				"sdfdasw (44)\n" +
				"iaaws (68)\n" +
				"dqrwhri (178) -> iztdlnf, hhjgskh\n" +
				"ucjde (44)\n" +
				"kiismq (42)\n" +
				"grvkl (99)\n" +
				"avrfz (57)\n" +
				"byhqi (58)\n" +
				"oykcbpj (298) -> acwtk, mxogohe\n" +
				"njlxjg (97)\n" +
				"pdxgf (236) -> khumo, qlxowz\n" +
				"havmcsf (98)\n" +
				"ceixcl (12)\n" +
				"wurjtrm (33)\n" +
				"mkdxj (97)\n" +
				"ygoxtx (91)\n" +
				"fmnil (16)\n" +
				"nvbococ (118) -> bkhnhga, nmlmm\n" +
				"upstldy (21)\n" +
				"iojycd (158) -> frmmub, mjjvkh, xeblqw, wrrdy\n" +
				"nowyljq (184) -> getbk, eveoo\n" +
				"oqqnazv (71) -> pjrtj, godqs\n" +
				"tflcc (201) -> fmzpc, upstldy\n" +
				"bkcozk (66)\n" +
				"osfsey (25) -> ueikvt, ndpwr\n" +
				"whszfc (135) -> illzp, droaqx\n" +
				"npiost (58)\n" +
				"pyfyx (25)\n" +
				"ftomb (69)\n" +
				"irxbhi (96)\n" +
				"espkomt (97)\n" +
				"acwtk (25)\n" +
				"qmwbv (157) -> tcksxcj, ccxsuk\n" +
				"rgewan (55)\n" +
				"mwbzjrn (72)\n" +
				"kcawhph (23)\n" +
				"ukedg (262) -> elhde, aeeyxh\n" +
				"xtckrp (36) -> eelwu, kwwhiv, brzrx\n" +
				"lcobq (109) -> yafph, bczzzw\n" +
				"mfhtd (89) -> vpqmdqf, btxgac\n" +
				"qqdrox (14)\n" +
				"mxrvwib (36)\n" +
				"nxlzxzq (37)\n" +
				"yukbvwy (89)\n" +
				"bhfkje (15)\n" +
				"arhfcx (99)\n" +
				"sybqi (55)\n" +
				"xsdlmg (59)\n" +
				"lyqbnl (47)\n" +
				"slaiad (11)\n" +
				"qignfgc (99)\n" +
				"iuuhcc (54)\n" +
				"kljfbe (87)\n" +
				"itpjbr (98)\n" +
				"fxrtldx (35)\n" +
				"hhxofiu (80) -> tmejjp, srqipi, jpsoy\n" +
				"qoxcvs (12)\n" +
				"iayol (23)\n" +
				"vtzgyeg (59) -> ingzgv, khaxl, cejlti, iuuck, alsrt, fpwfhqa, sabkxwy\n" +
				"rbhzdm (40)\n" +
				"wuezook (82)\n" +
				"qjjjm (60)\n" +
				"marrb (15)\n" +
				"pyklnj (29)\n" +
				"hgqsp (99)\n" +
				"jiorqgn (136) -> dbdne, pnejfr, qfjnebk, uoezmkf, dqrwhri\n" +
				"duruha (25)\n" +
				"fisyh (46) -> dpygp, nglwlyl\n" +
				"dpqsg (290)\n" +
				"byxxgzt (386) -> nyghbkz, unjxp\n" +
				"omzvw (83) -> owaqfb, betkfui, xklmcmc, avemla\n" +
				"juaekax (21)\n" +
				"bczzzw (66)\n" +
				"dmayk (9)\n" +
				"jdpncg (90) -> oqpxd, sifvsqc, rrdin\n" +
				"iaxvd (51)\n" +
				"uriyyc (261) -> vlzoz, worqvps, flcyx, lzfuzm\n" +
				"agpuxcs (17)\n" +
				"flays (52) -> uyflsu, awhgs, apwqbdt, vmcdxsc\n" +
				"aijyga (49)\n" +
				"paetkc (854) -> pmttpt, ihvtb, ucntsl\n" +
				"zvzzst (65)\n" +
				"untiezr (6) -> erzpzd, movvd, ecrkcs\n" +
				"ndflhsj (1709) -> azzpq, ngbourw, ypccy, jmpyaib\n" +
				"asiigv (25) -> fbebcq, lchstmy, ciwydtl\n" +
				"wcmif (86)\n" +
				"bydub (73)\n" +
				"terrhqm (242) -> ydpxkx, pdebsm\n" +
				"dzdgx (35)\n" +
				"empap (57)\n" +
				"wuavkqo (68) -> davnh, mukkakg\n" +
				"pfbukuq (33)\n" +
				"zeien (79)\n" +
				"blntgdj (35)\n" +
				"rrdin (56)\n" +
				"aycnip (42) -> iyhuvj, kunzaag, ftimasv, zxcjlk, mlvpmj\n" +
				"oipjur (178) -> cipzed, ijhzbaa\n" +
				"efvwgf (41)\n" +
				"ctjyra (89)\n" +
				"jstihz (93) -> ulymdk, uiqzhqu, vhzoa\n" +
				"ehwofnh (18) -> kvopnl, kaihb, ocstme, hszuim, mjnjzet, dhhcmdj, ndflhsj\n" +
				"nlehenc (12)\n" +
				"dsoipkq (93)\n" +
				"qlxowz (37)\n" +
				"fppwvpe (84)\n" +
				"tmzvfia (93)\n" +
				"ufryj (412)\n" +
				"nzbmqoj (416) -> fjgns, igbiz, iqefm\n" +
				"kgclit (49)\n" +
				"bjtca (22)\n" +
				"xxrcw (88)\n" +
				"sclfvp (7741) -> psmlok, kgjmfr, grqfud\n" +
				"cjwnq (191) -> uihbo, lqnskaj\n" +
				"qubxyhi (68)\n" +
				"fhpik (42)\n" +
				"vaxierg (63)\n" +
				"ayrmwy (77)\n" +
				"qkshp (85)\n" +
				"feope (63)\n" +
				"zymmhlb (89)\n" +
				"hdfugh (44)\n" +
				"gsxxi (44)\n" +
				"alvji (226) -> pxgfxbt, klflx\n" +
				"tillos (262) -> zxqbpy, nntot\n" +
				"ngwdz (96)\n" +
				"xjdxfb (82)\n" +
				"ncsglzf (151) -> tsasgm, phltmve\n" +
				"anlopt (139) -> apbzweg, zcxsxky\n" +
				"nfpfpq (97)\n" +
				"zgnyiz (66)\n" +
				"flspx (15)\n" +
				"pofye (42)\n" +
				"xftjd (93) -> racbcat, zefywno\n" +
				"rukmtyd (192) -> wfaus, zeipd\n" +
				"fzivpz (64) -> espkomt, nfpfpq, mjkgsg, mkdxj\n" +
				"dmbdxs (78)\n" +
				"uaofl (27)\n" +
				"kdbbkg (22)\n" +
				"owbhv (151) -> klaqkg, qskjee\n" +
				"uajkvy (212) -> odpuf, wyujf, pprsdm\n" +
				"kikni (59)\n" +
				"myfkdkl (17)\n" +
				"dttxe (24)\n" +
				"iwejes (8)\n" +
				"qjamq (52)\n" +
				"ypccy (39) -> itimbmg, ekzro\n" +
				"djdiyl (51) -> zyxswnx, maykdnd\n" +
				"jalyzrg (189) -> socgh, nqdab\n" +
				"plexk (87)\n" +
				"eberpkh (62) -> bzeyrs, ahotpd\n" +
				"mwnczjf (46)\n" +
				"ibszdcc (151) -> bavhssu, ikxcldw, ahaan, afejk\n" +
				"iipyba (25)\n" +
				"bubcg (42)\n" +
				"vdlhr (88)\n" +
				"bkjpa (626) -> zbtgzh, jalyzrg, ppmjk, lliow, ydwtc\n" +
				"qerhwfp (122) -> vxbieux, wcmif, aktlne\n" +
				"skvcg (32)\n" +
				"tnjkbcd (51)\n" +
				"genete (23)\n" +
				"ndpwr (87)\n" +
				"aurya (34)\n" +
				"dqmcksd (64)\n" +
				"cjikbu (6)\n" +
				"eifitp (15)\n" +
				"aeylapx (383)\n" +
				"errqggj (55)\n" +
				"lpflvwn (296) -> iqvvnfr, pedazr\n" +
				"tvgfdb (88) -> kcawhph, genete\n" +
				"jpjbtm (96)\n" +
				"dujlhd (83)\n" +
				"ilsvcl (95) -> dqabk, efvwgf\n" +
				"novtxck (234) -> oijissd, mozuwfi\n" +
				"gxpdbf (35)\n" +
				"pxkxjy (20)\n" +
				"fylvsj (82)\n" +
				"cyxvk (81)\n" +
				"uhvtx (5)\n" +
				"tziitox (41) -> mtlutxf, lukls\n" +
				"jdvwj (47)\n" +
				"wdlpc (97)\n" +
				"xriycgo (121) -> fkuvh, showzx\n" +
				"dnodp (148) -> rxcyz, qfdlr, xavay, srofdd\n" +
				"saflt (60)\n" +
				"kmjbuf (51) -> kebxaum, dfmrhz\n" +
				"pbdoak (86)\n" +
				"qszzvq (15)\n" +
				"twdlx (88)\n" +
				"pduiy (1736) -> dgfjw, xqyyotm\n" +
				"frmmub (55)\n" +
				"mlvpmj (2598) -> vppppj, jpyfzy, irxpuis\n" +
				"diiqyx (26)\n" +
				"xuknyi (273) -> gvotglo, dnaclwb\n" +
				"tuzpg (13)\n" +
				"hhexmn (225) -> hcvfmh, aywgi, bcyusmh\n" +
				"qxvfq (204)\n" +
				"jncodb (85)\n" +
				"uihbo (84)\n" +
				"islbpsv (82)\n" +
				"omqxa (81)\n" +
				"aaavm (163)\n" +
				"ecblhee (55)\n" +
				"zrtrhph (6535) -> czwrn, jaiqco, tppwhd, wcgfkq, ynsjo, vhysl, nuwaia\n" +
				"ckpsa (84)\n" +
				"ykoyzh (12) -> sqdyn, ghbmnod\n" +
				"rycova (42)\n" +
				"izgkl (32)\n" +
				"fozofs (47)\n" +
				"dnrle (15)\n" +
				"hkqdsjx (360) -> wpzcj, tnrej\n" +
				"elqgxm (1472) -> thdermn, fnjqvc, zrovx\n" +
				"hcvfmh (5)\n" +
				"bykcfy (29)\n" +
				"hvqex (45)\n" +
				"grrmgdv (151) -> clbkb, pzbnrp, zaccgw, dnrle\n" +
				"haphukg (62)\n" +
				"jjrcs (45)\n" +
				"vmnys (100) -> npiost, shwsc, hqesnp\n" +
				"ghobjvb (21)\n" +
				"pvesfah (202)\n" +
				"hmdvz (38)\n" +
				"hjjfc (66)\n" +
				"cqgdvfr (13) -> kpgzhfa, uembj\n" +
				"igbiz (77) -> qcsqz, qtmszjy, hqqcmi\n" +
				"pafhmi (41)\n" +
				"brzrx (379) -> yjxmv, szwdc, iwejes, xrbipx\n" +
				"kfgafaq (95) -> anqaz, mwbzjrn\n" +
				"jxmvpr (8)\n" +
				"xklmcmc (84)\n" +
				"ykrdbmw (66) -> ptvuev, juahc, mnrsu, eqzjl, oseerig, ufcaif\n" +
				"jhahcgn (19) -> nzorq, sipdbpd\n" +
				"xksfmz (1213) -> wacijzk, pvesfah, anobpj, vounq\n" +
				"qxcds (27) -> qmnjlw, hvche\n" +
				"durpmst (28)\n" +
				"krtdc (266)\n" +
				"dpcpy (62)\n" +
				"sfdtqc (63) -> jqmpf, mlkbqhk\n" +
				"vnbuj (20)\n" +
				"opath (91) -> fdozub, dsnwpy, vvbijk, osdwzw, rxmvx, icmfzt\n" +
				"vhvmcal (6)\n" +
				"kpbdkq (260) -> lczyx, ncffowp\n" +
				"yyauqx (80) -> lislxi, rotbjjy\n" +
				"rguvpi (55)\n" +
				"iyhuvj (19) -> nopmvrz, fzivpz, nzskcw, pkhhbp, edpkt, eodye, lyxaz\n" +
				"zwtznsv (49) -> fwwvg, twdlx, skhjby, kfrar\n" +
				"shdht (34)\n" +
				"qoouyiw (1117) -> wwxctxk, suslpgz, rduns\n" +
				"jvhnuoq (44)\n" +
				"bouvy (62)\n" +
				"olvnqyu (23) -> kuwuy, gcbrstj\n" +
				"nakiug (78)\n" +
				"ajqaniw (48) -> uzowuwt, dxtne\n" +
				"mzbvwk (1081) -> dynfb, qydug, rsebscc, fxucung, hldolxr, jbutmk\n" +
				"axouzs (199) -> urvwum, blafijn, ytacid, ysbjlf, qmnykar, vebuhzt\n" +
				"albxmd (89)\n" +
				"slvkou (42) -> xcdycx, dplpd\n" +
				"pzbnrp (15)\n" +
				"vvyhqon (8)\n" +
				"pqrcl (171) -> ojdlcls, dmbdxs\n" +
				"lnuve (840) -> zjowzz, cllhod, uzzuddz, agzideh, mzfmw, chzno\n" +
				"ukzcbat (884) -> rxhmtg, iojycd, mpjvq\n" +
				"pmttpt (140) -> wuwnzr, bhfkje\n" +
				"mvlvwo (66) -> yogzh, xstglba, zwtznsv\n" +
				"yafph (66)\n" +
				"uhtmhy (84)\n" +
				"wnjdsq (53)\n" +
				"evliz (151) -> nxtwjc, agpuxcs\n" +
				"pdawj (39) -> ytxlw, ozackw\n" +
				"ftntagd (27) -> qkshp, zwxkyn\n" +
				"flywvww (598) -> cqgdvfr, dhugaw, whszfc\n" +
				"vhjri (92)\n" +
				"jnenzeu (171) -> wqtcnyz, krfwuk\n" +
				"zjowzz (67) -> ebcls, lratbc, kvztqrg\n" +
				"jgvsp (52) -> jeqlbxq, kzjdhi\n" +
				"ohpvb (69)\n" +
				"seztb (7)\n" +
				"oqixvwe (47)\n" +
				"mgvovnb (127) -> blntgdj, dzdgx\n" +
				"eyfds (88)\n" +
				"lkmcvop (35) -> zpqlfyn, twgajx, yafxw\n" +
				"isesfdw (48)\n" +
				"ywsjwhi (80)\n" +
				"mklrsr (54)\n" +
				"kxotrd (61) -> sjyymi, wrtarf\n" +
				"pavbfb (14)\n" +
				"serls (40)\n" +
				"gpkgkv (59) -> aqbybws, zzlgja, ajjyaog, qkgtzy, pqrcl, gimjz\n" +
				"ftnzxce (31)\n" +
				"qxvpaqr (183) -> dhgfms, gjbeou, phyop, sfevya\n" +
				"edpkt (368) -> ohgyus, pofye\n" +
				"joutwz (215) -> wxeki, jlcvhl\n" +
				"zvldmx (22)\n" +
				"vmcdxsc (87)\n" +
				"fvkqehj (37)\n" +
				"jjkyj (14)\n" +
				"fcakejv (4140) -> ykrdbmw, jzklwrz, kjfmxih, wlppp\n" +
				"kaihb (1131) -> kxotrd, qxcds, cagiues, edcrp, olvnqyu, cibabc\n" +
				"tcyqi (77) -> xtojoy, adkszk\n" +
				"whuak (62) -> idqfawa, ganlaq, odqkxi\n" +
				"nzorq (82)\n" +
				"jyjkwnc (49)\n" +
				"lczyx (77)\n" +
				"gynwzem (92) -> uhtmhy, yixmif, fppwvpe\n" +
				"dptzp (75)\n" +
				"erlwita (34)\n" +
				"gekwq (77)\n" +
				"vbrwu (51)\n" +
				"pqrvq (41)\n" +
				"fdbnn (61) -> pvqmab, nhttnio\n" +
				"mcihl (24)\n" +
				"ncmsneu (344)\n" +
				"fpqfvd (79)\n" +
				"vogdr (45)\n" +
				"ncffowp (77)\n" +
				"ushmwu (97) -> niiwne, bdudb\n" +
				"fmdxpvz (24)\n" +
				"vbukg (15) -> npjbfxb, vyfkoc, invkz\n" +
				"wlfzzwr (62)\n" +
				"mjoctb (16)\n" +
				"ipwdq (76)\n" +
				"hwssny (78) -> vpvvmqv, dujlhd\n" +
				"zfjuv (88)\n" +
				"qbepv (67)\n" +
				"xrbipx (8)\n" +
				"uafzt (78)\n" +
				"pwhdea (96)\n" +
				"izxkgl (81)\n" +
				"biner (121) -> qvvgle, aptrqbk, nmcxmr\n" +
				"szqdnd (284) -> xxsxwrm, eaemp, alpoep\n" +
				"ihvtb (130) -> pxkxjy, vnbuj\n" +
				"wjpvpg (53) -> tfqel, wfnrq, mgboos\n" +
				"pysmz (90)\n" +
				"stqsnlz (89) -> odvasfk, eieqwo\n" +
				"dtbgg (26)\n" +
				"zermehr (66) -> buwffdx, icojter\n" +
				"sefzkr (118) -> igfvkh, upvzg\n" +
				"vpvvmqv (83)\n" +
				"ufyxgmv (73) -> xjkzvpn, tvzbk\n" +
				"nlztkoh (383) -> jektqvn, cjikbu\n" +
				"vhysl (346) -> ezcmxxy, phzap, clfvfbd, reyaoo\n" +
				"fkcwv (71)\n" +
				"vhdbfe (214) -> wurjtrm, pfbukuq\n" +
				"ziaty (62)\n" +
				"rrhiz (113) -> pxknh, htxwgxj\n" +
				"aeeyxh (30)\n" +
				"ddiqs (89)\n" +
				"ugyebr (82) -> mgetjw, eecdh, fcxag, muburl\n" +
				"hobrps (112) -> epaztgn, mkisdq\n" +
				"tvlhxbd (94)\n" +
				"edshwfr (50)\n" +
				"qwtss (91) -> duruha, qebjnbs\n" +
				"horkr (38)\n" +
				"vsyhi (35)\n" +
				"klaqkg (24)\n" +
				"wirzgw (12)\n" +
				"oglqg (6)\n" +
				"uxjzpl (1247) -> zwtuhb, jvaqrl, uajkvy\n" +
				"qdoici (98)\n" +
				"gvotglo (12)\n" +
				"myaznzp (162) -> ffzpfp, xhidor\n" +
				"fdwlwr (43)\n" +
				"cqhxddr (211)\n" +
				"pmhmqfc (89)\n" +
				"zcxsxky (21)\n" +
				"nqdab (50)\n" +
				"emyiqu (67)\n" +
				"vyfkoc (94)\n" +
				"ohkkn (32)\n" +
				"zqnrzvk (15)\n" +
				"jpadrxu (29)\n" +
				"mxtcb (98)\n" +
				"ylysm (1333) -> pmosxof, njhtc, vpdbtl\n" +
				"ennlusa (138) -> eedcta, mzmyto, pgmctro, eakfc\n" +
				"sbovaf (84)\n" +
				"mwikxz (21)\n" +
				"hxhkfs (88)\n" +
				"gcjdpx (8) -> dntxe, grvkl\n" +
				"cpnwxr (34)\n" +
				"sylbpy (355) -> omtrskm, mhzpj\n" +
				"rhsqn (204) -> afiqx, hmdvz\n" +
				"umttqu (221)\n" +
				"gozszri (31)\n" +
				"leaohjx (84)\n" +
				"vcjhxmu (46)\n" +
				"zyybpa (50)\n" +
				"iumspgx (1713) -> fqpfnc, lnuve, oyrmwz, zcptsvh, znqux, grgkrf\n" +
				"yaueae (352) -> sdvzj, wfnrlgo\n" +
				"tpnnkuw (190) -> nxlzxzq, fvkqehj\n" +
				"jntictz (131) -> ifengok, vkzhxfv, tsdgx\n" +
				"ewfpgoj (98)\n" +
				"qasbblg (55)\n" +
				"dbdne (39) -> zyneso, svxpof, mtwbsrl\n" +
				"cwwwj (201) -> pdxgf, ugyebr, tillos\n" +
				"grksx (23)\n" +
				"kemdk (6)\n" +
				"ysbjlf (144) -> pyaco, leaohjx\n" +
				"nlbvsaj (47)\n" +
				"eyovcb (195) -> lhurwx, qwqzr, tpcmp, ngffuwc, nmdit, xfwju\n" +
				"uwscgd (48) -> bjkfl, jpjbtm\n" +
				"ojsntix (6025) -> xinyot, pklfpox, suzkkr, fhifg\n" +
				"eluqn (226) -> kikni, ytvsrny\n" +
				"bbojh (21)\n" +
				"dhgfms (11)\n" +
				"mtwbsrl (51)\n" +
				"mgene (12150) -> xtckrp, mvlvwo, eyovcb\n" +
				"iuuck (93) -> gwkdpj, ximfci, wlfzzwr, mopos\n" +
				"teuhjl (14)\n" +
				"orofe (52) -> oxpur, ullgsq, texqz, bssnhty\n" +
				"tppwhd (46) -> zpxbc, buhoxvf, nyqht, asgmujz\n" +
				"hnoakdg (98)\n" +
				"dqxhlmf (30)\n" +
				"luxtn (73)\n" +
				"kkzzctu (12) -> ygoxtx, zjlqjvv\n" +
				"eoeac (97)\n" +
				"qwqzr (179)\n" +
				"ydapn (41)\n" +
				"zzgvh (13)\n" +
				"iebfp (86)\n" +
				"cvmgc (98)\n" +
				"cllhod (286)\n" +
				"vlpbqn (60)\n" +
				"qnbxo (206) -> nxfjeuy, teafht\n" +
				"rjuizk (87)\n" +
				"twbcuh (5)\n" +
				"kavzymu (248) -> vgfve, letus\n" +
				"ohgok (98)\n" +
				"qfdlr (72) -> zyybpa, zyqsny\n" +
				"wlppp (2421) -> jiybk, ctebhmp, vgwkv\n" +
				"qkgtzy (204) -> trwyel, kptbzl, fxaom\n" +
				"sdjshz (55)\n" +
				"fzrfow (32) -> dntzv, qaosty\n" +
				"vmlmrk (109) -> zpdcajt, hdfugh\n" +
				"skhjby (88)\n" +
				"fgxaf (20)\n" +
				"ngzrfo (431) -> pbebtfc, ndgra, texjaoa, cwqou, qnovi\n" +
				"mbmsvws (662) -> yhmclb, glcbz\n" +
				"nglwlyl (84)\n" +
				"gamtq (27)\n" +
				"jtxvw (80) -> dgfqg, tcymb, rtjax\n" +
				"yjffdl (22)\n" +
				"xecjyv (74)\n" +
				"dpygp (84)\n" +
				"mqhwy (74)\n" +
				"bkhnhga (97)\n" +
				"yplyevo (75)\n" +
				"xzxsnus (54)\n" +
				"aktlwea (43)\n" +
				"oyyfhxh (84) -> togddow, dtjuno, twhnzo\n" +
				"xndzibu (40)\n" +
				"hbabeiy (300) -> nfomnyt, kuqmkzc\n" +
				"hoiju (59)\n" +
				"fnbpxoq (646) -> fscnkbm, ygzyhpx, buplvox\n" +
				"okian (9)\n" +
				"kwiiccw (9) -> cyxvk, hkqulxp, nfgme\n" +
				"lyfsi (34)\n" +
				"kpgzhfa (90)\n" +
				"lyxaz (388) -> ohkkn, fphhjt\n" +
				"xcdycx (82)\n" +
				"subedu (96) -> aijyga, hmsfs\n" +
				"yhhzefl (272) -> knnmsai, vhgtr, eolzkkc\n" +
				"shdbfhl (96)\n" +
				"xcaqylz (11)\n" +
				"iahug (397) -> waangt, nqijykz, pnhmvd\n" +
				"xyfclte (55)\n" +
				"knyhb (58)\n" +
				"nntot (24)\n" +
				"iixhucd (13) -> fwssgyj, kkzzctu, fpuuwxw, subedu, ycnfy, vkufxby\n" +
				"eflbhmn (77)\n" +
				"qqkvxv (52)\n" +
				"zaccgw (15)\n" +
				"vqbvnf (31)\n" +
				"agzideh (214) -> eelrlu, mxrvwib\n" +
				"znslgho (67)\n" +
				"amrvw (52)\n" +
				"tcujev (66)\n" +
				"xzmnjz (59) -> diiqyx, pahywto, ucozsnh, zwjuqr\n" +
				"euaku (22)\n" +
				"jqkrk (84)\n" +
				"ytgdbn (22)\n" +
				"buhmvt (24)\n" +
				"ygeeepa (32) -> hywytz, ehyzqx, kavzymu, krtdc\n" +
				"tfaxln (196) -> kloow, vpmyvzz\n" +
				"mtlutxf (78)\n" +
				"wgbupli (63)\n" +
				"pahywto (26)\n" +
				"hmsfs (49)\n" +
				"pavabvy (1241) -> grbnbad, lcobq, sinfhwq, vmdwgiy, xvjmz\n" +
				"tenzlo (12)\n" +
				"apwqbdt (87)\n" +
				"hfqij (38)\n" +
				"aocbwq (51)\n" +
				"kwonpn (54)\n" +
				"gzxpx (52)\n" +
				"vyiufa (68)\n" +
				"rhhlps (318) -> jvhnuoq, cfhbh\n" +
				"zvtsnz (176) -> jpcais, pgllqy\n" +
				"uuxwz (360) -> kjbps, idxgock\n" +
				"nzskcw (400) -> dtbgg, yyhsmd\n" +
				"ufcaif (408) -> ffimin, fohnt\n" +
				"hiotqxu (877) -> ohlhl, lpweyw, fgfhom\n" +
				"qahbhq (151) -> emyiqu, znslgho, dtgnqs, eupya\n" +
				"pdebsm (8)\n" +
				"wfnzaoj (133) -> zqnrzvk, marrb\n" +
				"rxhmtg (244) -> puzsftr, qhbwsiu\n" +
				"vdezdp (68)\n" +
				"krfwuk (63)\n" +
				"rffho (87)\n" +
				"slbun (66)\n" +
				"rybovf (34)\n" +
				"sxonkbq (50)\n" +
				"cqtuah (63) -> flays, hkqdsjx, zcszxf\n" +
				"czmxofi (81)\n" +
				"qjool (41)\n" +
				"lnnhuld (43)\n" +
				"pxknh (36)\n" +
				"dvispjs (15)\n" +
				"shwsc (58)\n" +
				"jaiqco (950) -> ctbubmz, vaale, jhrxncw\n" +
				"zyqsny (50)\n" +
				"btsvt (13)\n" +
				"rfuqci (64) -> xjhfgv, omqxa, obkparr, izxkgl\n" +
				"dfxox (146) -> horkr, wemcfwy, ljcjmur\n" +
				"nmcxmr (20)\n" +
				"kjfmxih (2163) -> nuomen, ufyxgmv, fumcav\n" +
				"ntidj (214) -> qoxcvs, ceixcl\n" +
				"quhyxh (274)\n" +
				"awhgs (87)\n" +
				"horeib (340) -> jcpbsc, pcdpxv\n" +
				"czsnue (183) -> durpmst, olosbi\n" +
				"fgcjopa (52)\n" +
				"lfveq (292) -> jgrigjx, oiyohma, qumhu, dttxe\n" +
				"ahhqrp (55)\n" +
				"rtgpmf (94) -> dvoylt, llpifh, yusdv, hvqex\n" +
				"qxkcxj (46)\n" +
				"gbjzyvh (20)\n" +
				"ksizuia (77)\n" +
				"frvqvlo (92)\n" +
				"okvaid (79)\n" +
				"mxogohe (25)\n" +
				"ullgsq (53)\n" +
				"vnrwmwp (34)\n" +
				"rujdblh (15833) -> ihtcuq, tvhkggh, igjmm, pbonnr\n" +
				"yogzh (305) -> mtypps, pmytxie\n" +
				"xhljlrn (6)\n" +
				"tbhdon (72)\n" +
				"uutzk (77)\n" +
				"tzehi (199) -> swkfz, vhjri\n" +
				"dynfb (131) -> abnzhwd, fxrkpax\n" +
				"cfhbh (44)\n" +
				"zxqbpy (24)\n" +
				"lzbzre (97) -> vjhja, obctcme, yaeee\n" +
				"ppxmvic (45) -> gynwzem, yhhzefl, eluqn, ncmsneu\n" +
				"pnhmvd (242)\n" +
				"dhpoh (5)\n" +
				"wrwqsw (62)\n" +
				"gxgnzi (186) -> lmrhhj, uaofl, yiipi\n" +
				"joryqqt (44)\n" +
				"uvvsl (67) -> xlgffbd, zdbjk\n" +
				"nqijykz (168) -> fmtzdw, jwrcrra\n" +
				"kfrar (88)\n" +
				"rovaby (25)\n" +
				"mkuow (31)\n" +
				"guaqgw (130) -> vjfkl, pwhdea\n" +
				"lehkqty (48)\n" +
				"twgajx (174) -> uokfe, oircg, wirzgw, tenzlo\n" +
				"krvnq (45)\n" +
				"gdpmx (77) -> gachpm, zcohp, pqrvq, pafhmi\n" +
				"hdtplwx (255) -> gahopg, dqmcksd\n" +
				"xszbzi (13) -> sxrjnm, ewowmhn, qjdzqm, tpnnkuw, rjfiqcz, nowyljq\n" +
				"mjryqy (118) -> qjamq, vgtvj\n" +
				"rvgcgd (332) -> kwfghyi, gvajepy, seztb, dntft\n" +
				"npwjod (7625) -> ryxauy, fzrfow, xhpbaer\n" +
				"kwwhiv (263) -> zgltwud, weiik\n" +
				"lrqskol (11)\n" +
				"eonodgj (62)\n" +
				"srqipi (1107) -> uxxwj, tgxpafk, sfdtqc, konmvry, tflcc, ngbnryz\n" +
				"bcyusmh (5)\n" +
				"kwikqd (274) -> jdnia, wdjpqq\n" +
				"saqta (60)\n" +
				"hivkyyy (68)\n" +
				"zeipd (13)\n" +
				"wfnrq (45) -> ccaeaw, qdoici, cvmgc, wpulnl\n" +
				"zzypx (96)\n" +
				"nopmvrz (340) -> rrfyhi, lrhclhk\n" +
				"ezbax (97)\n" +
				"oyrmwz (42) -> fvbygj, omzvw, ieejg, qahbhq, vjaffbt, poywgwi\n" +
				"eznjfl (59)\n" +
				"dmawkm (6)\n" +
				"hclhewh (82)\n" +
				"qcyua (53)\n" +
				"vzylhou (36)\n" +
				"nhylqxq (88)\n" +
				"ueikvt (87)\n" +
				"fkuvh (51)\n" +
				"rrfyhi (56)\n" +
				"btxgac (55)\n" +
				"buwffdx (76)\n" +
				"pwqisw (72)\n" +
				"uzzuddz (146) -> dgzcgr, anprhpf\n" +
				"ygzyhpx (84) -> gzsltcw, fhsxx\n" +
				"jeqlbxq (48)\n" +
				"esroty (22)\n" +
				"zdbjk (59)\n" +
				"lpxcjq (46)\n" +
				"akbciz (9)\n" +
				"njogs (11)\n" +
				"rpcczq (134) -> jnpwbjj, fawadg\n" +
				"ycnfy (194)\n" +
				"ciaql (8)\n" +
				"obctcme (43)\n" +
				"jpyaa (6)\n" +
				"ydnsh (172) -> xndzibu, pcciu\n" +
				"anobpj (152) -> ykdkp, pyfyx\n" +
				"dnqxg (348) -> qlbapm, xhljlrn\n" +
				"fhfcmv (131) -> ctpac, iaaws\n" +
				"ygfyhh (31)\n" +
				"aywwpfz (352) -> bsqbqtw, ygfyhh\n" +
				"wrtarf (78)\n" +
				"oaiipqw (46)\n" +
				"hvyscq (282) -> zagrlc, rrohj\n" +
				"nuwaia (1310) -> zzypx, shdbfhl\n" +
				"kljhkzg (50)\n" +
				"dvnzgo (89)\n" +
				"izkcvii (85) -> jyjkwnc, yxxrv\n" +
				"pgllqy (21)\n" +
				"derfr (58)\n" +
				"qgudtwk (67)\n" +
				"obkparr (81)\n" +
				"gjbeou (11)\n" +
				"zefywno (78)\n" +
				"oxcth (74) -> wuezook, snpwaur\n" +
				"pulfop (8)\n" +
				"tnrej (20)\n" +
				"vkufxby (184) -> ewlryhh, dhpoh\n" +
				"budohp (82)\n" +
				"rotbjjy (80)\n" +
				"ooixr (55) -> pmhmqfc, eevia\n" +
				"avemla (84)\n" +
				"hbjrjw (26) -> dkuds, qtyeiv, hobchva, ltfxsl\n" +
				"nfpawkr (53)\n" +
				"aqcscz (21)\n" +
				"zagrlc (49)\n" +
				"eulpqss (62)\n" +
				"vnxrh (63) -> mqhwy, xecjyv\n" +
				"mopevhs (220) -> cnnajhy, ywsjwhi\n" +
				"tsdpmhr (11)\n" +
				"ggmjft (197)\n" +
				"khaxl (251) -> yzfbc, jjrcs\n" +
				"uchxwm (69)\n" +
				"rtjzffy (41)\n" +
				"rguht (60)\n" +
				"rfmbo (92)\n" +
				"eqrmhiv (55) -> eiceooz, xuxuy, horeib, waznyo, ufryj, zbscr\n" +
				"srsuyk (75) -> ensngra, kskmxw, jyxztzm\n" +
				"iwbzsq (416) -> kemdk, iefjz, vhvmcal, qygtd\n" +
				"ximfci (62)\n" +
				"ycmhi (66)\n" +
				"zddnqld (76)\n" +
				"qemad (52)\n" +
				"teuku (88)\n" +
				"aktlne (86)\n" +
				"uphktul (63)\n" +
				"vxbas (304) -> cyzobwd, juaekax, axbupt, mwikxz\n" +
				"tzhto (297) -> jaxczdp, bphpr\n" +
				"vjmhzau (43)\n" +
				"mvhybn (66)\n" +
				"jbbpzze (53)\n" +
				"davnh (33)\n" +
				"ofshfcn (274)\n" +
				"hhqks (93)\n" +
				"ckatuf (280) -> uokdqce, zhiacn, csyuq\n" +
				"mnjhqkb (57)\n" +
				"vdexe (66)\n" +
				"kgiswh (15)\n" +
				"skxcsro (71)\n" +
				"whbqia (23682) -> uiges, jtwfdu, spqvn, gworrlc, mgene, aycnip\n" +
				"icmfzt (288) -> jldxskr, zbbyckg, teuhjl\n" +
				"xstglba (297) -> qqkvxv, fgcjopa\n" +
				"uamdcy (62)\n" +
				"fesyd (43)\n" +
				"jsdzajv (89)\n" +
				"ohlhl (82)\n" +
				"gwkdpj (62)\n" +
				"hrdvx (191) -> dcdxxv, uhjzmx\n" +
				"wwxctxk (128) -> vczbfs, ciaql, jmnhj, vvyhqon\n" +
				"ctebhmp (119)\n" +
				"zhhhbv (20)\n" +
				"ocspnqg (84) -> kpdms, ucjde, pgozvs, joryqqt\n" +
				"qrzofif (66)\n" +
				"dgfjw (58)\n" +
				"lnxxnux (60)\n" +
				"eveoo (40)\n" +
				"khjbclb (581) -> tespp, kmjbuf, phcizz\n" +
				"eawuhm (98)\n" +
				"lrkttbz (35)\n" +
				"qtyeiv (97)\n" +
				"owxcxd (243) -> eppcdr, lkfhfri, ytjuerk\n" +
				"hjibopk (76)\n" +
				"lgpgt (114) -> saqta, qjjjm\n" +
				"kuqmkzc (9)\n" +
				"fyvrp (78)\n" +
				"qoyhxl (72) -> vgqxpp, phqtbfn\n" +
				"getbk (40)\n" +
				"qmryr (87)\n" +
				"hdaii (21)\n" +
				"jzlquwl (65) -> ymnissn, kkeqyo, fozofs\n" +
				"wopvp (231) -> mfngva, dmawkm\n" +
				"xpuly (14)\n" +
				"cyrupz (55) -> whbqia, sopjux, cfcdlh, wuluv, uwmocg, xtcpynj, qjvtm\n" +
				"tkntd (45) -> fscqnmn, fodfvds\n" +
				"sqsyxpe (119) -> djvozoc, otdcfi\n" +
				"waangt (46) -> ohgok, ydndqy\n" +
				"tvhkggh (294) -> uhvtx, utsyk\n" +
				"cipzed (14)\n" +
				"ykjng (1685) -> kukkmrx, xriycgo, djdiyl\n" +
				"leccfrx (8) -> jzeeng, vdlhr, kazqqf, cnvce\n" +
				"pmxdc (20)\n" +
				"jafvw (395) -> gznxb, suwehi, brrvjn\n" +
				"zyuuri (70) -> jnenzeu, brsgom, xuknyi, ggttj, vbukg, lhcix\n" +
				"csvhlkb (88)\n" +
				"xsbjwz (35)\n" +
				"bssnhty (53)\n" +
				"qtmszjy (86)\n" +
				"tsdgx (20)\n" +
				"trabc (52)\n" +
				"ynsjo (190) -> zxymd, wxruhqa, ckatuf, hablmj\n" +
				"svxpof (51)\n" +
				"wpzcj (20)\n" +
				"pcdpxv (36)\n" +
				"vjfkl (96)\n" +
				"chzno (264) -> lrqskol, mcponby\n" +
				"ounsg (40)\n" +
				"ucozsnh (26)\n" +
				"ikdpgy (33)\n" +
				"zyxswnx (86)\n" +
				"ensngra (56)\n" +
				"emuysfg (50)\n" +
				"vqmckky (80)\n" +
				"eecdh (57)\n" +
				"yafxw (130) -> lpxcjq, qxkcxj\n" +
				"jnpwbjj (73)\n" +
				"prfyjj (283) -> kljhkzg, mgmmqpf\n" +
				"vgbxwsh (85)\n" +
				"tespp (113)\n" +
				"jyxztzm (56)\n" +
				"hkjbbs (23)\n" +
				"rxmvx (234) -> ljpyq, xbnbi, uwisk\n" +
				"apbzweg (21)\n" +
				"pnxmraq (6)\n" +
				"fnkxzn (1197) -> mwmguqn, igjhbnk\n" +
				"ytgqzq (62) -> ddiqs, jgdqth\n" +
				"oircg (12)\n" +
				"pmytxie (48)\n" +
				"pprsdm (15)\n" +
				"synlyuo (165) -> adzhm, ciizgft\n" +
				"vxbieux (86)\n" +
				"zoagmd (58)\n" +
				"nuomen (121) -> hdaii, zfufrfx, noksmmp, fcpmz\n" +
				"djvozoc (24)\n" +
				"mbora (95)\n" +
				"uokdqce (16)\n" +
				"brxmlaa (47)\n" +
				"bcxne (66)\n" +
				"twhnzo (53)\n" +
				"nhefqs (139) -> cpnwxr, erlwita, raaqp\n" +
				"usmhoj (159) -> vommsj, fhpik\n" +
				"wlkzwch (87) -> axouzs, bkjpa, opath, wpxaup, ejehv, qdnmni, uggjwfl\n" +
				"jcalbf (90)\n" +
				"mhzpj (17)\n" +
				"fhsxx (33)\n" +
				"mzfmw (206) -> wwwep, yitoepf, idgrh, nqjsdi\n" +
				"hqqcmi (86)\n" +
				"fscnkbm (100) -> kyspusd, iipyba\n" +
				"asgmujz (270) -> sqypk, pzoji\n" +
				"tznvgv (87)\n" +
				"ihquo (45)\n" +
				"dwuakz (35)\n" +
				"ychlsfn (61)\n" +
				"ksledpc (146) -> tqefb, oglut\n" +
				"lpweyw (54) -> syzptux, rruyk\n" +
				"nxfjeuy (87)\n" +
				"dgebx (37)\n" +
				"sqypk (47)\n" +
				"grgkrf (1515) -> rxbohqw, ijhvxea, tzhto\n" +
				"ywuqf (57)\n" +
				"ihtcuq (70) -> uafzt, ounuwsx, nakiug\n" +
				"akwdkl (32)";
		final ProgramTower tower = new ProgramTower();
		System.out.println("Program tower bottom program is:");
		System.out.println(tower.getBottomProgramName(programTowerInput));
		System.out.println("Weight difference is:");
		System.out.println(tower.getRequiredWeightChange());

		final String registerInputs = "sd dec 441 if k != 0\n" +
				"lp dec 419 if mxn >= 7\n" +
				"w inc -592 if icg >= -9\n" +
				"a dec -29 if q <= 9\n" +
				"kt dec 486 if ms != 8\n" +
				"kt inc -841 if kt > -488\n" +
				"rz inc -592 if m <= 1\n" +
				"xtz dec 780 if lp < 9\n" +
				"iox dec 804 if icg != 6\n" +
				"lp inc 360 if i == 9\n" +
				"f dec -570 if gi >= 7\n" +
				"um inc 87 if q != 4\n" +
				"kt dec -242 if rz != -595\n" +
				"j inc -154 if db != 0\n" +
				"giq dec 728 if iox > -811\n" +
				"a dec -9 if xtz > -781\n" +
				"lp inc -261 if ms > 2\n" +
				"w inc -816 if hey > -1\n" +
				"mxn inc 680 if ms >= -9\n" +
				"q inc -777 if w < -1400\n" +
				"wm dec -353 if q == -774\n" +
				"q inc 414 if hey == 0\n" +
				"xdl inc 488 if kt != -1075\n" +
				"gus dec -136 if fxx != -7\n" +
				"f dec 852 if hey >= 10\n" +
				"j inc 531 if ms <= -9\n" +
				"km dec 231 if xdl >= 487\n" +
				"fxx dec 579 if iox == -804\n" +
				"km dec 23 if kt != -1076\n" +
				"fxx inc -845 if xtz != -773\n" +
				"mxn dec 335 if fxx != -1432\n" +
				"q dec 184 if f == 0\n" +
				"wm dec -330 if f == 0\n" +
				"iox dec 677 if mxn != 339\n" +
				"mxn inc -429 if hey < 1\n" +
				"rz dec 101 if hey == 8\n" +
				"k inc 17 if db == 0\n" +
				"gus inc -328 if iox == -1481\n" +
				"a inc 657 if rz <= -584\n" +
				"wm dec -365 if rz < -590\n" +
				"m inc -710 if w < -1399\n" +
				"kt inc -246 if wm != 698\n" +
				"w dec 976 if fxx >= -1431\n" +
				"giq inc 319 if hey >= -5\n" +
				"iox inc -563 if xdl < 495\n" +
				"xdl dec -349 if f >= -9\n" +
				"sd inc -296 if q >= -555\n" +
				"xdl inc 406 if cl >= -2\n" +
				"f inc 966 if hey >= -6\n" +
				"lp dec -838 if iox > -2054\n" +
				"k dec -674 if q < -542\n" +
				"i inc -23 if k < 692\n" +
				"mxn inc -221 if sd != -302\n" +
				"mxn inc -830 if mxn > -309\n" +
				"km inc -283 if db > -7\n" +
				"icg inc 365 if xdl > 1234\n" +
				"q inc -23 if m < -702\n" +
				"wm dec -507 if rz < -582\n" +
				"j inc -501 if gi != -10\n" +
				"um inc 274 if a > 689\n" +
				"db inc 814 if xdl != 1250\n" +
				"fxx dec -172 if db != 822\n" +
				"wm dec 581 if kt <= -1323\n" +
				"gi dec -715 if kt >= -1339\n" +
				"f inc -209 if i >= -31\n" +
				"q inc 933 if fxx > -1246\n" +
				"mxn dec -227 if gi > 713\n" +
				"fxx dec -112 if xdl <= 1252\n" +
				"hey dec -998 if xtz >= -781\n" +
				"lp dec -743 if ms <= 4\n" +
				"icg dec -581 if fxx > -1149\n" +
				"gus inc 725 if k != 698\n" +
				"icg dec 156 if kt != -1339\n" +
				"gus dec 961 if i > -32\n" +
				"giq dec -992 if kt <= -1327\n" +
				"m inc -477 if xdl >= 1240\n" +
				"db dec -258 if gus <= -424\n" +
				"wm inc -72 if gi > 713\n" +
				"i dec 923 if lp == 1581\n" +
				"m inc -221 if iox == -2044\n" +
				"j inc 410 if m < -1402\n" +
				"kt inc 838 if a == 685\n" +
				"i dec 528 if gi < 712\n" +
				"iox dec -823 if i >= -952\n" +
				"a dec -705 if icg > 799\n" +
				"gi dec -538 if db > 1079\n" +
				"xdl inc -507 if q > -571\n" +
				"rz inc 37 if km > -546\n" +
				"fxx dec -718 if ms <= -2\n" +
				"xdl inc -742 if cl < 4\n" +
				"q dec 591 if wm > 542\n" +
				"a dec 100 if db != 1072\n" +
				"fxx dec -392 if giq >= 579\n" +
				"j inc 991 if i >= -942\n" +
				"m inc 311 if sd != -296\n" +
				"icg inc -286 if db != 1075\n" +
				"m inc 906 if rz == -555\n" +
				"um inc 150 if hey == 993\n" +
				"rz inc -637 if fxx < -746\n" +
				"ms dec 779 if f >= 751\n" +
				"gus inc 928 if j != -100\n" +
				"rz dec 769 if sd < -292\n" +
				"xdl inc -556 if gus <= 505\n" +
				"rz inc -94 if j < -82\n" +
				"mxn dec -763 if cl == 0\n" +
				"xdl dec -693 if gus <= 502\n" +
				"db inc -879 if kt <= -1339\n" +
				"w dec 651 if hey > 991\n" +
				"um dec -898 if giq == 583\n" +
				"xdl dec 501 if hey > 998\n" +
				"wm dec 746 if lp < 1587\n" +
				"iox inc 915 if um > 1251\n" +
				"a inc 573 if q >= -1165\n" +
				"j dec -459 if m <= -512\n" +
				"km dec -601 if xdl >= 131\n" +
				"km dec 801 if f >= 756\n" +
				"ms inc 318 if j < -91\n" +
				"hey dec -768 if i <= -945\n" +
				"f inc -982 if xdl < 134\n" +
				"i inc 210 if iox < -305\n" +
				"icg inc -838 if xtz >= -784\n" +
				"mxn dec 901 if f == -225\n" +
				"m inc 601 if i <= -733\n" +
				"iox inc -863 if cl >= -5\n" +
				"ms dec -474 if db >= 1069\n" +
				"xtz dec 708 if um >= 1253\n" +
				"lp dec 0 if xdl < 130\n" +
				"k inc -476 if sd <= -291\n" +
				"um dec 475 if hey != 1756\n" +
				"q inc 178 if k <= 215\n" +
				"km dec 244 if a >= 1265\n" +
				"j dec 485 if k < 209\n" +
				"icg inc 429 if um >= 784\n" +
				"ms inc -881 if kt > -1341\n" +
				"cl inc -75 if iox < -1176\n" +
				"icg dec -72 if gi == 715\n" +
				"i inc 714 if lp >= 1572\n" +
				"rz inc -881 if j >= -96\n" +
				"ms dec -453 if i <= -29\n" +
				"giq dec -500 if sd != -305\n" +
				"sd dec -78 if lp != 1572\n" +
				"a inc 313 if db == 1072\n" +
				"w dec 97 if q == -978\n" +
				"gus dec -203 if f != -225\n" +
				"xdl dec -894 if j < -88\n" +
				"q inc 71 if k != 213\n" +
				"um dec -242 if wm > -207\n" +
				"kt dec -997 if sd != -215\n" +
				"cl dec 643 if lp != 1587\n" +
				"hey inc -564 if fxx == -748\n" +
				"ms dec 639 if m != 95\n" +
				"ms dec 131 if w <= -3026\n" +
				"xdl dec 241 if w != -3032\n" +
				"mxn inc 404 if i == -28\n" +
				"giq dec 111 if xdl >= 789\n" +
				"wm inc 93 if j <= -88\n" +
				"xdl inc 318 if um >= 1026\n" +
				"gi dec -766 if a < 1587\n" +
				"mxn inc 212 if w > -3040\n" +
				"f dec -601 if giq == 1084\n" +
				"m dec 135 if kt >= -334\n" +
				"a dec -471 if rz >= -2940\n" +
				"cl dec -379 if giq != 1080\n" +
				"w inc -834 if db < 1077\n" +
				"km inc -515 if f >= -226\n" +
				"i inc 133 if a > 2043\n" +
				"gus dec -368 if gi >= 1476\n" +
				"db inc -629 if fxx > -758\n" +
				"km inc -807 if a != 2052\n" +
				"j dec -129 if cl > -267\n" +
				"gi dec -443 if m <= -35\n" +
				"kt dec -355 if sd != -218\n" +
				"mxn inc -734 if xtz == -1488\n" +
				"icg inc 468 if m == -34\n" +
				"m inc 896 if iox <= -1168\n" +
				"xdl inc -763 if j < 39\n" +
				"db inc -51 if xdl >= 337\n" +
				"sd dec 688 if icg >= 167\n" +
				"w inc 307 if gi >= 1924\n" +
				"ms inc 190 if xdl >= 331\n" +
				"k inc 869 if fxx >= -750\n" +
				"mxn inc -772 if ms >= -1771\n" +
				"f inc -303 if q == -922\n" +
				"kt dec 99 if ms < -1757\n" +
				"j dec -733 if sd < -904\n" +
				"wm inc -808 if gi <= 1933\n" +
				"q dec -671 if i != 112\n" +
				"cl inc -790 if xdl >= 330\n" +
				"icg inc -617 if ms > -1774\n" +
				"w inc 529 if xdl > 333\n" +
				"w inc -413 if wm < -907\n" +
				"db inc 780 if xdl > 330\n" +
				"xtz inc -535 if um <= 1025\n" +
				"mxn inc 415 if db > 1165\n" +
				"xtz inc 170 if db != 1169\n" +
				"k dec -365 if k <= 1091\n" +
				"giq inc -695 if q < -233\n" +
				"db inc -991 if a > 2057\n" +
				"k dec 543 if fxx == -748\n" +
				"kt inc 673 if hey <= 1209\n" +
				"gi inc -23 if mxn <= -1917\n" +
				"m inc -567 if sd > -916\n" +
				"m dec -269 if wm == -912\n" +
				"kt dec 601 if db != 1180\n" +
				"km dec -781 if kt == -351\n" +
				"rz inc -296 if wm != -912\n" +
				"um inc 4 if gus != 874\n" +
				"um inc -876 if q < -231\n" +
				"gi dec -744 if xtz < -1320\n" +
				"j inc -101 if q <= -236\n" +
				"kt inc -959 if xtz == -1318\n" +
				"icg dec 9 if m == 562\n" +
				"kt inc -412 if gus > 867\n" +
				"fxx dec 394 if gus > 867\n" +
				"fxx dec 105 if xtz == -1318\n" +
				"a dec -533 if giq != 396\n" +
				"km dec -864 if um != 147\n" +
				"mxn dec -240 if i != 114\n" +
				"m inc -830 if km != -628\n" +
				"iox inc 160 if mxn != -1690\n" +
				"k inc 966 if j > 679\n" +
				"xtz inc 482 if cl <= -1050\n" +
				"f inc -430 if fxx < -1253\n" +
				"sd inc 138 if sd > -915\n" +
				"giq dec 736 if xtz == -836\n" +
				"f dec 780 if ms >= -1767\n" +
				"wm inc -362 if kt <= -1731\n" +
				"um dec -195 if xtz >= -838\n" +
				"um dec 888 if i >= 107\n" +
				"i dec 754 if gus != 868\n" +
				"hey inc -518 if kt <= -1726\n" +
				"iox inc 843 if hey > 676\n" +
				"ms dec -46 if a < 2587\n" +
				"mxn inc 288 if gus >= 864\n" +
				"gus inc -643 if mxn < -1393\n" +
				"um inc 457 if rz >= -2936\n" +
				"um dec -976 if xtz == -836\n" +
				"m dec 783 if fxx > -1254\n" +
				"gi inc -63 if m <= -1043\n" +
				"lp dec -244 if cl > -1062\n" +
				"sd inc 908 if km >= -637\n" +
				"km inc -725 if kt <= -1731\n" +
				"j dec -20 if k == 906\n" +
				"wm dec -596 if kt >= -1740\n" +
				"xtz dec 133 if km <= -1355\n" +
				"db inc -792 if icg != -466\n" +
				"db dec -851 if lp != 1835\n" +
				"cl dec 707 if f > -1012\n" +
				"iox dec 246 if iox >= -170\n" +
				"um dec 719 if ms == -1720\n" +
				"xtz dec -216 if icg != -464\n" +
				"km dec 776 if w <= -3446\n" +
				"j dec 388 if xdl != 339\n" +
				"j dec 776 if kt == -1732\n" +
				"mxn dec 615 if cl == -1761\n" +
				"i inc 579 if gus < 226\n" +
				"i inc -172 if xdl < 341\n" +
				"ms inc 720 if lp < 1825\n" +
				"ms dec -590 if hey < 690\n" +
				"iox dec -781 if gus < 231\n" +
				"mxn inc -145 if a >= 2577\n" +
				"q inc -885 if f <= -1013\n" +
				"xtz inc -148 if a != 2593\n" +
				"km inc -586 if fxx < -1239\n" +
				"um inc -988 if kt < -1724\n" +
				"k dec -852 if xtz != -891\n" +
				"j inc -365 if m != -1050\n" +
				"gus inc -679 if cl != -1760\n" +
				"um inc -342 if icg != -455\n" +
				"hey inc -807 if mxn == -2157\n" +
				"w dec 759 if w != -3439\n" +
				"ms inc -328 if gus >= -455\n" +
				"gi inc -179 if iox == 369\n" +
				"ms inc 930 if giq != -345\n" +
				"fxx inc 959 if giq == -338\n" +
				"km dec -605 if db <= 1226\n" +
				"um dec 954 if gus == -460\n" +
				"f inc -325 if giq < -341\n" +
				"cl dec -95 if cl <= -1752\n" +
				"hey dec 825 if sd < 141\n" +
				"db dec -608 if sd >= 139\n" +
				"giq inc 141 if lp > 1821\n" +
				"a dec 824 if km <= -2715\n" +
				"k inc 982 if db < 1840\n" +
				"k dec -6 if giq != -213\n" +
				"xtz dec -59 if kt <= -1731\n" +
				"fxx dec -589 if a == 1761\n" +
				"m inc 874 if rz == -2936\n" +
				"m dec 241 if xtz == -838\n" +
				"gus dec 512 if w > -4208\n" +
				"mxn inc 651 if gus == -973\n" +
				"lp inc -553 if hey == -948\n" +
				"giq inc 252 if lp > 1263\n" +
				"km dec -360 if a == 1761\n" +
				"giq inc -504 if a != 1770\n" +
				"kt inc -815 if um <= -1146\n" +
				"lp dec 343 if gi >= 1652\n" +
				"w dec 6 if lp <= 937\n" +
				"gus dec 806 if ms > -534\n" +
				"q dec 262 if f > -1335\n" +
				"rz dec -959 if sd <= 141\n" +
				"w dec -958 if mxn == -2157\n" +
				"gus inc 530 if xdl > 333\n" +
				"lp dec -30 if hey > -949\n" +
				"lp dec 345 if q != -509\n" +
				"i inc 509 if km > -2363\n" +
				"rz inc -576 if um == -1155\n" +
				"km inc 622 if iox > 367\n" +
				"k dec -833 if ms != -527\n" +
				"um dec 586 if i == 1027\n" +
				"q inc -724 if rz == -2553\n" +
				"cl dec -372 if f <= -1330\n" +
				"cl dec -944 if j > -442\n" +
				"j dec 674 if hey != -958\n" +
				"q inc -830 if j != -1135\n" +
				"cl dec 594 if um < -1749\n" +
				"gi dec -991 if q > -2066\n" +
				"kt dec -528 if giq >= -465\n" +
				"iox inc -291 if a > 1759\n" +
				"q dec -395 if f != -1330\n" +
				"um dec 244 if cl <= -1285\n" +
				"a dec 961 if um < -1988\n" +
				"iox inc -321 if w == -3253\n" +
				"lp dec -307 if iox < -241\n" +
				"m dec -188 if mxn == -2157\n" +
				"um dec -481 if icg <= -450\n" +
				"gi dec 303 if cl < -1294\n" +
				"mxn dec -791 if wm != -684\n" +
				"kt dec -368 if sd != 149\n" +
				"mxn dec -783 if sd < 141\n" +
				"gi dec 864 if m == 11\n" +
				"gus dec -17 if w == -3253\n" +
				"w dec 499 if giq > -464\n" +
				"xtz inc 659 if q > -2067\n" +
				"wm inc 572 if kt != -1654\n" +
				"xtz dec -287 if xtz != -191\n" +
				"sd inc 763 if kt <= -1658\n" +
				"xdl inc 830 if gus == -1225\n" +
				"icg inc 508 if km == -1737\n" +
				"gi inc 756 if rz == -2560\n" +
				"xtz inc 983 if km <= -1734\n" +
				"w inc 717 if xtz > 1085\n" +
				"q dec 52 if w < -3030\n" +
				"xdl inc -373 if f <= -1321\n" +
				"w dec -544 if icg > 56\n" +
				"gus inc -120 if km > -1741\n" +
				"mxn dec -16 if hey <= -947\n" +
				"wm dec 591 if mxn != -576\n" +
				"gus inc -355 if kt <= -1644\n" +
				"xdl inc 898 if fxx <= -650\n" +
				"f dec 71 if m != 11\n" +
				"xtz dec 902 if fxx > -663\n" +
				"kt dec -576 if db != 1831\n" +
				"rz inc 465 if fxx < -650\n" +
				"a dec 342 if fxx >= -666\n" +
				"k inc 293 if cl != -1286\n" +
				"iox dec 791 if db == 1839\n" +
				"a dec 125 if kt != -1071\n" +
				"gi dec 852 if xtz == 185\n" +
				"f inc 982 if sd == 133\n" +
				"mxn dec -426 if sd <= 146\n" +
				"gus inc -100 if xdl <= 1696\n" +
				"um inc 872 if xtz != 182\n" +
				"db dec -10 if db < 1843\n" +
				"q inc 209 if lp >= 920\n" +
				"k inc -338 if hey >= -950\n" +
				"m inc -601 if wm < -695\n" +
				"w dec 725 if xdl >= 1694\n" +
				"wm inc -913 if q >= -1901\n" +
				"fxx inc 986 if sd <= 144\n" +
				"a dec 329 if m == -590\n" +
				"xtz inc 80 if q < -1893\n" +
				"gus inc 234 if fxx == 328\n" +
				"ms inc 110 if giq < -451\n" +
				"gus dec -969 if sd != 134\n" +
				"um dec 806 if ms <= -417\n" +
				"gus dec -458 if icg < 53\n" +
				"cl dec -272 if fxx > 326\n" +
				"k inc -212 if sd != 143\n" +
				"xtz dec 109 if fxx <= 324\n" +
				"mxn dec 302 if m >= -599\n" +
				"lp inc -240 if giq <= -451\n" +
				"m dec -58 if wm != -1618\n" +
				"xtz dec -178 if gus == -139\n" +
				"giq inc -132 if xdl != 1694\n" +
				"w inc -149 if a >= 962\n" +
				"f inc -512 if lp <= 690\n" +
				"lp dec -84 if sd < 147\n" +
				"cl inc 657 if db <= 1851\n" +
				"m inc -180 if hey == -948\n" +
				"sd inc -711 if a < 974\n" +
				"ms inc -905 if j != -1134\n" +
				"f inc -852 if mxn >= -451\n" +
				"lp inc 818 if i == 1027\n" +
				"w dec -407 if wm <= -1610\n" +
				"m dec -298 if gi > 926\n" +
				"gi inc -17 if sd != -564\n" +
				"ms inc 891 if kt != -1075\n" +
				"xdl inc -498 if fxx != 337\n" +
				"kt dec 153 if lp == 1575\n" +
				"db inc -565 if f < -2690\n" +
				"lp inc 812 if um <= -1438\n" +
				"fxx inc 151 if um != -1429\n" +
				"fxx dec 484 if km < -1732\n" +
				"q inc 130 if f == -2690\n" +
				"lp dec 926 if icg != 58\n" +
				"giq dec -378 if k >= 3321\n" +
				"cl dec 136 if ms == -1323\n" +
				"xdl dec -889 if w != -3502\n" +
				"hey dec 540 if hey == -948\n" +
				"a dec 796 if xdl >= 1189\n" +
				"xtz dec 197 if kt < -1066\n" +
				"i dec 328 if db == 1284\n" +
				"giq dec -697 if hey > -1482\n" +
				"f inc -985 if icg != 51\n" +
				"gi inc 128 if f > -3689\n" +
				"j dec 638 if i != 699\n" +
				"mxn inc 300 if icg < 55\n" +
				"icg inc -846 if q <= -1900\n" +
				"icg dec -845 if giq > -86\n" +
				"cl dec 502 if hey < -1482\n" +
				"db inc -18 if hey != -1483\n" +
				"giq inc -398 if wm < -1615\n" +
				"xtz inc -724 if gus > -146\n" +
				"um inc -761 if gus >= -137\n" +
				"gi dec 423 if mxn <= -146\n" +
				"xtz dec -632 if ms >= -1326\n" +
				"gi dec 990 if i == 693\n" +
				"xtz dec 292 if i == 699\n" +
				"q inc 881 if xtz >= -143\n" +
				"xdl dec -25 if a <= 175\n" +
				"f dec -599 if iox >= -1036\n" +
				"giq dec -502 if gus == -139\n" +
				"xdl dec 235 if gus >= -139\n" +
				"q inc 704 if wm <= -1610\n" +
				"ms inc 693 if i == 699\n" +
				"k inc 407 if ms != -627\n" +
				"f dec 107 if iox <= -1029\n" +
				"xtz inc -328 if w != -3502\n" +
				"j dec -474 if xdl < 994\n" +
				"gus dec 82 if fxx != -12\n" +
				"db dec -913 if xtz >= -143\n" +
				"iox dec -932 if gus != -230\n" +
				"giq inc -74 if q > -316\n" +
				"ms inc -711 if gi != 1039\n" +
				"w dec -29 if q >= -315\n" +
				"um inc -851 if xtz == -141\n" +
				"f inc -816 if ms <= -1348\n" +
				"hey inc 813 if lp > 1468\n" +
				"sd dec 483 if icg != 48\n" +
				"w dec -199 if db <= 2181\n" +
				"q inc -846 if sd != -572\n" +
				"db inc -134 if k <= 3732\n" +
				"um dec -185 if mxn > -145\n" +
				"rz inc 559 if a < 174\n" +
				"cl inc 650 if f != -3190\n" +
				"gi inc 785 if cl >= -343\n" +
				"w inc -227 if lp >= 1468\n" +
				"gus inc -437 if wm < -1608\n" +
				"kt inc -301 if w < -3499\n" +
				"k dec -873 if km < -1736\n" +
				"xdl dec -262 if q < -1155\n" +
				"f dec 325 if mxn >= -149\n" +
				"wm inc 523 if km < -1736\n" +
				"gus dec -643 if db <= 2053\n" +
				"gus dec 998 if iox > -95\n" +
				"icg inc 774 if q < -1160\n" +
				"k inc 789 if a > 159\n" +
				"fxx dec 447 if xtz <= -133\n" +
				"m inc -730 if rz <= -1526\n" +
				"mxn dec -825 if cl > -346\n" +
				"xtz inc 846 if sd > -576\n" +
				"mxn inc 128 if cl < -352\n" +
				"cl dec 99 if xtz <= 704\n" +
				"lp dec -537 if ms >= -1341\n" +
				"giq dec 784 if w == -3501\n" +
				"iox inc 410 if giq <= -437\n" +
				"f dec 314 if iox <= 317\n" +
				"kt inc 520 if a == 169\n" +
				"wm inc -419 if km >= -1740\n" +
				"icg dec 900 if fxx != -450\n" +
				"hey dec 564 if hey <= -670\n" +
				"um inc 653 if lp < 2016\n" +
				"hey dec 835 if fxx <= -447\n" +
				"giq dec 542 if giq == -433\n" +
				"gus dec 320 if cl > -354\n" +
				"icg inc 75 if i > 695\n" +
				"iox inc -949 if j <= -649\n" +
				"q inc 0 if ms == -1341\n" +
				"um dec 180 if rz != -1538\n" +
				"i inc 534 if rz >= -1536\n" +
				"i inc -316 if fxx == -452\n" +
				"rz dec 225 if icg <= 2\n" +
				"gus inc -416 if km != -1727\n" +
				"icg inc -325 if m >= -1150\n" +
				"rz dec 892 if gus < -742\n" +
				"k inc -832 if j > -657\n" +
				"wm inc -10 if gus <= -752\n" +
				"f dec 179 if rz < -2644\n" +
				"q inc 817 if kt > -859\n" +
				"fxx inc 501 if xtz < 712\n" +
				"m inc 111 if kt < -862\n" +
				"ms dec -896 if gus != -749\n" +
				"kt dec -925 if kt >= -862\n" +
				"fxx inc -713 if cl <= -355\n" +
				"xdl dec -120 if a == 172\n" +
				"a dec -757 if hey != -2073\n" +
				"gus inc 127 if mxn != -12\n" +
				"xdl inc -627 if f == -3995\n" +
				"kt dec 832 if lp < 2004\n" +
				"w dec 208 if kt > 61\n" +
				"kt dec 378 if lp >= 1998\n" +
				"cl dec -371 if xdl > 1249\n" +
				"f dec 708 if i < 927\n" +
				"db dec 602 if ms > -443\n" +
				"cl dec 247 if f > -4707\n" +
				"um dec -394 if gi != 1040\n" +
				"j dec 190 if giq >= -440\n" +
				"gi inc 560 if q == -347\n" +
				"xdl inc -601 if gus >= -630\n" +
				"k dec 934 if iox == -641\n" +
				"m inc -672 if icg >= -334\n" +
				"w dec 104 if xdl != 647\n" +
				"lp dec 36 if icg >= -329\n" +
				"mxn dec 768 if m >= -1821\n" +
				"f dec 555 if k == 3625\n" +
				"w dec 440 if q >= -353\n" +
				"lp dec -83 if kt != -316\n" +
				"hey dec -168 if db != 2042\n" +
				"giq dec 460 if xtz == 708\n" +
				"fxx dec 446 if icg <= -325\n" +
				"icg dec -22 if xtz != 717\n" +
				"ms dec 920 if j != -841\n" +
				"hey inc 213 if db < 2053\n" +
				"mxn dec 862 if w < -4150\n" +
				"rz dec 873 if xdl <= 656\n" +
				"gi inc -584 if lp > 2047\n" +
				"kt inc -29 if um <= -385\n" +
				"m inc -883 if xtz < 715\n" +
				"j inc 850 if iox == -641\n" +
				"xdl dec 738 if w > -4154\n" +
				"icg dec -851 if kt <= -329\n" +
				"db inc -437 if ms > -449\n" +
				"kt inc 280 if xtz > 702\n" +
				"iox dec 924 if giq <= -899\n" +
				"m dec 453 if cl < -344\n" +
				"fxx inc -543 if i > 914\n" +
				"rz inc 402 if f > -5269\n" +
				"iox dec -260 if giq >= -900\n" +
				"km dec -971 if sd >= -578\n" +
				"wm inc 193 if k == 3630\n" +
				"xdl dec -416 if a != 932\n" +
				"lp inc 213 if icg == 545\n" +
				"um inc 864 if wm <= -1516\n" +
				"lp dec 343 if fxx <= -943\n" +
				"rz inc 657 if kt > -50\n" +
				"kt dec -253 if xdl <= 328\n" +
				"km inc 256 if mxn > -781\n" +
				"hey inc 856 if k == 3625\n" +
				"gus inc 266 if f < -5264\n" +
				"rz dec -139 if m <= -3151\n" +
				"hey dec -669 if db == 1603\n" +
				"gi inc -452 if ms == -445\n" +
				"kt inc 123 if mxn == -783\n" +
				"f inc -656 if sd > -562\n" +
				"m inc -479 if i > 915\n" +
				"um inc -288 if sd == -571\n" +
				"giq dec -68 if gi == 9\n" +
				"fxx dec -867 if fxx != -940\n" +
				"um inc 80 if m > -3636\n" +
				"i dec 980 if j < 9\n" +
				"lp inc -932 if km < -764\n" +
				"cl inc 387 if mxn != -788\n" +
				"wm dec -492 if km != -766\n" +
				"km inc 571 if m > -3634\n" +
				"kt inc 903 if q >= -340\n" +
				"wm inc 852 if k < 3616\n" +
				"um dec -210 if m < -3629\n" +
				"j inc -136 if m < -3623\n" +
				"j dec -575 if i != 908\n" +
				"sd inc 762 if xdl == 325\n" +
				"gi inc -933 if kt != 314\n" +
				"giq inc 272 if fxx < -939\n" +
				"um inc -279 if iox <= -386\n" +
				"xtz dec 303 if f < -5258\n" +
				"xtz dec 344 if iox != -378\n" +
				"giq dec -384 if f < -5264\n" +
				"f inc -698 if mxn <= -778\n" +
				"rz inc -185 if q <= -342\n" +
				"um dec 272 if db <= 1613\n" +
				"rz inc -650 if q <= -347\n" +
				"xtz dec -621 if q <= -340\n" +
				"kt inc 497 if sd < 200\n" +
				"gus dec -786 if km < -203\n" +
				"um dec 584 if a != 926\n" +
				"hey dec 467 if xdl <= 318\n" +
				"ms inc -975 if j == 448\n" +
				"rz inc 763 if w <= -4144\n" +
				"cl dec 923 if i >= 915\n" +
				"km inc -294 if fxx >= -942\n" +
				"fxx dec 218 if ms != -1420\n" +
				"q inc 671 if gus < -350\n" +
				"xdl dec 652 if i >= 913\n" +
				"xtz dec -657 if gus > -367\n" +
				"km dec 316 if j != 457\n" +
				"wm dec 664 if fxx <= -932\n" +
				"iox dec 463 if gus != -359\n" +
				"hey inc -254 if fxx <= -940\n" +
				"cl inc -684 if q > 317\n" +
				"rz dec -287 if xtz < 1348\n" +
				"lp dec 315 if lp != 1340\n" +
				"hey dec -685 if q >= 325\n" +
				"kt dec -360 if icg <= 553\n" +
				"a inc 834 if um >= -646\n" +
				"m inc -91 if sd < 183\n" +
				"a dec 37 if k != 3617\n" +
				"a inc -306 if sd != 201\n" +
				"k dec 822 if q <= 327\n" +
				"iox inc -885 if iox >= -850\n" +
				"kt inc -835 if rz == -2113\n" +
				"cl dec -99 if a < 586\n" +
				"cl dec 635 if w != -4141\n" +
				"kt inc -938 if giq == -173\n" +
				"sd dec 599 if iox != -1720\n" +
				"ms dec -484 if j != 448\n" +
				"wm inc 669 if fxx == -945\n" +
				"iox inc -633 if sd <= -402\n" +
				"i dec -774 if f >= -5963\n" +
				"f inc -783 if um < -646\n" +
				"km inc 6 if xtz > 1333\n" +
				"gus inc -986 if a == 583\n" +
				"iox inc -233 if um <= -651\n" +
				"xtz dec -857 if w != -4149\n" +
				"wm inc -791 if a < 584\n" +
				"j dec -41 if cl <= -2111\n" +
				"xdl inc 77 if rz > -2123\n" +
				"xdl inc -983 if ms != -1416\n" +
				"fxx dec 247 if sd == -408\n" +
				"k inc -362 if k > 2804\n" +
				"xdl inc 13 if iox >= -2595\n" +
				"db inc 473 if um <= -654\n" +
				"w inc 307 if w > -4152\n" +
				"xdl dec -237 if a <= 584\n" +
				"wm inc 366 if giq == -173\n" +
				"j dec 111 if i != 917\n" +
				"k dec 790 if w != -3848\n" +
				"sd dec -841 if wm == -2595\n" +
				"i inc -538 if xdl == -989\n" +
				"f dec 583 if rz > -2114\n" +
				"xtz inc -886 if kt <= -590\n" +
				"ms inc 151 if mxn == -783\n" +
				"q dec -585 if fxx == -1184\n" +
				"j dec -102 if km == -799\n" +
				"xdl dec 504 if sd == 433\n" +
				"fxx inc -208 if db > 2078\n" +
				"m dec 471 if q >= 323\n" +
				"icg inc -296 if i <= 919\n" +
				"rz dec -601 if mxn > -791\n" +
				"gus dec -870 if gi > -925\n" +
				"um dec -171 if gi >= -927\n" +
				"f inc 969 if gi != -932\n" +
				"j dec 78 if xdl <= -1481\n" +
				"m dec 115 if lp != 1019\n" +
				"km inc 911 if ms != -1267\n" +
				"gi inc 798 if i <= 920\n" +
				"iox dec -780 if km < 122\n" +
				"cl dec 670 if xdl > -1492\n" +
				"gus inc 231 if kt != -602\n" +
				"giq dec 584 if k <= 2021\n" +
				"j dec -142 if k != 2020\n" +
				"a inc 905 if xdl == -1487\n" +
				"giq inc -1 if k > 2012\n" +
				"j inc -123 if sd != 433\n" +
				"a dec -615 if ms >= -1270\n" +
				"q inc 848 if ms == -1269\n" +
				"kt dec -69 if w < -3838\n" +
				"fxx dec -676 if i > 926\n" +
				"iox dec 980 if gi > -131\n" +
				"fxx dec -716 if giq != -758\n" +
				"fxx dec 937 if sd > 433\n" +
				"sd inc 414 if i != 914\n" +
				"cl inc -625 if giq <= -757\n" +
				"gus dec 306 if fxx != -1390\n" +
				"q inc 228 if lp != 1010\n" +
				"ms inc 340 if gus == -549\n" +
				"cl inc -185 if xtz == 461\n" +
				"m dec -550 if f == -6363\n" +
				"fxx dec 73 if lp >= 1019\n" +
				"ms inc 651 if w != -3842\n" +
				"giq inc 155 if xtz > 450\n" +
				"wm dec -41 if icg < 253\n" +
				"wm inc -535 if k != 2006\n" +
				"j dec 181 if a >= 2094\n" +
				"cl inc -70 if km <= 114\n" +
				"i dec -910 if db < 2085\n" +
				"mxn dec -616 if giq != -610\n" +
				"ms inc 688 if lp <= 1019\n" +
				"kt inc 264 if f == -6357\n" +
				"gi inc -200 if xdl >= -1496\n" +
				"rz dec -610 if km < 121\n" +
				"w dec 82 if wm < -3085\n" +
				"giq dec 136 if um != -483\n" +
				"rz inc 804 if km < 121\n" +
				"i dec 197 if um < -475\n" +
				"cl dec 656 if ms == -241\n" +
				"m inc 656 if w <= -3921\n" +
				"lp inc -497 if gus > -557\n" +
				"xtz inc 47 if w > -3926\n" +
				"hey dec -130 if km <= 112\n" +
				"gus inc 800 if gus > -555\n" +
				"icg dec 229 if wm == -3089\n" +
				"kt dec -746 if gi != -333\n" +
				"xdl dec -365 if m == -2896\n" +
				"gi dec 286 if j > 430\n" +
				"wm inc 858 if q > 1393\n" +
				"mxn dec 440 if iox >= -2798\n" +
				"sd dec 651 if hey < -282\n" +
				"um inc 135 if kt <= 220\n" +
				"hey dec -639 if ms != -251\n" +
				"lp dec 558 if q != 1393\n" +
				"kt dec -264 if kt != 217\n" +
				"sd inc -523 if k >= 2006\n" +
				"k dec 938 if w <= -3917\n" +
				"mxn inc -120 if um == -350\n" +
				"giq inc -223 if icg > 16\n" +
				"m dec 171 if xtz < 504\n" +
				"um dec 850 if xdl == -1122\n" +
				"iox inc 955 if km >= 118\n" +
				"gi dec -910 if icg == 20\n" +
				"db inc -39 if xdl > -1116\n" +
				"mxn dec 481 if xtz > 491\n" +
				"um dec 766 if iox >= -2798\n" +
				"sd inc -103 if um != -1967\n" +
				"q inc -673 if q <= 1403\n" +
				"hey dec -471 if xdl == -1122\n" +
				"j inc -818 if sd <= 212\n" +
				"fxx dec -749 if ms > -238\n" +
				"w inc 407 if xdl >= -1123\n" +
				"mxn dec 138 if xtz >= 507\n" +
				"rz dec 257 if db != 2071\n" +
				"xdl dec 116 if lp > -38\n" +
				"mxn inc -162 if xtz <= 495\n" +
				"gi dec 669 if i < 1633\n" +
				"gi dec 187 if ms == -251\n" +
				"mxn dec 893 if xdl != -1229\n" +
				"k inc 616 if i <= 1633\n" +
				"xtz dec 881 if a <= 2105\n" +
				"gus inc 732 if i != 1627\n" +
				"kt inc 749 if a == 2103\n" +
				"f inc -289 if rz <= -346\n" +
				"um inc 919 if f < -6644\n" +
				"wm inc -646 if m != -3067\n" +
				"hey inc 1 if a != 2108\n" +
				"xdl dec 725 if ms <= -238\n" +
				"j dec -789 if k != 1695\n" +
				"hey inc 317 if w < -3515\n" +
				"kt inc 965 if gi >= -379\n" +
				"wm inc 137 if a != 2101\n" +
				"sd dec -783 if hey <= 1160\n" +
				"gus dec -349 if um <= -1046\n" +
				"ms inc -843 if sd == 1004\n" +
				"k inc -298 if f >= -6661\n" +
				"gus dec -15 if gi <= -365\n" +
				"gus dec -411 if wm <= -2092\n" +
				"cl inc 25 if icg != 30\n" +
				"km inc 634 if m == -3067\n" +
				"kt dec 856 if gus < 1766\n" +
				"xdl inc -808 if fxx <= -1461\n" +
				"xdl dec -883 if rz >= -358\n" +
				"gus dec -311 if j > 1214\n" +
				"sd dec 349 if xdl == -1888\n" +
				"mxn dec -309 if j <= 1225\n" +
				"giq dec 181 if ms >= -1087\n" +
				"rz dec -951 if iox >= -2788\n" +
				"k dec -824 if lp != -42\n" +
				"fxx dec -984 if km <= 746\n" +
				"mxn dec 333 if gus <= 2067\n" +
				"fxx dec 742 if db >= 2078\n" +
				"kt inc -367 if mxn > -1793\n" +
				"i dec -853 if lp < -27\n" +
				"kt dec -491 if wm < -2085\n" +
				"ms inc 233 if wm != -2097\n" +
				"i inc 729 if rz != -363\n" +
				"ms dec 246 if km < 737\n" +
				"xtz dec 455 if cl > -4106\n" +
				"icg inc -755 if kt <= 1206\n" +
				"wm dec -828 if mxn <= -1798\n" +
				"giq inc 397 if xdl != -1888\n" +
				"mxn dec 861 if cl != -4101\n" +
				"fxx dec 406 if f <= -6653\n" +
				"icg dec -101 if rz == -355\n" +
				"gus dec -147 if cl <= -4101\n" +
				"cl dec 717 if q > 728\n" +
				"db dec -276 if m < -3061\n" +
				"k dec -3 if sd > 651\n" +
				"lp dec -357 if xtz < -827\n" +
				"f dec -380 if lp <= 322\n" +
				"cl inc -740 if gi > -368\n" +
				"sd inc 744 if fxx >= -1221\n" +
				"iox inc 39 if mxn != -2661\n" +
				"fxx inc -569 if ms < -841\n" +
				"j dec 19 if gus == 2216\n" +
				"sd inc 826 if f < -6267\n" +
				"cl dec -377 if f != -6272\n" +
				"fxx dec 318 if icg >= -638\n" +
				"db dec 638 if xdl == -1883\n" +
				"q dec -923 if um >= -1055\n" +
				"a inc 22 if q < 1656\n" +
				"rz inc 129 if sd <= 1484\n" +
				"db dec 408 if kt == 1199\n" +
				"q inc -782 if iox <= -2750\n" +
				"w dec 232 if fxx >= -2119\n" +
				"gi dec -887 if km >= 738\n" +
				"hey dec 35 if icg < -624\n" +
				"xdl inc -379 if um > -1052\n" +
				"hey inc -596 if icg != -638\n" +
				"hey dec -945 if um >= -1047\n" +
				"xdl dec -202 if k > 2219\n" +
				"rz dec 76 if f < -6269\n" +
				"xdl inc 289 if q <= 876\n" +
				"rz inc 308 if kt >= 1190\n" +
				"a inc -190 if lp != 317\n" +
				"kt inc -195 if db >= 1944\n" +
				"f dec 526 if q < 878\n" +
				"wm dec -305 if xdl > -1777\n" +
				"xdl dec -99 if k != 2215\n" +
				"fxx inc 953 if wm == -1789\n" +
				"hey dec 625 if rz == -1\n" +
				"mxn dec 319 if mxn < -2644\n" +
				"m dec 611 if f == -6798\n" +
				"fxx dec -83 if icg < -639\n" +
				"gi dec 567 if cl > -4830\n" +
				"ms inc -95 if mxn < -2966\n" +
				"um inc 862 if gus != 2215\n" +
				"hey dec -341 if icg == -634\n" +
				"iox dec 829 if f <= -6801\n" +
				"giq dec 376 if kt == 1012\n" +
				"lp dec -990 if um < -183\n" +
				"iox inc -868 if kt >= 999\n" +
				"iox dec -670 if f <= -6796\n" +
				"fxx inc 895 if gus < 2209\n" +
				"k inc -916 if q <= 873\n" +
				"rz dec 646 if w >= -3747\n" +
				"kt inc -807 if j == 1203\n" +
				"fxx dec 568 if gi >= -43\n" +
				"giq dec -966 if q < 877\n" +
				"rz inc 250 if giq < -174\n" +
				"iox inc -19 if i == 3212\n" +
				"f inc -404 if k <= 1304\n" +
				"gi dec -481 if kt >= 195\n" +
				"giq dec -323 if gi < 424\n" +
				"lp inc 873 if km >= 752\n" +
				"icg dec 953 if um <= -182\n" +
				"q dec 246 if db != 1942\n" +
				"rz inc -987 if lp > 1307\n" +
				"hey inc -728 if xtz <= -837\n" +
				"fxx dec 743 if xtz != -843\n" +
				"km dec 393 if km <= 740\n" +
				"rz inc 635 if icg < -1578\n" +
				"k dec -136 if km <= 742\n" +
				"gus inc 715 if giq >= -185\n" +
				"lp dec 782 if km >= 741\n" +
				"ms dec -140 if sd != 1479\n" +
				"iox inc -992 if sd != 1488\n" +
				"wm inc 8 if ms >= -802\n" +
				"giq dec 134 if xtz <= -830\n" +
				"mxn dec 877 if xtz > -832\n" +
				"lp inc -260 if ms > -815\n" +
				"xdl inc 170 if w > -3742\n" +
				"q inc -674 if gi != 434\n" +
				"giq inc -760 if wm <= -1788\n" +
				"km dec -96 if hey != 1802\n" +
				"j inc 662 if fxx >= -1904\n" +
				"gus dec 305 if a <= 1943\n" +
				"db inc 881 if icg > -1583\n" +
				"um inc -137 if rz >= -96\n" +
				"mxn dec -755 if lp == 269\n" +
				"lp inc -220 if hey > 1799\n" +
				"cl inc 652 if xdl >= -1678\n" +
				"gus inc -473 if a >= 1935\n" +
				"k dec 80 if i != 3216\n" +
				"gus inc 138 if xtz != -831\n" +
				"mxn inc 654 if giq >= -1075\n" +
				"xtz inc -677 if um >= -323\n" +
				"cl inc -557 if hey >= 1807\n" +
				"m dec 488 if lp == 49\n" +
				"k inc -214 if q != -49\n" +
				"k inc -584 if cl != -4727\n" +
				"icg inc -423 if ms == -806\n" +
				"gi dec -323 if fxx >= -1909\n" +
				"ms dec -61 if giq != -1062\n" +
				"wm dec 259 if q < -45\n" +
				"f inc -634 if gi == 753\n" +
				"iox inc 985 if gi > 750\n" +
				"km dec -821 if db < 1950\n" +
				"f inc 105 if gi < 763\n" +
				"j inc -36 if q <= -44\n" +
				"ms inc -244 if giq < -1063\n" +
				"i dec 423 if cl == -4727\n" +
				"kt dec 77 if sd == 1481\n" +
				"db inc -779 if gi == 753\n" +
				"gi dec -525 if iox <= -2985\n" +
				"f dec 378 if rz != -86\n" +
				"mxn dec 479 if km < 1671\n" +
				"f inc -812 if kt > 118\n" +
				"db inc -121 if kt < 128\n" +
				"w inc 957 if mxn == -2042\n" +
				"db inc -97 if mxn != -2052\n" +
				"km inc 521 if q < -46\n" +
				"a dec -669 if i >= 2783\n" +
				"icg inc 47 if km > 2176\n" +
				"gi inc 459 if gi != 760\n" +
				"mxn dec 810 if hey >= 1803\n" +
				"ms inc -896 if xtz != -1522\n" +
				"fxx inc 331 if cl == -4727\n" +
				"hey dec 104 if sd < 1482\n" +
				"f dec -684 if f < -8923\n" +
				"xtz dec 893 if giq > -1080\n" +
				"um dec -749 if db < 962\n" +
				"rz inc 823 if sd <= 1484\n" +
				"a inc 4 if w > -2793\n" +
				"cl dec -559 if a > 2614\n" +
				"iox dec 116 if db <= 956\n" +
				"cl dec -384 if gus == 2291\n" +
				"lp inc 522 if kt > 118\n" +
				"icg dec -250 if km <= 2186\n" +
				"j inc -144 if mxn > -2843\n" +
				"kt dec -682 if ms > -1891\n" +
				"gi inc -320 if sd < 1489\n" +
				"iox dec -955 if kt != 802\n" +
				"mxn dec 949 if lp > 570\n" +
				"mxn dec -84 if wm > -2050\n" +
				"xtz dec 762 if kt == 802\n" +
				"wm dec -74 if um != 422\n" +
				"m inc -948 if gi >= 889\n" +
				"w inc 90 if w != -2792\n" +
				"j dec -516 if fxx <= -1568\n" +
				"cl inc -457 if k <= 1232\n" +
				"ms dec -288 if w != -2792\n" +
				"ms inc 57 if db >= 946\n" +
				"a dec -481 if w >= -2800\n" +
				"icg dec -210 if ms != -1827\n" +
				"giq inc 323 if a != 3098\n" +
				"ms inc -646 if iox <= -3090\n" +
				"mxn dec -390 if lp > 565\n" +
				"db dec 634 if hey >= 1701\n" +
				"iox inc 357 if w >= -2799\n" +
				"hey inc 434 if icg != -1503\n" +
				"um dec 763 if xtz == -3168\n" +
				"giq dec 742 if m != -5115\n" +
				"giq inc -645 if db < 318\n" +
				"f inc -832 if ms == -2474\n" +
				"xtz dec 921 if w > -2799\n" +
				"f dec -259 if xtz <= -4086\n" +
				"mxn dec -689 if ms == -2468\n" +
				"kt inc -725 if iox != -2732\n" +
				"sd inc -586 if rz <= 730\n" +
				"w dec 94 if xdl > -1682\n" +
				"lp inc -793 if km > 2185\n" +
				"cl inc -764 if j < 2348\n" +
				"lp dec 656 if fxx != -1577\n" +
				"f dec -892 if db > 319\n" +
				"i inc -441 if k <= 1230\n" +
				"db dec 935 if q == -49\n" +
				"q dec -926 if xtz > -4094\n" +
				"q inc 729 if fxx == -1572\n" +
				"lp inc 115 if k != 1233\n" +
				"j dec -252 if mxn == -3318\n" +
				"w inc 695 if gi <= 891\n" +
				"j dec -721 if gi < 899\n" +
				"sd dec -132 if sd == 896\n" +
				"cl inc 856 if icg == -1503\n" +
				"giq inc -142 if k >= 1218\n" +
				"iox inc -328 if db <= -617\n" +
				"db inc -199 if wm >= -1981\n" +
				"km dec -364 if j == 3066\n" +
				"cl dec -659 if sd >= 891\n" +
				"xtz inc -207 if giq == -1632\n" +
				"cl inc 928 if i <= 2339\n" +
				"giq inc -897 if km != 2544\n" +
				"mxn inc -61 if xdl > -1679\n" +
				"f inc 953 if lp >= 30\n" +
				"f dec -450 if giq > -2535\n" +
				"w dec -962 if kt >= 68\n" +
				"gi inc 317 if km < 2556\n" +
				"kt dec -271 if k >= 1231\n" +
				"iox dec 238 if i <= 2352\n" +
				"xtz inc -840 if ms <= -2467\n" +
				"giq dec 905 if f >= -8097\n" +
				"kt dec 484 if icg <= -1502\n" +
				"lp dec 675 if km >= 2539\n" +
				"ms inc 772 if j <= 3073\n" +
				"ms dec 297 if q > 1604\n" +
				"kt inc 465 if hey > 1701\n" +
				"w inc 987 if kt > 50\n" +
				"xtz dec 180 if q == 1606\n" +
				"um dec -823 if gus != 2284\n" +
				"hey inc -964 if um == 487\n" +
				"kt inc 387 if cl > -4046\n" +
				"cl dec -167 if gi == 1209";
		final RegisterInstructions instructions = new RegisterInstructions();
		System.out.println("Highest register value:");
		System.out.println(instructions.getHighestRegisterValue(registerInputs));
		System.out.println("Highest encountered value");
		System.out.println(instructions.getHighestHeldValue(registerInputs));

		final String garbageStreamInput = "{{{{{{},<!!!>>}},{{{{{{{<a!u!>!!!>!!}<>},{}}},<!>},<!!a!>,<!!!!!>!>!>,<i!io!!,!!}i!!!>},<a!>},<>},{<!>,<i'i}u{!\"!!!!u!}>}},{}}},{{{{<i!!!>,<<!!e}!!!!!!i!>{>},{}},{{{<i\"!>aa>},{<,oi!!!>aa,!!!<!ei!>},<a,!\"<}'!e>}},{<\"a!>!a,{\"!o'!>,<!>,<!!!!<!>,<!\",a!!!>i>,{}}}}}},{{{{{<o!!\"e!!!>{!!!>,<{!>},<i>,<!>,<<\">},{{<!!!>a!>!!!{\"{ao!>},<!>aa!!!>!>},<\"!>,<!!!>!>,<>},<au'!>!!o!>,<ie>},{<}!'i,!!}e!>,<!!!>},<!'a!u!,!{!!!>!'>,{}}},{{{{{{{<eu,!!!>,o!!!><\",i!>,<!>,uuao>}},{<}<\"a{!!!>!!!>,<a!!!>u!>,<!!!>>,<\"!!!!<}!u!o}'!!e!!!>a!!},,!>}!!>}},{<\">,<!>,<>},{<ie!!!>,<}!!{!>},<!oo!o<!!!>,>,{<!>,<!!}!!,{!,!>,<>}}},{{{<}!!{!!!>i,}'!\"ooo,!!>}},{}},{{{<!>,<o{}\"e!!!!!!!>'!>!!!>}<!>,<{!>},<{<!>},<a>}}}},{{<\"',,',a{i!oi,>}}},{{<!>!!'}e!>{,!!!!!>\"a!>},<\"!>},<},!!i>}}},{{{{<\"{!>!!u!{\"\">,{<>}},{{{}},<,!>,<a'!!a{uo!>},<>}},{{<{!>,<!>,<u{'!'!},},!>,<<<!>},>},{}},{<!>,<ia!>,<!>},<{>,{<,!>,<!!}u!>},<i!>},<!>\"eu!u!>},<{>}}}},{{{<u!>,<!!i{iu'!!!>!!}o>,{<!>},<<>}},{{},<e{ei!!!>,<\"!!!!!>!>,<!>!>\"<i!!}!>,<\"io>},{}},{{<!>,<ia\"!!!>\">,<\">},{{<}{>,{{<i>,{{{<!'!>},<!>},<,\"!>,<!!!>!>!>,<i,!i'!!!!!>},<i}>}},{{<u\"}!u!<!!!>aa\"!>oa\"!!!>!>>},{}}}},<!!e!>},<!u'a\"i}!!!!i!'>}},{{{<{}}\">},{<{\"!>,<!o!a!!!!!>!!'}!!!>},<!!!!!'i<\"iu>}},{<!!!!!>u}}!,u!!!!!>!!,e!!!>\"!!!!'}!!!>},<{>},{{{<!!!>a!,\"!>,<,}ua'!a>,{{<ia!!!>!!\",}'!!i<<!!!u!!<e!><>},{<!!u!!!>'!>},<!!!<'>}}}},<<u!>!!!>>}},{}},{{{<!>},<!!!>o!!>}},<a!>,<!!!>>}},{{{{<!!!!>},<,,<}!'>},{{{{{{<a!a!>},<'{,!>},<ia!}},!o!>},<!>},<<>},<!!i,a'!a,e!,a!>!!!>,<!!{>}},<'}!>},<!!!>!>},<<}!!\"!,!!!>,<!!o!e,o}i!!e>},{{}}},{<'!!!!!a'!!oa>,<\"{\"!!,!e!!}<'!>}!!!>i>},{<,!>},<{}!>},<!>},<i!>,<oai!!!>>,{<<!\",!!!>!,!\"!!!!,!!!>{!>},<u!!u{o!!!>>}}},{<!\"!!ii!!i!!}i'e}!>},<\"\"!>,<!'a!!!>},<e!>,<>,<{!>i{!!!>!>!!{!'ee>}}}}},{{{<\"\"!}<<!!<e!!!>!>!,!>},<!!!>,>}},{{},<!!!!,',!!!>!e!>!!!>ui!!,,!!!!!!!!!>!!>}},{{{{{<'{!!!!i'!>,<o{,}}!>!>>},<!!!a!!e!o,,>},{{<!!!{{\"{'<}!,>},<,{!!!>\"!>},<,!!!>,<'!}o>}},<!\"!!!>}!!!>e\"!>,<{{!>,<o<\"!>,<!>,<!{!!!>!!!>>},{<,!>,<!e>}}},{},{{{<o'',!!i<u!!>}},{<>}},{{{{{<a!!!>ii\"!>,<\"<e>}}},{{{}},{}},{<i!>,<,i!>},<>,{<!>,<<!>,<!!!>,<'!>'>}}},{{<}u>,{}},{}},{{{},{<!!!>!{!!!>},<i\"!><a>}},{{<\"ooaa<,!a!>},<e\"oa!u,!ouu>}}},{{{<!!!!'>}},{{<i'!!a>,{<!!!>\"e}!!,!!!\"!!,!!!><!>,<!>},<!>},<!,e,>}},{{},{<o!!!>!u!'!e<e!!!>!o!>,<!!!!<!!!!{!>,<<'>}},{{{{}},{<i!!!>!>'!!!>!!!!!!!>!!!>,<>,{<!}!!ai}{!>,<'<!!i!>},<!!!!!>!ii!\"<>}}}}},{{{{{},<!!!>}!!!>},<{e!!!'{!>},<a,!>,<<<>},<uea}>}},{<!!>},{}},{{{{}},{<!!}\"!>,<<e'!>},<!!!'!!!>,uiie'!>},<!!!>!!}>}},{{},{<>}},{{<o\"uu!!!>!!!!!>,<!}i{e!!'uu!>}a>,<{!!>},{<>,<!>},<>},{{}}}}}}},{{{{<!>'!!!>a!>,<!>,<o!!!,}!!>},{{<>}}},{{},<u!!{!>},<!>,<<!>},<<ai!!oi}u!>},<!>!>},<>},{<>,<!!<!!e}!!{!!!>,<!>!>},<o}i!>,<e>}},{{{<<!!!,<!>,<!e'e\"a'>},{<!!!e{!<!!!!>}}},{{{{}},{{{<!!,!!!>{!>},<\"}!>'!>},<!!e!!!>!!<'}i!>!!>},{{{<a!!,,,u>,{}}},{<}!!!>\"!a,u!!'ou!>}!a>}}}},{{},{<}!ae!>,<\"!>,<!!!>{,>}}},{}}},{{{{<i'{uo!!!>,>},<u!>},<!!!>!!!>,<,!>,<i!>},<oe>}}},{{{<a!!!>,a!!!>}}!>},<!o\"i,o!!!!uu!>,<!>},<>,<i!>,<!>},<!!!><a>},{{<!>{!!\"a\"'}>},{<!>,<,,e!>i{>}},{<>}},{{},{{<!!!!},}!!}!'!>,<a!!\"{a!>!!!>!!!>i!>,<>,{}},<o!!<!!<,!!!>,!!ii'!<u}!!!>!>}\">},{<}a<<a'e<{<uu}a>,<!!!!!>!o>}},{{{{<e!>},<,e!!!!!!!u>}},{},{{<\"'<'>,{<e!>!!{>}},{<'\"!!!!!>'!>\"{!>!>},<!>},<i<!!!><aa{>},{}}},{{{<!>},<i!>'e!>},<!!!>e\"!!!>,<!>},<}eo!>,<!>,<,a>}},{},{{<!!!>}ie!!}!!i',>},<!e!u!!,!>},<!!!>{{!!!!'!>}a\"!!!>,>}},{{{<!!!!!>,<{aa<i!!!!!!!>'{oa!}!!!>i>,<,<!!!!!>,<!!!>!>\"!!!>!>,<}'!'i>},{<!}{ee>,<>},{<!!!>u!!!\"a,\"!>},<!!!!!!!!!>ea!!!!}!>,<!i>}},{{},{{{<,o\"'>}}},{{<!!!>!!!>!>{,'ue{'!!!>>}}}},{{{<e!>},<!!!!!!!>o}!>,<!{!>,<!!!>'\"!!!!<i<u!!'{>}},{{{<!!!>{a!>},<''!!o!!!!!>ii!>,<eii{}<e!!!>>},{<'\"!!!!{!!!!!>!>},<}>}},{{<uo}!e'!>,<!!,<!>,<a!>,<<!>!>},<>}}}}},{{{{{{{}},{{{{{<{!>ie<e!>,!',!>,<u!!!>}a!e!!!!'!!>},{<!!!>,<i}},<!>},<!!!>!!!!{>}},{<!>},<,\"{!!!>'o}!>,<'{>,{<e,!!!!!><>}},{{},{}}}},{{<oi!>a'!!!>,<!!{{a!>,<!!}i<!!\"o!>},<!!!i,a>},<!!u\"'!!'!>!o'{iei!!u!>o{'\"!>},<>}}},{<{!!\"u>,<}!>,<>}}},{{<!!<!>,<>}}},{{<{!!,!o!!!>}\"!!!>!>},<a,euo\"o!>!>},<e}>,<'!a!!!>},<<!>,!',{i>},{{<e!a!>},<ai{}{!!ue<>,<'!!<>}},{}},{}}}},{{{{{},{}},{<oia!!!>!>,<eae!!<>}},{{{<>}},{{<o'}!>o!>},<!!,!>!>},<>},{{<!<>},<!!!>u\"<<!'o!!\"!!!!!><,'!>>},{<'!!!>\"!>,<oi,>,<!!!!e<\"o{'uo!!!!i<!!!!!>},<!>>}}}},{{{{{<!}'!o\"!>},<!>,<!<iio,{aa!>},<>,{}},{{<e!!{!,!!a'>,{}},<!!}<i!!!>}i<!>!!'u!e!!!!'!>,<!>,<,!>,<>},{{{<!!,!>!!!>a}uiu!!>}},{<!>,<!!uo<!>!!!>,<'!!!>o>}}}},{{{},{{},<{\"o>},{{},{{{}},{<i!>,<,!>,<!{<!!\"u!>u!!ii!>>,{<'!!!>!!!'!!i{!'<>}},{<!!'!>,<oo!>!>!>},<i\">,{}}},{<!>,<>,{<!>!!\"}!>},<!a!'!!!>!'ei>}}}}},{},{{{<{!!!>>,{<ai!!!>,<'<>}},{{<!>i!!ae<!>,<!ii!!!!i!!!!oo!>,<}!!}>},{<,!!!>!>i>}},{{{{<,eo}!}o!>},<\"!!'<{<!!!o<!>,<!a!!ia>},<!!<ie!!!>!'i<u\"'!!!>i,}!!!!e>},{<!>!!!i!>,<ai!>},<!>e!!!>{!!{u!>},<!!u>}},<,!!{uo<'!>!!\"}}>}},{{{},{{<ae!>!\"o<o!!!a>},{<i!!{i{!>,<\"!!!u!>!>,!>,<!!!!!>>}},{<{'e{!!\"!!}!!\"a!!!>i>}},{{<'!<,,}>,{<!!!!!>!>},<!!,!>},<!o!},!!!>,,e!!\"eea!>ie>}},{},{}}},{{<\"{!>},<!<e<<!!}>,<}!!!>!>,<u!ii<,ii}!!!>!>,<>},{<!!!>{'!>!!'!>,<!!ao!!}!!!>\"io!!,!!}{!!!>,<>}},{{{<o,!!ie!!!>,<!>>},{{<\"!!!!!!}!>,<!!i<,aa>,{<u!>},<',!>},<'!!!>,<a!!u!>},<,!!!>!!e!!!>},<<o\">}},{}},{}},{{{{{{<!>},<'>}}},{}},{{<uu!!\"!!<e!>!>!!!>!!o>},{<,u\"!>},<'{!!!>{}{>}}}},{{},{<<!>u!!,!<iuia,!'}>}}}},{{{{{<!>,<\"!!!>a!!!>{u!!!>>}}}},{{},{{<!!!>!!!!}>,{<!>},<,\",e'\"!!!>!!!>!>},<u\"i>}},{<!!!>{!>!!!>u!>},<\"e<<!,>,{}},{{},<{!>,<!!!>ou{!!,!!i<{o'i!>,<ae>}},{{{{<!>},<o!>},<!u}{!>!>},<!!!!'{a>},{{{<!!e}!!!!!>>}}}},{<!!!>,<!>,<{!>io,!\"\"o!!e\"\"aee>,<ui'o!!>}},{{<'ue{'u!!!>,!!u!>,<ouu!!!>!>o!o!!{>,<i!>,<!>!>,<!!i>},{{}},{{{<!>},<!!u>}},{}}},{{{}},{{<!!!!!!a<!<!!a\"!!\"e>,<!o<!!!>>}}},{{<''!!,!!\">,{<<euu}uo,!!<a!!!>!>,<a!!!>,!>i>}},{{<,}u!!!>},<!!!!!><u'}>}}}},{{{<!a!e!<!!\"'!,!>!>,<!!a!!oi!!!>,<aiuu,>,<u<\"!!!!\"o!a{!!i!!!>o{!!>},<!>!>},<!!!\"!!e!>,<!!!>!>},<ou,{i!>,<a!>!>uo>},{<!>o!!!!a!>!!,u!!a!!!>!!!!!>\"!!!!!>>,{}},{{<!>},<!>!!\"!>},<a'!!,\"}!!!>'<i'!>,<!!>}}}},{{{{<!!\"o'e}\"!>},<ie\"!!}ea!!!>>,<<i\"!!!>>},{<>}},{}},{{}},{}},{{{{<,u!<\"<ie!>},<!>,<!!!>}a!ou!'!>},<>},{{<ie!!!>},<!!!>!!a!><!!!!e!!\"e>}},{{},{<!a!u{>}}},{{{{{{},{}}},{{{<!'{!>},<}a\"aaa!>\"o!>,<,!>},<{!!!>!>,<{>}}}},{{{<!>,<<i!>!!!>!!a,\"<!>},<i}o{>,{{<!!!!uu!>!!'!u<>}}},<!o!!!>{!!!>!!i!!!>!!\"{!!!!!>>},{{<i,!>!>},<!>,<!!!>},<ae!!e!>>}},{<eo!>,<a}>}},{{{{{{<{uu<,o''}!!!!!!!ao<!>,<>},{{},{{<,a!!!>!>!>,<\"u<!>,<!!!><,!!!>!!uue{!>,<>}}}},<a<u>},{{},<'e{e!!!>!}<!!<i{o\"!>,<!!io!>,<!ia>},{{<}<!!}e{}eie}!!{i!>,<>}}},{{<!!!!}!!!>!>},<!>,<!!!>}!!i!!!>},<!>,<i>},{{{},{}}},{<}!!a'\"'>,{{{{},{}},{<!!!>},<ia>}},{<!!!>ao!!''!!!><!>,<!!i!<!>},<,!!!>!>},<iaaeo>}}}},{{<u!!!!i!!!>a>},{{<!!\"!>,<!>,<!>,<e'!\",o!!!>!!i!>},<>}}}},{},{{<,ei'{,ea!!uo!>,<a!>,<>,<!ee<!><,!>{!!!!!!!>>},{},{{<!!}o!!!!'a'e!!!>!!!>!>,<>}}},{{{<,i}u!!<!e\">},<o!!<,{,u!!!>!!!>{>},{{{<!!!>!>,<!>!>}>},<ea>},{{{{},<i!!!>}o{!!!>!!!>u!!ioe!!!!!>!!!>},<>}},{{}},{<}!!!!'\"'a!!{!>,<<!!!>!!o',!>,<!!!>!{!>,<!>,<>,{<o\"\"!>},<ai>}}},{{{{<!!!>!!!>!!!!!>ao!>,<\"{!>,<i}<oo!>e'!>,<>}},{{{<!!!>!!}<<,>,{<}<'''!,!!!>ea!!'!{oi!!!!ao!{\">}},<o!>i>}},{{<!!ouo<!>,<i!>,<}{e!!'!!!>u{!\"!!'>,{{},{<!<!!!>\">}}},{{{<>}},{}}}},{<!>,<!!ia!<!>,<a!o!!!>e'!>,<!!<,o'>,{<!oi}!>,<!!!>!>!>,<ea!!!>\"!>!>!}\"o'!!!>!e>}},{{<'{{'>}}}}}}},{{<!a!>},<i}<\"{<e!>!>},<,\"'ia!!!!!}e}>,{<>}}},{}},{{<!>},<!!\"\"<{!!!>!>,<!>},<!,o<!!!>!>,<!>,<e'}>,<},ou<!>!!,!>,<!>oi!!}>},{<a!>},<!!!!!>{ae!!!>!>},<>}}},{{<!>,<!!<o}e!>,<!>},<!>,>}},{{{<,!!e!!'a!!'o!!!>,<!!>},{}},{<>}}}}}},{{{{{{{<a!!!>,<i!>,<{>}},<>},{<e\"!>},<!>e!>},<',>}},{{<!>},<}\">},{<u!!!>,!!!>'a,!>,<}!}'!!'<u<!!!,<>,<!>,<!>},<!!,ea>}},{{{{<!>,!!!!!>ao>},<o!!{!!a{\"!!!>},<>},<}aa,uu>},{{},{<oa!>},<!!'aa>}}},{{<!!!!i!!\"'!!ai!>},<o\"a>,{{{{<}!!!\"!>,<!a!!!>o>}},{<u!!i,!!!>!>>}},{}}},{}}},{}},{{{{},{{<\"'\"uei{'a!u!!!>},<!{{e>},<\"u!!!>},<{!!a!>i!!e!!!>>}}},{{},{{{<i<{!!!>!!!!\"u{!>,<}>}}},{<!!!>'!>,',!!!>oe\"'uu{oa}<>}},{{{<>,{{<,!!!<>},{}}},{{<!>},<<a>}}},{{<!>,<'!!e!!!!!!!>,<u>,<\"u!>i!>}!!<o'>},{{<\"a!>,<!\"o!!o>},<!!!>!!!>\"!>o!!!>u!>},<!!!!!>},<<!!!>>}}}}},{{{<!>},<e}<!>,<,'{oi,}ia>,{{{{{{{<!!!!!>},<!><!>},<o!>a'{i'i>}}}},<!>},<\"}i<}!!!>!!!>i>}}}},{{<!iia<\"!u,<!!u!!!!!>a>},{{<!!!>!>},<ee>}}}},{{{}}},{{{{}},{{{<!!!!!>eua{}}!>},<!!i}{!>},<}!>},<!!'!!!!\"u>},{<,!!}\"ei!!\">,<<o<!>},<oi!>,<u},{>}},{}}},{{{{<i!>>},<!!!!!>},<e!!!!<\"e!>},<,{>}},{<}!!e>,<!!!>,!>},<!i!!oe,!a!!a!!!\"!!\"!!'>},{{<,!!e!!!>,,{!!}}!!<oe!!u>},<a\"uao!o!!{e'!>o!>},<o>}}}},{{{{{},{<u,<>}},{<i>,<!>,<\"!!!\"!}!>},<!!!!!>',<!>,<o!!e{>},{{},{<!>}!><>}}},{{{<\"\"!>!>,<!>},<!>!!!><{!!!>!!e>}},{{<eai'<<!!!!!>,!!<'i>}},{<u!>i,!>!!,<!>i'a>,<!>,<!>,<!<'!o!!!!!>,<>}},{{},{{{<!!!>,o,!!}!>!>!!i!!{u!>},<>},<\"!>},<!>,<{!>!>},<<!!!>!{!!!u}e!>},<e!>},<\"!,!\">},{{<!>},<!u}!>,<>},{{<>,{<!!!>}}!!,!>,<!!u>}},{<i!e',!!'<,,>,{<!!!>!>,<ao}a'!>,<!!!!!>!i!!!>>}}},{}}}},{{{{<e{!!}{,<'a!>,<!!!>>},<>},{<{<u}!!iu!!'!!!>o\"{e!>,<!>>,{<>}},{<{!>},<!>},<!>},<}u{<!!!>,<{,!!!>!!<>}},{{<!>!!i'>},{},{{{}},{{{<!!!>a!,!!!>},<i!>},<!!i,i'!!}!>>},{{{<!!!>}i<!!!!!>,<u,\"ie'!!!!!!e!!!>e!u>}},<u'!>,<!!!>'o!>,<}'!>,<!!!!}\"a>}},{<!>},<o!<!>,<i>}},{{{<>},<a!!!>,<a{!>!!}!iaue!>!\">},{{<!!,{e!!!>!!!>},<i\"!>,<!!<\"!!}iue'!>!>>},{{{},{}},{<e!u<!!o<!!!>!!!>o!>},<o>,{<!!!>\"<!>,<!>},<!>},<!>,<!!e}>}},{<!i'!>},<>,{<>}}},{<o!>,<!>,<<!>!!{ui{<a!!{!!'!!u!>>}},{{<!ou!!!>!>},<u,!>!!!a'<a!!\"uo{>},<}!>>}}}},{{{{{{{{<!!!>,<\"{!>,<!i>,{<e,u>}},{{<!!,!!a!>,<!>!!!>},<''e!<>}}}},{<<!>},<!>o!!i!!!'!>,<!!!!!!!>o,!}e!!!>,!>a>}},{}},{{<i>},<e!!e!!{!>!!!>u!>!<!>\"i{!>,<!>},<'!>,<>}},{},{<>,{<\"!>,<u!!!>},<!>,<\"!!!>!>,<!>e{!!!>!!!!!!ue<>}}}}}},{{{<!!!>},<!!}\"e!!>},{{<a!!o!>oa!!o<!>,<!!!>},<<'!{>},{<o!>},<!>e!!i,\"}!>!>},<>}}},{{{{{{{<}!'!!}!!e!>,<>}},{<o,>}},{<!!!>}!!!>\"!>},<>},{{<!u!,!!{!>,i,>,<e<i!!!'<}>}}},{{},{}}},{{{<!>o\"uu>,<!>{ii!i<>},<'oe{!>>},{<<'ao!!u!!e!!!!!>,<u!''ee!!\"}>}},{{{{{<i!u!<a!>},<!!!>,<{!ue'<!!!!!>io!!aa,>},{}}},{{{{<'!!!>!>},<!!<!!<''ea!!a!ii<ai!>>}},{<'!{<a\"o<!>},<!,a,i>},{<,!>,<{>,{<}>}}},{<ao,e!>},<i>},{{{{<o{!>},<!!}!!<!!!>},<oo>},{{{<!!!>o!>!!a!!'\"!>!!!!!>!>\"!{!>},<>}},<!!,,!!<,!{!!!>,<!!!>!!!>>}}},{{}},{{<!!!o}!>,!>!\"!>a\">,{<}>}},{}}}},{{<u!!{>},{<!>},<!!!>\"\",{\"i!!!>u\"a!!<oo!!!!!>,>}}},{{{{{{},{{{<a>},<'!'!>},<a>}}},{<ou<>},{<!>ooiu!>},<!!!a!!!!!>>}}},{{<i!>},<{!!,ue!>,<!!!>\"!'!!'u!\"i!>,<>},{{},{<!\"<!!!>!!'ueo>}},{{{<{!>!!a!!!>!!!>'!>'!!<o}!!'i!>},<!>},<!!>},{{<oe!!!>},<'i!!!>!!o\"!}!u,i\"oeu\"\",>}}},<!!{o}}u}\"!<!\"\"!!o!>},<<!>},<}o\"i!>},<>}}},{{{{{{{<ea{}u!!!>!!!>},<!>},<>}}},<<eu!!!!<!!<,!!!>!>}\"!>,<u>},{}},{{<!!{!!}u{}u',!>,<!>},<!!!>e'\"}>}}},{{{<'<u!u!o!!!>!>},<!>\">},{}},{}}},{{{{{<u!>,<e!!!!!>!!!>!!!!!!!>!u!>>},{<!oa!!!ee'!\"u{,ui!!oii!>},<u!>},<o>}},{{<}o}!,!>},<!!e!>},<<<!><<!>,<!!,o!!{!>,<>},{<,!!!>,<!!\"!eu\"i>}},{}},{{{<!!!>\"uii!>},<!o}!>!!!>>},<,>}},{}},{{{<,{,,!>,<!!!!u!{o>,{{}}},{{<}!!a!{!!!>oi'a!>,<{{,'>},{<{o!!,!>,<!!'!>e,o}u!>},<>}}},{{<!!!{!>,<'o!!!>'!!}!!\"{ue\"!>!!,>},<!\"!!,a!>,<!>!!\"oie>},{{},<o!!,!!!!!!!>}ei>}},{{<oi!i>,<,!!a}>}},{{{},{<eo\">}},{{{<<!!!>!>},<!!e!!!>,<}i!>e}o!>,<oi!>,<!!!>'>}}},{{{{<}!>,<>},{{{},{<>}}}},{}},{{{<uaei<>,{<{{\"!!>}},{{{{<!>,<!!!>u!!eao}'!!!>},<!>},<!>}!}>},{<!>!>ui>}},{{<!!!!ao{}''!>'uo!>!!!!!>},<!!i}!!!>!!!>>},{<<i!!!>,<'!>},<u{!>},<!!!>!!<>,<,<ia!>{!>eu>}},{{<>},{}}},{{<!!{i!>!>},<!>,<!!!>!!u}!!!>o!>},<>},{}}}}},{{{<\"!>>},{}}}}}}},{{<>,<'!>!>,!>},<!>!<>},{{<,o'\"ia!>e}i,ie,u{!>},<!>},<!!>}},{<!{{}!>,<!>},<i!,>,<o!>},<eu{e!!!>'o!!!>!>!>,<{\"i{!!<a>}},{{},{{<!!!!i<<a!>},<!!i\"u!>,<!!!>,<<!!!!!>\"!>},<,>},{}},{{<\"oi>,<!>,<!!!><,oi\"euuoo!>!>,<!>,<ie>}}}}},{{},{{}},{<>}},{{{<!>},<'>}}},{{{{<a{i>},<ou!>oiae<!>},<!>},<!>}<o!!!>u!>>},{{<!!!>,a!!!>i\"!!\"!!'>,{{},{<!!\"{ou'}!!,iue'>}}}},{{<o!!!>!!\"!\"!e!a!!!>i!>},<!a!!>},<<!>},<!!!>,<>}},{{{<!!!>!>,<!>},<>},{<!!!>!!!>!!!>},<!>},<o!>e!!\"!>,<>}},<>},{{},{}}}},{{<,eo!!!>}!>,<!>},<>,<!!!}<!!'{<!>!!!>}e{!!!!!>!!\"u<>},{},{<<},!!!>u!>},<!>},<>,<eo{!>!>},<!>,<o!!!\"!>i!!!>\"!!!>!>},<au>}}},{{{<i\"}!>!>},<!>,<u!>},<a!!!>,<!>>,{{<!>,<,}!!\"ei!i!!,a\"'!>e<!>,<!}>},<>}},{{{{<<,!>},<!!!>'!>,<!!!!u!!u{!e,e!!!>,<a!!!>!!!eu{!>>}},<io{o\"!>,<ii!!!!!>,<!>{!!!!>},{<a\">},{<\"!>,<!>,<!>,<!>,<ea!>},<iu!>,<'!<i,<o>}}},{{{{{<o!!!>,<!>i<'eu!!!>!>,<a'!>>},{{<!!>}}},{<\"<{!>!>,<!>,<'{!>},<!!!>},<o!!a!!!}>}},{{},<{}!>!><<ea<u!!!>'!>},<<>}}},{},{{{{{<!u!!!>a,!>},<a!u,>},{<!>o!!!!!>!!}u'i!>},<>,{<e!!a\"a!>a!>},<<!>},<ae!>},<!!i!>,<>}}}},{<!!oeu}},}}a\"i'<\"o!!!>!!}{!>},<>,{<,a>,{{<!>,<}!!ia,',>},{{<!!!!a{!>},<!>,<!!!>!>,<<!!!>{,!\",>}}}}}},{{{{<!uo\"}!!!!!!<!>},<>,{{<!!<i>},<u!!!>,<!>,<,'!i,eo>}},{<!i!!e<!{e>,{}}},{{{{<,!!!>,<!>},<>,{}},{{{},{<o!u!!!!!>{!!ue!!oo>}},{<e!!!>,<!!!,!>,<'\"!!!!u}\"!!!!!u!!!><!!!>>,<,!>},<!u}!>,<>},{{<{e\"!!!e,\"\"o\"{'!\"!!!>a\"!<>},<ueu<!!!>!!!!<!>,<!!a{},<'!!!!{>}}},{{{{<oou!!i>,{<>}},<a}!!!>,!!!!{'u\",i!!!>ae!>},<!!!!,!!<>},<e{<ee<o!!!,!!!>>},{{<>},<!!!><>},{{{{{{<'e!a!>!'<!>},<!>!!!>,!!,!!!>!,i!!!'!!!>,!!!>>},{}}}},<!!<!>},<\"!>,<'!!!>,<ae,a!>,<!!!>!>!!>}}}}},{{<<!>o!,!>},<!!!!!>!oa!!!>!>},<'>,{}},{{{},{<}u!!e!!!!!>,<}!>,<!!!>},<i,!!!!e!>}!!>}},{{{<!!!e!><{e!>},<}!>,<!!!>!,!{iu>,{<!!!}!!!!>}},{{},{{<i!>,<{>}}}},{{<{a<,!!!!!>!<!\">,{<}i!!'e!!e}{<\"!>},<!>},<'e{aa>,{}}}}}},{<<}o!>,<!!u!>},<\"{,\"!!!>!>,<!!!>'!}>,{}}}},{{<}!a!>},<'!!!>!u{!!!!!>!>ioai{'>},{{{}}},{<!!}!!!!!>}{o!!!>},<!>},<!>},<!!!!!>!!{',>}},{{{},{{<,!>!>!>},<u!>,<!>!>},<o}i}!!!>>}}}},{{<!a!>>,{<i{a!!!!!!i<a!>!\"{}}!>,<'!!!>!!o>}}}},{{{<!!!>!!e}e!o\"!!>,<!!\"!!!><<!>!!!>,<,!!>}},{<\"!!!>!!!>o,!!!>>},{{}}},{{},{<}!!o!}ua}!>},<,{i<>,<i!!!>!!!>!!!>o!>,<!>!!'u!!}!>,<\"!!>}}}},{{{{{{<<io!>},<}!!e<<e!>{>}}},{{<>},<!!!>u!>\"}i!!!>,<,}}a!!!>!\"!}u!!'>}}},{{{{{<\"!>,<e!'!!uo!>,<o!!!!e>},{<!uuu,a>}},{{<'a<>},<o!!}i>}},{},{}},{{{<!\"{,au<ee!e,!!\">},{<}'\"i{\"!iou!!!>!!!>},<!>},<>}},{{<'\"!!!>e!!au'!!!>>},<''\"ui<u!!!\"ua\"i!!!>!>,<!!a\"!>a>}},{{{<!!!{u}{'}!!!!io,e>}},{},{}},{{{},{{<'\"!>,<e!>{>},<'a<!>},<!!!>\"oee>},{}},{<<aee!>},<u{\"{!!ea!>o{!>,<!>},<!!!<!!!!!>>},{<!!<e'!>e!>!>,\"!>>,<!!!><o!!o!\"!!}!!!!u<!!!!\"{!i!!!>>}}},{{<'!!!>!o!}!>,<,!e!a!ao>,{}}}},{{{{<{}!>,<>}},{{<}oa,!!e!>},<<e}!!!!!>},<!>{!!!>{!a,u>},{<'!>,<u>}},{{<\"!!!>,!!!>!!!!!><!>!!a!!!>,>,{<!!!>,!!>,{<!!!>!{o>}}},{}}},{{{<i!!o>}}}}}},{{{{{<u>}}},{{<!!!>!!!>\"oeai,!>},<!>,<!>},<!!!!!>}e<o{>,{<\"{}!!!>a!i,!!i!,'{!!},,>}},{<a<u!>!>},<!'!>,<>,{<o!!>,{<{!ua!!o!>},<!!o!>},<!>,<!>,<!>!>oiu}>}}}},{{}}},{{{{<!>,<'\"!!ii\"!><a>},{{<>},{}}},{{<!!o<}!!u{!>},<!>},<<!>,<<!!}',a!a!!'>},<!!!{!>},<!>,<!>,<!!<!!!>>}},{{{{<e\"!!'!!!>},<!>,<a!}i>,{<!>''ae!>!>},<!>},<}!!!>\",e!!{u{>}},{}},{{<!oa}!>},<!ii!>!>!>,<{!!uu>},<!u!!!>},<!!a!'!!uo}oo,,'!!>}},{{{<!!!>o!>,<'<ia!!!>,{!>},<>},{<<\"u!!<ui!!}!>},<\"!>oo!}!>,<e}!>,<!>},<!!i>}},{<u{!!u!!!!<{u!!!>!!!>u!,!!!>!!!>'eio'>,{{}}},{<e!>},<\"!>},<!>!i!>o>}},{{{{},<<eai<!>},<o!<!!!>,<a}!,!!!>\"!>>},{<!!!{'!>{!}}ioui'>,{<!>,<!!!>!!\"!!'!<o}}>}}}},{{}}}},{{{<!>!>!!a!>},<o>,<,!>},<{!>!>}i!!'u,!>,<i!>,<'a{>},{<!>},<i!>,<o!!!!!>o!>,<!><\"!!!>>},{{{{{},{<!>},<a\"!!<{!>,<!>},<'!>!,'!>},<!!!>,<!>},<u,>}}},{{}}},{},{<!,!!!>!!!>eo\"!>,<a!io,uu!!!>>,<!!!>!!i!!!><>}}},{{{{{<e!!o!>}!>>},{}},<!!!>u!>},<!a,e>}},{{{{}},{<,!!!>!<<!!{'e{!>},<>}},<e!!}{\"'!!{!>,<!!!i!!!i>},{{{{<}eu>}},{},{{{<!!<!!o,!!a'!>},<o\"a!!!>,<a!i!!!>{,!!!>>,{{{},{}}}},{<e!!'!>,<!a>}},{{<oo!!!>\"a>,<{o<<o!>},<i!!!>\"!'u}u!>},<}ue>},<!!!>!\"\"'>}}},{{<o\"!!u\"'!!!>!<!!i!!{\">},<!!e!>},<!!!!!>\"!>{o>},{{<}\"!e\"o>},{}}}},{{<\"!>},<!!'i!i!>!,}eu\"a!!!a!>},<i!!\"!u!>},<{>,<!!ie!!o!!\">},{},{{{<!e!>,<{'!!!!<o<!!}!!!>},<!>!!!>>}},{}}},{{{<\"\"{!>!!!!aau!!!!<>},<!uae!o!>},<\"!!<eo>}}}},{{{{{{},{<!!!!!!!>,!!{!\"e<>}},{<!>},<!!!!!><!!!!!>},!!e!>},<!>!>},<!!'u!>,<\"!!,}!'>,{<e!!\"'!>},<o!'\"u{!>},<{!>},<<\"!!!>,<!!!\">}},{{{<{!!u<!!a!!!>,!e!a<}>},{}},{{{}}}}},{<}!>},<i!>,<!>,<>},{<,!>},<!>,<'<\"!!!!!>{<!>,<>}},{{{<!!!>!!!>!u}!>},<a}u{\",o!!!>},<\">}}}},{{{<!}\"!!',!!!>,<!>>},{{<i!!o<\"a}o!!uu{!>,<\",o!>{>},{}},{}},{{{{<e!!{!!<!au!!!>!>!>,<o!!!>u!\"u!>,<e<a'{>}}},{{},<!!<!!!>a!>},<!!!>!!}!<oa'>},{<{!>},<!>{!>},<!!!>},<!!!>!'o!!{i!>,,!>},<i>}},{{<'ea}a!!}!i>},{<ia!!!>},<!!!>{u{<!>,<!!!>},<u!>,<u>,<,!\">},{{<u!>},<!>,<>}}},{{{}},{{{<o!e{!!ui\"!}!u!!!!}i,o!\">}}}}},{{{{},{}},{},{<!>'a!!!>>,{<!!!>a,,!>,<!>,<{!!!>ee>}}},{{{},{{<!!'a\"<i!!!>'!!,\"\"u!>},<\"\"u!>>},{}}},{{}},{<\">,{<}ea!!!>,<!}}oe\"!>,<!>},<!!!>>,{<!!!{,>}}}},{{{{{{{<{u\"!}\"!!>}}}},<!!,{i!>,<u,a,!!!!\"!>>},{}},{},{{{{<,\"!!\"\"ue!!>,{<}''eoiae'!ae!>},<o!>},<e>}},{{<!!!>,!!!>!!\"!!!>!>!!i!,!!!!e>}}},{}},{{<!!!\"!''\"}a!!!eia!!o!oeu!>},<!!!>a!a!>,<>},{{},{<!!!>!!!\"!!!!\",{>}}},{{{<{!{!>,<!>},<!>},<{>},<!!'!!o,e!>!!>}}},{{{{<o}e!!>},{}}},{<u!!!>i!!!>!}o!>e!!o!!i!!}!!!>!!!!\"u!!\"\"!>},<>,<!i\"e!!!>ei!>,ee>}}}},{{{{{<}!>,<!>},<'o!>,<e>}},{{<i\"!!e!ia!!<o\"!>},<>},<}!i!!\"!!,!>!!!>!!}i!!<'!>},<!!!>u}{>},{{<o{!,!!u>,<o>},<!e{!{{!!!>ue\"!!o'!!,u!!!>!'!!'o}'>}},{{{},{}},{{}},{<!>},<!<!!!!!><!>,<<u}!!!!!>,<!>,<!a!>>,{{}}}},{{<!!!>{'>,{<!!!>\"!>},<>}}}}}},{{{{{{{{<!>},<a,!>},<,>}},{{<a!<\"a>,{<!>},<!!a!>},<o<>}},<!>uo!>,<u{!>!>!eu!e'!>,<!>}a!!',!!>}},{{{<'\"}!}!>,<!!!>!>,<!<i!!<!!!!!>i!>},<\"!!!>},<'a<>},<}\",!!!>,i{!'!!!>e,'!!'u!!!>'>},{},{{{},{},{{<\"!!e!!}!>e<!!!>,<>},{<!>>,<o'a\"!>,<i!u<<>},{<!!<!!!!ooi!>,<o!!}!>,<!u!!!>uaa!!e>}}},{{<{{,,\"{!}!>},<!!!!a!!!!uie!>,<ia!o>}}}},{}},{},{}},{{{{{{<ou!>},<!!<>},{<o'!!!!u!>,<!'>}},{{<{i!o<o'!!!>!'>}},{{{},{<!><}>}},{{<ua!!ai!!aa!!!>!<!!a!!!>},<>},{<{,\"!!<}!!!u!!>}}}},{},{<!!eio!!e!>},<e>}},{{{{}},<!>},<e!>},<!!!i!>i,u'>},{{{<!!!>>,<!!'i!>},<\"!!!>!!i!o!!!>i,!>,<!>>},{{},<}!!!>!!!>o!>,<!!!>!!,!>,<e!!<!i\"'!!{>}},{<,!>},<<!>,<<!!u!>,<!!!>!>!!!{>}}}},{{{<o{>}},{{<e}a!>,<!}{e!!!>i!!!!}!u,>},{{{<\"u{<!!!!!>,<\"o\"o!!!>,<!e\"!ei<>}},<ou!!!>,,!>>},{{<'e!!\"'ue!!!>!!}i\"a!!\"o\">,{}},{<!''!e\">,{}}}}},{{{{{{<!}!!i!!e'a!>,<!}e!>},<a>}}}},{<'u>}},{{<>},{}},{{<<}\"\"!!iu!>,<\"!o,<'}i!!!<!\"{!>,<>,<>},{{<\"i,\"!!!>!!!>!>!>},<>}}}}},{{{<!!!>uu!>},<<!>},<!>i}u!!!!e!{,!!!!!{'!!!>>,<{<!>},<!>},<uiaeo,>},{<!!{\"'!>,<'u>,<!!i!>},<!!}!a!!!>!!!>!!!!'i<a,!!o!>!}{'!!!>\",>},{{<>}}},{{{{{{},{<!!!>u!!\"!!>}},<eu\"o{!!!>ai!!o!!a>},{{},{{<{,u!>\"e}>}}}},{{<ea!!!>!>},<!o!!!>!>,<>,<\"\"!>,<!>}e!!}<e>},{<{,iiu!!e!!iui}au{i\">,{}}},{{},<!i>}},{{{<!!!>}a!!,!>,<!>,<a{i!>},<ao{a!>!,'!!!>>,<>}},{{<aio,!>\"u!!!>!>!!a<<>,<,>}},{<!!!!o!!o\"!!a\"!>},<!!aae}>}}}}},{{{{},{{{}},{<a<!!!!!!!ea<{>,{<!!ie'''!!!>,<e!>},<i>}},{<a!!!!a>}}},{{{{{}},<!!'!>},<!>},<>},{}},{{{<!>,<eio>,<>},<a!>a''e,!!!'!!a{!{!ia,>},<{oai!>!!!>!!!>,<!>},<aao!>},<,!e!>!!!!!>,>},{<ae>}}},{{<!!!'!>},<{!!!>\"!!!>}>},{},{<eo\"!u!>},<!<u'{!}',!>},<,>}},{{<!>,<!>},<oauu<}!!'!!!>!!{e!!!>!!!>},<!!!>,<!'>},{{{<!!}!>,<!!'!>},<}a,o<{a!!!!'u!!!>!!!>!!!>!>>},<o!>},<a!>!!!>a}!>},<}\"a!!\"!>,<u\"ai>},{<!!!>,<e!>},<a!!oe\">}},{{},<!!!>!!!!!>!>{!!'!<!>,<!!!!\">}},{{<a<!!i\"!!!>,!>},<!>a!{>},{{{<!!!>!!!>!!\"!>,<!!!!{<!!!>},<o!>},<!>,<>,<'!o'oe{!!','!>,<!!!a!i!>a>}},<}!>},<>}}},{{{<>,{{<i!!<o!>,<!>,<!>,<\",>},{}}}},{{{},{{},{<>}}}},{{{<!>},<!!!>!!!!!!!>!!e}<!!!!!!{!>},<e!!!>!}{>,<!!!>!<ii!,!>e!!i{o!>,<>},{{{<a!!!!!>,<!!!!!!!>!!!>}!!uo,a!!{!!!>!\"ee!>!>,<>}},<!\"'!ou<o{!>>}},{{{<}!!!>,<!>},<e{o,!!!>},<!><!!ii{!>!>},<u!>,<>},<{!!!!'!!!>}>}},{{{<eie!!<!!\"!>},<}!!}!>,<e!>,<>,<!!!>,<!!!!{>},{<!>},<au\"'o!!!>!!i,,{u!!!><!>},<!!!>,u>,<a!!i>},{<}{!>},<!eu',!!!!u!>>}},{},{{<!>},<!>},<!!i,,!>,<!!i!!}o}i!!!>'}a>,{<i!!{u!>,<}>,{<e!!!!!>i!>,<!>,<!!!>a!!!!!><o!!!><>}}},{{{<>},{<e!>!>,<'a!!!!i!>,<\"o!!!>'uo,<>}},{{{}},{<>},{{}}}},{}}}}},{{{{<!!!>o\">},<\"a!>,<,i!!}!!!>},<!>,<>}},{{{}},{<{>},{<!>\"'!>!!!!'>,<<}!>},<\"!!!!!>,<a{>}}},{{{{},{{<i},!!>},{<!!!>!!,!!<i{a!>o>}},{}},{{<!ei!>},<\"au!>},<!!e}{>},{{},<!!!>!!!>i,}!>},!>},<\"!i!>,<!!>}},{{{},{}},{<!ea!>},<oe!!!!!>,<o!!!!<!>},<>}}},{{{{},{{{{<o{!>,<!!!>!!!{!>},<{o>}}},{{}}}},{{{{},<!>},<!>'!>},<!>,<i<!>,<\"u!{a!!u}}>}},{{}}}},{<<!>},<>,{<{!>,<i!>!>\"<}u!!<{a}{{\"},!>>}},{{{<!>!!!>,<!!!!\"\"a!>},<u!>},<{\"!u!>},<\"a!o!!!<!>,<}>}}}},{{<{e,!>'<a}e}a!!!a!>!!!>}!!!>>},{{<\",o!!!!'!>,<e!!!!!>!>e,,a<o{<>,<>},{{<a\"'{!!!>{!>,<u!>},<'>,{{<!!i\"i<,,!!{!>e!!!!!!!>!!<!!e'ae'>,<<,!!!!!>\"\"'{!!i>}}},{{{<{>}}}},{{{<!a!!!>o'!!!>!!!>{!!>},{<o\"i{,!>},<'!!e{!>>}},<i!>,<!!!>!o!>},<{,<eie>}}}}},{{{{{}}},{{<!>,<a>},<!!e!!,u!>{\"!!!!!>u!>},<e\"<\"o>},{}},{{{}},{{},<\">},{<\"\"!!!,a<}{!!e'>}}},{{{{<ee!!ui!!!>!o,>},{<{}u!!>}},{<!!!i>,<eu!!<!>},<e>},{{<i!>},<!o!>!>,<u>},<<,'}!ii!>},<'{>}},{{{<!{u\"'!,!<'}!>o}<!!!>{e>},<u}o>},{{<!}!ea,!!\"\"}a>}}},{{{{<!!e<o!>},<!!<>},{<\"<>,{<\"u!o!e}o,!a!!o>,{}}},{}},{{{<<!{\"!>,<!>u,!>},<!>},<!!!!\"!>o,!!<!!!!}!!>,<<u!>,<!!!>a!>,<{{'{!!{!>},<'<ue>},{{<o<!>},<}>}}}}},{{{},<i!!e!>},<i!!!!!!e{>},{},{{}}},{{{<!!aa!>>,{<>}}},{<<!>},<!>!i{!!!!!>'\",!>},<u!{>,{<!>!i!i\"!>,<<!>},<,!>},<}!!,{e!u!!!!!<,e!!!!'e>}},{{<!!>},{}}},{{<!>\"a!!}!>},<!>,!'<>,{<!>!!\"a!>!!!><,!!,ae'\"a'\">}}}},{{},{<,!>,<!!,u!!!!e!!!>'u>,{<{!!!u,\"u!>,<o>}},{<!>},<o!>u!<>,<ie'!>,<aa!>!!!>{ea!!,'!>},<i{>}}},{{{{{{},{<}!!ui'!!\"u}e!''!>,<{e!>!>},<'!!i!>>}}},{{<o}<}i!!\"\"!!>},{{<!>},<!}\"!>,<e!>>},{<{{oe>}}},{{{},{<'!!!,e<,{{'}!!{ia>,{{<!!!>{!!ei!>},<<>},{}}}},{<<i!>,<!>,<}!!!>,<!\"o!!oo>,{<}'i!!!>{i!!}}i<,!>!!o>}}}},{{<<!o!>},<,{a!>},<{<!!!e!!!>'!!a!!o!>,<o>,{{<!>,<a\"\"}!\"!!!>>}}},{{<uo!!>,<eae,>},{{<!>{,<\"au,<\">}},{{{<!>''i!>,<oa,<!>,<}oo>}}}},{{{<<,}>}},{<,!!!>!!<{{!!e!>},<!!!>},<i!>i{u{>,<\"!>},<!>a'!e!>},<'!!!!!{a>},{{}}}},{{{},{{{<!>,!}'\"!!!>!!\"!>},<!!!>a!>,<!>},<!>},<{}!!!{'!>,<>}}}},{{<!>},<}!>,<eu>}}},{{<\"!i!aeae}u'e!>,<u{!!!>!>,<>,<!>},<!>,<,\"!!u>},{}}},{{{{<<}!!!>i\"!>},<u!!{!!>,<!>!u!><o<'o!>!>}o!>,<!>,<!,oo>},{{{<<!>oe!!}\"\">},<!>},<!!!!!>u>},{},{<>}},{<!!!>\"i!!u!>,<,!!!>},<!!!>e\"!!<!>,<!!!><!>,<}a!!!>!>>}},{{<e!!,{!!!>!!!!!!<!>},<{uie>},<o<!!e>},{{<,i!>,<!!!!a!!o!e!!!!<!>!!!>>},{<!!!>!>,<!>e>}}},{{<{e}!!!>!>},<\"!!!'!>},<o{!!i,o{>},{{{{{<}\"u!<,a!>,<!!a!>},<}!}ii}<}}i!>},<>}},{}},{<e{}a<!!}uo'!>,<!!u!!!>a>,{}}},{{{},<oi\"o>},{{<'!>},<>},<!>o!>,<\"\"!!ue!!!!!>!!!>{!>,<ii\"}>}}},{<u{!!!!!>,e!>},!>'iu\">}},{{{<}a!>},<oe{o}a}u!<,,!!!>}!!!!o>,{<!>,<e!!!>i!>,<\"!!}!!a>}},<!!'\"oe!!!>},<{!!!>!>,<>},{{},<!!\"<!>,<uo!>,!>!!!>,<iooaieoa{,>},{{{{<'e!!eei!>},<\"!>},<a!!!>!e!>!>,\"\">}}}}},{{<!!\",!!,e>},{<!>oe,,'!,!>\"\"a!!<e>}}}}}}";
		final GarbageStream garbageStream = new GarbageStream();
		System.out.println("stream score is:");
		System.out.println(garbageStream.getScoreOfGroups(garbageStreamInput));
		System.out.println("garbage count is:");
		System.out.println(garbageStream.countGarbage(garbageStreamInput));

		final String knotInput = "46,41,212,83,1,255,157,65,139,52,39,254,2,86,0,204";
		final KnotHash knotHash = new KnotHash();
		System.out.println("Knot result is:");
		System.out.println(knotHash.getHash(256, knotInput));
		System.out.println("String hash is:");
		System.out.println(knotHash.getStringHash(256, knotInput));

		final String hexInput = "se,ne,ne,n,nw,s,sw,sw,n,nw,se,nw,s,nw,nw,nw,sw,sw,sw,sw,se,n,sw,sw,s,sw,sw,sw,s,s,s,s,sw,s,n,s,sw,s,s,s,s,s,s,se,s,s,se,s,se,se,nw,ne,se,se,nw,se,se,se,n,se,se,se,nw,se,se,se,se,se,se,ne,se,ne,se,ne,ne,se,ne,ne,se,s,s,sw,ne,ne,n,ne,nw,ne,ne,sw,ne,se,ne,ne,ne,ne,ne,ne,nw,ne,n,ne,nw,n,ne,se,ne,s,n,se,sw,ne,n,ne,ne,n,n,sw,n,ne,nw,ne,n,ne,n,n,n,n,nw,n,n,n,n,ne,sw,n,n,n,n,ne,se,n,n,n,n,n,n,nw,sw,n,n,n,n,n,n,n,n,n,n,n,n,nw,n,nw,n,n,sw,nw,sw,n,ne,n,n,s,n,n,ne,n,nw,n,ne,nw,nw,n,n,n,ne,se,nw,n,ne,nw,nw,n,n,nw,nw,nw,nw,s,nw,nw,nw,nw,nw,sw,n,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,ne,ne,n,se,nw,nw,nw,se,nw,nw,nw,nw,nw,nw,nw,ne,nw,nw,sw,nw,sw,n,nw,se,sw,nw,se,sw,nw,nw,nw,ne,sw,sw,n,sw,nw,sw,nw,sw,nw,sw,nw,sw,sw,nw,s,nw,nw,nw,sw,nw,ne,sw,sw,nw,sw,nw,sw,nw,se,nw,sw,nw,n,nw,nw,nw,sw,nw,sw,sw,sw,nw,sw,nw,nw,sw,sw,sw,nw,sw,sw,s,nw,sw,ne,sw,nw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,n,sw,sw,sw,ne,sw,s,se,sw,sw,nw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,s,sw,sw,ne,sw,sw,sw,ne,n,sw,sw,sw,ne,s,ne,sw,ne,sw,s,sw,sw,sw,se,nw,sw,sw,sw,sw,s,n,sw,sw,sw,sw,nw,sw,sw,se,s,sw,sw,n,sw,sw,s,sw,ne,se,sw,sw,sw,sw,sw,s,s,s,se,sw,sw,s,s,sw,sw,s,sw,nw,s,s,sw,s,ne,sw,ne,s,s,s,sw,s,sw,s,sw,s,ne,nw,sw,nw,sw,sw,s,sw,sw,s,s,s,sw,s,s,s,s,s,s,s,s,s,se,nw,se,n,s,s,s,sw,sw,s,sw,ne,s,ne,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,n,nw,s,s,s,s,sw,s,s,s,s,s,s,s,s,s,se,s,s,s,sw,ne,s,se,s,s,s,s,se,s,s,s,se,s,s,sw,s,s,s,se,se,se,se,sw,se,s,s,ne,s,n,ne,s,s,sw,sw,s,s,s,se,n,nw,s,n,s,se,se,nw,s,se,nw,ne,s,s,se,sw,sw,ne,n,se,se,s,nw,n,s,s,se,s,se,se,se,s,se,sw,sw,se,s,s,se,s,se,n,s,s,se,se,sw,se,se,ne,s,s,se,se,nw,s,s,s,s,sw,se,ne,se,s,se,se,se,n,s,nw,se,se,se,se,ne,s,se,n,se,se,s,s,se,se,sw,se,s,se,se,s,se,se,se,se,se,se,s,nw,se,se,se,se,se,se,se,se,se,s,sw,n,se,se,s,se,ne,se,s,n,se,se,se,se,se,se,se,nw,se,se,se,sw,s,se,se,se,se,se,se,ne,s,se,n,se,se,se,se,s,ne,se,s,s,se,se,n,s,se,se,se,se,n,se,se,se,se,se,n,sw,se,se,se,se,se,se,se,se,se,se,se,se,se,se,ne,se,n,se,se,se,nw,ne,se,n,s,s,ne,se,se,se,se,se,ne,se,se,ne,se,se,sw,se,se,se,n,se,se,se,n,se,se,se,se,se,nw,se,nw,se,se,sw,se,sw,se,se,n,ne,se,n,se,s,ne,se,se,se,nw,ne,se,s,nw,ne,se,ne,se,se,se,ne,se,ne,nw,se,sw,se,se,n,se,ne,n,se,sw,se,se,se,se,sw,ne,se,se,sw,se,se,se,nw,ne,se,n,se,se,ne,se,ne,se,nw,ne,ne,se,sw,ne,se,se,sw,se,se,se,ne,se,ne,ne,se,ne,sw,se,se,ne,ne,se,se,se,ne,se,s,ne,se,se,n,ne,ne,se,se,ne,ne,ne,ne,ne,se,ne,ne,ne,se,s,ne,s,ne,nw,n,ne,se,se,se,n,se,ne,ne,se,ne,ne,ne,ne,ne,ne,ne,s,ne,ne,ne,ne,s,sw,nw,se,ne,ne,ne,ne,ne,ne,sw,se,ne,sw,se,s,ne,ne,ne,se,ne,n,ne,se,sw,se,n,ne,ne,nw,ne,ne,ne,n,s,ne,ne,ne,ne,ne,ne,nw,ne,sw,ne,se,ne,se,ne,ne,sw,n,se,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,se,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,n,ne,sw,ne,ne,ne,ne,ne,ne,ne,ne,s,n,ne,ne,ne,ne,ne,ne,se,ne,ne,ne,nw,ne,ne,n,ne,ne,ne,ne,ne,se,ne,se,s,sw,ne,ne,ne,ne,ne,n,nw,ne,s,ne,ne,ne,ne,n,ne,ne,ne,ne,n,ne,sw,ne,ne,ne,s,ne,ne,ne,ne,n,nw,ne,n,ne,n,s,ne,ne,ne,ne,se,ne,ne,ne,ne,sw,n,ne,ne,s,nw,ne,n,ne,ne,ne,sw,nw,n,n,s,n,n,ne,n,ne,ne,ne,n,se,ne,sw,s,se,ne,ne,ne,s,nw,s,n,s,ne,n,ne,sw,ne,ne,sw,ne,sw,s,ne,ne,ne,se,n,n,se,ne,n,ne,ne,ne,ne,ne,ne,ne,n,se,n,n,n,s,ne,ne,ne,ne,ne,n,n,ne,sw,nw,se,ne,n,nw,ne,ne,ne,n,ne,ne,n,ne,nw,ne,nw,se,nw,ne,n,ne,ne,n,ne,n,ne,ne,nw,sw,ne,n,n,nw,se,sw,s,n,n,n,n,ne,n,n,se,nw,n,n,nw,ne,n,nw,n,ne,ne,ne,ne,n,ne,n,ne,n,n,se,n,sw,n,n,se,sw,ne,n,n,n,nw,n,n,ne,ne,n,ne,ne,ne,ne,n,se,ne,n,ne,se,n,ne,n,ne,s,ne,ne,n,n,n,ne,sw,n,n,n,ne,se,n,ne,n,ne,ne,n,n,n,ne,n,s,n,n,sw,n,n,n,ne,n,s,n,n,ne,s,n,s,s,se,ne,s,ne,se,n,n,n,n,n,n,n,n,n,n,ne,n,n,n,n,s,nw,n,sw,ne,n,ne,n,s,n,n,s,n,n,n,n,s,n,n,n,sw,n,se,nw,s,ne,n,nw,se,n,n,s,ne,s,n,n,n,sw,n,n,n,nw,sw,n,sw,n,ne,n,n,n,s,s,n,n,n,ne,n,n,n,n,ne,se,n,n,n,n,n,n,n,n,ne,n,n,se,s,n,n,n,n,n,n,se,s,se,n,n,n,n,n,n,n,sw,n,ne,n,se,n,n,n,n,nw,n,n,n,n,s,n,n,n,n,n,n,n,n,n,se,n,s,n,n,se,n,n,n,s,n,nw,n,n,nw,nw,n,n,se,n,n,se,n,ne,nw,n,n,se,n,nw,sw,se,n,sw,n,se,nw,n,n,n,n,nw,n,n,n,n,sw,n,nw,n,sw,n,ne,n,nw,s,n,n,nw,n,nw,n,n,sw,nw,n,n,n,n,n,n,n,n,n,n,n,n,n,n,se,ne,n,se,nw,sw,sw,n,n,n,n,nw,s,s,n,n,nw,n,n,n,n,ne,se,n,n,n,n,n,n,n,n,n,n,n,nw,n,nw,n,n,sw,sw,n,n,se,n,n,nw,n,se,sw,n,n,nw,n,s,se,ne,nw,nw,sw,nw,nw,ne,n,n,n,nw,n,nw,nw,s,nw,n,nw,se,n,n,n,n,nw,nw,n,s,n,n,n,se,n,sw,se,se,n,n,n,sw,n,sw,nw,sw,n,nw,n,n,ne,se,n,n,n,n,ne,se,s,s,nw,n,sw,n,se,n,ne,nw,nw,n,nw,ne,nw,nw,nw,n,n,ne,nw,n,n,se,n,sw,n,n,nw,s,n,n,nw,nw,n,nw,nw,n,se,n,nw,nw,n,n,n,ne,nw,n,nw,n,n,nw,s,ne,n,nw,nw,se,n,s,nw,s,nw,nw,n,nw,n,nw,nw,nw,nw,nw,n,n,sw,nw,s,nw,n,nw,nw,n,sw,n,n,n,sw,s,nw,nw,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,s,se,nw,nw,nw,nw,nw,ne,nw,nw,n,n,n,n,nw,n,nw,n,n,n,nw,n,n,nw,nw,nw,se,nw,nw,s,nw,nw,nw,sw,ne,se,nw,n,sw,nw,nw,nw,nw,n,nw,n,nw,n,nw,n,n,nw,nw,n,nw,nw,nw,nw,nw,nw,n,se,n,n,n,sw,nw,nw,se,se,nw,ne,n,nw,se,nw,nw,s,nw,nw,n,nw,nw,nw,nw,n,nw,n,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,sw,nw,ne,nw,n,nw,nw,nw,n,n,sw,sw,nw,s,nw,nw,nw,nw,n,s,n,nw,nw,n,nw,nw,nw,nw,nw,ne,sw,nw,nw,nw,nw,n,nw,nw,nw,n,ne,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,sw,n,se,nw,nw,nw,nw,nw,nw,n,nw,s,n,nw,nw,n,s,nw,nw,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,nw,n,nw,n,n,nw,nw,nw,nw,nw,nw,nw,nw,n,n,nw,n,sw,nw,nw,nw,nw,se,nw,n,nw,nw,nw,nw,se,nw,ne,nw,nw,n,nw,nw,nw,nw,nw,ne,nw,n,nw,s,se,sw,se,nw,nw,nw,nw,se,sw,n,ne,ne,nw,se,s,ne,nw,s,nw,nw,nw,nw,nw,nw,s,nw,nw,n,n,ne,nw,nw,nw,nw,nw,nw,ne,ne,nw,nw,s,se,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,s,nw,nw,nw,nw,sw,nw,sw,n,nw,nw,nw,se,nw,n,nw,nw,se,se,nw,sw,nw,s,nw,n,nw,nw,nw,se,nw,sw,s,nw,s,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,nw,nw,s,sw,nw,se,s,nw,nw,se,nw,nw,nw,nw,n,nw,s,nw,nw,nw,nw,sw,sw,nw,nw,sw,nw,nw,nw,sw,nw,nw,ne,nw,nw,nw,nw,nw,nw,sw,sw,nw,nw,nw,sw,sw,se,n,ne,nw,nw,sw,s,sw,nw,s,ne,nw,sw,sw,nw,se,n,nw,nw,nw,nw,nw,nw,s,nw,se,se,ne,nw,nw,nw,ne,sw,nw,nw,nw,nw,se,nw,sw,nw,nw,nw,sw,nw,sw,nw,ne,sw,nw,nw,nw,nw,s,nw,nw,nw,se,nw,s,sw,nw,nw,nw,sw,nw,nw,nw,nw,sw,nw,nw,se,ne,sw,sw,sw,nw,se,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,s,ne,nw,nw,nw,sw,nw,nw,sw,s,sw,nw,sw,nw,nw,nw,nw,nw,sw,nw,se,sw,nw,nw,sw,se,nw,nw,nw,se,n,nw,nw,n,sw,nw,nw,nw,sw,se,nw,nw,nw,nw,sw,ne,nw,s,nw,se,sw,s,sw,sw,sw,n,nw,sw,n,nw,nw,se,nw,n,ne,se,sw,nw,nw,nw,nw,nw,se,se,nw,nw,nw,n,nw,n,nw,nw,nw,nw,sw,nw,sw,nw,n,sw,sw,nw,nw,se,ne,nw,sw,nw,sw,sw,nw,nw,sw,sw,se,n,sw,nw,sw,nw,sw,nw,nw,nw,nw,sw,se,nw,nw,sw,nw,sw,nw,nw,nw,ne,nw,sw,se,nw,s,nw,ne,nw,sw,nw,sw,nw,nw,nw,ne,sw,nw,nw,sw,nw,sw,nw,sw,nw,sw,sw,sw,sw,nw,sw,ne,nw,sw,nw,nw,nw,nw,nw,sw,nw,nw,sw,s,sw,nw,nw,nw,nw,sw,sw,s,nw,se,se,sw,sw,nw,nw,sw,ne,nw,sw,sw,sw,sw,sw,sw,nw,nw,n,sw,sw,nw,nw,n,nw,n,sw,sw,sw,sw,se,sw,nw,sw,sw,sw,nw,sw,nw,se,sw,nw,sw,sw,sw,nw,sw,sw,ne,sw,nw,s,se,nw,sw,nw,nw,sw,sw,nw,nw,nw,nw,sw,se,sw,n,sw,sw,sw,s,sw,se,se,nw,sw,sw,sw,nw,sw,sw,ne,nw,nw,sw,se,sw,s,sw,nw,n,nw,nw,sw,s,nw,sw,sw,sw,nw,sw,nw,ne,ne,sw,nw,nw,sw,sw,nw,ne,nw,sw,sw,ne,sw,nw,nw,nw,sw,sw,nw,s,nw,sw,nw,sw,sw,s,n,nw,sw,s,ne,sw,sw,sw,ne,ne,sw,sw,sw,sw,se,nw,sw,s,nw,se,sw,n,nw,s,sw,sw,sw,sw,sw,sw,se,sw,nw,sw,nw,se,sw,s,sw,nw,sw,ne,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,n,nw,n,sw,ne,nw,sw,n,sw,sw,sw,nw,sw,sw,nw,n,sw,nw,sw,sw,sw,sw,se,sw,sw,sw,nw,sw,nw,sw,nw,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,s,nw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,sw,sw,nw,se,sw,se,sw,n,sw,sw,sw,sw,se,se,sw,nw,sw,sw,n,sw,s,sw,nw,sw,sw,sw,sw,sw,sw,sw,s,sw,nw,se,sw,sw,sw,se,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,s,sw,sw,nw,sw,sw,sw,nw,sw,sw,s,se,ne,sw,sw,s,nw,sw,sw,sw,sw,sw,s,sw,se,sw,s,s,sw,sw,ne,sw,sw,sw,sw,sw,sw,se,sw,sw,sw,n,sw,sw,sw,sw,ne,sw,sw,ne,se,sw,sw,sw,sw,sw,n,n,sw,nw,sw,s,sw,sw,sw,sw,ne,sw,sw,sw,ne,ne,nw,ne,sw,se,sw,n,sw,sw,sw,sw,sw,s,sw,sw,sw,sw,ne,sw,sw,sw,s,sw,sw,sw,sw,sw,n,sw,sw,sw,nw,n,sw,sw,sw,sw,sw,ne,sw,sw,n,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,ne,sw,nw,sw,n,sw,sw,sw,sw,sw,n,sw,sw,sw,se,sw,sw,sw,sw,n,sw,nw,nw,sw,sw,sw,se,sw,sw,sw,s,sw,sw,nw,sw,sw,sw,nw,s,sw,n,s,s,sw,sw,sw,ne,sw,sw,sw,sw,se,s,ne,sw,sw,n,s,sw,sw,sw,se,sw,sw,se,sw,sw,ne,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,sw,s,sw,sw,sw,n,sw,sw,sw,nw,s,sw,s,se,sw,sw,sw,s,sw,s,sw,nw,s,sw,s,sw,se,n,sw,sw,sw,sw,sw,s,n,s,s,ne,nw,sw,sw,sw,se,sw,sw,sw,sw,sw,sw,n,sw,se,sw,nw,sw,sw,sw,s,n,sw,sw,n,sw,nw,sw,sw,sw,sw,sw,sw,s,nw,s,sw,sw,sw,s,n,sw,sw,sw,sw,sw,sw,ne,sw,n,sw,s,sw,s,sw,n,s,ne,sw,sw,s,s,sw,sw,nw,s,n,sw,se,sw,nw,sw,sw,sw,sw,n,sw,sw,sw,sw,ne,sw,sw,sw,sw,se,sw,sw,sw,sw,sw,n,sw,sw,s,sw,sw,sw,sw,sw,sw,sw,sw,sw,se,sw,ne,sw,sw,s,sw,sw,s,sw,sw,sw,sw,sw,s,se,nw,sw,n,sw,sw,sw,sw,sw,sw,n,sw,se,sw,s,sw,sw,ne,n,sw,n,sw,sw,sw,sw,sw,ne,s,sw,s,nw,s,sw,sw,sw,nw,s,sw,sw,sw,s,sw,s,nw,sw,sw,s,sw,sw,sw,sw,sw,n,sw,s,n,sw,s,n,s,sw,sw,sw,s,sw,sw,sw,s,n,s,sw,sw,s,sw,sw,sw,sw,s,se,se,s,sw,s,sw,sw,sw,sw,sw,sw,se,nw,sw,sw,s,nw,s,nw,sw,ne,sw,n,sw,sw,sw,s,ne,sw,s,sw,nw,sw,s,sw,s,sw,sw,ne,sw,sw,ne,s,sw,sw,ne,sw,se,nw,sw,s,s,s,sw,s,nw,nw,ne,sw,sw,sw,sw,se,sw,sw,sw,s,ne,sw,sw,sw,sw,sw,sw,sw,s,sw,se,s,sw,s,sw,sw,s,sw,s,sw,s,sw,sw,sw,ne,s,ne,s,ne,s,s,ne,nw,sw,s,sw,n,s,s,sw,sw,n,s,sw,sw,s,s,s,s,s,sw,sw,s,sw,sw,sw,sw,ne,s,sw,s,nw,sw,sw,sw,sw,sw,n,sw,sw,s,se,sw,s,sw,ne,sw,sw,se,sw,s,s,sw,se,sw,sw,n,sw,sw,sw,s,s,s,n,s,se,sw,sw,s,s,sw,sw,s,s,sw,sw,sw,sw,sw,s,se,sw,sw,n,sw,s,s,s,sw,s,s,sw,se,s,s,se,sw,sw,se,se,sw,s,n,n,n,s,s,se,s,nw,sw,sw,sw,s,sw,sw,sw,s,sw,sw,s,sw,sw,s,s,n,sw,s,sw,s,s,s,se,s,s,s,sw,s,sw,se,sw,sw,sw,sw,s,sw,s,n,se,s,s,n,sw,sw,se,s,sw,s,n,s,s,sw,nw,sw,sw,sw,n,sw,s,n,s,sw,sw,sw,s,n,sw,sw,sw,sw,s,sw,s,nw,s,s,sw,s,s,n,s,sw,s,n,n,sw,se,sw,s,sw,s,s,sw,sw,sw,s,sw,nw,nw,se,sw,sw,s,s,s,sw,s,s,sw,ne,s,sw,sw,s,sw,n,s,s,s,sw,s,sw,s,s,s,sw,sw,sw,sw,sw,s,s,sw,sw,sw,se,sw,sw,s,sw,n,sw,s,s,s,nw,s,s,sw,s,s,s,s,sw,se,sw,sw,s,sw,n,sw,s,sw,se,s,s,s,sw,sw,n,s,sw,s,s,sw,s,s,s,sw,ne,sw,s,sw,s,ne,n,s,s,sw,sw,sw,s,s,sw,sw,s,sw,s,sw,sw,sw,sw,s,s,sw,n,s,n,s,sw,se,s,sw,sw,s,sw,s,s,s,sw,s,s,s,s,s,s,nw,sw,s,sw,sw,s,s,sw,sw,sw,s,s,sw,sw,s,s,s,sw,s,s,se,se,s,se,s,s,s,s,s,nw,s,n,sw,sw,s,ne,s,s,s,s,sw,s,sw,se,se,sw,sw,sw,nw,s,s,s,ne,sw,s,s,s,s,n,s,s,sw,s,sw,s,n,s,sw,se,s,nw,s,n,s,s,s,n,s,nw,s,s,s,n,s,s,s,sw,ne,s,s,s,s,s,sw,s,ne,sw,ne,s,s,s,sw,sw,sw,s,ne,nw,ne,nw,s,sw,s,s,s,s,s,s,s,s,n,sw,s,s,s,s,ne,s,s,s,s,s,s,s,s,sw,s,se,s,s,s,s,s,s,sw,se,n,se,n,s,s,s,s,s,s,s,nw,sw,n,s,s,s,s,s,s,sw,sw,s,s,sw,s,nw,s,s,nw,s,s,s,sw,s,s,n,s,s,s,s,sw,s,s,s,sw,s,s,s,ne,se,sw,s,s,n,s,s,se,sw,sw,s,s,ne,sw,s,s,s,sw,n,s,nw,s,n,s,s,s,s,se,s,s,sw,nw,s,s,se,sw,s,s,s,s,se,sw,s,s,s,s,s,ne,sw,s,s,s,nw,s,s,s,ne,s,s,n,s,sw,s,s,s,s,s,ne,s,sw,nw,s,s,s,n,s,n,sw,s,n,s,s,s,s,s,s,n,s,nw,sw,s,nw,s,nw,s,s,s,s,s,sw,n,s,s,s,s,s,s,s,s,s,sw,s,s,s,s,s,s,s,s,s,n,s,s,s,s,s,n,s,s,s,s,s,s,s,n,nw,ne,s,s,nw,s,se,s,s,sw,s,s,s,s,n,s,s,s,s,s,sw,s,s,s,s,s,ne,s,s,s,s,s,s,s,s,s,n,s,s,s,s,s,s,s,s,s,n,s,nw,s,s,ne,s,s,ne,s,s,s,n,s,s,s,s,se,s,s,s,s,s,s,s,n,ne,s,s,s,s,se,s,n,s,sw,s,s,s,s,s,s,nw,ne,s,nw,s,s,s,ne,s,s,ne,s,s,s,s,s,sw,s,s,s,s,n,s,s,s,s,s,s,s,s,se,s,n,n,s,s,s,s,s,s,se,s,s,s,s,s,sw,n,ne,s,s,s,se,s,s,nw,s,n,s,ne,s,s,ne,se,s,s,s,s,s,s,n,n,s,nw,s,s,s,s,s,s,s,s,nw,se,s,s,se,s,ne,s,se,nw,s,nw,s,s,s,sw,nw,s,s,s,s,se,s,n,se,se,s,s,s,nw,s,s,nw,ne,ne,s,s,nw,s,s,s,se,s,se,s,ne,se,s,s,s,sw,s,s,ne,s,s,s,s,s,s,s,se,s,se,s,s,ne,s,s,s,s,s,se,s,s,nw,s,s,se,se,ne,se,se,s,s,s,s,s,s,s,se,nw,s,nw,s,s,s,n,s,s,s,s,s,s,s,s,s,s,s,nw,s,s,s,sw,s,n,s,se,s,s,s,s,s,ne,s,s,s,s,s,se,n,s,s,s,se,ne,s,s,s,s,s,sw,s,se,s,s,se,s,s,se,s,se,se,s,se,s,s,s,se,s,s,s,sw,se,s,s,s,s,s,s,s,s,nw,s,s,s,s,se,s,s,s,s,sw,ne,s,s,sw,s,s,s,se,n,s,s,sw,se,s,se,s,nw,s,s,se,s,s,s,s,n,s,nw,sw,s,s,s,n,s,s,s,s,s,s,se,s,se,se,s,s,s,s,sw,s,s,se,s,s,s,se,s,s,s,ne,se,s,s,s,nw,s,s,s,s,n,se,s,s,s,s,se,s,se,s,sw,s,ne,s,s,sw,s,sw,se,se,s,s,s,s,se,s,nw,nw,s,n,s,s,s,s,s,nw,s,s,n,s,s,sw,s,se,se,s,sw,s,s,n,s,s,s,s,se,nw,s,se,nw,s,s,s,se,se,s,se,s,ne,s,nw,sw,s,s,s,nw,s,se,s,s,s,se,s,s,s,se,se,sw,s,s,sw,s,se,s,s,s,se,sw,s,se,se,s,s,s,s,se,s,s,s,sw,se,ne,s,se,s,se,s,s,s,ne,s,sw,sw,s,s,se,s,se,se,se,s,s,s,se,s,s,sw,nw,se,nw,s,s,s,s,s,s,s,se,s,se,s,sw,se,se,s,se,s,sw,s,se,s,se,s,se,s,s,sw,nw,se,sw,s,se,s,nw,s,s,s,s,s,s,nw,n,s,se,s,se,sw,s,se,se,ne,nw,se,ne,se,se,se,s,s,s,se,sw,s,sw,se,se,se,s,se,se,se,s,s,se,sw,se,se,s,s,se,sw,s,se,s,s,se,se,s,sw,se,n,se,se,s,sw,s,se,ne,s,s,s,s,s,se,s,s,se,s,s,s,se,se,sw,s,se,s,s,n,s,se,s,se,s,n,sw,se,se,se,s,s,s,se,n,sw,s,se,sw,se,se,s,se,se,se,s,s,sw,s,s,nw,se,se,se,s,se,s,s,nw,s,s,s,s,se,s,s,s,se,s,ne,nw,s,s,se,s,sw,se,se,s,s,s,se,s,se,s,se,se,sw,n,se,se,se,s,ne,se,nw,s,s,se,s,s,se,s,s,se,se,se,s,s,ne,se,s,sw,n,s,se,se,se,s,s,s,s,se,se,se,s,se,s,nw,se,s,s,s,se,se,se,s,s,s,se,se,s,se,s,se,nw,s,s,se,s,sw,se,se,se,s,se,sw,s,se,s,s,s,s,s,se,s,se,s,se,se,se,s,sw,nw,nw,s,nw,sw,se,s,s,ne,nw,se,se,se,s,n,se,s,s,se,s,ne,se,ne,se,s,s,s,s,se,se,se,se,s,se,nw,se,s,s,ne,s,s,s,ne,se,s,sw,s,s,sw,s,se,se,se,se,sw,s,se,se,s,nw,se,s,s,se,ne,s,sw,s,s,nw,se,n,s,s,ne,se,n,ne,se,s,ne,se,s,s,ne,se,ne,n,s,se,nw,se,se,ne,s,s,s,s,ne,se,s,se,n,se,se,s,s,ne,se,s,se,se,se,s,se,nw,se,sw,se,s,s,se,sw,se,se,s,ne,se,s,ne,s,se,s,se,s,sw,se,s,s,se,s,sw,se,se,s,s,sw,s,se,s,sw,s,se,se,s,se,s,se,nw,sw,se,ne,se,se,se,s,se,se,se,nw,se,se,se,se,se,se,sw,se,se,s,se,sw,nw,se,se,s,se,s,s,se,se,s,se,se,s,nw,s,s,se,se,se,s,se,se,s,sw,sw,n,s,se,se,s,s,s,s,s,se,sw,s,se,s,nw,sw,se,sw,ne,s,se,se,se,se,n,s,se,se,se,s,s,se,s,se,s,ne,sw,se,se,sw,se,s,se,se,se,s,s,se,s,se,nw,se,s,n,se,s,se,nw,s,s,se,se,se,s,se,s,se,se,sw,se,s,sw,s,se,se,se,s,se,s,s,s,se,se,s,nw,se,nw,n,sw,s,s,s,se,se,s,se,se,se,se,s,s,ne,se,s,se,nw,se,se,ne,s,se,se,s,s,se,se,se,s,se,s,s,s,se,se,ne,s,ne,s,se,se,se,se,sw,se,se,se,se,se,se,se,sw,se,s,s,se,s,n,n,ne,se,s,ne,se,se,s,sw,se,s,nw,s,nw,se,s,s,se,se,se,se,nw,nw,se,se,se,s,n,se,se,se,ne,ne,n,se,se,se,s,se,n,s,s,ne,s,s,n,se,se,s,ne,se,se,s,nw,n,se,se,se,se,sw,se,s,s,se,se,se,se,n,n,se,se,s,s,se,nw,se,n,ne,s,se,nw,se,ne,se,se,ne,se,sw,s,s,se,se,s,se,s,se,se,se,n,s,se,se,s,s,n,s,s,se,se,se,se,se,sw,n,se,se,se,se,se,s,s,ne,s,n,s,se,s,se,se,se,se,se,ne,se,se,se,s,sw,se,ne,se,se,se,s,se,se,se,sw,se,s,ne,se,se,se,se,s,nw,ne,s,s,se,s,se,se,se,se,se,se,se,s,se,se,se,nw,s,se,sw,se,ne,ne,se,se,se,s,se,se,se,se,se,n,se,se,se,se,se,sw,nw,se,se,se,se,s,se,se,se,ne,s,ne,se,se,se,s,se,se,se,se,s,se,sw,se,se,se,se,se,sw,sw,se,se,s,se,se,se,se,n,se,se,se,se,se,se,ne,se,se,se,se,se,se,nw,se,se,se,s,se,se,se,se,se,se,se,se,se,se,se,se,s,se,s,s,se,ne,se,se,nw,nw,se,se,se,s,s,sw,s,se,se,se,se,se,se,se,se,se,se,se,n,se,se,nw,se,se,s,se,se,se,se,s,se,se,se,se,se,se,sw,se,se,se,se,se,se,se,n,se,n,se,n,nw,sw,se,sw,se,se,se,se,se,se,se,se,nw,se,se,se,se,se,se,se,se,ne,se,se,nw,ne,se,se,se,se,nw,sw,se,se,se,n,se,ne,se,ne,se,se,s,se,s,se,se,se,ne,ne,se,se,se,se,se,se,se,se,n,se,se,se,se,nw,se,se,sw,n,s,se,n,se,s,se,nw,sw,se,se,se,se,se,se,nw,se,se,se,sw,se,se,se,se,se,se,se,se,se,se,se,se,se,n,s,se,se,se,se,se,nw,n,se,se,nw,nw,se,se,se,se,n,se,se,se,se,se,se,s,sw,n,nw,se,nw,nw,n,n,n,se,n,n,n,n,s,se,n,ne,nw,ne,se,se,ne,ne,ne,se,nw,ne,sw,se,se,se,se,se,se,se,se,s,se,s,se,s,ne,se,s,sw,se,se,se,s,se,s,s,se,se,s,s,s,s,s,n,s,s,s,s,s,s,s,s,s,s,sw,s,n,s,sw,s,s,s,se,se,s,s,sw,sw,sw,sw,s,sw,ne,s,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,nw,sw,sw,ne,nw,sw,nw,nw,se,nw,s,sw,nw,nw,sw,sw,se,sw,nw,nw,nw,s,sw,nw,ne,nw,nw,nw,nw,ne,nw,nw,sw,se,nw,nw,ne,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,nw,n,n,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,nw,sw,se,n,n,n,nw,n,nw,ne,n,nw,nw,nw,n,nw,nw,n,n,nw,nw,n,n,n,n,sw,se,n,se,n,n,n,se,n,n,n,n,se,n,n,n,n,n,sw,n,n,n,sw,s,n,n,n,n,n,n,n,n,n,se,s,n,n,nw,ne,sw,s,n,s,s,s,n,n,n,ne,ne,n,n,n,n,n,n,n,ne,ne,n,n,ne,ne,n,n,ne,n,ne,ne,n,n,ne,ne,sw,ne,nw,ne,s,ne,sw,n,ne,n,se,ne,ne,se,nw,se,ne,sw,ne,ne,ne,ne,ne,s,ne,ne,ne,n,ne,n,ne,ne,ne,ne,ne,ne,ne,ne,se,se,ne,se,sw,ne,ne,ne,ne,ne,ne,ne,se,ne,ne,sw,ne,ne,ne,sw,ne,ne,ne,ne,ne,n,se,ne,ne,se,ne,nw,s,sw,ne,ne,ne,ne,n,n,ne,ne,se,ne,ne,ne,se,ne,ne,sw,n,sw,ne,ne,ne,ne,ne,se,nw,s,se,se,ne,ne,s,nw,ne,ne,ne,n,se,ne,ne,se,ne,ne,ne,ne,se,se,ne,ne,s,ne,ne,ne,ne,ne,se,ne,se,se,ne,ne,se,sw,ne,se,ne,ne,ne,ne,se,nw,ne,se,s,se,ne,se,sw,se,se,se,nw,se,se,ne,se,se,se,se,se,ne,ne,se,sw,ne,se,ne,ne,se,se,nw,se,se,ne,ne,se,se,se,se,se,ne,se,se,se,se,se,se,se,ne,se,se,sw,ne,s,se,s,se,se,nw,se,se,s,se,se,se,se,se,s,se,se,se,se,se,n,se,se,se,se,s,se,sw,se,se,n,se,se,se,ne,se,nw,n,nw,s,se,se,ne,s,s,se,se,s,se,n,se,sw,se,se,s,s,n,se,s,se,ne,se,se,se,se,s,se,se,sw,sw,s,se,s,s,se,s,se,s,nw,n,s,s,s,nw,se,nw,nw,ne,ne,ne,s,s,se,se,n,se,s,se,se,se,s,s,se,s,se,se,se,s,nw,ne,se,se,s,se,sw,sw,s,s,s,se,se,se,s,se,s,s,nw,se,se,se,se,ne,sw,s,se,s,s,nw,s,s,s,ne,se,nw,s,s,se,s,s,s,s,s,se,s,s,se,se,s,se,se,se,se,s,s,s,s,se,se,se,s,s,sw,se,se,s,ne,sw,n,s,s,n,s,se,s,s,s,nw,se,nw,s,s,s,s,s,sw,s,s,s,s,s,s,sw,n,ne,nw,ne,s,s,s,s,s,sw,s,s,s,s,ne,s,s,s,s,s,se,ne,se,s,s,s,sw,se,s,s,sw,sw,s,s,s,s,sw,sw,s,n,n,s,se,nw,nw,s,sw,nw,sw,s,s,ne,s,s,nw,s,s,s,s,sw,sw,n,nw,n,s,s,s,s,s,s,nw,s,s,sw,nw,s,s,n,s,s,s,s,s,s,sw,s,s,s,s,sw,s,s,s,s,s,se,n,s,sw,s,sw,s,s,nw,se,sw,s,s,sw,n,s,sw,se,s,s,s,s,s,s,sw,sw,s,sw,n,sw,se,s,sw,sw,s,s,nw,s,s,sw,s,ne,s,sw,se,sw,s,s,sw,se,n,sw,s,sw,ne,s,sw,s,s,s,sw,nw,s,s,n,sw,sw,sw,s,se,s,nw,s,s,s,sw,sw,s,ne,ne,sw,sw,s,sw,s,sw,s,sw,n,n,sw,n,sw,s,se,sw,sw,sw,ne,s,sw,s,sw,sw,sw,sw,ne,sw,sw,nw,nw,s,n,s,se,s,sw,sw,se,ne,ne,sw,sw,sw,s,n,s,sw,sw,sw,sw,s,sw,sw,s,s,sw,nw,s,s,sw,sw,s,sw,sw,sw,s,sw,sw,sw,sw,sw,ne,se,sw,s,sw,ne,sw,ne,s,n,sw,sw,s,sw,ne,s,sw,ne,sw,s,sw,sw,sw,s,ne,sw,s,s,sw,sw,sw,n,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,s,sw,sw,sw,ne,sw,nw,nw,sw,sw,sw,sw,sw,s,sw,n,sw,nw,nw,s,sw,sw,s,sw,sw,sw,ne,sw,nw,sw,sw,sw,nw,sw,n,nw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,s,sw,sw,sw,sw,se,nw,ne,sw,n,sw,sw,sw,s,sw,se,sw,nw,sw,n,sw,se,sw,sw,s,sw,nw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,s,sw,ne,sw,sw,nw,sw,sw,sw,sw,sw,s,sw,sw,sw,n,sw,nw,se,sw,sw,sw,sw,nw,se,nw,nw,sw,sw,sw,sw,nw,ne,nw,sw,nw,se,n,sw,sw,sw,sw,sw,nw,sw,sw,se,sw,nw,sw,nw,n,s,s,nw,nw,sw,sw,nw,n,sw,nw,sw,nw,s,ne,nw,n,nw,nw,sw,sw,n,n,sw,nw,sw,se,nw,nw,sw,nw,n,sw,sw,sw,nw,nw,nw,sw,n,nw,sw,se,sw,nw,se,nw,sw,nw,nw,nw,ne,nw,nw,nw,sw,se,n,sw,nw,nw,sw,nw,sw,sw,sw,sw,sw,sw,sw,s,sw,sw,nw,sw,nw,nw,ne,sw,nw,n,sw,sw,nw,nw,sw,n,sw,sw,nw,sw,nw,nw,sw,nw,nw,sw,ne,nw,sw,nw,n,nw,nw,nw,nw,s,nw,se,nw,sw,sw,ne,nw,nw,nw,sw,se,nw,nw,nw,sw,nw,n,sw,nw,nw,nw,sw,sw,nw,ne,nw,ne,se,nw,ne,nw,nw,nw,sw,nw,nw,sw,se,nw,nw,nw,sw,ne,sw,nw,nw,nw,sw,nw,nw,sw,ne,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,sw,nw,se,ne,nw,nw,sw,nw,nw,nw,sw,sw,nw,sw,sw,se,ne,nw,sw,nw,nw,n,nw,nw,se,nw,se,nw,nw,nw,ne,nw,nw,nw,nw,ne,ne,nw,sw,se,nw,nw,nw,sw,nw,nw,nw,nw,sw,ne,nw,nw,s,ne,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,s,nw,n,sw,ne,ne,nw,nw,s,nw,se,nw,se,nw,nw,nw,nw,nw,n,nw,nw,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,sw,nw,nw,ne,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,sw,nw,ne,nw,s,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,se,nw,nw,n,nw,se,nw,ne,se,ne,s,nw,se,nw,nw,n,n,nw,nw,n,nw,nw,nw,nw,se,nw,ne,n,nw,nw,nw,n,nw,sw,nw,s,nw,nw,n,nw,nw,n,nw,nw,ne,sw,nw,sw,nw,ne,nw,nw,se,nw,nw,n,n,nw,n,nw,n,s,nw,nw,nw,nw,se,nw,sw,nw,nw,nw,n,ne,se,n,nw,n,nw,nw,n,nw,n,n,nw,nw,nw,nw,n,nw,nw,nw,nw,n,nw,nw,nw,n,s,sw,sw,nw,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,n,nw,nw,s,nw,nw,n,nw,ne,ne,n,n,n,n,nw,n,n,nw,n,ne,n,nw,n,n,n,se,nw,se,n,nw,nw,nw,n,nw,s,n,nw,nw,nw,n,nw,nw,nw,nw,n,n,n,nw,n,s,se,n,nw,nw,nw,nw,n,nw,nw,nw,nw,n,ne,n,n,nw,s,nw,nw,nw,n,s,ne,n,nw,nw,nw,n,s,nw,se,sw,se,nw,n,n,nw,nw,nw,nw,n,nw,nw,nw,n,n,n,nw,ne,nw,n,nw,se,ne,s,nw,nw,n,nw,nw,s,nw,s,s,n,sw,nw,n,s,n,n,ne,se,nw,n,nw,nw,se,n,nw,nw,nw,n,nw,n,nw,nw,s,n,nw,nw,n,ne,n,ne,n,n,nw,se,sw,n,n,nw,nw,n,nw,ne,nw,n,n,nw,nw,n,n,n,nw,nw,nw,se,n,nw,sw,nw,n,n,se,n,nw,nw,nw,n,nw,nw,n,nw,nw,nw,nw,n,n,se,ne,n,n,nw,se,nw,n,n,n,se,nw,n,n,n,n,n,n,ne,n,nw,n,se,n,nw,nw,n,n,n,nw,n,n,s,nw,nw,n,n,n,n,n,nw,nw,n,sw,n,sw,s,n,n,n,n,n,n,n,n,nw,n,n,n,n,se,ne,n,s,n,n,nw,nw,n,nw,nw,n,n,nw,n,n,n,sw,nw,nw,se,n,n,nw,n,n,n,n,n,n,n,n,nw,sw,n,nw,n,nw,n,n,n,n,n,s,nw,nw,ne,n,s,ne,nw,n,n,n,n,s,nw,ne,n,n,n,nw,n,n,n,n,s,s,n,n,n,n,n,n,n,n,n,n,n,n,n,n,s,s,n,n,se,n,n,ne,n,n,n,n,n,n,n,n,n,n,n,nw,s,n,n,n,n,n,n,n,n,nw,n,n,nw,se,n,n,n,n,n,nw,n,n,n,n,n,n,n,sw,se,n,n,se,n,n,n,sw,n,n,n,s,n,n,sw,n,n,n,n,n,n,n,n,n,n,n,n,n,se,n,n,n,sw,n,ne,nw,s,n,nw,n,n,ne,se,ne,n,n,n,n,s,n,n,n,n,n,s,n,n,n,n,n,n,nw,n,sw,n,n,se,nw,n,n,n,n,se,n,n,n,n,n,n,nw,se,n,n,sw,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,se,nw,s,s,n,n,n,n,n,ne,s,n,n,sw,n,n,n,n,n,ne,n,n,n,n,ne,ne,sw,s,ne,n,ne,s,n,s,n,n,n,se,n,n,ne,ne,n,n,n,n,n,n,n,se,ne,s,ne,n,n,ne,n,ne,ne,n,n,se,n,ne,sw,n,n,n,n,n,n,n,n,n,n,n,ne,n,n,n,sw,n,n,s,se,sw,n,ne,ne,n,se,ne,n,n,n,n,n,n,ne,n,n,ne,n,ne,ne,ne,n,ne,n,s,n,se,nw,ne,nw,n,se,n,n,nw,n,ne,n,n,ne,n,ne,s,s,sw,nw,n,s,ne,n,n,se,se,n,n,n,n,ne,n,n,ne,n,n,ne,ne,ne,n,n,n,n,ne,ne,n,n,s,n,n,ne,n,n,n,ne,ne,n,n,ne,ne,n,n,n,ne,ne,n,se,ne,ne,ne,n,n,sw,ne,ne,ne,n,n,n,ne,n,n,n,sw,se,se,n,n,n,ne,n,n,n,ne,ne,n,se,s,n,n,n,ne,n,sw,ne,ne,ne,n,ne,n,n,n,ne,n,ne,n,se,n,ne,ne,se,n,n,n,n,n,n,n,se,n,n,n,n,s,n,ne,ne,nw,ne,ne,n,nw,n,n,n,n,n,n,n,n,ne,n,s,n,ne,ne,n,ne,ne,s,n,ne,n,ne,n,ne,ne,ne,ne,sw,n,ne,s,ne,ne,ne,se,ne,ne,ne,ne,n,ne,ne,ne,se,n,ne,ne,n,ne,n,ne,ne,se,n,ne,n,n,n,n,ne,ne,ne,n,n,ne,ne,ne,ne,sw,ne,sw,nw,nw,s,n,ne,se,ne,ne,n,n,ne,n,ne,ne,s,n,ne,sw,ne,n,n,ne,se,n,ne,sw,n,nw,n,n,ne,ne,s,ne,n,ne,sw,ne,n,ne,n,n,n,n,ne,sw,ne,se,n,n,sw,n,s,nw,n,ne,ne,ne,ne,n,n,ne,ne,sw,n,n,ne,ne,nw,ne,n,nw,nw,ne,n,ne,ne,ne,ne,n,n,ne,ne,ne,s,n,nw,ne,ne,ne,nw,nw,n,se,nw,ne,ne,ne,ne,n,n,ne,n,ne,nw,n,ne,s,ne,n,s,ne,ne,nw,ne,n,ne,nw,se,n,n,n,n,ne,s,ne,n,n,ne,ne,n,ne,ne,n,ne,ne,se,n,ne,n,ne,n,nw,ne,n,n,ne,ne,ne,n,ne,n,s,ne,ne,ne,n,ne,n,ne,s,n,n,ne,n,ne,ne,ne,n,n,ne,n,ne,ne,s,ne,n,n,ne,ne,ne,n,ne,ne,n,ne,nw,ne,ne,ne,s,ne,s,ne,se,n,ne,sw,ne,ne,n,ne,ne,ne,ne,ne,sw,ne,s,n,n,sw,s,ne,n,ne,n,ne,ne,ne,ne,nw,ne,ne,n,ne,ne,nw,se,ne,ne,nw,s,ne,ne,ne,ne,ne,ne,s,ne,ne,ne,ne,ne,ne,sw,ne,n,ne,ne,ne,ne,n,ne,ne,ne,se,ne,se,ne,n,n,ne,ne,ne,n,ne,sw,n,ne,n,ne,ne,n,n,n,se,ne,n,sw,se,s,sw,ne,ne,n,n,n,sw,ne,ne,s,ne,ne,n,n,ne,ne,ne,nw,ne,ne,s,ne,ne,ne,ne,ne,n,ne,ne,n,ne,ne,nw,ne,se,n,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,n,ne,ne,ne,ne,ne,ne,ne,s,sw,ne,n,se,ne,ne,sw,ne,nw,ne,ne,nw,n,n,ne,ne,ne,ne,ne,ne,nw,ne,sw,ne,ne,ne,nw,ne,ne,ne,ne,ne,ne,ne,nw,ne,ne,ne,nw,ne,nw,nw,ne,nw,ne,ne,ne,n,se,n,sw,ne,ne,ne,ne,ne,ne,ne,se,sw,ne";
		final HexagonGrid hexagonGrid = new HexagonGrid();
		System.out.println("To find program we need to do this amount of steps in hex grid:");
		System.out.println(hexagonGrid.getShortestPath(hexInput));
		System.out.println("Furthest position was this many steps away");
		System.out.println(hexagonGrid.getFurthestDistance(hexInput));

		final String pipeInput = "0 <-> 780, 1330\n" +
				"1 <-> 264, 595, 1439\n" +
				"2 <-> 296, 531, 1440\n" +
				"3 <-> 207, 235, 1038\n" +
				"4 <-> 554, 1295\n" +
				"5 <-> 159, 568, 1381\n" +
				"6 <-> 1134\n" +
				"7 <-> 1472, 1977\n" +
				"8 <-> 704\n" +
				"9 <-> 783, 1082, 1795\n" +
				"10 <-> 46, 653, 958\n" +
				"11 <-> 55, 1931\n" +
				"12 <-> 12\n" +
				"13 <-> 537, 940\n" +
				"14 <-> 1066, 1411, 1997\n" +
				"15 <-> 1528\n" +
				"16 <-> 27\n" +
				"17 <-> 113, 370, 450, 982\n" +
				"18 <-> 571\n" +
				"19 <-> 1606\n" +
				"20 <-> 803\n" +
				"21 <-> 956\n" +
				"22 <-> 181, 1126, 1431, 1737\n" +
				"23 <-> 131, 162, 967, 1973\n" +
				"24 <-> 526, 1914\n" +
				"25 <-> 551, 1057\n" +
				"26 <-> 1162, 1922\n" +
				"27 <-> 16, 533, 1125\n" +
				"28 <-> 468, 902, 1159\n" +
				"29 <-> 29\n" +
				"30 <-> 749, 1079, 1684\n" +
				"31 <-> 1909, 1992\n" +
				"32 <-> 1666\n" +
				"33 <-> 426, 1662, 1883\n" +
				"34 <-> 109\n" +
				"35 <-> 307, 577, 727, 1763, 1948\n" +
				"36 <-> 578\n" +
				"37 <-> 92, 503, 1203, 1255\n" +
				"38 <-> 38, 471\n" +
				"39 <-> 615\n" +
				"40 <-> 584, 1787\n" +
				"41 <-> 591, 756\n" +
				"42 <-> 888\n" +
				"43 <-> 952\n" +
				"44 <-> 1029\n" +
				"45 <-> 45, 300, 596, 1393, 1486\n" +
				"46 <-> 10, 1887\n" +
				"47 <-> 592\n" +
				"48 <-> 108\n" +
				"49 <-> 1583\n" +
				"50 <-> 1200\n" +
				"51 <-> 51, 857\n" +
				"52 <-> 965\n" +
				"53 <-> 702, 1428\n" +
				"54 <-> 1525\n" +
				"55 <-> 11, 610\n" +
				"56 <-> 1703\n" +
				"57 <-> 1449\n" +
				"58 <-> 1097\n" +
				"59 <-> 1316, 1461, 1932\n" +
				"60 <-> 107, 1010, 1504, 1824, 1912\n" +
				"61 <-> 1677\n" +
				"62 <-> 691, 714, 1530\n" +
				"63 <-> 672, 1263, 1956\n" +
				"64 <-> 825, 1016, 1370\n" +
				"65 <-> 539, 1055, 1290\n" +
				"66 <-> 1287\n" +
				"67 <-> 338, 1195\n" +
				"68 <-> 108, 296, 1787, 1821\n" +
				"69 <-> 436, 1015, 1633\n" +
				"70 <-> 262, 407, 592, 1414\n" +
				"71 <-> 420, 797\n" +
				"72 <-> 1393\n" +
				"73 <-> 616, 993\n" +
				"74 <-> 168, 175\n" +
				"75 <-> 590, 1103\n" +
				"76 <-> 271\n" +
				"77 <-> 1309, 1496, 1627\n" +
				"78 <-> 569, 1888\n" +
				"79 <-> 1289, 1925\n" +
				"80 <-> 193, 993\n" +
				"81 <-> 500\n" +
				"82 <-> 1069\n" +
				"83 <-> 83, 1518\n" +
				"84 <-> 1465\n" +
				"85 <-> 1614\n" +
				"86 <-> 474, 749, 1286, 1678\n" +
				"87 <-> 160\n" +
				"88 <-> 1026, 1732\n" +
				"89 <-> 317, 422, 917\n" +
				"90 <-> 517, 1362\n" +
				"91 <-> 136\n" +
				"92 <-> 37, 703\n" +
				"93 <-> 1738, 1827\n" +
				"94 <-> 345, 907, 1180\n" +
				"95 <-> 95\n" +
				"96 <-> 406, 1086, 1258\n" +
				"97 <-> 97, 157\n" +
				"98 <-> 1002\n" +
				"99 <-> 109, 198, 654\n" +
				"100 <-> 555\n" +
				"101 <-> 101\n" +
				"102 <-> 939\n" +
				"103 <-> 616, 1266\n" +
				"104 <-> 1526\n" +
				"105 <-> 306, 1276, 1330\n" +
				"106 <-> 1395\n" +
				"107 <-> 60, 288, 1971\n" +
				"108 <-> 48, 68\n" +
				"109 <-> 34, 99, 578, 1042\n" +
				"110 <-> 906, 1567\n" +
				"111 <-> 917, 1347\n" +
				"112 <-> 1291, 1384, 1695, 1988\n" +
				"113 <-> 17, 1173\n" +
				"114 <-> 297, 1576\n" +
				"115 <-> 361\n" +
				"116 <-> 117, 1084\n" +
				"117 <-> 116, 164, 683, 1454\n" +
				"118 <-> 1956\n" +
				"119 <-> 1198\n" +
				"120 <-> 171, 416\n" +
				"121 <-> 1949\n" +
				"122 <-> 233, 770, 1012\n" +
				"123 <-> 801\n" +
				"124 <-> 1406\n" +
				"125 <-> 769\n" +
				"126 <-> 418, 1038, 1273\n" +
				"127 <-> 611, 1060, 1241\n" +
				"128 <-> 576, 665, 1568\n" +
				"129 <-> 862\n" +
				"130 <-> 1607, 1644\n" +
				"131 <-> 23, 812\n" +
				"132 <-> 1097\n" +
				"133 <-> 1403, 1992\n" +
				"134 <-> 232\n" +
				"135 <-> 959\n" +
				"136 <-> 91, 1354, 1868, 1932\n" +
				"137 <-> 766, 1049\n" +
				"138 <-> 138\n" +
				"139 <-> 139, 355\n" +
				"140 <-> 1858\n" +
				"141 <-> 703, 1319\n" +
				"142 <-> 424\n" +
				"143 <-> 869\n" +
				"144 <-> 231, 338\n" +
				"145 <-> 1163, 1345\n" +
				"146 <-> 431, 940, 1389\n" +
				"147 <-> 1282, 1784\n" +
				"148 <-> 218, 1137\n" +
				"149 <-> 378\n" +
				"150 <-> 257, 798\n" +
				"151 <-> 1603\n" +
				"152 <-> 152, 189, 1151\n" +
				"153 <-> 623, 1228\n" +
				"154 <-> 154\n" +
				"155 <-> 376, 808\n" +
				"156 <-> 1726\n" +
				"157 <-> 97\n" +
				"158 <-> 482\n" +
				"159 <-> 5\n" +
				"160 <-> 87, 504, 1775\n" +
				"161 <-> 873, 1047\n" +
				"162 <-> 23\n" +
				"163 <-> 291\n" +
				"164 <-> 117, 229, 371, 1427\n" +
				"165 <-> 487, 1683, 1844\n" +
				"166 <-> 508\n" +
				"167 <-> 278, 1228, 1453\n" +
				"168 <-> 74, 1210\n" +
				"169 <-> 396, 410, 1256\n" +
				"170 <-> 555, 1624\n" +
				"171 <-> 120, 340, 1713\n" +
				"172 <-> 1748\n" +
				"173 <-> 880, 1306\n" +
				"174 <-> 1052, 1697\n" +
				"175 <-> 74, 995\n" +
				"176 <-> 1421\n" +
				"177 <-> 551, 640\n" +
				"178 <-> 1611\n" +
				"179 <-> 1504\n" +
				"180 <-> 310, 1432, 1722\n" +
				"181 <-> 22\n" +
				"182 <-> 1175\n" +
				"183 <-> 1115\n" +
				"184 <-> 184\n" +
				"185 <-> 708\n" +
				"186 <-> 1130\n" +
				"187 <-> 944\n" +
				"188 <-> 451, 593\n" +
				"189 <-> 152\n" +
				"190 <-> 885, 1491\n" +
				"191 <-> 191\n" +
				"192 <-> 1751\n" +
				"193 <-> 80, 931\n" +
				"194 <-> 544, 826\n" +
				"195 <-> 1354\n" +
				"196 <-> 705\n" +
				"197 <-> 1646, 1693\n" +
				"198 <-> 99\n" +
				"199 <-> 1681, 1818\n" +
				"200 <-> 200\n" +
				"201 <-> 678, 691\n" +
				"202 <-> 1084\n" +
				"203 <-> 446, 1232\n" +
				"204 <-> 337, 826, 1919\n" +
				"205 <-> 440, 818\n" +
				"206 <-> 618, 898\n" +
				"207 <-> 3\n" +
				"208 <-> 208\n" +
				"209 <-> 574, 1760, 1774\n" +
				"210 <-> 960, 1315\n" +
				"211 <-> 525, 670\n" +
				"212 <-> 453, 1552\n" +
				"213 <-> 1164\n" +
				"214 <-> 893, 1597\n" +
				"215 <-> 386, 1412, 1752\n" +
				"216 <-> 1800\n" +
				"217 <-> 1103\n" +
				"218 <-> 148, 218\n" +
				"219 <-> 1135, 1216, 1404\n" +
				"220 <-> 1899\n" +
				"221 <-> 987, 1248\n" +
				"222 <-> 706, 1199, 1916\n" +
				"223 <-> 816, 1079, 1703\n" +
				"224 <-> 726\n" +
				"225 <-> 797\n" +
				"226 <-> 396, 1482\n" +
				"227 <-> 844\n" +
				"228 <-> 703, 972, 1275\n" +
				"229 <-> 164, 377, 662, 1048\n" +
				"230 <-> 230, 661\n" +
				"231 <-> 144, 1358\n" +
				"232 <-> 134, 793, 1433, 1730\n" +
				"233 <-> 122\n" +
				"234 <-> 882\n" +
				"235 <-> 3, 489\n" +
				"236 <-> 945, 1346\n" +
				"237 <-> 480\n" +
				"238 <-> 702\n" +
				"239 <-> 1008\n" +
				"240 <-> 1078\n" +
				"241 <-> 1103, 1844\n" +
				"242 <-> 666, 1299\n" +
				"243 <-> 1489\n" +
				"244 <-> 423, 827, 860, 868\n" +
				"245 <-> 1747\n" +
				"246 <-> 659, 1446\n" +
				"247 <-> 679\n" +
				"248 <-> 1467, 1942\n" +
				"249 <-> 1678\n" +
				"250 <-> 284, 1223\n" +
				"251 <-> 1513\n" +
				"252 <-> 1673\n" +
				"253 <-> 1084\n" +
				"254 <-> 747, 1705\n" +
				"255 <-> 255\n" +
				"256 <-> 390\n" +
				"257 <-> 150, 1439, 1804\n" +
				"258 <-> 1302, 1626\n" +
				"259 <-> 259, 1519\n" +
				"260 <-> 449\n" +
				"261 <-> 269, 641\n" +
				"262 <-> 70\n" +
				"263 <-> 1334, 1358\n" +
				"264 <-> 1, 1843\n" +
				"265 <-> 1316\n" +
				"266 <-> 1045, 1053, 1264\n" +
				"267 <-> 364, 1198\n" +
				"268 <-> 501, 594, 732, 1919\n" +
				"269 <-> 261, 681\n" +
				"270 <-> 670, 1283, 1531\n" +
				"271 <-> 76, 1817, 1858\n" +
				"272 <-> 625, 757, 1236, 1793\n" +
				"273 <-> 1255, 1539\n" +
				"274 <-> 442, 1406\n" +
				"275 <-> 706, 1760\n" +
				"276 <-> 841, 1553, 1764\n" +
				"277 <-> 1133\n" +
				"278 <-> 167, 908\n" +
				"279 <-> 1771\n" +
				"280 <-> 280, 1583\n" +
				"281 <-> 702\n" +
				"282 <-> 282, 1712, 1776\n" +
				"283 <-> 820, 981\n" +
				"284 <-> 250\n" +
				"285 <-> 680, 880, 1896\n" +
				"286 <-> 286, 489\n" +
				"287 <-> 608, 1204, 1423\n" +
				"288 <-> 107, 1353, 1729\n" +
				"289 <-> 289, 299\n" +
				"290 <-> 761, 1134\n" +
				"291 <-> 163, 801, 1435\n" +
				"292 <-> 1217, 1525\n" +
				"293 <-> 1206\n" +
				"294 <-> 797, 1124, 1371\n" +
				"295 <-> 335, 704\n" +
				"296 <-> 2, 68, 1516\n" +
				"297 <-> 114, 1036, 1987\n" +
				"298 <-> 298, 588, 1430\n" +
				"299 <-> 289\n" +
				"300 <-> 45, 1965\n" +
				"301 <-> 773, 1591\n" +
				"302 <-> 1122, 1341\n" +
				"303 <-> 450, 1786\n" +
				"304 <-> 304\n" +
				"305 <-> 724\n" +
				"306 <-> 105, 1861\n" +
				"307 <-> 35\n" +
				"308 <-> 308, 1015\n" +
				"309 <-> 930, 1011\n" +
				"310 <-> 180\n" +
				"311 <-> 1513\n" +
				"312 <-> 646\n" +
				"313 <-> 1381\n" +
				"314 <-> 511, 804, 1079\n" +
				"315 <-> 399\n" +
				"316 <-> 948, 1169\n" +
				"317 <-> 89, 725\n" +
				"318 <-> 318\n" +
				"319 <-> 319\n" +
				"320 <-> 787\n" +
				"321 <-> 1132\n" +
				"322 <-> 322\n" +
				"323 <-> 1376\n" +
				"324 <-> 1540\n" +
				"325 <-> 1448, 1944, 1995\n" +
				"326 <-> 1828\n" +
				"327 <-> 1886\n" +
				"328 <-> 639\n" +
				"329 <-> 831, 959\n" +
				"330 <-> 527\n" +
				"331 <-> 1399, 1535\n" +
				"332 <-> 1843\n" +
				"333 <-> 333, 522\n" +
				"334 <-> 1512\n" +
				"335 <-> 295, 885\n" +
				"336 <-> 1651\n" +
				"337 <-> 204, 1164, 1874\n" +
				"338 <-> 67, 144, 584, 621\n" +
				"339 <-> 1887\n" +
				"340 <-> 171, 1861\n" +
				"341 <-> 1555\n" +
				"342 <-> 507\n" +
				"343 <-> 1441\n" +
				"344 <-> 409, 527, 1364, 1756\n" +
				"345 <-> 94\n" +
				"346 <-> 357, 499\n" +
				"347 <-> 795, 1065, 1191\n" +
				"348 <-> 914, 1800, 1982\n" +
				"349 <-> 349\n" +
				"350 <-> 436\n" +
				"351 <-> 1472, 1514\n" +
				"352 <-> 375, 884\n" +
				"353 <-> 499, 567\n" +
				"354 <-> 1033, 1218\n" +
				"355 <-> 139\n" +
				"356 <-> 866\n" +
				"357 <-> 346, 1665\n" +
				"358 <-> 1225\n" +
				"359 <-> 359, 1429\n" +
				"360 <-> 1512\n" +
				"361 <-> 115, 920, 1975\n" +
				"362 <-> 507, 682, 1116, 1762\n" +
				"363 <-> 1583, 1737\n" +
				"364 <-> 267\n" +
				"365 <-> 1878, 1885\n" +
				"366 <-> 1060\n" +
				"367 <-> 421\n" +
				"368 <-> 1362\n" +
				"369 <-> 532, 1140\n" +
				"370 <-> 17, 1065, 1117\n" +
				"371 <-> 164\n" +
				"372 <-> 372\n" +
				"373 <-> 373\n" +
				"374 <-> 1050\n" +
				"375 <-> 352, 1311, 1446\n" +
				"376 <-> 155, 1928\n" +
				"377 <-> 229, 636\n" +
				"378 <-> 149, 1897\n" +
				"379 <-> 936\n" +
				"380 <-> 1193, 1963\n" +
				"381 <-> 1783\n" +
				"382 <-> 1900\n" +
				"383 <-> 383\n" +
				"384 <-> 1630\n" +
				"385 <-> 441\n" +
				"386 <-> 215\n" +
				"387 <-> 795, 946\n" +
				"388 <-> 1457\n" +
				"389 <-> 731, 1973\n" +
				"390 <-> 256, 1706, 1900\n" +
				"391 <-> 391\n" +
				"392 <-> 1400\n" +
				"393 <-> 818, 1244\n" +
				"394 <-> 394, 1881\n" +
				"395 <-> 395, 1656\n" +
				"396 <-> 169, 226\n" +
				"397 <-> 1790\n" +
				"398 <-> 1260\n" +
				"399 <-> 315, 399\n" +
				"400 <-> 1204\n" +
				"401 <-> 1606\n" +
				"402 <-> 1191, 1726, 1853\n" +
				"403 <-> 403\n" +
				"404 <-> 1470\n" +
				"405 <-> 1924\n" +
				"406 <-> 96, 413, 1201\n" +
				"407 <-> 70\n" +
				"408 <-> 1063, 1216, 1586\n" +
				"409 <-> 344, 409, 1625, 1803\n" +
				"410 <-> 169, 1732\n" +
				"411 <-> 1599\n" +
				"412 <-> 889, 1460\n" +
				"413 <-> 406, 761, 1918\n" +
				"414 <-> 661\n" +
				"415 <-> 442, 962, 1200\n" +
				"416 <-> 120, 503\n" +
				"417 <-> 446, 612, 1007\n" +
				"418 <-> 126, 797, 1478, 1857\n" +
				"419 <-> 1060, 1350, 1459, 1736\n" +
				"420 <-> 71, 978, 1215\n" +
				"421 <-> 367, 665, 1385, 1415\n" +
				"422 <-> 89, 679, 1418\n" +
				"423 <-> 244\n" +
				"424 <-> 142, 1813\n" +
				"425 <-> 627, 981\n" +
				"426 <-> 33\n" +
				"427 <-> 1172, 1495, 1740\n" +
				"428 <-> 1869\n" +
				"429 <-> 966, 986, 1162, 1658\n" +
				"430 <-> 1866\n" +
				"431 <-> 146, 1523, 1934\n" +
				"432 <-> 558, 811, 944\n" +
				"433 <-> 693, 1291\n" +
				"434 <-> 766\n" +
				"435 <-> 1784\n" +
				"436 <-> 69, 350, 1064\n" +
				"437 <-> 766, 817, 882, 1481\n" +
				"438 <-> 742, 1159\n" +
				"439 <-> 724, 1518\n" +
				"440 <-> 205\n" +
				"441 <-> 385, 1206\n" +
				"442 <-> 274, 415, 442, 821\n" +
				"443 <-> 1088, 1533\n" +
				"444 <-> 666, 1260\n" +
				"445 <-> 591, 1030, 1395, 1722\n" +
				"446 <-> 203, 417, 1278, 1494, 1507\n" +
				"447 <-> 447\n" +
				"448 <-> 1599, 1882\n" +
				"449 <-> 260, 1758\n" +
				"450 <-> 17, 303, 1970\n" +
				"451 <-> 188\n" +
				"452 <-> 658, 763, 769\n" +
				"453 <-> 212\n" +
				"454 <-> 605\n" +
				"455 <-> 478\n" +
				"456 <-> 720, 1139, 1546\n" +
				"457 <-> 598, 1127, 1496, 1518\n" +
				"458 <-> 635\n" +
				"459 <-> 1068\n" +
				"460 <-> 1080, 1088, 1857\n" +
				"461 <-> 739\n" +
				"462 <-> 1344\n" +
				"463 <-> 1775\n" +
				"464 <-> 593, 1957\n" +
				"465 <-> 703, 745, 1145\n" +
				"466 <-> 1550, 1980\n" +
				"467 <-> 467\n" +
				"468 <-> 28\n" +
				"469 <-> 1278\n" +
				"470 <-> 470\n" +
				"471 <-> 38, 996, 1626\n" +
				"472 <-> 1933\n" +
				"473 <-> 799\n" +
				"474 <-> 86, 696, 1228\n" +
				"475 <-> 491, 1250, 1739\n" +
				"476 <-> 726\n" +
				"477 <-> 1687\n" +
				"478 <-> 455, 834, 835, 1389, 1983\n" +
				"479 <-> 479\n" +
				"480 <-> 237, 576\n" +
				"481 <-> 791, 1370\n" +
				"482 <-> 158, 1365\n" +
				"483 <-> 761, 893\n" +
				"484 <-> 1192\n" +
				"485 <-> 1301\n" +
				"486 <-> 1431\n" +
				"487 <-> 165, 1119\n" +
				"488 <-> 789\n" +
				"489 <-> 235, 286\n" +
				"490 <-> 490\n" +
				"491 <-> 475, 1775\n" +
				"492 <-> 1280, 1758\n" +
				"493 <-> 1007, 1152\n" +
				"494 <-> 1747\n" +
				"495 <-> 495, 879\n" +
				"496 <-> 1219\n" +
				"497 <-> 643, 1118\n" +
				"498 <-> 1010, 1529\n" +
				"499 <-> 346, 353, 697, 1303\n" +
				"500 <-> 81, 1700\n" +
				"501 <-> 268\n" +
				"502 <-> 502\n" +
				"503 <-> 37, 416, 1121, 1740\n" +
				"504 <-> 160, 909\n" +
				"505 <-> 525, 1686, 1940\n" +
				"506 <-> 1292, 1380\n" +
				"507 <-> 342, 362, 969, 1674\n" +
				"508 <-> 166, 1233\n" +
				"509 <-> 1069\n" +
				"510 <-> 636\n" +
				"511 <-> 314, 1759\n" +
				"512 <-> 1218, 1726\n" +
				"513 <-> 1008, 1361, 1679\n" +
				"514 <-> 1280\n" +
				"515 <-> 1789\n" +
				"516 <-> 619, 1835\n" +
				"517 <-> 90, 1362, 1537\n" +
				"518 <-> 880\n" +
				"519 <-> 1329\n" +
				"520 <-> 1248, 1441\n" +
				"521 <-> 743, 1141, 1534, 1743\n" +
				"522 <-> 333, 689\n" +
				"523 <-> 1233\n" +
				"524 <-> 860\n" +
				"525 <-> 211, 505\n" +
				"526 <-> 24, 984, 1503\n" +
				"527 <-> 330, 344, 771, 1243\n" +
				"528 <-> 898\n" +
				"529 <-> 597\n" +
				"530 <-> 1220, 1282\n" +
				"531 <-> 2\n" +
				"532 <-> 369, 821, 1806, 1937\n" +
				"533 <-> 27, 1102\n" +
				"534 <-> 1643, 1870\n" +
				"535 <-> 569, 772\n" +
				"536 <-> 536\n" +
				"537 <-> 13\n" +
				"538 <-> 1060, 1710\n" +
				"539 <-> 65, 1002\n" +
				"540 <-> 833, 1021, 1301\n" +
				"541 <-> 1677\n" +
				"542 <-> 542\n" +
				"543 <-> 1242\n" +
				"544 <-> 194, 698, 716, 1895\n" +
				"545 <-> 1348, 1584\n" +
				"546 <-> 797, 1622\n" +
				"547 <-> 871, 1761\n" +
				"548 <-> 1666\n" +
				"549 <-> 1485\n" +
				"550 <-> 1363, 1587\n" +
				"551 <-> 25, 177, 645, 1311\n" +
				"552 <-> 1208\n" +
				"553 <-> 840\n" +
				"554 <-> 4, 1454\n" +
				"555 <-> 100, 170, 898, 1075, 1828, 1989\n" +
				"556 <-> 924, 1614\n" +
				"557 <-> 557\n" +
				"558 <-> 432, 558\n" +
				"559 <-> 1680\n" +
				"560 <-> 1667\n" +
				"561 <-> 760\n" +
				"562 <-> 1668, 1799\n" +
				"563 <-> 738\n" +
				"564 <-> 1062, 1142, 1313\n" +
				"565 <-> 750\n" +
				"566 <-> 1104, 1614\n" +
				"567 <-> 353, 744\n" +
				"568 <-> 5, 568, 1338\n" +
				"569 <-> 78, 535, 881\n" +
				"570 <-> 600, 1516\n" +
				"571 <-> 18, 1312, 1414, 1669\n" +
				"572 <-> 572, 1958\n" +
				"573 <-> 967, 1419\n" +
				"574 <-> 209\n" +
				"575 <-> 1013, 1087\n" +
				"576 <-> 128, 480\n" +
				"577 <-> 35, 577, 580\n" +
				"578 <-> 36, 109\n" +
				"579 <-> 1417\n" +
				"580 <-> 577, 601, 700\n" +
				"581 <-> 815, 1327, 1749\n" +
				"582 <-> 891, 1263\n" +
				"583 <-> 1652\n" +
				"584 <-> 40, 338\n" +
				"585 <-> 585\n" +
				"586 <-> 640, 688, 1258, 1331\n" +
				"587 <-> 1472\n" +
				"588 <-> 298\n" +
				"589 <-> 1170\n" +
				"590 <-> 75, 1054\n" +
				"591 <-> 41, 445\n" +
				"592 <-> 47, 70\n" +
				"593 <-> 188, 464, 1259, 1579\n" +
				"594 <-> 268, 1194\n" +
				"595 <-> 1, 1367, 1501\n" +
				"596 <-> 45\n" +
				"597 <-> 529, 626, 1237\n" +
				"598 <-> 457, 648, 699\n" +
				"599 <-> 1108, 1592\n" +
				"600 <-> 570, 789, 1672\n" +
				"601 <-> 580, 1298\n" +
				"602 <-> 861, 1394\n" +
				"603 <-> 1297, 1994\n" +
				"604 <-> 1136\n" +
				"605 <-> 454, 605\n" +
				"606 <-> 832, 1109\n" +
				"607 <-> 954, 1138\n" +
				"608 <-> 287, 1971\n" +
				"609 <-> 888\n" +
				"610 <-> 55, 1580\n" +
				"611 <-> 127, 710, 1087\n" +
				"612 <-> 417, 950, 1428, 1464\n" +
				"613 <-> 672, 1426\n" +
				"614 <-> 794, 1724\n" +
				"615 <-> 39, 848\n" +
				"616 <-> 73, 103, 616\n" +
				"617 <-> 726, 1026\n" +
				"618 <-> 206, 1676\n" +
				"619 <-> 516, 1204\n" +
				"620 <-> 925\n" +
				"621 <-> 338\n" +
				"622 <-> 989\n" +
				"623 <-> 153\n" +
				"624 <-> 824, 1566, 1966\n" +
				"625 <-> 272, 1326\n" +
				"626 <-> 597, 750\n" +
				"627 <-> 425\n" +
				"628 <-> 1181, 1541, 1704\n" +
				"629 <-> 1370, 1805\n" +
				"630 <-> 630, 763\n" +
				"631 <-> 1709\n" +
				"632 <-> 1315, 1848\n" +
				"633 <-> 1501\n" +
				"634 <-> 674, 871\n" +
				"635 <-> 458, 811\n" +
				"636 <-> 377, 510, 1488\n" +
				"637 <-> 1337\n" +
				"638 <-> 781\n" +
				"639 <-> 328, 1399\n" +
				"640 <-> 177, 586, 1202, 1332, 1847\n" +
				"641 <-> 261, 1942\n" +
				"642 <-> 819\n" +
				"643 <-> 497, 1089\n" +
				"644 <-> 1661\n" +
				"645 <-> 551\n" +
				"646 <-> 312, 938, 1642, 1764\n" +
				"647 <-> 1437\n" +
				"648 <-> 598\n" +
				"649 <-> 784, 1154, 1746\n" +
				"650 <-> 1207, 1268\n" +
				"651 <-> 1240, 1797\n" +
				"652 <-> 1254\n" +
				"653 <-> 10, 739, 764\n" +
				"654 <-> 99, 1759\n" +
				"655 <-> 895, 1784\n" +
				"656 <-> 656, 701, 738\n" +
				"657 <-> 1170\n" +
				"658 <-> 452\n" +
				"659 <-> 246\n" +
				"660 <-> 809\n" +
				"661 <-> 230, 414\n" +
				"662 <-> 229\n" +
				"663 <-> 1133, 1231\n" +
				"664 <-> 745, 820\n" +
				"665 <-> 128, 421\n" +
				"666 <-> 242, 444, 926\n" +
				"667 <-> 955, 1762\n" +
				"668 <-> 1843\n" +
				"669 <-> 1384, 1849\n" +
				"670 <-> 211, 270, 1836\n" +
				"671 <-> 1415\n" +
				"672 <-> 63, 613, 1864\n" +
				"673 <-> 964, 1973\n" +
				"674 <-> 634, 1479, 1554\n" +
				"675 <-> 1390\n" +
				"676 <-> 1468, 1855\n" +
				"677 <-> 1632\n" +
				"678 <-> 201, 1445\n" +
				"679 <-> 247, 422, 1401, 1484\n" +
				"680 <-> 285\n" +
				"681 <-> 269, 1115\n" +
				"682 <-> 362, 682\n" +
				"683 <-> 117, 1826\n" +
				"684 <-> 977, 1458\n" +
				"685 <-> 812\n" +
				"686 <-> 1214, 1690, 1886\n" +
				"687 <-> 1752\n" +
				"688 <-> 586\n" +
				"689 <-> 522\n" +
				"690 <-> 1077, 1454\n" +
				"691 <-> 62, 201, 815, 1019\n" +
				"692 <-> 1454\n" +
				"693 <-> 433, 941\n" +
				"694 <-> 852\n" +
				"695 <-> 695\n" +
				"696 <-> 474\n" +
				"697 <-> 499\n" +
				"698 <-> 544\n" +
				"699 <-> 598, 1448\n" +
				"700 <-> 580\n" +
				"701 <-> 656\n" +
				"702 <-> 53, 238, 281\n" +
				"703 <-> 92, 141, 228, 465, 1326\n" +
				"704 <-> 8, 295, 1939\n" +
				"705 <-> 196, 1099\n" +
				"706 <-> 222, 275, 885, 905, 1531\n" +
				"707 <-> 707, 1981\n" +
				"708 <-> 185, 708, 1182, 1891, 1999\n" +
				"709 <-> 1911\n" +
				"710 <-> 611\n" +
				"711 <-> 711, 1150\n" +
				"712 <-> 1833\n" +
				"713 <-> 713\n" +
				"714 <-> 62, 1011, 1096, 1666\n" +
				"715 <-> 1094\n" +
				"716 <-> 544, 992\n" +
				"717 <-> 1297\n" +
				"718 <-> 718, 1727\n" +
				"719 <-> 996\n" +
				"720 <-> 456, 1388, 1748\n" +
				"721 <-> 1331, 1458\n" +
				"722 <-> 1535\n" +
				"723 <-> 723\n" +
				"724 <-> 305, 439\n" +
				"725 <-> 317, 1854\n" +
				"726 <-> 224, 476, 617, 1123\n" +
				"727 <-> 35, 1249\n" +
				"728 <-> 1369\n" +
				"729 <-> 1537\n" +
				"730 <-> 730, 1212\n" +
				"731 <-> 389, 1815\n" +
				"732 <-> 268\n" +
				"733 <-> 1199\n" +
				"734 <-> 919\n" +
				"735 <-> 1627, 1694\n" +
				"736 <-> 1036, 1319\n" +
				"737 <-> 1345\n" +
				"738 <-> 563, 656\n" +
				"739 <-> 461, 653\n" +
				"740 <-> 1069\n" +
				"741 <-> 1436\n" +
				"742 <-> 438, 1879, 1895\n" +
				"743 <-> 521, 1657\n" +
				"744 <-> 567\n" +
				"745 <-> 465, 664\n" +
				"746 <-> 873, 998\n" +
				"747 <-> 254, 1380\n" +
				"748 <-> 1089, 1329\n" +
				"749 <-> 30, 86\n" +
				"750 <-> 565, 626\n" +
				"751 <-> 1362\n" +
				"752 <-> 752\n" +
				"753 <-> 840, 1066, 1424, 1745\n" +
				"754 <-> 854, 1534, 1964\n" +
				"755 <-> 1516, 1907\n" +
				"756 <-> 41, 1069\n" +
				"757 <-> 272\n" +
				"758 <-> 1792\n" +
				"759 <-> 1068\n" +
				"760 <-> 561, 1048, 1377\n" +
				"761 <-> 290, 413, 483, 1457\n" +
				"762 <-> 1170\n" +
				"763 <-> 452, 630\n" +
				"764 <-> 653, 1521\n" +
				"765 <-> 1928, 1986\n" +
				"766 <-> 137, 434, 437\n" +
				"767 <-> 1664\n" +
				"768 <-> 924, 1562, 1923\n" +
				"769 <-> 125, 452\n" +
				"770 <-> 122, 851\n" +
				"771 <-> 527, 1046, 1767\n" +
				"772 <-> 535, 1056\n" +
				"773 <-> 301, 1613, 1751\n" +
				"774 <-> 903, 1110, 1318, 1849\n" +
				"775 <-> 1640\n" +
				"776 <-> 776\n" +
				"777 <-> 777, 1593, 1880\n" +
				"778 <-> 1194, 1524\n" +
				"779 <-> 1299\n" +
				"780 <-> 0\n" +
				"781 <-> 638, 1434, 1448\n" +
				"782 <-> 1540, 1554\n" +
				"783 <-> 9\n" +
				"784 <-> 649, 1017\n" +
				"785 <-> 840, 915, 1325\n" +
				"786 <-> 1424\n" +
				"787 <-> 320, 1049\n" +
				"788 <-> 1273\n" +
				"789 <-> 488, 600\n" +
				"790 <-> 924, 1085, 1775\n" +
				"791 <-> 481\n" +
				"792 <-> 1796\n" +
				"793 <-> 232, 1860\n" +
				"794 <-> 614, 1309\n" +
				"795 <-> 347, 387\n" +
				"796 <-> 796, 1059\n" +
				"797 <-> 71, 225, 294, 418, 546\n" +
				"798 <-> 150, 1818\n" +
				"799 <-> 473, 1224\n" +
				"800 <-> 1864\n" +
				"801 <-> 123, 291, 1546\n" +
				"802 <-> 802, 1648\n" +
				"803 <-> 20, 803\n" +
				"804 <-> 314\n" +
				"805 <-> 1721\n" +
				"806 <-> 1520\n" +
				"807 <-> 1476\n" +
				"808 <-> 155, 808\n" +
				"809 <-> 660, 1880\n" +
				"810 <-> 1816\n" +
				"811 <-> 432, 635, 847\n" +
				"812 <-> 131, 685, 1411\n" +
				"813 <-> 1083\n" +
				"814 <-> 1348\n" +
				"815 <-> 581, 691\n" +
				"816 <-> 223\n" +
				"817 <-> 437, 1702\n" +
				"818 <-> 205, 393, 1751\n" +
				"819 <-> 642, 1161\n" +
				"820 <-> 283, 664, 839, 1157\n" +
				"821 <-> 442, 532, 1310, 1618, 1992\n" +
				"822 <-> 1743\n" +
				"823 <-> 1174\n" +
				"824 <-> 624, 1051\n" +
				"825 <-> 64, 1838\n" +
				"826 <-> 194, 204, 1149\n" +
				"827 <-> 244\n" +
				"828 <-> 1791, 1930, 1936\n" +
				"829 <-> 829, 1398\n" +
				"830 <-> 1816\n" +
				"831 <-> 329, 943, 1612\n" +
				"832 <-> 606, 1223\n" +
				"833 <-> 540, 833\n" +
				"834 <-> 478\n" +
				"835 <-> 478, 835, 1160\n" +
				"836 <-> 906, 1558, 1905\n" +
				"837 <-> 837, 1544\n" +
				"838 <-> 883\n" +
				"839 <-> 820\n" +
				"840 <-> 553, 753, 785\n" +
				"841 <-> 276\n" +
				"842 <-> 1639\n" +
				"843 <-> 843\n" +
				"844 <-> 227, 1436\n" +
				"845 <-> 845\n" +
				"846 <-> 1266\n" +
				"847 <-> 811, 1268, 1386, 1766\n" +
				"848 <-> 615, 949\n" +
				"849 <-> 1616\n" +
				"850 <-> 1334, 1567, 1698\n" +
				"851 <-> 770, 1807\n" +
				"852 <-> 694, 1293, 1946\n" +
				"853 <-> 967\n" +
				"854 <-> 754\n" +
				"855 <-> 1655\n" +
				"856 <-> 959, 1706, 1733\n" +
				"857 <-> 51\n" +
				"858 <-> 866, 1949\n" +
				"859 <-> 859\n" +
				"860 <-> 244, 524, 999\n" +
				"861 <-> 602, 1369, 1568\n" +
				"862 <-> 129, 863, 1179\n" +
				"863 <-> 862, 912, 1688, 1707, 1884\n" +
				"864 <-> 916\n" +
				"865 <-> 865, 1808\n" +
				"866 <-> 356, 858\n" +
				"867 <-> 1624\n" +
				"868 <-> 244\n" +
				"869 <-> 143, 916\n" +
				"870 <-> 1030\n" +
				"871 <-> 547, 634, 1638\n" +
				"872 <-> 901, 1155, 1300\n" +
				"873 <-> 161, 746, 1413\n" +
				"874 <-> 874, 1985\n" +
				"875 <-> 900, 1212, 1616\n" +
				"876 <-> 876\n" +
				"877 <-> 1197\n" +
				"878 <-> 1732\n" +
				"879 <-> 495, 1090\n" +
				"880 <-> 173, 285, 518, 1400\n" +
				"881 <-> 569, 1109\n" +
				"882 <-> 234, 437, 1829\n" +
				"883 <-> 838, 1416, 1492\n" +
				"884 <-> 352, 1108\n" +
				"885 <-> 190, 335, 706, 1802\n" +
				"886 <-> 1930\n" +
				"887 <-> 986\n" +
				"888 <-> 42, 609, 1710\n" +
				"889 <-> 412, 1242\n" +
				"890 <-> 1116, 1335\n" +
				"891 <-> 582\n" +
				"892 <-> 1072, 1378, 1510\n" +
				"893 <-> 214, 483, 1421\n" +
				"894 <-> 1329\n" +
				"895 <-> 655, 1480\n" +
				"896 <-> 907\n" +
				"897 <-> 897, 1191, 1753\n" +
				"898 <-> 206, 528, 555, 1572, 1783\n" +
				"899 <-> 1885\n" +
				"900 <-> 875\n" +
				"901 <-> 872, 1322\n" +
				"902 <-> 28, 1490\n" +
				"903 <-> 774, 1839\n" +
				"904 <-> 904, 1392\n" +
				"905 <-> 706, 1984\n" +
				"906 <-> 110, 836, 1000, 1232\n" +
				"907 <-> 94, 896, 907\n" +
				"908 <-> 278, 1136\n" +
				"909 <-> 504\n" +
				"910 <-> 1938\n" +
				"911 <-> 1507\n" +
				"912 <-> 863, 1581, 1849\n" +
				"913 <-> 1694\n" +
				"914 <-> 348\n" +
				"915 <-> 785\n" +
				"916 <-> 864, 869, 1771\n" +
				"917 <-> 89, 111\n" +
				"918 <-> 1146, 1397\n" +
				"919 <-> 734, 1647, 1936\n" +
				"920 <-> 361, 1287\n" +
				"921 <-> 977\n" +
				"922 <-> 922\n" +
				"923 <-> 1669\n" +
				"924 <-> 556, 768, 790\n" +
				"925 <-> 620, 1207, 1765\n" +
				"926 <-> 666, 1801\n" +
				"927 <-> 1083, 1151\n" +
				"928 <-> 1265\n" +
				"929 <-> 1082\n" +
				"930 <-> 309, 1663\n" +
				"931 <-> 193\n" +
				"932 <-> 932, 1018\n" +
				"933 <-> 991\n" +
				"934 <-> 1554\n" +
				"935 <-> 1826\n" +
				"936 <-> 379, 988, 1011, 1871\n" +
				"937 <-> 1585, 1694\n" +
				"938 <-> 646, 1935\n" +
				"939 <-> 102, 1355\n" +
				"940 <-> 13, 146, 1337\n" +
				"941 <-> 693, 1789\n" +
				"942 <-> 1083, 1723\n" +
				"943 <-> 831, 1471\n" +
				"944 <-> 187, 432\n" +
				"945 <-> 236\n" +
				"946 <-> 387\n" +
				"947 <-> 1579\n" +
				"948 <-> 316, 1044, 1574\n" +
				"949 <-> 848, 1914\n" +
				"950 <-> 612\n" +
				"951 <-> 1012, 1271\n" +
				"952 <-> 43, 1535, 1574\n" +
				"953 <-> 1986\n" +
				"954 <-> 607, 1055, 1452\n" +
				"955 <-> 667\n" +
				"956 <-> 21, 1869\n" +
				"957 <-> 957\n" +
				"958 <-> 10\n" +
				"959 <-> 135, 329, 856\n" +
				"960 <-> 210, 1885\n" +
				"961 <-> 1904\n" +
				"962 <-> 415, 1658\n" +
				"963 <-> 1156\n" +
				"964 <-> 673\n" +
				"965 <-> 52, 981\n" +
				"966 <-> 429, 1734\n" +
				"967 <-> 23, 573, 853\n" +
				"968 <-> 1975\n" +
				"969 <-> 507, 1865\n" +
				"970 <-> 1870\n" +
				"971 <-> 1175\n" +
				"972 <-> 228\n" +
				"973 <-> 1068\n" +
				"974 <-> 1421\n" +
				"975 <-> 975\n" +
				"976 <-> 1401\n" +
				"977 <-> 684, 921, 1798\n" +
				"978 <-> 420\n" +
				"979 <-> 1485\n" +
				"980 <-> 1867, 1893\n" +
				"981 <-> 283, 425, 965\n" +
				"982 <-> 17, 1638\n" +
				"983 <-> 1542\n" +
				"984 <-> 526\n" +
				"985 <-> 985\n" +
				"986 <-> 429, 887\n" +
				"987 <-> 221, 1784\n" +
				"988 <-> 936\n" +
				"989 <-> 622, 1114, 1154\n" +
				"990 <-> 1023, 1027\n" +
				"991 <-> 933, 991\n" +
				"992 <-> 716\n" +
				"993 <-> 73, 80\n" +
				"994 <-> 1221, 1905\n" +
				"995 <-> 175\n" +
				"996 <-> 471, 719, 1379\n" +
				"997 <-> 1790\n" +
				"998 <-> 746\n" +
				"999 <-> 860, 999, 1346\n" +
				"1000 <-> 906\n" +
				"1001 <-> 1171, 1649, 1850\n" +
				"1002 <-> 98, 539, 1998\n" +
				"1003 <-> 1244\n" +
				"1004 <-> 1473\n" +
				"1005 <-> 1706\n" +
				"1006 <-> 1685\n" +
				"1007 <-> 417, 493, 1845, 1980\n" +
				"1008 <-> 239, 513, 1536\n" +
				"1009 <-> 1202, 1442\n" +
				"1010 <-> 60, 498, 1641\n" +
				"1011 <-> 309, 714, 936, 1958\n" +
				"1012 <-> 122, 951\n" +
				"1013 <-> 575, 1239\n" +
				"1014 <-> 1014, 1555, 1961\n" +
				"1015 <-> 69, 308, 1559\n" +
				"1016 <-> 64\n" +
				"1017 <-> 784, 1586, 1643\n" +
				"1018 <-> 932\n" +
				"1019 <-> 691\n" +
				"1020 <-> 1877\n" +
				"1021 <-> 540, 1743, 1798\n" +
				"1022 <-> 1900\n" +
				"1023 <-> 990\n" +
				"1024 <-> 1024\n" +
				"1025 <-> 1444\n" +
				"1026 <-> 88, 617\n" +
				"1027 <-> 990, 1027, 1345\n" +
				"1028 <-> 1228\n" +
				"1029 <-> 44, 1264\n" +
				"1030 <-> 445, 870, 1130\n" +
				"1031 <-> 1158, 1610\n" +
				"1032 <-> 1400\n" +
				"1033 <-> 354\n" +
				"1034 <-> 1802, 1849\n" +
				"1035 <-> 1474\n" +
				"1036 <-> 297, 736\n" +
				"1037 <-> 1473, 1949\n" +
				"1038 <-> 3, 126\n" +
				"1039 <-> 1046\n" +
				"1040 <-> 1082, 1100\n" +
				"1041 <-> 1043\n" +
				"1042 <-> 109\n" +
				"1043 <-> 1041, 1520\n" +
				"1044 <-> 948, 1977\n" +
				"1045 <-> 266, 1189, 1972\n" +
				"1046 <-> 771, 1039\n" +
				"1047 <-> 161, 1168\n" +
				"1048 <-> 229, 760\n" +
				"1049 <-> 137, 787, 1738\n" +
				"1050 <-> 374, 1925\n" +
				"1051 <-> 824, 1631, 1989\n" +
				"1052 <-> 174\n" +
				"1053 <-> 266\n" +
				"1054 <-> 590\n" +
				"1055 <-> 65, 954, 1235\n" +
				"1056 <-> 772, 1368\n" +
				"1057 <-> 25, 1098\n" +
				"1058 <-> 1792, 1819\n" +
				"1059 <-> 796\n" +
				"1060 <-> 127, 366, 419, 538\n" +
				"1061 <-> 1665, 1887, 1983\n" +
				"1062 <-> 564\n" +
				"1063 <-> 408\n" +
				"1064 <-> 436, 1073\n" +
				"1065 <-> 347, 370\n" +
				"1066 <-> 14, 753\n" +
				"1067 <-> 1622\n" +
				"1068 <-> 459, 759, 973, 1844\n" +
				"1069 <-> 82, 509, 740, 756, 1099, 1259, 1351\n" +
				"1070 <-> 1498\n" +
				"1071 <-> 1935\n" +
				"1072 <-> 892, 1072\n" +
				"1073 <-> 1064, 1908\n" +
				"1074 <-> 1609\n" +
				"1075 <-> 555\n" +
				"1076 <-> 1076\n" +
				"1077 <-> 690\n" +
				"1078 <-> 240, 1433\n" +
				"1079 <-> 30, 223, 314, 1112\n" +
				"1080 <-> 460\n" +
				"1081 <-> 1574\n" +
				"1082 <-> 9, 929, 1040, 1382\n" +
				"1083 <-> 813, 927, 942\n" +
				"1084 <-> 116, 202, 253, 1084, 1465\n" +
				"1085 <-> 790\n" +
				"1086 <-> 96, 1190\n" +
				"1087 <-> 575, 611, 1412\n" +
				"1088 <-> 443, 460\n" +
				"1089 <-> 643, 748\n" +
				"1090 <-> 879, 1208, 1288\n" +
				"1091 <-> 1091, 1716\n" +
				"1092 <-> 1456, 1606, 1925\n" +
				"1093 <-> 1158, 1997\n" +
				"1094 <-> 715, 1297, 1313, 1412, 1508\n" +
				"1095 <-> 1095\n" +
				"1096 <-> 714\n" +
				"1097 <-> 58, 132, 1587\n" +
				"1098 <-> 1057, 1254\n" +
				"1099 <-> 705, 1069\n" +
				"1100 <-> 1040, 1813\n" +
				"1101 <-> 1101\n" +
				"1102 <-> 533\n" +
				"1103 <-> 75, 217, 241, 1188\n" +
				"1104 <-> 566, 1792\n" +
				"1105 <-> 1646\n" +
				"1106 <-> 1107, 1574\n" +
				"1107 <-> 1106\n" +
				"1108 <-> 599, 884, 1144, 1476\n" +
				"1109 <-> 606, 881\n" +
				"1110 <-> 774\n" +
				"1111 <-> 1475, 1560, 1663\n" +
				"1112 <-> 1079\n" +
				"1113 <-> 1113, 1715\n" +
				"1114 <-> 989, 1910\n" +
				"1115 <-> 183, 681, 1476, 1866\n" +
				"1116 <-> 362, 890, 1271\n" +
				"1117 <-> 370, 1757\n" +
				"1118 <-> 497, 1977\n" +
				"1119 <-> 487\n" +
				"1120 <-> 1164\n" +
				"1121 <-> 503\n" +
				"1122 <-> 302, 1655\n" +
				"1123 <-> 726, 1856\n" +
				"1124 <-> 294\n" +
				"1125 <-> 27, 1570\n" +
				"1126 <-> 22\n" +
				"1127 <-> 457, 1587\n" +
				"1128 <-> 1320\n" +
				"1129 <-> 1129, 1230\n" +
				"1130 <-> 186, 1030, 1145, 1628\n" +
				"1131 <-> 1151\n" +
				"1132 <-> 321, 1902\n" +
				"1133 <-> 277, 663, 1577\n" +
				"1134 <-> 6, 290, 1976\n" +
				"1135 <-> 219\n" +
				"1136 <-> 604, 908\n" +
				"1137 <-> 148, 1383\n" +
				"1138 <-> 607\n" +
				"1139 <-> 456, 1654\n" +
				"1140 <-> 369\n" +
				"1141 <-> 521\n" +
				"1142 <-> 564, 1143\n" +
				"1143 <-> 1142\n" +
				"1144 <-> 1108\n" +
				"1145 <-> 465, 1130, 1842\n" +
				"1146 <-> 918\n" +
				"1147 <-> 1282\n" +
				"1148 <-> 1148\n" +
				"1149 <-> 826\n" +
				"1150 <-> 711\n" +
				"1151 <-> 152, 927, 1131\n" +
				"1152 <-> 493, 1720\n" +
				"1153 <-> 1865\n" +
				"1154 <-> 649, 989\n" +
				"1155 <-> 872\n" +
				"1156 <-> 963, 1668\n" +
				"1157 <-> 820\n" +
				"1158 <-> 1031, 1093, 1790\n" +
				"1159 <-> 28, 438\n" +
				"1160 <-> 835\n" +
				"1161 <-> 819, 1789\n" +
				"1162 <-> 26, 429, 1374\n" +
				"1163 <-> 145\n" +
				"1164 <-> 213, 337, 1120, 1366\n" +
				"1165 <-> 1843\n" +
				"1166 <-> 1884\n" +
				"1167 <-> 1494, 1799\n" +
				"1168 <-> 1047\n" +
				"1169 <-> 316\n" +
				"1170 <-> 589, 657, 762, 1685\n" +
				"1171 <-> 1001\n" +
				"1172 <-> 427, 1226\n" +
				"1173 <-> 113, 1621\n" +
				"1174 <-> 823, 1174\n" +
				"1175 <-> 182, 971, 1405\n" +
				"1176 <-> 1462\n" +
				"1177 <-> 1177\n" +
				"1178 <-> 1858, 1920\n" +
				"1179 <-> 862, 1664\n" +
				"1180 <-> 94\n" +
				"1181 <-> 628, 1321\n" +
				"1182 <-> 708\n" +
				"1183 <-> 1693\n" +
				"1184 <-> 1879\n" +
				"1185 <-> 1674\n" +
				"1186 <-> 1186, 1575\n" +
				"1187 <-> 1341, 1718\n" +
				"1188 <-> 1103\n" +
				"1189 <-> 1045, 1433\n" +
				"1190 <-> 1086\n" +
				"1191 <-> 347, 402, 897\n" +
				"1192 <-> 484, 1603, 1615\n" +
				"1193 <-> 380, 1193\n" +
				"1194 <-> 594, 778\n" +
				"1195 <-> 67\n" +
				"1196 <-> 1747\n" +
				"1197 <-> 877, 1197\n" +
				"1198 <-> 119, 267, 1380\n" +
				"1199 <-> 222, 733\n" +
				"1200 <-> 50, 415\n" +
				"1201 <-> 406\n" +
				"1202 <-> 640, 1009\n" +
				"1203 <-> 37\n" +
				"1204 <-> 287, 400, 619\n" +
				"1205 <-> 1294\n" +
				"1206 <-> 293, 441, 1444, 1899\n" +
				"1207 <-> 650, 925\n" +
				"1208 <-> 552, 1090\n" +
				"1209 <-> 1797\n" +
				"1210 <-> 168, 1264\n" +
				"1211 <-> 1784\n" +
				"1212 <-> 730, 875, 1515, 1636\n" +
				"1213 <-> 1989\n" +
				"1214 <-> 686, 1214\n" +
				"1215 <-> 420\n" +
				"1216 <-> 219, 408, 1651\n" +
				"1217 <-> 292\n" +
				"1218 <-> 354, 512\n" +
				"1219 <-> 496, 1905\n" +
				"1220 <-> 530\n" +
				"1221 <-> 994\n" +
				"1222 <-> 1222\n" +
				"1223 <-> 250, 832\n" +
				"1224 <-> 799, 1224\n" +
				"1225 <-> 358, 1527\n" +
				"1226 <-> 1172, 1619, 1721\n" +
				"1227 <-> 1509\n" +
				"1228 <-> 153, 167, 474, 1028\n" +
				"1229 <-> 1538, 1959\n" +
				"1230 <-> 1129\n" +
				"1231 <-> 663\n" +
				"1232 <-> 203, 906\n" +
				"1233 <-> 508, 523, 1638\n" +
				"1234 <-> 1693\n" +
				"1235 <-> 1055\n" +
				"1236 <-> 272\n" +
				"1237 <-> 597, 1729\n" +
				"1238 <-> 1656, 1933\n" +
				"1239 <-> 1013\n" +
				"1240 <-> 651\n" +
				"1241 <-> 127, 1689, 1741\n" +
				"1242 <-> 543, 889\n" +
				"1243 <-> 527\n" +
				"1244 <-> 393, 1003\n" +
				"1245 <-> 1245\n" +
				"1246 <-> 1733\n" +
				"1247 <-> 1357, 1543\n" +
				"1248 <-> 221, 520, 1810\n" +
				"1249 <-> 727\n" +
				"1250 <-> 475, 1372, 1444\n" +
				"1251 <-> 1313\n" +
				"1252 <-> 1364\n" +
				"1253 <-> 1274\n" +
				"1254 <-> 652, 1098\n" +
				"1255 <-> 37, 273\n" +
				"1256 <-> 169, 1671\n" +
				"1257 <-> 1257\n" +
				"1258 <-> 96, 586, 1474, 1513\n" +
				"1259 <-> 593, 1069\n" +
				"1260 <-> 398, 444, 1937\n" +
				"1261 <-> 1684\n" +
				"1262 <-> 1328, 1631\n" +
				"1263 <-> 63, 582, 1284, 1637\n" +
				"1264 <-> 266, 1029, 1210\n" +
				"1265 <-> 928, 1376, 1629\n" +
				"1266 <-> 103, 846\n" +
				"1267 <-> 1733\n" +
				"1268 <-> 650, 847, 1902\n" +
				"1269 <-> 1269\n" +
				"1270 <-> 1754\n" +
				"1271 <-> 951, 1116, 1772\n" +
				"1272 <-> 1453\n" +
				"1273 <-> 126, 788\n" +
				"1274 <-> 1253, 1420, 1503\n" +
				"1275 <-> 228\n" +
				"1276 <-> 105\n" +
				"1277 <-> 1979\n" +
				"1278 <-> 446, 469\n" +
				"1279 <-> 1334\n" +
				"1280 <-> 492, 514, 1405, 1941\n" +
				"1281 <-> 1399\n" +
				"1282 <-> 147, 530, 1147\n" +
				"1283 <-> 270\n" +
				"1284 <-> 1263\n" +
				"1285 <-> 1976\n" +
				"1286 <-> 86\n" +
				"1287 <-> 66, 920\n" +
				"1288 <-> 1090, 1588\n" +
				"1289 <-> 79, 1619\n" +
				"1290 <-> 65, 1368\n" +
				"1291 <-> 112, 433\n" +
				"1292 <-> 506\n" +
				"1293 <-> 852\n" +
				"1294 <-> 1205, 1813\n" +
				"1295 <-> 4, 1542\n" +
				"1296 <-> 1767\n" +
				"1297 <-> 603, 717, 1094, 1340\n" +
				"1298 <-> 601, 1387\n" +
				"1299 <-> 242, 779, 1677\n" +
				"1300 <-> 872\n" +
				"1301 <-> 485, 540\n" +
				"1302 <-> 258\n" +
				"1303 <-> 499\n" +
				"1304 <-> 1382, 1906\n" +
				"1305 <-> 1305\n" +
				"1306 <-> 173\n" +
				"1307 <-> 1389, 1589\n" +
				"1308 <-> 1308\n" +
				"1309 <-> 77, 794, 1477\n" +
				"1310 <-> 821, 1317\n" +
				"1311 <-> 375, 551\n" +
				"1312 <-> 571, 1843\n" +
				"1313 <-> 564, 1094, 1251\n" +
				"1314 <-> 1590\n" +
				"1315 <-> 210, 632\n" +
				"1316 <-> 59, 265, 1436, 1872\n" +
				"1317 <-> 1310\n" +
				"1318 <-> 774, 1511\n" +
				"1319 <-> 141, 736\n" +
				"1320 <-> 1128, 1799\n" +
				"1321 <-> 1181, 1833\n" +
				"1322 <-> 901, 1558\n" +
				"1323 <-> 1846, 1906\n" +
				"1324 <-> 1981\n" +
				"1325 <-> 785\n" +
				"1326 <-> 625, 703\n" +
				"1327 <-> 581\n" +
				"1328 <-> 1262\n" +
				"1329 <-> 519, 748, 894\n" +
				"1330 <-> 0, 105, 1851, 1979\n" +
				"1331 <-> 586, 721\n" +
				"1332 <-> 640\n" +
				"1333 <-> 1544\n" +
				"1334 <-> 263, 850, 1279\n" +
				"1335 <-> 890\n" +
				"1336 <-> 1336\n" +
				"1337 <-> 637, 940\n" +
				"1338 <-> 568\n" +
				"1339 <-> 1383, 1449\n" +
				"1340 <-> 1297\n" +
				"1341 <-> 302, 1187, 1686, 1830\n" +
				"1342 <-> 1553, 1658, 1725, 1822\n" +
				"1343 <-> 1821\n" +
				"1344 <-> 462, 1508\n" +
				"1345 <-> 145, 737, 1027, 1947\n" +
				"1346 <-> 236, 999\n" +
				"1347 <-> 111\n" +
				"1348 <-> 545, 814\n" +
				"1349 <-> 1349, 1773, 1969\n" +
				"1350 <-> 419\n" +
				"1351 <-> 1069, 1384, 1946\n" +
				"1352 <-> 1410\n" +
				"1353 <-> 288, 1862, 1919\n" +
				"1354 <-> 136, 195, 1739\n" +
				"1355 <-> 939, 1366\n" +
				"1356 <-> 1623\n" +
				"1357 <-> 1247, 1650, 1949\n" +
				"1358 <-> 231, 263\n" +
				"1359 <-> 1422\n" +
				"1360 <-> 1676\n" +
				"1361 <-> 513, 1361, 1852\n" +
				"1362 <-> 90, 368, 517, 751\n" +
				"1363 <-> 550\n" +
				"1364 <-> 344, 1252\n" +
				"1365 <-> 482, 1968\n" +
				"1366 <-> 1164, 1355\n" +
				"1367 <-> 595\n" +
				"1368 <-> 1056, 1290, 1634\n" +
				"1369 <-> 728, 861, 1884\n" +
				"1370 <-> 64, 481, 629\n" +
				"1371 <-> 294, 1825\n" +
				"1372 <-> 1250\n" +
				"1373 <-> 1373, 1732\n" +
				"1374 <-> 1162\n" +
				"1375 <-> 1572, 1615\n" +
				"1376 <-> 323, 1265\n" +
				"1377 <-> 760\n" +
				"1378 <-> 892\n" +
				"1379 <-> 996\n" +
				"1380 <-> 506, 747, 1198, 1545\n" +
				"1381 <-> 5, 313\n" +
				"1382 <-> 1082, 1304\n" +
				"1383 <-> 1137, 1339\n" +
				"1384 <-> 112, 669, 1351\n" +
				"1385 <-> 421\n" +
				"1386 <-> 847\n" +
				"1387 <-> 1298, 1463\n" +
				"1388 <-> 720\n" +
				"1389 <-> 146, 478, 1307\n" +
				"1390 <-> 675, 1390\n" +
				"1391 <-> 1475, 1950\n" +
				"1392 <-> 904\n" +
				"1393 <-> 45, 72, 1815, 1954\n" +
				"1394 <-> 602, 1594\n" +
				"1395 <-> 106, 445, 1863, 1952\n" +
				"1396 <-> 1495\n" +
				"1397 <-> 918, 1925\n" +
				"1398 <-> 829\n" +
				"1399 <-> 331, 639, 1281\n" +
				"1400 <-> 392, 880, 1032, 1422, 1673\n" +
				"1401 <-> 679, 976\n" +
				"1402 <-> 1830\n" +
				"1403 <-> 133\n" +
				"1404 <-> 219\n" +
				"1405 <-> 1175, 1280\n" +
				"1406 <-> 124, 274\n" +
				"1407 <-> 1980\n" +
				"1408 <-> 1624, 1717\n" +
				"1409 <-> 1560\n" +
				"1410 <-> 1352, 1410\n" +
				"1411 <-> 14, 812, 1968\n" +
				"1412 <-> 215, 1087, 1094\n" +
				"1413 <-> 873, 1413\n" +
				"1414 <-> 70, 571, 1701, 1943\n" +
				"1415 <-> 421, 671\n" +
				"1416 <-> 883, 1416\n" +
				"1417 <-> 579, 1870\n" +
				"1418 <-> 422, 1460\n" +
				"1419 <-> 573\n" +
				"1420 <-> 1274, 1864\n" +
				"1421 <-> 176, 893, 974\n" +
				"1422 <-> 1359, 1400\n" +
				"1423 <-> 287\n" +
				"1424 <-> 753, 786\n" +
				"1425 <-> 1685\n" +
				"1426 <-> 613, 1514\n" +
				"1427 <-> 164\n" +
				"1428 <-> 53, 612\n" +
				"1429 <-> 359, 1556\n" +
				"1430 <-> 298, 1927, 1955\n" +
				"1431 <-> 22, 486\n" +
				"1432 <-> 180\n" +
				"1433 <-> 232, 1078, 1189, 1869\n" +
				"1434 <-> 781\n" +
				"1435 <-> 291, 1599\n" +
				"1436 <-> 741, 844, 1316, 1577\n" +
				"1437 <-> 647, 1722\n" +
				"1438 <-> 1438\n" +
				"1439 <-> 1, 257\n" +
				"1440 <-> 2\n" +
				"1441 <-> 343, 520\n" +
				"1442 <-> 1009\n" +
				"1443 <-> 1443, 1869\n" +
				"1444 <-> 1025, 1206, 1250\n" +
				"1445 <-> 678\n" +
				"1446 <-> 246, 375\n" +
				"1447 <-> 1981\n" +
				"1448 <-> 325, 699, 781\n" +
				"1449 <-> 57, 1339\n" +
				"1450 <-> 1668\n" +
				"1451 <-> 1692, 1802, 1911, 1951\n" +
				"1452 <-> 954\n" +
				"1453 <-> 167, 1272\n" +
				"1454 <-> 117, 554, 690, 692\n" +
				"1455 <-> 1581\n" +
				"1456 <-> 1092, 1696\n" +
				"1457 <-> 388, 761\n" +
				"1458 <-> 684, 721\n" +
				"1459 <-> 419, 1608\n" +
				"1460 <-> 412, 1418, 1460\n" +
				"1461 <-> 59\n" +
				"1462 <-> 1176, 1571, 1979\n" +
				"1463 <-> 1387, 1771\n" +
				"1464 <-> 612\n" +
				"1465 <-> 84, 1084\n" +
				"1466 <-> 1553\n" +
				"1467 <-> 248, 1709\n" +
				"1468 <-> 676\n" +
				"1469 <-> 1603\n" +
				"1470 <-> 404, 1647\n" +
				"1471 <-> 943, 1471\n" +
				"1472 <-> 7, 351, 587, 1903\n" +
				"1473 <-> 1004, 1037\n" +
				"1474 <-> 1035, 1258\n" +
				"1475 <-> 1111, 1391\n" +
				"1476 <-> 807, 1108, 1115\n" +
				"1477 <-> 1309\n" +
				"1478 <-> 418\n" +
				"1479 <-> 674\n" +
				"1480 <-> 895, 1559\n" +
				"1481 <-> 437\n" +
				"1482 <-> 226\n" +
				"1483 <-> 1510\n" +
				"1484 <-> 679\n" +
				"1485 <-> 549, 979, 1650\n" +
				"1486 <-> 45, 1675, 1684\n" +
				"1487 <-> 1632\n" +
				"1488 <-> 636, 1590\n" +
				"1489 <-> 243, 1489\n" +
				"1490 <-> 902\n" +
				"1491 <-> 190\n" +
				"1492 <-> 883, 1661\n" +
				"1493 <-> 1636\n" +
				"1494 <-> 446, 1167\n" +
				"1495 <-> 427, 1396\n" +
				"1496 <-> 77, 457\n" +
				"1497 <-> 1497\n" +
				"1498 <-> 1070, 1498\n" +
				"1499 <-> 1499\n" +
				"1500 <-> 1781\n" +
				"1501 <-> 595, 633\n" +
				"1502 <-> 1502, 1782\n" +
				"1503 <-> 526, 1274\n" +
				"1504 <-> 60, 179\n" +
				"1505 <-> 1646\n" +
				"1506 <-> 1506\n" +
				"1507 <-> 446, 911, 1978\n" +
				"1508 <-> 1094, 1344, 1805\n" +
				"1509 <-> 1227, 1979\n" +
				"1510 <-> 892, 1483\n" +
				"1511 <-> 1318\n" +
				"1512 <-> 334, 360, 1642\n" +
				"1513 <-> 251, 311, 1258\n" +
				"1514 <-> 351, 1426\n" +
				"1515 <-> 1212, 1580\n" +
				"1516 <-> 296, 570, 755\n" +
				"1517 <-> 1901\n" +
				"1518 <-> 83, 439, 457\n" +
				"1519 <-> 259\n" +
				"1520 <-> 806, 1043, 1566\n" +
				"1521 <-> 764\n" +
				"1522 <-> 1912\n" +
				"1523 <-> 431\n" +
				"1524 <-> 778\n" +
				"1525 <-> 54, 292, 1525\n" +
				"1526 <-> 104, 1526\n" +
				"1527 <-> 1225, 1527\n" +
				"1528 <-> 15, 1683, 1794\n" +
				"1529 <-> 498\n" +
				"1530 <-> 62\n" +
				"1531 <-> 270, 706\n" +
				"1532 <-> 1942\n" +
				"1533 <-> 443\n" +
				"1534 <-> 521, 754\n" +
				"1535 <-> 331, 722, 952, 1551\n" +
				"1536 <-> 1008\n" +
				"1537 <-> 517, 729, 1667\n" +
				"1538 <-> 1229\n" +
				"1539 <-> 273, 1582\n" +
				"1540 <-> 324, 782\n" +
				"1541 <-> 628\n" +
				"1542 <-> 983, 1295, 1755\n" +
				"1543 <-> 1247\n" +
				"1544 <-> 837, 1333\n" +
				"1545 <-> 1380, 1704\n" +
				"1546 <-> 456, 801, 1717, 1993\n" +
				"1547 <-> 1555\n" +
				"1548 <-> 1745\n" +
				"1549 <-> 1634\n" +
				"1550 <-> 466, 1982\n" +
				"1551 <-> 1535\n" +
				"1552 <-> 212, 1594, 1613\n" +
				"1553 <-> 276, 1342, 1466\n" +
				"1554 <-> 674, 782, 934\n" +
				"1555 <-> 341, 1014, 1547\n" +
				"1556 <-> 1429\n" +
				"1557 <-> 1787\n" +
				"1558 <-> 836, 1322\n" +
				"1559 <-> 1015, 1480\n" +
				"1560 <-> 1111, 1409\n" +
				"1561 <-> 1561\n" +
				"1562 <-> 768\n" +
				"1563 <-> 1563, 1567\n" +
				"1564 <-> 1847\n" +
				"1565 <-> 1743\n" +
				"1566 <-> 624, 1520\n" +
				"1567 <-> 110, 850, 1563\n" +
				"1568 <-> 128, 861\n" +
				"1569 <-> 1569\n" +
				"1570 <-> 1125, 1769\n" +
				"1571 <-> 1462\n" +
				"1572 <-> 898, 1375\n" +
				"1573 <-> 1846\n" +
				"1574 <-> 948, 952, 1081, 1106, 1927\n" +
				"1575 <-> 1186\n" +
				"1576 <-> 114\n" +
				"1577 <-> 1133, 1436\n" +
				"1578 <-> 1821\n" +
				"1579 <-> 593, 947\n" +
				"1580 <-> 610, 1515\n" +
				"1581 <-> 912, 1455\n" +
				"1582 <-> 1539\n" +
				"1583 <-> 49, 280, 363, 1779\n" +
				"1584 <-> 545, 1902\n" +
				"1585 <-> 937\n" +
				"1586 <-> 408, 1017, 1605\n" +
				"1587 <-> 550, 1097, 1127\n" +
				"1588 <-> 1288\n" +
				"1589 <-> 1307, 1823\n" +
				"1590 <-> 1314, 1488\n" +
				"1591 <-> 301\n" +
				"1592 <-> 599\n" +
				"1593 <-> 777\n" +
				"1594 <-> 1394, 1552\n" +
				"1595 <-> 1665\n" +
				"1596 <-> 1909\n" +
				"1597 <-> 214\n" +
				"1598 <-> 1703\n" +
				"1599 <-> 411, 448, 1435\n" +
				"1600 <-> 1600\n" +
				"1601 <-> 1822\n" +
				"1602 <-> 1816\n" +
				"1603 <-> 151, 1192, 1469, 1797, 1967\n" +
				"1604 <-> 1688\n" +
				"1605 <-> 1586\n" +
				"1606 <-> 19, 401, 1092\n" +
				"1607 <-> 130, 1770\n" +
				"1608 <-> 1459, 1654\n" +
				"1609 <-> 1074, 1728\n" +
				"1610 <-> 1031\n" +
				"1611 <-> 178, 1724\n" +
				"1612 <-> 831\n" +
				"1613 <-> 773, 1552\n" +
				"1614 <-> 85, 556, 566\n" +
				"1615 <-> 1192, 1375\n" +
				"1616 <-> 849, 875, 1917\n" +
				"1617 <-> 1791\n" +
				"1618 <-> 821\n" +
				"1619 <-> 1226, 1289\n" +
				"1620 <-> 1620, 1832\n" +
				"1621 <-> 1173\n" +
				"1622 <-> 546, 1067, 1754\n" +
				"1623 <-> 1356, 1652\n" +
				"1624 <-> 170, 867, 1408, 1868\n" +
				"1625 <-> 409, 1629\n" +
				"1626 <-> 258, 471\n" +
				"1627 <-> 77, 735\n" +
				"1628 <-> 1130\n" +
				"1629 <-> 1265, 1625\n" +
				"1630 <-> 384, 1808\n" +
				"1631 <-> 1051, 1262, 1784, 1833\n" +
				"1632 <-> 677, 1487, 1709\n" +
				"1633 <-> 69\n" +
				"1634 <-> 1368, 1549\n" +
				"1635 <-> 1635\n" +
				"1636 <-> 1212, 1493\n" +
				"1637 <-> 1263, 1990\n" +
				"1638 <-> 871, 982, 1233\n" +
				"1639 <-> 842, 1639\n" +
				"1640 <-> 775, 1843\n" +
				"1641 <-> 1010\n" +
				"1642 <-> 646, 1512, 1816\n" +
				"1643 <-> 534, 1017, 1929\n" +
				"1644 <-> 130, 1820\n" +
				"1645 <-> 1863\n" +
				"1646 <-> 197, 1105, 1505, 1719\n" +
				"1647 <-> 919, 1470, 1975\n" +
				"1648 <-> 802\n" +
				"1649 <-> 1001, 1676\n" +
				"1650 <-> 1357, 1485, 1984\n" +
				"1651 <-> 336, 1216, 1888\n" +
				"1652 <-> 583, 1623, 1652\n" +
				"1653 <-> 1745\n" +
				"1654 <-> 1139, 1608\n" +
				"1655 <-> 855, 1122\n" +
				"1656 <-> 395, 1238\n" +
				"1657 <-> 743, 1812\n" +
				"1658 <-> 429, 962, 1342\n" +
				"1659 <-> 1792\n" +
				"1660 <-> 1764\n" +
				"1661 <-> 644, 1492\n" +
				"1662 <-> 33, 1726\n" +
				"1663 <-> 930, 1111\n" +
				"1664 <-> 767, 1179, 1913\n" +
				"1665 <-> 357, 1061, 1595\n" +
				"1666 <-> 32, 548, 714\n" +
				"1667 <-> 560, 1537\n" +
				"1668 <-> 562, 1156, 1450\n" +
				"1669 <-> 571, 923\n" +
				"1670 <-> 1674\n" +
				"1671 <-> 1256\n" +
				"1672 <-> 600\n" +
				"1673 <-> 252, 1400, 1673, 1901\n" +
				"1674 <-> 507, 1185, 1670\n" +
				"1675 <-> 1486\n" +
				"1676 <-> 618, 1360, 1649\n" +
				"1677 <-> 61, 541, 1299\n" +
				"1678 <-> 86, 249\n" +
				"1679 <-> 513, 1700\n" +
				"1680 <-> 559, 1920\n" +
				"1681 <-> 199\n" +
				"1682 <-> 1895\n" +
				"1683 <-> 165, 1528, 1988\n" +
				"1684 <-> 30, 1261, 1486\n" +
				"1685 <-> 1006, 1170, 1425, 1980\n" +
				"1686 <-> 505, 1341, 1720\n" +
				"1687 <-> 477, 1977\n" +
				"1688 <-> 863, 1604\n" +
				"1689 <-> 1241\n" +
				"1690 <-> 686\n" +
				"1691 <-> 1785, 1890\n" +
				"1692 <-> 1451\n" +
				"1693 <-> 197, 1183, 1234\n" +
				"1694 <-> 735, 913, 937\n" +
				"1695 <-> 112\n" +
				"1696 <-> 1456, 1921\n" +
				"1697 <-> 174, 1768\n" +
				"1698 <-> 850\n" +
				"1699 <-> 1699\n" +
				"1700 <-> 500, 1679\n" +
				"1701 <-> 1414\n" +
				"1702 <-> 817\n" +
				"1703 <-> 56, 223, 1598\n" +
				"1704 <-> 628, 1545\n" +
				"1705 <-> 254\n" +
				"1706 <-> 390, 856, 1005\n" +
				"1707 <-> 863\n" +
				"1708 <-> 1815\n" +
				"1709 <-> 631, 1467, 1632\n" +
				"1710 <-> 538, 888\n" +
				"1711 <-> 1742\n" +
				"1712 <-> 282\n" +
				"1713 <-> 171\n" +
				"1714 <-> 1714\n" +
				"1715 <-> 1113\n" +
				"1716 <-> 1091, 1729\n" +
				"1717 <-> 1408, 1546\n" +
				"1718 <-> 1187\n" +
				"1719 <-> 1646, 1719, 1735\n" +
				"1720 <-> 1152, 1686\n" +
				"1721 <-> 805, 1226\n" +
				"1722 <-> 180, 445, 1437\n" +
				"1723 <-> 942\n" +
				"1724 <-> 614, 1611\n" +
				"1725 <-> 1342\n" +
				"1726 <-> 156, 402, 512, 1662\n" +
				"1727 <-> 718\n" +
				"1728 <-> 1609, 1827, 1881\n" +
				"1729 <-> 288, 1237, 1716\n" +
				"1730 <-> 232\n" +
				"1731 <-> 1863\n" +
				"1732 <-> 88, 410, 878, 1373\n" +
				"1733 <-> 856, 1246, 1267\n" +
				"1734 <-> 966\n" +
				"1735 <-> 1719\n" +
				"1736 <-> 419\n" +
				"1737 <-> 22, 363\n" +
				"1738 <-> 93, 1049\n" +
				"1739 <-> 475, 1354\n" +
				"1740 <-> 427, 503\n" +
				"1741 <-> 1241\n" +
				"1742 <-> 1711, 1853\n" +
				"1743 <-> 521, 822, 1021, 1565\n" +
				"1744 <-> 1989\n" +
				"1745 <-> 753, 1548, 1653\n" +
				"1746 <-> 649\n" +
				"1747 <-> 245, 494, 1196, 1810\n" +
				"1748 <-> 172, 720\n" +
				"1749 <-> 581\n" +
				"1750 <-> 1768\n" +
				"1751 <-> 192, 773, 818\n" +
				"1752 <-> 215, 687\n" +
				"1753 <-> 897\n" +
				"1754 <-> 1270, 1622, 1945\n" +
				"1755 <-> 1542\n" +
				"1756 <-> 344\n" +
				"1757 <-> 1117\n" +
				"1758 <-> 449, 492\n" +
				"1759 <-> 511, 654, 1938\n" +
				"1760 <-> 209, 275\n" +
				"1761 <-> 547\n" +
				"1762 <-> 362, 667\n" +
				"1763 <-> 35\n" +
				"1764 <-> 276, 646, 1660\n" +
				"1765 <-> 925\n" +
				"1766 <-> 847, 1875\n" +
				"1767 <-> 771, 1296\n" +
				"1768 <-> 1697, 1750, 1768, 1780\n" +
				"1769 <-> 1570, 1896\n" +
				"1770 <-> 1607, 1770\n" +
				"1771 <-> 279, 916, 1463\n" +
				"1772 <-> 1271\n" +
				"1773 <-> 1349, 1894\n" +
				"1774 <-> 209\n" +
				"1775 <-> 160, 463, 491, 790\n" +
				"1776 <-> 282\n" +
				"1777 <-> 1952\n" +
				"1778 <-> 1952\n" +
				"1779 <-> 1583\n" +
				"1780 <-> 1768\n" +
				"1781 <-> 1500, 1800\n" +
				"1782 <-> 1502\n" +
				"1783 <-> 381, 898\n" +
				"1784 <-> 147, 435, 655, 987, 1211, 1631\n" +
				"1785 <-> 1691, 1792\n" +
				"1786 <-> 303\n" +
				"1787 <-> 40, 68, 1557\n" +
				"1788 <-> 1788\n" +
				"1789 <-> 515, 941, 1161\n" +
				"1790 <-> 397, 997, 1158\n" +
				"1791 <-> 828, 1617\n" +
				"1792 <-> 758, 1058, 1104, 1659, 1785\n" +
				"1793 <-> 272\n" +
				"1794 <-> 1528\n" +
				"1795 <-> 9\n" +
				"1796 <-> 792, 1933\n" +
				"1797 <-> 651, 1209, 1603\n" +
				"1798 <-> 977, 1021\n" +
				"1799 <-> 562, 1167, 1320\n" +
				"1800 <-> 216, 348, 1781\n" +
				"1801 <-> 926, 1859\n" +
				"1802 <-> 885, 1034, 1451\n" +
				"1803 <-> 409\n" +
				"1804 <-> 257\n" +
				"1805 <-> 629, 1508\n" +
				"1806 <-> 532\n" +
				"1807 <-> 851\n" +
				"1808 <-> 865, 1630\n" +
				"1809 <-> 1809\n" +
				"1810 <-> 1248, 1747\n" +
				"1811 <-> 1911\n" +
				"1812 <-> 1657\n" +
				"1813 <-> 424, 1100, 1294\n" +
				"1814 <-> 1906, 1937\n" +
				"1815 <-> 731, 1393, 1708\n" +
				"1816 <-> 810, 830, 1602, 1642\n" +
				"1817 <-> 271, 1817\n" +
				"1818 <-> 199, 798, 1818\n" +
				"1819 <-> 1058\n" +
				"1820 <-> 1644\n" +
				"1821 <-> 68, 1343, 1578, 1904\n" +
				"1822 <-> 1342, 1601\n" +
				"1823 <-> 1589\n" +
				"1824 <-> 60\n" +
				"1825 <-> 1371\n" +
				"1826 <-> 683, 935\n" +
				"1827 <-> 93, 1728\n" +
				"1828 <-> 326, 555\n" +
				"1829 <-> 882\n" +
				"1830 <-> 1341, 1402\n" +
				"1831 <-> 1831\n" +
				"1832 <-> 1620\n" +
				"1833 <-> 712, 1321, 1631\n" +
				"1834 <-> 1834\n" +
				"1835 <-> 516\n" +
				"1836 <-> 670\n" +
				"1837 <-> 1837\n" +
				"1838 <-> 825\n" +
				"1839 <-> 903\n" +
				"1840 <-> 1840\n" +
				"1841 <-> 1841\n" +
				"1842 <-> 1145\n" +
				"1843 <-> 264, 332, 668, 1165, 1312, 1640\n" +
				"1844 <-> 165, 241, 1068\n" +
				"1845 <-> 1007\n" +
				"1846 <-> 1323, 1573\n" +
				"1847 <-> 640, 1564\n" +
				"1848 <-> 632\n" +
				"1849 <-> 669, 774, 912, 1034\n" +
				"1850 <-> 1001, 1873\n" +
				"1851 <-> 1330\n" +
				"1852 <-> 1361\n" +
				"1853 <-> 402, 1742\n" +
				"1854 <-> 725\n" +
				"1855 <-> 676, 1908\n" +
				"1856 <-> 1123\n" +
				"1857 <-> 418, 460\n" +
				"1858 <-> 140, 271, 1178\n" +
				"1859 <-> 1801\n" +
				"1860 <-> 793\n" +
				"1861 <-> 306, 340\n" +
				"1862 <-> 1353\n" +
				"1863 <-> 1395, 1645, 1731\n" +
				"1864 <-> 672, 800, 1420\n" +
				"1865 <-> 969, 1153\n" +
				"1866 <-> 430, 1115\n" +
				"1867 <-> 980\n" +
				"1868 <-> 136, 1624\n" +
				"1869 <-> 428, 956, 1433, 1443\n" +
				"1870 <-> 534, 970, 1417\n" +
				"1871 <-> 936\n" +
				"1872 <-> 1316\n" +
				"1873 <-> 1850\n" +
				"1874 <-> 337\n" +
				"1875 <-> 1766\n" +
				"1876 <-> 1876\n" +
				"1877 <-> 1020, 1877\n" +
				"1878 <-> 365, 1878\n" +
				"1879 <-> 742, 1184\n" +
				"1880 <-> 777, 809\n" +
				"1881 <-> 394, 1728\n" +
				"1882 <-> 448\n" +
				"1883 <-> 33\n" +
				"1884 <-> 863, 1166, 1369\n" +
				"1885 <-> 365, 899, 960\n" +
				"1886 <-> 327, 686\n" +
				"1887 <-> 46, 339, 1061\n" +
				"1888 <-> 78, 1651\n" +
				"1889 <-> 1889\n" +
				"1890 <-> 1691\n" +
				"1891 <-> 708\n" +
				"1892 <-> 1892\n" +
				"1893 <-> 980, 1941, 1947\n" +
				"1894 <-> 1773\n" +
				"1895 <-> 544, 742, 1682\n" +
				"1896 <-> 285, 1769\n" +
				"1897 <-> 378, 1993\n" +
				"1898 <-> 1981\n" +
				"1899 <-> 220, 1206\n" +
				"1900 <-> 382, 390, 1022\n" +
				"1901 <-> 1517, 1673\n" +
				"1902 <-> 1132, 1268, 1584, 1959\n" +
				"1903 <-> 1472\n" +
				"1904 <-> 961, 1821\n" +
				"1905 <-> 836, 994, 1219\n" +
				"1906 <-> 1304, 1323, 1814\n" +
				"1907 <-> 755\n" +
				"1908 <-> 1073, 1855\n" +
				"1909 <-> 31, 1596\n" +
				"1910 <-> 1114, 1915\n" +
				"1911 <-> 709, 1451, 1811\n" +
				"1912 <-> 60, 1522\n" +
				"1913 <-> 1664\n" +
				"1914 <-> 24, 949\n" +
				"1915 <-> 1910\n" +
				"1916 <-> 222\n" +
				"1917 <-> 1616\n" +
				"1918 <-> 413\n" +
				"1919 <-> 204, 268, 1353\n" +
				"1920 <-> 1178, 1680\n" +
				"1921 <-> 1696\n" +
				"1922 <-> 26\n" +
				"1923 <-> 768\n" +
				"1924 <-> 405, 1924\n" +
				"1925 <-> 79, 1050, 1092, 1397\n" +
				"1926 <-> 1926\n" +
				"1927 <-> 1430, 1574\n" +
				"1928 <-> 376, 765\n" +
				"1929 <-> 1643, 1947\n" +
				"1930 <-> 828, 886\n" +
				"1931 <-> 11, 1960\n" +
				"1932 <-> 59, 136\n" +
				"1933 <-> 472, 1238, 1796\n" +
				"1934 <-> 431\n" +
				"1935 <-> 938, 1071\n" +
				"1936 <-> 828, 919\n" +
				"1937 <-> 532, 1260, 1814\n" +
				"1938 <-> 910, 1759\n" +
				"1939 <-> 704\n" +
				"1940 <-> 505\n" +
				"1941 <-> 1280, 1893\n" +
				"1942 <-> 248, 641, 1532\n" +
				"1943 <-> 1414\n" +
				"1944 <-> 325\n" +
				"1945 <-> 1754\n" +
				"1946 <-> 852, 1351\n" +
				"1947 <-> 1345, 1893, 1929\n" +
				"1948 <-> 35\n" +
				"1949 <-> 121, 858, 1037, 1357\n" +
				"1950 <-> 1391\n" +
				"1951 <-> 1451\n" +
				"1952 <-> 1395, 1777, 1778\n" +
				"1953 <-> 1953\n" +
				"1954 <-> 1393\n" +
				"1955 <-> 1430\n" +
				"1956 <-> 63, 118\n" +
				"1957 <-> 464\n" +
				"1958 <-> 572, 1011\n" +
				"1959 <-> 1229, 1902\n" +
				"1960 <-> 1931\n" +
				"1961 <-> 1014\n" +
				"1962 <-> 1962\n" +
				"1963 <-> 380\n" +
				"1964 <-> 754\n" +
				"1965 <-> 300\n" +
				"1966 <-> 624\n" +
				"1967 <-> 1603\n" +
				"1968 <-> 1365, 1411\n" +
				"1969 <-> 1349\n" +
				"1970 <-> 450\n" +
				"1971 <-> 107, 608\n" +
				"1972 <-> 1045\n" +
				"1973 <-> 23, 389, 673\n" +
				"1974 <-> 1974\n" +
				"1975 <-> 361, 968, 1647, 1994\n" +
				"1976 <-> 1134, 1285\n" +
				"1977 <-> 7, 1044, 1118, 1687\n" +
				"1978 <-> 1507\n" +
				"1979 <-> 1277, 1330, 1462, 1509\n" +
				"1980 <-> 466, 1007, 1407, 1685\n" +
				"1981 <-> 707, 1324, 1447, 1898\n" +
				"1982 <-> 348, 1550\n" +
				"1983 <-> 478, 1061\n" +
				"1984 <-> 905, 1650\n" +
				"1985 <-> 874\n" +
				"1986 <-> 765, 953\n" +
				"1987 <-> 297\n" +
				"1988 <-> 112, 1683\n" +
				"1989 <-> 555, 1051, 1213, 1744\n" +
				"1990 <-> 1637\n" +
				"1991 <-> 1991\n" +
				"1992 <-> 31, 133, 821\n" +
				"1993 <-> 1546, 1897\n" +
				"1994 <-> 603, 1975\n" +
				"1995 <-> 325\n" +
				"1996 <-> 1996\n" +
				"1997 <-> 14, 1093\n" +
				"1998 <-> 1002\n" +
				"1999 <-> 708";
		final PipeCommunication pipeCommunication = new PipeCommunication();
		System.out.println("Pipe result is:");
		System.out.println(pipeCommunication.countProgramsWithZero(pipeInput));
		System.out.println("Group count is:");
		System.out.println(pipeCommunication.countNumberOfGroups(pipeInput));

		final String firewallInput = "0: 3\n" +
				"1: 2\n" +
				"2: 5\n" +
				"4: 4\n" +
				"6: 6\n" +
				"8: 4\n" +
				"10: 8\n" +
				"12: 8\n" +
				"14: 6\n" +
				"16: 8\n" +
				"18: 6\n" +
				"20: 6\n" +
				"22: 8\n" +
				"24: 12\n" +
				"26: 12\n" +
				"28: 8\n" +
				"30: 12\n" +
				"32: 12\n" +
				"34: 8\n" +
				"36: 10\n" +
				"38: 9\n" +
				"40: 12\n" +
				"42: 10\n" +
				"44: 12\n" +
				"46: 14\n" +
				"48: 14\n" +
				"50: 12\n" +
				"52: 14\n" +
				"56: 12\n" +
				"58: 12\n" +
				"60: 14\n" +
				"62: 14\n" +
				"64: 12\n" +
				"66: 14\n" +
				"68: 14\n" +
				"70: 14\n" +
				"74: 24\n" +
				"76: 14\n" +
				"80: 18\n" +
				"82: 14\n" +
				"84: 14\n" +
				"90: 14\n" +
				"94: 17";
		final Firewall firewall = new Firewall(firewallInput);
		System.out.println("firewall severity is:");
		System.out.println(firewall.countSeverity(0));
		System.out.println("minimal delay is");
		System.out.println(firewall.countMinimalDelay());

		final String diskDefragmenterInput = "ljoxqyyw";
		final DiskDefragmenter diskDefragmenter = new DiskDefragmenter();
		System.out.println("Full blocks on disc:");
		System.out.println(diskDefragmenter.countFullBlocks(diskDefragmenterInput));
		System.out.println("Regions on disc:");
		System.out.println(diskDefragmenter.countRegions(diskDefragmenterInput));

		final Generators generators = new Generators();
		System.out.println("generators result is:");
		//System.out.println(generators.getFinalCount("591", "393"));
		System.out.println("generators picky result is:");
		//System.out.println(generators.getPickyCount("591", "393"));

		final String programsDanceInput = "x13/7,s2,x2/1,pn/a,x11/4,pb/f,x14/15,s3,x10/9,s4,x0/8,s5,x13/6,pl/e,x8/4,s13,x5/7,s12,x6/15,pm/k,x9/8,pi/l,x0/13,s4,x2/11,pp/m,s11,x15/8,s6,pf/o,x14/11,pe/a,x10/8,s1,x5/13,pc/h,x6/12,pn/l,x11/9,s9,x3/1,s10,x10/12,pj/b,x15/3,s13,x11/12,s14,x0/15,s6,x11/9,s1,x13/0,pl/k,s7,x2/8,pd/i,s1,x15/13,s2,x2/9,s2,pk/n,x3/8,po/f,x13/14,s4,x5/15,s6,x14/0,s4,x6/8,s3,x2/3,s2,x6/10,pp/m,x0/1,s7,x5/14,s11,x7/0,pd/k,x8/11,pe/i,x12/1,s1,x0/5,s3,x14/7,pk/d,x11/8,ph/g,x0/12,pb/e,s14,x8/13,s5,x4/11,s6,x1/3,po/k,x9/15,pg/a,x8/5,s6,x6/10,s3,x3/9,ph/p,x14/8,s8,x12/11,pk/c,x6/10,s2,x12/8,s11,x6/5,s4,x9/4,s14,x7/10,pf/p,x2/4,pl/b,x0/8,s13,x6/2,pk/o,x1/14,s13,x4/3,s15,x7/14,pl/h,x2/3,s8,x8/0,pf/d,x12/5,pn/h,x3/14,s4,x2/10,pj/o,x9/11,pm/k,x4/7,pa/e,x14/12,pp/i,x1/7,s2,x0/6,s13,x3/12,s7,x15/2,s2,x3/4,s6,x0/15,s12,x11/4,s6,x15/6,s7,x14/3,pn/e,x8/2,s13,x12/3,s4,x8/11,pb/j,x2/9,s11,x3/0,s10,x12/2,po/e,x11/15,pg/m,x2/14,s14,x11/7,pb/k,x10/8,pn/f,x3/15,pj/i,x12/4,s3,x15/13,pg/n,x7/2,s4,x5/0,s9,x2/9,s5,x11/7,pp/d,s15,x5/10,pk/g,x14/1,pc/p,x10/2,s6,x9/7,s13,x15/8,s13,pk/l,x14/9,pi/j,x3/11,s12,x10/0,pn/l,x4/5,s8,x1/13,pc/g,x15/12,s9,x5/0,pn/j,x14/7,s1,x2/1,po/f,x3/4,s7,x9/12,pi/b,x10/2,pk/e,x12/13,pn/d,x4/7,po/i,x14/12,s12,x10/5,s1,x9/12,s1,x13/10,s6,x15/1,pg/p,x10/2,s6,x12/0,pf/l,x14/5,s7,pm/o,x9/10,pi/k,x15/12,pe/o,s12,x8/10,pk/g,x13/12,s9,x14/0,s9,x3/1,s4,x4/14,pb/h,x13/7,pd/n,x8/5,pj/k,x12/1,s3,x15/8,s2,x10/1,s3,pi/n,x14/8,s7,x2/4,s5,x8/9,s1,x12/5,s6,x1/7,pm/a,x9/6,s6,x13/8,pl/k,x11/6,pm/c,x13/4,s5,x15/12,pa/l,x0/5,pe/p,x15/1,pa/c,s6,x8/3,ph/i,x13/9,s5,x14/3,pl/a,x10/2,pk/j,x12/3,s10,x13/1,pg/h,x3/4,s5,x11/6,s15,x15/9,s8,x2/7,s15,x9/13,s2,x15/14,s8,pe/p,x13/7,s5,x15/9,s8,pc/j,x7/14,s13,x12/4,s3,pm/l,x8/0,pf/c,x4/5,pp/g,x2/3,s8,x6/0,s5,x9/4,s9,x15/11,s11,x0/13,s12,x7/1,pc/a,x13/11,pb/g,x14/10,s6,pe/h,x6/4,s14,pk/c,x12/13,s10,x4/3,pj/i,x7/9,s9,x5/1,pe/m,s10,x15/2,pj/d,x13/5,s5,x3/1,s10,x2/9,s13,pm/b,x13/11,pp/j,x7/10,s1,x3/1,pm/d,x8/2,s3,x9/1,s1,pc/k,x13/8,s2,x3/4,s1,x5/0,s7,x2/4,s10,x10/3,pp/f,s3,x15/1,pi/d,x5/8,s7,x0/12,s12,x5/1,pa/n,x9/4,s11,x5/6,s1,x10/14,pe/d,x0/1,s10,x15/11,s6,x1/12,po/b,x3/5,pe/l,x14/7,s12,x11/13,pk/c,x7/6,pn/f,x2/12,s8,x5/8,pc/m,x15/11,s14,x3/13,s5,x15/11,s3,x9/1,s3,x5/7,s3,x9/1,pd/o,x2/6,pp/m,s6,x4/3,pj/o,x0/12,s11,x2/6,s9,x1/10,s12,pn/p,x11/7,s1,x2/0,s2,x15/6,s7,x7/8,s15,x0/11,s14,x12/15,pg/m,x9/3,s15,x12/15,s1,x14/1,pk/j,x3/13,s5,x12/14,s13,x1/6,s7,x15/14,pd/g,x7/6,s14,x8/1,s7,pj/b,x2/4,s2,x7/6,s11,x2/10,s11,x5/0,s15,x10/2,pl/i,x15/5,s12,pm/k,x14/2,s14,x1/13,s10,x12/5,s1,x11/7,s4,x2/14,s5,x13/9,pe/l,x11/6,s7,x12/0,pn/g,x13/8,pj/o,x7/12,s5,x13/10,pc/h,x12/1,pf/p,x0/13,s8,x10/14,s15,x0/9,s1,x10/13,s7,x3/9,pm/b,x0/14,po/k,s9,x13/2,pg/m,x6/7,s12,x10/3,s13,x0/6,s3,x12/5,s14,x2/8,pc/e,x5/7,s11,x12/1,s15,pn/l,x14/3,s13,x2/4,s15,x6/14,pd/c,x11/3,pm/e,x7/12,s7,x9/2,pf/g,x1/4,s9,x11/9,s15,x0/2,pp/j,x13/1,s2,x7/6,pm/c,x13/14,s14,x12/1,s14,x5/8,po/e,s2,x10/1,pl/i,x8/4,s5,x0/10,pk/d,x12/6,s12,x5/10,pa/n,s15,x15/11,s13,x3/13,pm/d,s1,x14/15,s9,x4/5,s12,pe/g,x11/15,pm/j,x3/10,s4,x0/5,ph/o,x13/3,s11,x5/11,s1,x10/6,s14,x0/4,s8,x10/1,pa/d,x12/4,s8,x5/15,s14,x14/10,pm/o,s5,x0/4,s5,x15/3,s5,x11/4,pk/i,x15/9,s7,x1/11,ph/l,x4/2,s5,x10/14,s7,x15/4,s9,x8/0,pj/o,x7/11,s14,x13/5,s8,x8/14,s14,x9/10,s4,x2/13,pb/h,x0/15,s14,pj/p,x5/6,s13,x1/14,s13,pe/c,x2/0,s6,pg/b,x5/8,pd/n,x14/12,s4,x5/1,s1,x10/14,s7,x2/5,s2,x8/15,s2,x2/5,pj/b,x4/14,s9,x7/12,s12,x10/13,pg/n,x14/11,s2,x1/5,s4,x3/9,s11,x8/0,pm/l,x1/14,s7,x15/7,ph/a,x2/12,s12,pe/n,s13,x3/13,s13,x2/4,s15,x15/5,s8,x11/0,s9,x8/9,pf/h,x14/13,s11,x10/4,s13,x11/3,s5,x10/15,s14,x14/8,s10,x15/13,s9,x9/0,s10,x8/6,s14,x11/0,s2,x1/4,pg/b,x0/9,s14,x3/2,s14,x8/5,s4,x6/9,s15,x13/5,pn/l,x9/6,pb/e,x13/8,s8,pi/a,x9/4,pm/k,x0/14,s2,x12/8,s5,x0/2,s4,pd/i,x15/11,s4,x13/3,pm/c,x10/4,s7,x12/11,pg/o,s4,x13/0,s3,x4/8,pm/j,x5/13,s13,x0/2,s8,x13/11,pl/d,x10/4,s15,x7/3,pk/h,x14/15,pn/m,x7/11,s12,x4/9,pl/i,x2/8,s2,x9/7,s6,x6/3,pf/n,x14/7,s2,x15/1,s11,x6/12,s11,x9/0,pk/m,x5/3,s5,x8/10,s5,x14/9,pg/c,x3/4,s3,x7/12,s14,x13/6,pn/k,x1/7,ph/m,x15/3,s12,x11/0,pk/f,x15/1,s5,x0/3,ph/c,x15/14,pn/l,x2/13,pm/d,x14/12,pi/e,x1/10,s5,x7/15,s15,x12/4,s2,x0/5,s10,x13/2,pp/k,x0/15,po/a,x1/2,pl/g,x11/7,pm/h,s5,x9/3,s5,x7/8,pi/a,x6/2,s4,x4/3,s11,x6/2,pp/d,x13/12,s15,x1/9,s7,x13/15,s8,x11/3,s6,x12/0,s8,x10/13,s8,x8/4,s9,x13/6,pf/a,x8/1,s8,x4/15,s15,x14/5,s11,x9/10,pp/d,x8/0,s5,x9/5,pa/h,x10/13,s10,x8/12,s6,pm/i,x10/9,pj/p,x6/7,pa/m,x13/11,pd/p,x4/14,pi/e,x10/8,pp/k,x14/9,pa/b,s10,x13/15,pe/h,x12/9,s12,x5/0,pd/j,x11/8,pl/e,x10/15,s15,x12/6,s1,x5/0,s6,x9/11,ph/j,x4/6,pl/c,x15/10,s9,pg/a,x8/13,s11,x1/15,s10,x2/8,pp/j,x0/11,s2,x13/4,s13,x7/8,s6,x10/14,pd/k,x0/8,pn/p,x5/15,pm/o,x14/3,pa/i,x5/6,s8,x0/10,s6,x14/13,pb/d,x1/7,s13,x8/4,s15,x6/2,pp/n,x15/5,s7,x4/12,s4,x5/6,s4,x11/12,s9,x14/0,ph/l,x6/12,s11,x13/8,s6,x4/3,s2,x0/11,po/k,x6/5,s9,x12/9,s3,x6/0,pb/p,x11/8,s11,x0/10,s10,x2/4,pe/k,x0/6,ph/a,x15/1,pf/e,x3/12,pp/b,x7/13,s12,pd/i,s9,x2/10,pe/a,x7/5,s7,x11/2,pd/h,x10/15,s14,x11/9,s4,pp/n,x7/1,s2,x14/5,s5,x4/13,pj/l,x7/6,s3,x12/15,s12,x4/2,s7,x9/1,s15,x4/3,s5,x6/8,s5,x2/13,s11,x12/10,s14,x14/11,s11,x15/9,pc/d,x2/4,s3,x0/10,pe/j,x2/5,s12,x1/13,s8,x9/3,pl/g,x7/10,pf/d,x12/13,s3,x14/1,po/l,s15,x10/12,pn/k,s1,pe/d,x6/5,s11,pb/g,x14/9,s10,x2/1,s2,x15/6,pd/l,x10/9,s8,x14/5,pp/e,x7/12,pm/n,x8/14,pb/e,x4/3,pl/j,x15/7,s6,x13/9,s12,x15/0,pc/o,x8/4,s7,x7/3,s15,pf/p,x12/0,s10,x5/14,s13,x15/13,s10,x7/1,pm/b,x5/12,po/p,x0/8,s10,x10/7,s9,x2/14,s7,x4/5,pi/a,s1,x10/9,s11,x12/7,pc/m,x1/8,ph/k,x7/6,s15,x13/0,s14,x12/4,s15,x11/10,s13,pn/g,s10,x13/6,s10,x8/3,s2,x12/4,s13,x7/3,pi/j,s3,x9/11,s12,x1/7,pn/e,x14/0,s10,x6/5,pm/i,x12/1,pf/d,x13/14,s2,x9/4,s8,x8/15,s9,pl/k,x3/11,pd/o,x10/0,s15,x5/11,pp/e,x1/4,s14,x0/9,pf/j,x11/3,s7,x13/5,s6,x4/0,s6,x14/1,s12,x9/11,pa/g,x6/2,s3,x1/4,s1,x0/15,pd/k,x8/2,s1,x4/13,s6,x11/12,ph/o,x2/14,s8,x0/6,s15,x9/4,s7,x5/1,s5,x7/4,s5,pn/b,x0/13,pe/j,x7/9,pk/f,x4/0,po/j,x12/2,pc/f,x7/13,po/p,x6/4,pa/i,x7/0,s3,x6/10,s6,x2/12,s8,x15/1,s3,x11/4,s10,x14/0,s8,x11/4,pk/p,x10/0,s7,x5/3,pi/l,x10/14,s11,x3/1,s2,x7/8,s11,x4/9,pb/f,x15/14,s10,x3/2,ph/j,x14/8,pp/e,x1/6,pf/j,x7/3,pi/n,x12/10,pa/m,s2,x0/15,pd/h,x1/7,s11,x4/5,s13,x10/15,s3,x13/11,s2,x2/6,pc/j,x9/12,s1,x11/13,pf/g,x12/9,s7,x0/7,po/c,x9/14,pl/k,x11/2,s15,x3/1,pc/e,x15/4,pg/j,x10/14,s4,x0/7,s10,x13/9,ph/i,x6/1,s15,x7/2,pf/l,x5/1,s9,x7/15,s13,x1/5,s13,x11/3,s9,x14/8,pd/i,x0/1,pf/k,x9/2,s8,x3/0,s13,x12/1,pn/l,x13/4,s4,x6/12,pa/o,x9/4,s5,x12/8,s5,x9/7,s11,x6/4,pd/c,x1/15,s8,x12/14,ph/k,x10/2,s10,x3/4,s5,x7/12,s7,x5/14,pp/n,x10/9,pc/e,x12/11,s2,x0/1,pm/p,x9/13,s13,x6/10,s5,x7/3,s7,x5/4,s14,x10/3,s9,pn/a,x15/13,pe/g,x3/2,ph/b,x12/15,s5,x4/3,s12,x6/5,pn/k,x13/0,s10,x1/8,pd/l,x9/2,s6,x4/0,pn/e,x15/10,pd/k,x7/9,s1,x15/4,s6,x2/7,s4,x6/4,s4,x1/8,pm/b,x5/7,s5,x8/4,pg/e,x0/14,s10,x4/13,s1,x3/8,pj/f,x15/2,s4,x13/1,s9,x6/10,pa/p,x8/14,ph/f,x11/12,s11,x8/5,s1,x10/12,pa/i,x6/7,s10,x9/14,s14,x4/3,s3,x13/7,s10,x9/0,s11,x14/13,ph/n,x7/3,po/l,s3,x0/2,pm/k,x4/6,pd/b,x1/15,s6,x10/5,s12,x3/14,s3,pg/c,s7,x1/0,pi/o,x9/4,s2,x5/11,pp/f,x10/13,s11,x7/9,pg/h,x11/12,pe/a,x7/6,pg/c,x12/8,s13,x7/11,s7,x6/10,s6,x9/13,s7,x14/12,pk/d,x2/9,s8,x4/13,s5,x10/2,pp/a,x14/4,s15,x15/7,pc/f,x4/8,s13,x6/3,s12,x13/9,s14,ph/d,x11/6,s1,x5/14,s8,x4/13,s1,x9/2,s9,pm/c,x1/6,s5,x13/10,s4,x1/15,s10,x2/13,s3,x3/6,pn/f,x4/2,s7,x8/15,po/j,x12/7,ph/d,s10,x6/3,pa/i,x1/2,ph/k,x9/0,pe/l,x14/5,s2,x8/10,s9,x14/0,s14,x5/11,s15,x13/15,pf/j,x6/4,s10,x12/14,s3,x1/11,s5,x2/0,s9,x4/5,po/n,x13/14,pc/g,x12/7,s6,x15/1,s7,x8/14,s15,x6/13,s11,x10/5,s7,x0/4,s9,x7/13,pp/m,x0/9,pg/f,x13/10,s1,x3/0,s15,x6/8,ph/d,x14/1,pk/m,x2/6,s10,x4/5,s6,x8/1,s5,x3/5,pa/i,x1/13,s10,x11/2,pc/d,x4/13,pe/p,x6/15,s13,x13/4,pl/a,s8,x5/9,s9,pf/g,x11/2,s14,pa/o,x6/15,s5,x12/8,pj/l,x13/4,s15,x10/1,s12,x7/11,s6,x6/1,s2,x3/0,s9,x14/2,pf/o,x5/6,pc/h,x8/11,s14,x5/6,s11,x11/2,s6,x14/3,s13,pk/i,x12/0,pm/d,x13/8,pj/e,s4,x6/2,s14,x5/14,s1,x7/9,pp/k,x8/13,s5,x10/15,pm/j,x8/2,pe/k,x13/9,pn/g,x11/7,s10,pi/d,x2/13,s8,x6/15,s3,pc/o,x11/13,s4,x10/15,s1,pp/d,x5/7,s15,x2/14,s5,x11/8,s7,x14/3,pb/o,x2/10,pd/h,s2,x9/5,pb/a,s9,x8/4,s13,x7/1,pc/o,x6/12,s1,x11/0,s6,x8/5,s15,pi/g,x14/3,pb/o,x1/2,s12,x5/7,pc/i,x6/4,pg/p,x8/12,s1,x7/11,s4,x9/2,s13,x8/7,s12,x2/1,pm/l,x12/8,pc/p,x1/10,s12,x6/2,s9,x0/7,s6,x8/1,s14,x0/11,s9,x7/9,pj/b,x15/8,pk/o,x2/6,s6,x11/12,s3,x2/0,s8,x12/6,pm/a,x3/14,s6,x10/5,pl/c,x1/11,pe/h,s1,x6/3,pn/i,x11/2,s5,x9/13,s12,x5/0,pe/d,x7/6,ph/b,x5/12,s5,x7/4,s3,x1/6,pf/l,x13/4,s6,x12/7,pn/c,s2,pf/b,x0/11,s13,x12/6,pn/c,x1/8,s7,x2/7,pl/g,x3/8,s4,x9/2,s13,x3/10,s6,x13/4,s10,x0/2,s8,x7/11,ph/a,x12/10,s7,x3/8,s6,x15/1,s4,x4/13,s12,x0/7,s4,x5/13,s4,x7/6,pb/f,x13/2,s12,x7/0,s10,x12/15,pm/o,x6/3,s15,x10/0,pg/d,x13/11,s12,x15/9,po/j,x11/12,pl/h,x1/14,s14,x11/7,s12,x1/6,s3,x14/0,s7,x5/10,s8,x14/2,pb/g,x13/15,s15,x3/1,s4,x12/7,pn/e,x1/11,s10,x13/15,ph/d,x8/6,s5,x7/10,s8,x2/8,s1,x15/11,pl/k,s14,x8/1,s4,x11/13,pe/n,s6,x12/5,s12,x14/2,s10,x8/6,pj/h,x13/2,s10,pl/e,x5/10,pa/i,x9/1,pp/n,s14,x12/2,s10,x14/4,s4,x11/12,s4,x13/0,pb/d,s8,x7/1,pm/e,s3,x6/8,s15,x0/2,s8,x7/4,pp/c,x0/12,s2,x8/2,s7,pd/a,x3/1,pm/b,x11/5,pd/n,x4/2,pm/k,x0/9,pf/b,x13/4,pe/g,x1/12,s13,x3/15,s5,x0/10,s3,pf/b,x9/13,pd/e,s3,x15/1,pi/o,x6/3,s1,x9/13,pc/a,x7/8,s6,x11/12,s13,x2/15,s4,x4/13,s8,x0/7,s8,x11/6,s6,pm/g,x9/12,s9,x7/11,s4,x9/6,s5,x14/13,s7,x5/0,s15,pf/j,x14/2,s9,x6/7,s8,x10/2,s6,x11/0,pg/b,x8/13,s4,x6/14,s1,pp/k,x11/3,pf/c,x4/2,pn/h,x10/13,pj/b,x12/6,s6,x15/0,s14,x1/12,pg/k,x15/7,s15,x2/13,s8,x4/3,pa/c,x13/12,s3,x14/10,s6,x12/11,s4,x10/15,s8,x8/1,pn/i,x10/2,s7,x0/6,s13,x3/10,pa/e,x14/4,pn/m,x12/5,s8,x4/2,pk/i,x12/11,pd/l,x7/3,ph/b,x12/14,pm/n,x11/1,s5,x7/8,s10,x6/1,pc/f,x7/14,s6,x3/4,s5,x12/1,ph/n,x13/15,pk/i,x14/11,pf/b,s10,x8/5,s7,x9/10,s2,x8/6,pc/p,x4/14,pn/d,x12/15,s13,x7/0,s14,x6/5,s7,x1/13,pb/k,x14/10,s12,x13/0,pc/j,x2/7,s1,pf/a,x11/13,s12,x7/1,s1,x15/12,pp/i,s14,x13/9,s2,pn/d,x3/4,pl/m,x0/14,pb/e,x8/10,s13,x13/1,s2,x11/3,s8,x10/12,s6,x0/15,pg/a,x10/3,s10,x8/1,pj/i,x10/13,s1,x5/1,s4,x6/8,s15,x3/10,s5,x15/14,pc/l,x3/8,pe/o,x0/14,s15,x3/12,pp/d,s3,x1/7,s3,x12/4,pi/k,x14/10,ph/l,x15/2,pd/f,x10/4,s1,x14/5,pe/c,x11/3,s8,pn/a,x15/13,pl/g,x7/5,pm/p,x9/3,pc/j,x4/0,pl/i,x8/14,pg/b,x0/9,s15,po/d,x6/7,pl/m,x13/9,s4,x14/0,pn/k,x11/10,pc/l,x6/0,s2,x3/5,pp/b,x7/15,pd/l,s12,x13/12,pf/e,x0/2,s3,x11/3,pl/o,x10/6,s15,x11/13,s1,x8/3,s1,pg/f,x4/0,s15,x13/3,s10,x0/2,s10,x13/4,s9,x3/14,s11,pk/c,x2/15,pm/d,x13/10,s14,x0/14,s12,x8/3,s6,x14/6,ph/e,x13/7,s10,x1/14,s13,x15/13,s10,x0/2,s12,x6/5,s14,x8/14,s10,x0/7,s6,x8/1,pa/k,x0/4,pd/f,x3/6,s12,x10/7,s10,x12/0,s13,x5/14,s8,x2/15,pa/l,x0/1,pj/b,x7/3,s5,pg/l,x12/4,pn/a,x5/3,pi/e,x7/1,po/j,x4/10,s15,pi/d,x15/7,pj/k,x0/9,pm/n,x2/1,s11,x7/14,s11,x5/9,s3,x3/12,s15,x8/2,s15,x12/5,pd/l,x15/9,s10,pa/j,x8/12,s12,x7/5,pl/i,x0/14,s10,x1/7,pk/e,x5/0,s1,x2/13,pf/l,x5/8,pg/h,x3/7,s5,x15/0,s13,pk/j,x11/5,pb/h,x2/14,s14,x13/12,pf/j,x9/6,s12,x2/0,s11,x3/6,s11,x14/0,pi/o,x9/7,s5,x13/0,s2,pd/n,x5/1,s12,x12/8,pc/h,x9/7,s14,x12/0,s3,x5/6,s11,x12/10,s10,x15/3,s12,x13/12,pl/o,x0/15,s3,x1/7,pf/a,x5/2,pg/m,s9,x9/1,s15,x11/3,pd/n,x9/2,s5,x12/8,po/e,x5/2,s2,pi/g,x7/0,pl/k,x3/11,s10,x15/7,s9,x9/3,s6,x0/12,pe/d,x10/8,s2,x4/5,pk/b,x0/3,po/c,x12/7,pj/n,x2/4,pg/i,s10,x15/0,pp/n,x14/8,pg/a,s11,x4/12,s11,x5/8,pj/c,s11,x1/3,s5,x13/14,s15,x15/5,pa/e,x2/12,s5,x1/8,s1,x12/9,pd/c,s12,x7/5,pk/m,s7,x10/15,s5,x1/2,ph/p,x0/7,pj/o,x14/12,s13,x9/15,s13,x6/2,pl/a,x3/8,s1,x7/11,s6,x2/8,pe/m,x0/11,pf/b,s1,x1/14,pk/h,x5/0,s6,x12/6,pn/f,x8/5,s5,x13/10,pb/m,x6/11,s6,x4/10,pf/a,x12/15,s9,x1/4,s2,x7/15,s1,x2/0,s6,x13/14,pl/c,s9,x7/4,pm/f,x6/5,s3,x3/0,pb/l,x14/4,s5,x15/9,s1,x7/3,s11,x12/0,s6,x9/2,pk/d,x13/15,s13,x14/9,s1,x15/2,pp/j,x11/3,s6,x2/4,s9,x1/9,s2,x11/13,s11,x4/7,s8,x2/12,po/n,x6/14,pm/p,x4/10,s3,x5/2,pk/i,x0/15,pj/a,x7/12,s4,x2/11,s15,x15/13,s12,x9/5,s6,x12/2,s7,x9/15,s13,x1/14,s14,x8/6,s5,x13/11,s15,x8/10,pk/g,x12/3,s1,x7/0,s15,x9/3,pm/a,x14/7,s13,x3/2,s6,x1/10,pk/h,x8/2,s9,x4/1,s2,x3/9,s12,x2/11,s7,x13/14,pf/n,x3/6,s9,x5/2,pc/o,x11/12,pb/a,s4,x6/3,pl/f,x15/13,pd/i,x11/5,s6,x6/12,pm/g,x14/9,s4,x5/2,s3,x10/3,s13,x11/12,pj/p,x10/6,s13,x4/7,pd/b,x2/9,pl/c,x4/13,s15,x15/3,pm/h,x9/6,s13,x7/1,pa/b,x9/14,s15,x3/15,s13,x6/13,s7,x1/7,s7,x6/4,ph/o,x1/14,pg/f,x6/4,s1,x13/9,s14,x10/1,s5,x11/13,ph/o,x0/10,pb/k,x13/3,pp/a,s4,x14/1,s8,x2/15,s8,pf/g,x3/11,s10,x1/9,s7,x4/0,s3,x7/9,pe/m,x6/2,pa/c,x7/15,s8,x1/0,pp/j,x2/3,s1,x6/11,pe/i,x8/15,s12,x1/13,s9,x9/10,pk/d,s4,x12/11,pj/c,x15/5,s6,x14/7,s11,x2/1,s13,x13/4,s3,x2/7,s7,x14/4,s15,x9/6,s12,x12/8,s4,x7/11,s7,x5/12,pg/f,x0/10,pn/j,x14/12,s1,pc/a,x4/11,pf/d,s1,x8/5,pk/i,x13/7,s13,x4/3,s15,pa/b,x6/12,pc/m,s8,x1/8,s13,x13/5,s13,x14/4,pf/e,x7/15,pn/i,x9/11,s1,x8/5,s10,x2/13,s14,x0/5,s5,x11/9,s11,x0/7,s13,x12/2,s15,x8/7,pb/g,s1,x1/14,s3,x10/15,s4,pk/e,s7,x0/12,pn/l,s3,x14/3,pk/m,x10/4,pf/i,s9,x7/2,pg/n,x11/10,s7,x2/8,pb/a,s15,x1/13,pj/g,x7/6,s8,pn/o,x9/8,s15,x10/6,s11,x3/15,s8,x10/7,s7,x9/11,s6,pi/b,x13/15,s13,x6/9,s9,x15/3,s2,x13/11,po/g,x14/15,s3,x2/13,s7,x0/12,s2,x6/5,s12,x3/0,pp/m,x15/12,pn/a,x14/5,s4,x0/11,s2,x6/3,s6,x4/2,s11,pf/j,x10/1,s2,x3/12,pc/p,x11/7,pk/m,x10/6,pa/c,x7/4,po/j,x14/5,pa/g,x0/1,s5,x10/9,s2,x15/6,s6,x10/13,s2,x3/8,pm/e,x13/1,pn/h,x8/12,s15,x14/3,pb/p,x4/5,s1,x13/10,pj/n,x15/11,s11,x10/3,pl/d,x6/12,ph/o,x14/0,s7,x1/10,s2,x5/13,pj/n,x10/2,pf/b,x13/0,s1,x9/10,pe/d,x6/3,s14,x9/10,pk/b,x2/5,pa/o,x13/15,pe/n,s10,x11/3,s9,x6/12,s2,pc/l,x8/15,s7,po/i,x1/11,s12,x4/0,pp/c,s2,x10/14,pi/b,s9,x2/0,s12,pj/o,x3/13,s8,x0/8,s8,pf/p,x6/10,s8,x13/7,s15,ph/m,s13,x3/5,pk/g,x11/8,s1,x4/6,ph/c,x12/8,pk/o,x3/4,s14,x15/10,s6,x8/0,pl/m,x10/3,pf/k,s11,x6/15,s12,x7/13,pp/d,x10/4,s10,pa/b,x9/3,s12,x6/4,pe/f,x11/14,po/n,x4/6,s10,x3/15,pj/m,s7,x9/14,s2,x10/0,s10,x7/11,pn/k,x0/3,pm/a,x8/6,s1,x9/1,po/j,x12/6,pa/h,x10/15,pd/i,x2/0,pa/m,x12/14,pi/n,x4/8,pk/c,x3/14,pd/g,x5/1,pl/a,x14/2,s3,x7/3,po/j,x14/12,pp/m,s2,x9/5,pc/h,x15/2,pm/g,x13/8,s1,x4/3,s2,x11/1,s1,x12/7,s9,x10/14,pi/j,x7/13,s13,x1/8,s15,x0/6,s1,x5/14,s3,x13/10,pd/h,x8/6,pj/o,s14,x9/14,ph/b,s9,x13/15,pe/k,x8/0,s4,x2/6,pf/h,x5/13,s10,pi/a,x0/8,s2,x9/2,s8,x14/5,s10,x6/12,s13,x8/11,pf/l,x13/3,s9,x7/12,s7,x9/8,s6,x7/0,pd/a,x14/12,pj/g,x9/0,s9,x14/1,pc/i,x2/0,s2,x15/10,pg/f,x9/0,s1,x6/3,pn/d,x7/12,pi/a,x6/3,pd/m,s12,x9/10,s5,pl/c,x4/11,s14,x5/9,s10,x0/4,pi/f,x3/7,s15,x2/0,s14,x1/4,pj/g,x11/8,pi/c,x15/9,s7,x1/14,s1,x6/2,pk/p,s4,x1/3,s15,x11/10,s9,x0/13,s7,x10/3,s7,x9/15,pe/d,x2/6,pi/c,x14/12,s3,pn/o,x0/10,ph/f,x6/9,s4,x5/4,pd/m,x11/6,pc/b,x3/4,s1,x6/8,pl/o,x12/9,s7,x8/7,s5,x11/15,s4,x14/7,s3,x0/9,ph/a,x7/14,s1,x12/15,s13,x10/11,s1,x0/4,pk/n,s9,x15/13,po/f,x7/11,s15,x10/0,pi/p,x14/11,pa/h,x1/0,pb/o,x6/14,pm/j,x4/13,s13,x12/6,s13,x13/15,s1,x6/14,s13,x0/12,pn/f,x7/14,s9,x9/3,po/d,x6/4,s7,x10/14,s4,pa/k,x6/7,s12,x1/5,s9,x14/3,pi/p,x10/1,pd/c,x8/9,pi/l,s8,x2/3,s1,x8/9,s9,x5/1,s14,x11/15,pa/j,x8/1,pd/k,x12/3,s12,x2/9,s8,x7/6,s14,x11/13,pf/h,x9/0,s5,x7/13,pm/o,x5/15,pf/a,x10/11,s6,x6/14,po/g,x1/4,pa/c,x14/8,s3,x5/4,pp/g,x13/9,pa/c,x15/7,s8,x8/11,ph/g,s6,pk/m,s2,x5/4,pe/c,x8/13,pg/o,x3/11,pm/f,x6/5,pn/g,x13/12,s10,x14/1,s11,x12/6,pa/m,x10/4,s7,x0/12,s12,x9/3,ph/e,x6/5,s1,pf/d,x8/10,s7,x5/14,s9,x11/2,pi/n,x3/15,pp/c,x7/5,s11,pe/l,x2/15,po/f,x9/6,s8,x2/7,pa/m,x5/6,s11,x8/15,s14,x14/9,po/f,x1/2,s1,x4/0,s1,x1/7,s12,x8/14,pe/k,x12/6,s2,x7/13,s5,x4/11,pj/b,x9/12,s13,x0/8,pf/g,x14/5,pc/a,x3/4,s1,x1/14,s4,x2/11,s7,x14/7,s11,x13/1,s6,x4/11,s15,pe/j,x13/3,pm/p,x15/10,s7,x8/11,pc/j,x1/14,s11,x10/7,s11,x2/9,s4,x14/12,pm/p,s8,x2/10,s14,x11/9,pl/a,s4,x8/6,s9,x4/9,s8,x13/14,pk/i,x9/1,s15,x2/15,pj/l,x11/10,s1,x14/7,s8,x13/15,s1,x4/5,s10,x11/1,pf/i,x10/7,pl/d,x9/6,s9,x4/14,pp/c,s14,x13/11,pa/f,x1/15,pp/c,x7/12,pa/l,x2/14,s10,x4/10,pj/f,x2/6,s14,x14/8,pd/h,x11/0,s1,x1/2,s7,x9/6,s14,x12/8,s10,pg/o,s4,x4/2,pn/b,x11/7,pj/k,x14/6,s6,x3/2,s3,x10/11,pb/c,x2/1,s4,x15/14,pk/g,s6,x13/4,pm/n,x0/14,s14,x5/15,s11,x1/2,s7,x6/14,s13,x13/9,s7,x4/2,s11,x3/13,s7,x14/9,s4,x10/11,s2,x5/7,s4,x13/0,s12,x2/15,pa/j,s11,x12/7,s8,x13/2,pm/p,x11/14,pi/h,x6/0,pg/c,x3/1,pd/i,s3,pk/l,s10,x5/15,s6,x6/8,s12,x13/15,s4,x6/2,s5,x8/1,pa/f,x5/13,po/e,s14,x9/15,s12,x0/3,s1,x11/7,pb/g,x10/12,pi/a,x0/11,pl/j,x6/3,s10,x15/13,s15,x8/14,pf/i,x1/13,pb/p,x15/14,pm/h,x9/11,s1,x7/15,s5,x4/13,s3,x3/15,pc/n,x13/14,s14,x9/15,pk/b,x10/12,s14,x9/1,s14,po/h,s6,x8/3,pp/l,x6/1,pc/j,s15,x5/11,s8,x7/8,pa/o,x9/5,s12,x15/7,s5,x6/1,s15,x13/7,s14,x5/6,pf/g,x2/9,s9,pm/j,x6/11,s12,x2/15,pl/f,x14/7,pn/k,x9/3,s9,x10/6,s1,x15/0,s2,x2/4,s15,x8/14,s10,x5/4,s9,x0/11,pa/b,x12/3,s8,x8/5,pp/n,x14/2,s9,x6/0,pb/g,x8/14,s12,x2/9,s5,x15/10,pd/o,x8/2,pg/j,s5,x0/14,s3,x2/11,s3,x10/0,s5,x4/13,pm/f,x3/6,s8,x7/8,s6,x5/4,s14,x7/11,s1,pg/k,x15/4,s2,x1/13,po/f,x2/14,pg/k,x1/10,s2,x13/6,s1,x4/15,pl/o,x9/13,s8,x10/1,s3,x7/12,s3,x4/14,s9,x6/11,s7,x1/0,pi/k,x9/8,s2,x6/2,s3,x13/4,s8,x5/9,s4,x10/12,po/d,x8/6,s15,x15/1,pa/j,x2/5,pn/h,x1/11,pf/j,x2/6,s2,x7/0,ph/e,x13/4,s2,x10/3,pf/d,x13/5,s12,x12/10,s7,x14/3,pg/m,x11/7,ph/o,x14/15,s14,x4/5,s2,x0/8,s7,pf/c,x3/13,s1,x6/15,s10,x13/12,s6,x5/8,s2,x3/4,s6,x8/7,pm/e,x13/14,pp/j,x3/5,s7,x8/0,pe/b,x5/7,pc/g,x13/14,pb/o,x9/12,s13,x1/13,pe/h,x7/8,po/c,s10,x12/15,s1,x3/4,pb/a,s13,x1/5,s14,x14/8,pd/j,x3/6,s7,pc/a,x0/9,pj/k,x14/6,s12,x0/11,s5,x1/13,pl/c,s7,x11/14,pj/f,x3/15,s5,x8/2,pd/g,x0/1,s6,x3/15,s13,x12/4,s3,pa/e,x8/7,s9,x0/6,s5,x7/8,pi/h,s6,x13/4,s1,x0/11,pe/m,x1/4,pk/i,x8/6,s7,x13/14,s2,x9/8,s15,x2/1,s14,x7/13,pb/h,x14/0,pg/m,x13/15,s13,x7/12,s6,x11/13,s13,x7/4,s10,x15/13,s3,x7/12,s6,x0/13,s9,x6/9,s13,x8/15,s3,x6/1,s8,x14/3,s5,x11/7,pb/k,s3,x15/9,s2,pl/p,x4/14,s7,x10/5,s13,x4/8,s6,x6/13,s9,x3/9,s5,x7/10,pa/c,x6/14,pe/l,s12,x1/7,pa/j,x11/0,s13,ph/n,x14/4,pj/p,x2/11,pl/f,x7/0,s3,pk/d,x6/8,s3,x7/0,pc/l,s5,x14/1,s7,x9/8,s13,x1/7,pg/e,x12/11,s5,x15/3,pa/o,s1,x2/7,s2,pp/e,x14/8,s12,x6/12,ph/b,x1/7,s13,x15/9,s11,x14/13,pk/p,x12/2,s8,x4/14,s1,x2/10,pl/o,x1/4,s5,x12/15,pc/f,x0/3,s13,x9/12,s6,x3/5,s6,x9/1,s5,x5/2,s3,x10/3,pb/k,x8/15,s9,x4/14,pj/c,x11/8,s14,x4/13,pm/e,x10/1,pd/o,x11/12,pa/b,x9/2,s6,x3/12,s13,x11/9,s6,x15/1,s11,x4/9,po/k,x0/2,pf/h,x15/9,s5,x8/1,s4,x14/13,s6,x10/6,pb/o,s4,x12/15,pe/g,x10/3,s3,x0/13,pk/o,x12/14,s4,x6/2,s12,x14/3,pj/i,x2/12,pd/g,x1/7,s6,x14/4,s5,x5/1,pb/j,x14/9,s8,x4/11,s12,x10/8,s12,x0/5,po/k,x9/13,s8,pi/a,x1/5,s8,x10/11,pm/j,s14,x8/13,s12,x4/5,s3,x12/13,pg/l,x10/7,pp/n,x5/0,s4,x12/1,pe/j,x11/4,s1,x14/8,pf/c,x1/12,pi/g,x5/15,s4,x13/8,pc/b,x15/4,pa/k,s6,x5/7,pf/g,x15/2,s11,x6/7,s4,x8/11,s11,ph/j,x9/3,s3,x15/8,pe/k,x14/12,s9,x4/5,s14,x3/7,pa/p,x14/0,pn/j,x4/8,pf/e,x6/9,ph/j,x7/13,s5,x0/12,s6,pf/k,x10/6,s3,x13/4,pa/l,x11/12,pg/j,x1/15,s2,x0/2,s13,x13/5,pc/o,x7/4,pf/p,x2/8,s7,x10/12,s13,x13/1,pl/m,x8/4,s15,x15/1,po/p,x10/3,s8,x6/2,pm/l,x12/3,pi/e,s3,x11/1,s7,x12/3,pd/o,x13/5,s14,x3/4,s12,x12/1,s9,x2/4,s5,x12/14,ph/l,x3/2,pn/p,x7/1,s5,pm/h,x2/5,pn/j,x8/12,pe/p,s13,x7/1,s12,x8/2,s12,x14/4,s1,x12/3,s14,x11/8,pd/c,x7/13,s10,x15/10,s5,x5/14,s3,x13/2,pf/n,x14/1,s11,x12/6,s5,x4/2,pl/c,x8/3,pa/j,x5/12,pi/p,x11/10,s4,x0/1,s4,x13/14,pd/f,x6/11,s3,x9/2,po/b,x4/6,pd/p,x3/5,s7,x7/12,ph/m,x8/13,pd/j,x11/15,pi/c,s13,pd/g,x7/14,s7,x11/9,s15,x14/13,s5,x6/7,s14,x8/10,pi/m,x5/2,pa/j,x4/3,s8,x15/13,pf/h,x5/7,s14,x12/9,s9,x10/4,pj/d,x15/5,s3,x14/11,s1,x4/0,s5,x2/11,pl/n,x15/6,s10,x9/2,s12,x12/13,s5,x4/1,s9,x12/7,s4,x0/9,s9,x12/6,s11,x1/10,s5,x11/12,s7,x9/7,s1,x15/5,pb/h,x3/1,pa/i,x8/6,s6,x7/13,s10,x3/12,s8,x15/9,pj/f,x6/3,s6,pn/i,x7/2,s12,x6/14,s7,x3/7,po/c,s5,x9/14,pi/l,x11/0,s12,x8/12,s9,x1/7,pc/b,x12/4,s5,x1/14,s5,x4/9,s12,x6/0,s13,x11/7,pl/d,x4/2,pj/h,x10/6,s5,x14/5,s9,x9/12,s9,x14/15,s7,x7/5,pm/l,x9/4,pn/p,x8/6,s11,x3/12,pb/e,x8/15,s14,x2/13,s12,x0/8,pi/k,x12/7,pl/j,x10/6,po/h,x3/14,s2,x2/13,s10,x1/15,s3,x12/10,pb/k,x14/4,s7,x6/12,s12,x3/9,pl/p,x8/14,s14,x2/11,s15,pj/a,x4/1,po/b,x0/10,s11,x8/5,pc/l,x7/12,s13,x4/15,pk/p,x11/6,s12,x2/5,pa/d,x13/8,s13,x1/10,po/m,x2/12,pp/c,s15,x14/5,s10,x1/0,s6,x15/12,po/k,x8/0,s5,pd/p,x6/13,s6,x1/7,pe/m,x9/11,s3,x14/8,pp/g,x11/3,s3,pe/n,x0/5,pd/l,x6/4,pp/m,x0/9,pe/f,x7/14,s9,x9/1,s6,x0/2,s6,x3/15,s14,x6/5,s3,x14/15,s11,x8/5,s7,x10/9,s14,x12/14,pk/m,x9/1,pl/p,x11/7,s4,x13/12,po/h,s11,x5/3,pf/d,x1/13,pa/c,x4/3,s5,x8/1,s4,pj/g,x14/4,s12,x10/6,s12,x14/11,s1,x8/3,po/d,x0/9,s9,x12/1,pc/m,x6/13,pi/o,x14/2,pj/k,x15/9,s3,x11/6,s6,x1/2,s8,x4/13,s5,pe/f,s8,x3/15,s9,x2/1,s4,x8/14,pd/c,x7/1,ph/m,x5/11,s2,x4/3,pn/k,x5/1,pb/f,x15/6,s1,x7/14,s2,x0/6,pe/g,x10/1,pd/c,x6/13,s7,x1/4,pk/h,x9/12,s15,x6/11,pi/m,x1/15,pd/l,x0/14,s14,x12/10,pn/f,x7/1,s13,x4/5,po/m,x14/1,pn/l,x12/3,pb/o,x10/13,s12,x0/6,s14,x8/1,s7,x2/14,pg/j,s13,x9/12,s15,x11/7,s6,x8/2,pn/h,x0/5,pm/k,x8/13,ph/i,x7/5,pl/j,x11/10,s1,x8/14,po/e,s13,pf/k,x1/11,pg/e,x9/10,s6,x14/13,pi/b,x2/7,s12,x13/3,s4,x7/9,s2,x12/14,s8,x13/11,s9,x14/8,pn/m,x1/15,s9,x3/0,s12,x2/14,s7,x0/12,s2,x1/13,s13,x15/8,s10,x10/4,s3,x9/5,pf/a,x8/7,pe/j,x6/10,s5,pl/k,x13/14,pf/i,x11/8,pp/g,x15/10,pb/c,x3/12,pn/l,x9/11,pb/a,x6/0,pc/j,x15/13,s2,pa/f,x5/0,s9,x10/8,pd/e,s10,x13/14,s10,x9/0,s6,x2/15,s13,x12/7,s3,x0/1,pb/k,s9,x8/2,pg/p,x10/7,s6,x12/6,s2,x8/3,s9,x6/4,s14,x1/0,pe/c,x13/10,pa/p,x14/2,pl/i,x13/5,s2,x4/10,pc/p,s6,x6/5,s14,x3/10,pn/o,x7/1,pa/d,x8/15,pj/b,x3/12,pm/h,s6,x0/15,po/g,x8/13,s9,pi/h,x12/6,s12,x13/3,s14,x7/9,s13,x5/11,po/l,x1/3,s13,pi/g,x8/4,pa/b,x10/13,s14,x2/8,s11,x11/9,s14,x13/12,s15,x6/15,s1,x7/8,pf/j,x14/5,pg/n,x11/1,s1,x3/13,s14,x9/1,s15,x11/7,pd/j,x0/12,s12,x13/7,s11,pc/k,s12,x8/10,s1,x4/13,s12,x12/14,s4,x10/5,pm/g,x14/0,pn/e,x8/4,pp/d,x15/6,s3,x0/12,pa/c,x3/13,s14,x14/4,s3,pl/g,s2,x15/8,s15,x10/14,s8,pk/i,s2,x8/2,s8,x9/7,pm/b,x8/0,pi/d,s6,x6/1,pf/n,x0/14,s4,x10/1,s6,x14/11,s8,pa/g,x15/1,ph/i,x12/14,s3,x2/13,s10,x1/3,s14,x12/2,s3,x6/3,s1,x13/8,s14,pa/m,x2/9,pj/h,x4/15,pe/p,x3/13,pj/a,x1/14,pm/n,x8/13,s2,x12/11,s14,x8/2,s9,x15/1,s10,x10/12,s13,x13/1,s4,x7/0,s1,x8/11,s7,x14/15,s13,x13/3,s13,x6/2,pb/d,x3/10,pp/n,x6/5,s1,x4/3,s6,x1/0,pc/h,x15/9,s12,x7/2,s2,x10/9,s7,x7/15,pl/e,s11,x8/10,s9,x15/14,pk/n,x3/6,s8,x15/0,pf/m,x14/10,s10,x8/9,s1,x6/5,ph/i,x4/8,s8,x15/7,po/f,x8/11,pa/p,x0/12,po/h,s6,x4/6,s10,x0/15,pi/a,x7/8,s11,x11/6,s10,pm/c,s8,x8/12,pg/d,x10/1,s4,x4/15,pf/l,x9/8,s6,x14/10,s2,x12/1,pa/g,x14/7,s9,x4/6,s15,x10/0,pe/f,x11/2,s9,x12/4,s3,x3/5,s1,x9/10,s13,x6/12,pm/j,x9/3,pp/f,x15/14,s13,x7/10,pb/j,s1,x5/6,s12,x10/12,s15,x9/14,s12,x1/2,s5,x7/0,s3,x5/15,s12,x6/10,s3,x0/4,s5,x10/3,s5,x6/0,s15,po/e,x3/11,s14,x13/1,s15,x4/6,s5,x12/2,pj/i,x4/8,pg/a,x13/7,s1,x8/15,po/l,x9/13,pf/g,x7/10,pc/n,x11/5,s8,x7/0,pp/b,x8/14,s7,x13/11,s7,x10/8,s8,ph/o,s3,x9/11,s10,x12/6,pn/c,x0/9,pf/p,x14/4,pj/l,x6/3,s7,x13/5,s12,pg/k,x9/14,ph/i,x6/10,pg/a,x9/3,pl/f,x4/15,s8,x9/13,s8,x6/0,s13,x1/11,s4,x15/10,ph/a,x5/3,s1,x7/9,pd/o,x12/8,s2,x13/14,pj/f,x11/9,s7,ph/m,x15/5,pd/i,x3/13,pm/j,x2/4,s8,x3/6,s10,x12/5,s6,x8/13,s14,x4/7,s11,pk/a,x5/9,s11,pc/g,x11/14,pn/a,x12/8,s7,x4/6,s12,x1/9,pp/k,x11/13,s4,x3/7,s15,x15/11,s7,x2/7,pn/i,x14/15,pc/f,x4/2,pi/j,x5/9,po/c,x11/2,pi/l,x9/10,s1,pk/o,x14/15,s10,x7/0,pl/a,s12,x6/13,pj/m,x11/7,s12,x13/3,s9,x7/9,s3,x2/15,s9,x8/11,pl/g,x7/1,pe/a,x6/11,pf/i,x14/2,s15,x11/6,s5,x14/2,pd/e,x15/6,s6,x0/10,pm/l,x8/12,pb/f,x10/15,s11,x1/5,s14,x9/4,ph/n,x13/11,s15,x4/0,pc/k,x11/10,pa/e,s1,x15/3,s8,x11/6,pn/p,x10/2,s15,x11/13,s6,x3/5,s14,x9/1,pk/j,x0/14,pm/o,x8/2,s4,x10/3,ph/d,x4/7,pp/k,x9/10,s1,po/b,x11/13,pp/k,x12/3,po/d,x13/10,pn/b,x5/2,po/g,x13/15,s5,x4/3,pf/l,x13/11,s7,x15/14,pe/h,x11/13,pa/l,x1/9,s8,x13/7,s15,x4/1,pe/o,x8/2,s8,x6/5,s10,x2/4,s12,x12/7,pb/g,s15,x2/14,pm/j,x7/15,s10,x3/4,s8,x8/15,s9,x9/0,pp/e,s14,x8/6,s5,pk/j,x12/9,pg/l,x1/6,s3,x15/2,s2,x11/1,pa/m,x6/14,s9,x1/10,pj/i,s7,pe/b,x6/15,s14,x7/12,s11,x11/15,pd/l,x5/12,pn/m,x8/6,s6,x10/11,s9,x1/8,pc/f,s8,x15/14,pb/n,x1/6,pj/g,x15/3,pe/d,x7/4,s2,x13/6,s10,x2/10,pi/f,x14/12,s9,x11/4,pb/k,x6/10,s14,x0/9,s13,x10/13,pi/g,s4,x4/12,pd/c,x14/11,s7,x10/8,pa/f,s10,x0/5,s10,x14/7,pn/e,x13/0,s7,x4/7,s10,x1/15,s3,x6/5,pf/j,x4/9,s13,x10/8,s3,x11/3,pm/e,x12/2,pb/i,x10/6,pl/h,s4,x15/5,s15,x4/14,s3,x12/3,s15,x13/9,pg/d,x14/5,s5,x8/15,s6,x11/14,pi/b,s1,x7/10,ph/e,s1,x1/8,s5,x10/2,s10,x14/6,s8,x0/2,pb/f,x15/9,s4,x11/5,pd/a,x12/7,s5,x13/4,pp/k,s9,pa/c,s12,x9/11,pe/l,x1/8,s6,x15/10,s7,x3/4,s12,x8/12,s7,x11/13,pn/k,x7/8,s2,x10/13,s14,x5/11,s14,x3/15,pd/b,s6,x9/6,pp/i,x0/11,pl/k,x15/6,pg/n,x4/9,s12,x0/10,ph/f,s3,pl/c,x2/14,s15,x9/0,po/j,x11/8,s9,x12/5,s1,x14/4,s15,x3/10,pe/l,x14/2,pf/n,x7/13,pm/j,x1/3,s5,x5/8,pf/a,s4,x10/2,pn/g,x9/11,s11,x6/7,s10,x10/9,pb/p,x1/4,po/c,x10/15,s3,x2/12,s3,x5/0,s13,x9/3,s13,x4/5,pd/b,x12/0,s4,x14/6,s6,x12/1,s10,x3/0,pi/m,x8/7,s9,x11/3,s13,x0/10,s6,x4/2,s8,x15/3,pf/d,x13/5,s15,po/e,s1,x0/8,pi/c,x1/4,pj/f,x13/9,s12,x15/2,s11,pm/a,x8/7,s10,x2/3,s9,x0/1,s5,x11/3,s1,x6/12,s11,pe/k,s7,x4/7,s8,x11/0,pn/m,x14/10,pp/o,x4/11,s7,x8/9,s12,x0/15,pd/b,x4/9,pc/i,x6/5,pd/e,s6,x14/3,s12,x7/8,s12,x5/1,pf/k,x3/11,s7,x0/7,s15,x12/8,s9,x0/7,s6,x1/9,pp/h,x14/10,pg/l,x15/13,s10,x4/5,s13,x11/13,s2,x0/3,s2,x15/4,s7,x10/14,s6,x0/12,s10,x4/9,pk/a,s11,x3/8,pe/d,x2/0,s14,x10/4,s1,x11/5,ph/n,x1/12,s14,x9/5,pm/i,x7/3,pb/h,x6/0,pa/g,x11/7,s12,x5/1,s12,x0/9,pk/o,x6/7,s2,x4/2,s11,x14/7,s4,x2/13,s13,x10/12,s1,x3/9,pb/f,x11/14,s13,x8/3,s9,pl/e,s5,x10/0,pi/c,x5/4,pa/o,x8/0,s6,pk/h,x15/6,pa/g,x5/10,s2,x0/1,s13,x7/2,s9,x15/10,s15,x13/2,pp/o,x4/6,pk/i,x1/13,pf/h,s15,x14/8,pb/p,x11/7,pl/f,x5/13,pa/e,x12/1,s3,x4/13,s12,x14/9,pm/k,x4/3,s10,pe/b,x15/1,s14,x5/10,pc/i,s14,x1/9,s8,x2/12,s7,x11/7,s13,x0/5,pm/e,x7/2,s12,pa/j,x4/5,s3,x8/11,s11,x13/9,s6,x14/7,s13,x6/15,s15,x7/8,s3,pk/e,s3,x1/2,pa/c,x13/15,s6,x12/3,ph/p,x9/11,s3,x0/15,s6,x12/13,pj/i,x6/4,pf/a,x2/11,s11,x5/7,s9,x1/11,s15,x8/14,pl/c,x0/11,pm/d,x3/9,s6,x14/12,pk/a,x0/4,s3,x7/2,s8,x10/5,s11,x12/1,s3,x14/13,s4,x3/4,ph/o,x14/1,s8,x4/13,s3,x12/9,pk/m,x7/6,s15,x1/2,s13,x6/12,s5,x5/2,s1,x10/1,s11,x6/2,pf/e,x12/14,s12,x7/0,pi/c,x4/13,pm/d,x15/1,s1,x12/9,s12,x4/10,s3,x6/15,s7,x10/11,pb/i,x3/9,s7,x8/1,s2,x6/7,pn/p,x8/1,s3,x6/13,po/c,s13,x2/3,pe/g,s15,x10/5,ph/d,s2,x7/15,pl/o,s8,x2/1,s6,pg/c,s10,x14/10,s11,x8/0,s6,x15/14,s12,x11/10,pl/i,x1/12,s15,x9/8,s2,x0/15,s4,x4/9,pn/j,x7/0,s12,x9/8,pi/p,s15,x7/11,pf/a,x10/2,s3,x4/7,s9,x6/12,s10,x2/13,s12,x7/9,ph/o,x4/12,s2,x10/11,pm/j,x7/1,pc/i,x4/12,pb/p,x13/7,s11,x10/4,s9,x9/2,pm/n,x3/11,s12,x14/4,pa/h,x5/1,pg/d,s13,x12/9,s7,x5/2,pi/l,x8/0,s8,pn/e,x3/14,pa/l,x12/2,pk/n,x8/3,pb/i,x1/11,s11,ph/j,x13/4,po/i,x9/6,pj/b,s9,x13/14,pc/l,x9/2,s4,x15/10,s8,x9/4,s14,x7/11,s6,pd/i,x6/8,pb/j,x4/13,pc/g,s13,x12/0,po/n,x13/3,s4,x2/8,pm/c,x1/11,pg/k,x5/0,s4,x14/10,pb/n,x8/7,pf/l,x6/9,s11,x8/4,s12,x0/9,s7,x14/2,s11,pe/a,x8/6,pn/k,x4/7,s8,x2/14,pm/o,s5,x10/0,s15,x14/2,s14,pa/n,x5/7,s1,x1/13,s11,x12/5,s4,x9/8,s8,x15/6,s2,x14/9,pk/c,x8/2,s5,x4/9,pd/l,x14/3,s8,x8/13,s7,x12/11,pk/b,s9,x7/10,pa/g,x2/13,pe/n,s11,x5/4,pg/i,x13/15,pn/p,x2/5,pl/e,x1/7,pd/b,x2/13,pi/a,x3/0,s6,pk/o,x2/10,pn/h,x1/3,s8,pc/e,x4/9,s6,x0/2,pd/l,x7/9,s15,x0/10,s7,x2/7,pg/j,x3/11,pe/l,x1/0,s6,x10/3,s12,x5/4,s11,x15/3,pi/g,x7/11,pb/n,s12,x1/6,s2,x3/14,s13,x0/10,s4,x8/13,s2,pi/a,x10/3,pm/p,x11/6,s2,x3/9,s2,x7/11,s2,x12/2,pl/g,x6/3,pb/m,x4/1,s11,x15/5,s5,x7/12,pp/l,x13/9,s12,x10/7,pg/n,s3,x4/3,s15,x8/13,pj/e,x14/9,pd/m,x7/8,s5,x11/3,pc/g,s12,x4/6,s11,x2/0,s7,x3/1,s6,x6/7,s13,x10/4,s6,x0/2,pb/j,x13/10,pg/h,x0/15,pc/a,x14/9,s4,x15/6,s4,x12/13,s13,x8/11,s13,x3/6,pg/e,x9/10,s12,x2/11,pj/a,x8/12,s13,x2/6,s14,x12/3,s11,x6/8,s12,x0/13,pp/b,x3/9,s12,x13/6,s3,x5/4,s3,x12/8,s8,x2/0,pc/m,x13/6,s5,x4/0,s14,pd/b,x13/6,s13,x1/10,s13,x13/0,pg/p,x4/14,pf/l,x11/12,s3,x2/15,s1,x5/14,s7,x0/7,s2,x3/9,s11,x7/5,s11,x15/2,pn/p,s9,x9/10,pj/b,x12/14,pn/c,x9/3,ph/m,x1/5,s3,x6/15,pe/d,x5/4,pk/j,x12/1,pa/c,x11/4,pm/h,x15/9,pi/j,x2/3,s5,x1/12,s4,x3/13,s6,x14/2,pb/p,x0/8,pa/o,x2/13,pk/f,x8/10,s10,x4/3,pe/m,x8/1,s1,x4/3,s7,x0/7,s11,x15/1,s3,x5/13,po/k,x15/10,s13,x0/2,s8,x14/5,s5,x1/8,s6,x13/6,s14,x14/1,pa/f,x8/6,pc/j,x10/13,pe/m,x6/0,pp/l,x12/9,s10,x10/3,s11,x9/11,pg/o,x7/14,s14,x12/1,s12,x4/7,s14,x11/10,s8,x7/13,s11,x5/12,s11,x13/14,pd/a,x5/6,pk/h,x12/1,s9,x9/10,s6,x3/4,pi/f,x8/13,s6,x2/10,po/e,x6/12,s5,x8/2,s10,x15/9,pa/m,x1/0,s15,x7/10,pi/n,x15/3,ph/c,x0/2,pk/n,x13/14,s11,x1/5,s7,x10/9,s7,x5/14,s4,x13/15,pa/f,x9/12,s3,x10/0,pp/j,x2/3,s12,x15/5,po/k,x0/7,pf/g,x9/4,pa/p,x0/10,pi/k,x2/14,s6,x15/3,pl/b,x5/14,s3,x0/9,s13,x8/1,s6,x13/2,pp/o,x11/10,s7,x4/13,s9,pe/c,x5/7,s10,x15/6,s5,x14/8,s14,x10/9,s12,x11/14,pg/l,s10,x6/15,s14,x7/13,pf/j,x0/12,s5,x13/2,s6,x12/14,pi/m,x7/5,s13,x6/11,pd/o,x1/10,s3,x14/7,pl/p,x1/13,s5,x8/7,s9,x15/0,s10,x3/4,s12,x13/10,pj/n,s1,x6/0,s11,x11/12,s11,x15/5,s1,x8/1,ph/i,x9/13,s7,x4/15,s2,x3/9,pn/g,x14/4,pl/k,x5/9,s6,x0/13,s4,x2/6,s2,x3/4,s8,x10/0,pi/g,x15/7,s13,x12/13,s7,x8/0,s14,x10/13,s4,x14/7,pe/c,s14,pn/g,x0/9,s4,x11/7,s1,x3/1,s12,x7/8,pc/i,x3/5,s3,x2/14,pe/g,x4/12,pc/i,x5/6,pd/a,s9,x14/8,s3,x12/0,s8,x1/15,pj/k,x13/7,pc/i,x10/11,s12,x5/3,pd/p,x11/0,pf/e,x12/15,po/l,x9/13,pd/i,x5/12,s3,x14/11,pg/h,s10,x10/1,pn/c,x9/7,s10,x3/10,s11,x6/9,s14,x12/4,s14,pg/d,x5/13,s5,x15/10,pm/n,x1/8,s3,x11/15,s1,x13/2,s10,x8/15,pb/f,s1,x14/11,pn/o,x9/12,s9,x8/5,s13,x11/13,pc/i,x12/14,s4,x0/7,s9,x13/6,pd/g,x10/9,po/c,x0/14,s14,x12/11,pb/d,x13/5,pi/a,x11/7,s9,x9/0,s13,x2/8,s2,x0/3,pj/e,x15/13,s9,x6/14,pl/h,x4/1,s3,x15/10,pe/a,x5/3,pn/b,x15/9,s10,x14/4,s9,x3/2,s14,x10/7,s7,x6/0,s6,x4/9,s8,x10/2,pj/m,x8/3,s9,x1/11,pe/b,x5/10,s11,x3/6,pg/j,x8/5,s13,x0/11,s5,x12/9,pm/p,x11/2,s4,x15/4,s11,x13/9,s10,x14/8,s12,x2/10,s7,x14/12,pj/i,x8/1,pn/h,x12/9,s13,x13/5,pi/p,x9/15,s9,x1/10,s8,x2/12,pd/j,x7/14,s15,x8/10,pp/a,x13/7,s13,x10/15,pm/b,x6/4,s10,x9/10,pc/j,x2/4,s11,x8/5,ph/m,x10/4,pk/g,x1/0,s15,x10/12,s10,x15/13,s10,pf/i,x12/3,s11,x7/15,pn/e,x8/14,pp/d,x15/10,s8,x7/5,s9,x13/10,s10,x11/3,s11,x7/12,s12,x4/15,s4,x5/2,ph/e,x8/0,s7,pd/k,x14/7,pp/i,x11/15,s9,x4/7,pc/g,x9/11,s9,x13/2,pi/k,x12/11,s8,x7/1,s1,x2/5,s10,pp/f,s13,x12/8,pl/e,s7,x13/0,s6,x9/7,s3,x15/0,s14,x6/1,pb/i,x5/8,s4,x10/3,ph/c,x14/1,pa/d,s15,x5/11,s12,x12/6,pj/f,x1/5,ph/m,s2,x4/11,s6,x7/15,s15,x4/6,pe/f,s12,x10/15,s2,x2/14,s6,x12/5,s9,x2/1,po/k,x15/13,s4,pm/d,s5,x8/7,s12,x5/0,ph/f,x14/9,pa/e,s3,x10/12,s10,x3/1,s13,x7/14,po/b,s7,x6/9,s3,x3/5,s4,x0/8,pe/a,x4/12,pi/g,x2/13,pb/c,s1,x8/4,s6,x15/1,pf/o,x6/12,s9,x2/9,s9,x6/13,s12,x3/8,s9,x0/6,s5,x2/8,s5,x11/3,s6,x4/13,s8,x1/12,s2,pn/d,x8/3,s12,x14/10,s5,x0/6,s2,x7/2,pl/m,x0/8,po/b,x15/1,pk/d,x4/13,pj/o,x10/3,pp/f,x12/7,pi/j,s8,x15/5,s14,x4/1,s2,po/m,x15/14,s12,x4/11,s4,x13/6,s2,x2/12,s3,x15/6,s14,x11/8,s8,x10/14,s2,x3/5,s9,x4/9,s15,x2/15,s6,x7/14,s10,x9/5,pf/l,x12/0,pc/g,x2/6,pd/p,s3,x0/12,s3,x8/7,s4,pa/f,x2/15,pg/b,s2,x4/11,s7,x10/1,s3,po/e,x0/8,pi/l,x2/14,pe/d,x5/0,s9,x12/8,s1,x2/0,s1,x8/10,s1,x4/3,s14,x8/10,s11,pb/c,x0/3,s10,x5/4,pn/k,x11/2,s3,x14/4,s9,x15/11,pc/e,x8/6,s4,x4/15,s1,x13/9,s2,pp/j,x3/10,s7,x9/13,pk/g,x4/2,po/d,x11/7,s1,x14/0,s8,x4/12,s2,x11/9,s1,x1/12,pm/i,s1,x13/2,po/g,x7/9,pl/k,x10/11,s10,pc/e,x1/13,pf/a,s14,x12/7,s7,pc/m,x15/8,s8,x12/11,s11,x3/0,pn/h,s11,pg/k,s2,x6/12,s3,x2/14,s15,x9/10,pm/p,x13/12,s9,x0/3,pg/o,x12/4,s6,x13/0,pa/n,x15/1,s9,x5/11,s12,x8/3,s13,x6/10,pg/k,x14/0,s13,x7/12,pf/b,x3/0,pj/d,x8/4,pn/m,x12/3,pa/k,x8/11,pd/p,s3,x6/2,s15,x14/13,s2,x8/0,s6,x6/9,pi/e,s14,x8/2,s11,x0/13,pb/j,s7,x10/14,s1,x13/1,pp/o,x6/7,s11,pm/c,s6,x9/0,s3,x8/4,s6,x9/12,s3,po/j,x11/7,s12,x4/12,pi/b,x0/15,pg/c,x11/2,s13,x8/4,pl/e,x10/13,pd/p,s8,x3/7,pg/m,x2/8,pb/a,x1/3,pi/k,x11/15,pf/a,x6/5,s8,x2/1,s7,x7/11,pg/d,x12/8,s1,x13/0,s12,x15/6,pi/o,x1/8,pj/p,x11/15,s8,pe/o,x7/10,s11,x15/5,s13,x14/0,pn/a,x6/13,s11,x7/0,pb/d,x6/9,pk/f,x12/3,pn/h,x2/15,pb/l,x12/7,pe/g,x9/4,pa/m,x8/13,pb/k,x14/4,pn/h,x12/8,pb/m,x14/0,pk/p,x8/10,pn/j,x6/12,s11,x5/2,pk/c,x6/0,s14,x1/9,pp/b,x11/13,s7,x7/1,s3,x2/11,s4,x9/5,s3,x3/2,s11,pc/d,x4/8,ph/j,x7/6,s10,x13/0,s10,pp/a,x2/1,pl/j,x7/4,pf/c,x13/5,s7,x2/0,po/b,x6/11,pl/j,x8/13,pa/o,s10,x10/6,s5,x13/0,s13,x15/7,pj/m,x2/13,pk/e,x10/11,s1,x12/8,s15,x7/3,pj/m,x10/2,pd/n,x9/1,s4,x8/13,s15,x4/1,s7,x10/7,pm/k,x5/14,s14,x13/12,pn/o,x1/8,s12,x7/11,pg/b,x14/1,s10,x7/11,s5,x14/12,po/h,x5/0,s3,x6/13,s9,pd/g,x0/5,ph/a,x3/2,s10,x11/8,s2,x4/13,pp/m,x9/1,pb/k,x3/15,s9,x10/4,pa/l,x6/5,s12,x15/10,s6,x1/3,s12,x6/12,s12,x14/4,s14,x9/0,pc/b,x2/1,pk/p,x5/6,s12,pd/l,s4,pa/m,s13,x3/14,s5,x2/13,pn/c,s1,x7/15,pd/e,x12/8,s12,pa/o,x0/10,ph/m,s7,x11/2,s11,pi/a,x6/1,pd/p,x5/13,pk/f,x1/10,s2,pm/p,x15/8,s3,x10/11,ph/n,x0/14,pd/f,x4/3,s8,x8/12,s11,x5/15,pc/p,x8/10,s15,x5/2,pk/a,x11/7,s15,x5/12,pd/i,x2/9,po/b,s15,x12/10,ph/j,x5/14,pm/c,x9/1,s5,x4/15,s9,x0/5,s11,x12/2,po/k,x14/4,s12,x12/10,s9,x11/14,s9,x0/2,s15,x8/1,pa/b,x6/11,pl/d,x8/15,pa/c,x12/0,pd/g,x8/14,s10,x11/13,s14,x4/8,pk/a,x11/3,s10,x15/13,s4,x12/10,pi/b,x0/7,pj/f,x6/14,s11,x13/11,s15,x10/15,s4,x7/5,s9,x4/12,s1,x13/8,s8,x15/9,s4,x8/10,pl/n,x14/11,s10,x10/7,s15,pd/g,x11/4,pe/i,x1/5,pk/m,x3/2,s13,x7/1,pc/a,s3,x9/10,s13,x12/14,s5,x7/8,po/k,s13,x5/10,s5,x0/11,s6,x7/13,s8,x8/3,pl/a,s6,pf/i,x10/1,s13,x0/9,pa/m,x11/13,s13,x9/8,s15,x14/13,pc/b,x9/15,pp/n,x1/6,s12,x8/7,s9,x5/10,s8,x6/15,pm/c,x12/2,s13,x15/1,s2,pf/g,s9,x11/14,s9,pp/h,x13/7,s13,x11/6,pa/c,x5/7,po/n,x1/3,s11,x6/14,s1,x8/11,ph/k,x6/7,s1,x5/0,pn/j,x1/14,pi/a,x10/3,pn/d,x4/8,s12,x11/3,s8,x2/1,s1,po/p,x3/9,s2,x8/11,s2,x2/6,s10,x7/5,s4,x15/8,s8,x2/14,pm/n,x6/12,s6,x13/1,s14,x8/3,pf/p,x0/4,pm/j,x12/10,s8,x15/8,s15,x14/6,s11,x15/12,s13,x14/10,s11,x1/9,s3,x11/12,s14,x8/15,s2,x1/9,s8,pc/a,x11/2,pd/h,x4/6,s14,x13/15,s15,x10/9,s9,x8/6,s1,x13/15,s12,x14/7,s12,x13/15,pa/o,x6/1,s5,x8/14,s2,x9/2,pm/l,s4,x3/7,s3,x13/10,s4,x11/7,pc/d,x6/14,s4,x13/5,s8,pl/a,s7,x6/9,pb/n,x5/0,s14,x6/13,s8,x0/9,s3,x5/8,s1,ph/d,x3/12,s11,x1/14,s6,x7/15,s12,x10/5,pj/c,x15/11,pa/b,x10/8,pm/c,x11/6,ph/d,x1/14,pp/k,x3/11,ph/o,x8/4,pp/j,x5/7,pd/h,x2/0,pm/n,x1/10,s14,x5/7,pa/h,x9/13,s14,x2/4,pi/f,x12/11,pn/m,x2/10,pl/o,x12/9,s14,x13/5,s13,x6/3,s1,x15/4,s4,pm/k,x0/9,pe/g,x5/14,pl/c,x10/1,s6,pi/k,x7/9,pl/d,x6/14,s15,x10/1,pa/h,x2/11,pb/c,x12/14,s10,x1/0,ph/p,x4/11,s6,x0/8,po/l,x13/14,s13,x2/6,s3,x8/13,s13,x2/0,pp/i,x1/15,s2,x13/10,pc/e,x8/4,pd/n,x5/3,po/g,x8/6,pl/h,s14,x13/15,s1,x12/1,pn/d,x2/6,s15,pc/g,x12/9,s4,x0/11,pd/a,x9/14,s11,x1/7,s4,x6/8,s3,x2/15,s9,x7/8,s3,x15/9,ph/g,x11/8,pk/i,x12/9,s4,x13/7,s14,x5/11,s3,x8/2,pp/o,x14/7,pf/h,s9,x2/1,pd/n,x11/3,s3,x8/15,s15,x5/13,pj/b,s5,x4/6,s1,x14/2,pk/a,s4,x9/10,pj/o,x2/1,pp/g,x12/4,s2,x6/7,pi/b,x1/11,s12,x8/3,ph/m,s5,x1/15,pk/c,x13/10,s7,x3/7,pl/d,x13/1,s15,x14/5,s1,x6/8,ph/e,x0/12,pc/o,x1/4,pe/f,x15/13,po/i,x4/9,pc/e,x15/2,s8,x7/3,pp/b,s2,x8/4,pn/d,x13/14,po/j,x2/8,s6,x13/3,s11,x9/12,s6,x3/6,s12,x13/14,s7,x10/15,pa/p,s12,x11/5,s6,x1/14,pk/d,s8,x11/5,pg/m,s7,x3/2,pk/o,x11/12,s1,x5/4,pm/l,s6,x9/13,pe/n,s15,x14/12,pc/i,x4/10,s15,x0/13,pf/k,x5/3,pe/d,x10/2,s4,x14/3,s5,po/l,x5/4,s12,x15/3,pg/f,x14/9,s9,x6/1,pb/p,x4/3,pe/g,x2/15,s13,x1/10,s11,x15/5,pk/h,x0/7,pa/n,x1/12,s14,x14/7,pl/c,x6/0,s9,x12/8,s13,x3/14,s4,x10/1,s15,x15/6,po/h,x10/9,s14,x5/3,pe/m,x9/7,s8,x11/0,s1,x14/3,s6,x5/8,s5,x1/15,s5,x11/3,s3,x0/9,s1,x3/14,s9,x2/1,s5,x13/15,s13,x9/3,s13,x13/15,s9,x5/4,pf/d,x11/3,s12,x2/14,pi/g,x6/0,pl/c,x5/11,s6,x6/12,s1,x3/5,pa/h,x1/12,pj/k,s5,x7/11,s12,x10/6,pl/c,x2/9,s4,x10/11,pb/d,x12/14,s15,x15/9,pi/j,x3/12,pb/k,x6/5,s13,x8/12,s9,pd/l,x10/2,s8,x11/15,s5,x5/2,pc/g,x3/12,s4,x7/1,pl/f,x15/4,s6,x2/0,pd/n,x12/11,pb/l,x13/3,po/i,x2/1,pl/a,x5/9,s5,x8/10,s10,x14/3,s12,x12/11,s6,x15/3,s3,x13/14,pi/f,s13,x12/4,s2,x15/2,s11,x1/3,s6,x12/11,s3,x0/10,s7,pp/m,x1/2,s10,x12/4,s1,x0/13,pl/e,x4/8,ph/g,x14/15,s15,pa/n,x3/8,s11,x15/2,s5,x7/0,s6,x4/11,s1,x12/13,s14,x1/7,s8,x15/9,s5,x0/12,s9,x7/8,pj/e,x9/12,pn/o,x1/14,ph/f,x8/5,s7,pa/d,x4/2,pb/h,s15,x15/10,pd/e,x6/2,pk/n,s14,x11/7,s2,x4/15,s4,pp/h,x1/2,pi/c,s5,x13/9,pl/p,x14/7,pi/g,x11/12,s15,x6/9,s11,x3/1,s12,x10/13,s15,x14/15,pj/p,x4/7,s14,x14/12,s4,x4/1,pf/c,s8,x9/6,s15,x15/4,pm/g,x5/10,s6,x6/9,s3,x1/12,pi/e,x0/2,pp/k,x11/5,pc/e,s10,x1/7,pf/g,s3,x8/14,s1,x13/3,pl/d,s12,x5/8,ph/j,x0/3,pn/g,x14/2,pm/l,x13/11,s15,x4/15,s8,x5/9,s1,x1/8,s8,x11/14,s7,x0/5,s10,x6/8,pd/o,x4/10,ph/l,x3/1,pe/m,x2/6,pi/h,x5/11,s9,pj/b,x9/10,s6,pn/h,x4/2,pa/i,x6/14,s14,x2/12,pl/n,x5/8,s11,x6/7,s3,pi/o,x2/8,pf/b,x3/10,s15,x9/13,s9,pl/p,s13,x14/15,s6,x12/0,ph/e,x13/8,pm/a,x12/11,s8,x9/5,pi/l,x0/8,pe/j,x9/4,s11,x14/8,pk/b,x12/5,s2,x10/14,s6,x12/4,s6,x14/0,po/p,x3/13,s12,x6/12,s7,x8/13,pc/n,x11/6,s10,x12/4,s13,x5/6,s7,x3/7,pb/e,s8,x8/4,pk/o,s7,x0/12,s2,x10/11,s15,x9/6,s8,x11/8,s5,x14/7,s10,x0/6,s1,x9/8,s8,x1/2,pb/g,x3/5,pn/d,s11,x0/4,s15,x10/8,s10,x2/12,s4,x3/10,s6,pe/b,s14,x5/9,pd/l,x3/6,s1,x5/15,pk/m,s15,x11/7,s5,x8/15,s8,x7/9,ph/n,x3/1,s7,x5/15,pp/d,x8/4,s13,x15/2,pn/l,s3,x5/13,s13,x11/8,s14,x9/14,s2,x11/1,s9,x2/3,s3,x8/6,s12,x0/1,pf/h,s15,x4/5,pa/l,x14/1,pe/h,x2/0,s1,x7/1,pc/j,x12/9,s13,x15/2,s1,x9/13,s8,x14/1,s7,x12/15,pi/e,x7/0,s14,x8/13,s2,x10/9,s4,x2/7,s15,x11/4,pl/g,x14/9,ph/d,x5/11,pg/b,x3/2,s10,x1/12,pc/a,s12,x7/4,s10,x2/10,s13,x1/8,s5,x14/6,s2,x13/0,s5,x5/10,pf/h,x12/13,pn/g,s1,pl/c,x3/1,pg/a,x2/9,pf/i,x13/0,s15,x3/9,s13,x7/1,pc/m,x14/13,pi/g,x0/10,pb/f,x12/3,s8,x9/0,pm/e,s15,x14/6,pp/c,x7/4,pd/o,x1/11,pn/f,x8/15,pi/g,x4/7,s14,x0/13,pj/m,x9/11,pb/l,s8,x2/8,pi/c,x15/11,pf/o,x8/9,pl/p,x1/12,s3,x3/9,pj/g,x8/2,s2,x1/5,s2,x12/10,pf/a,x5/4,s12,x2/11,pp/e,x14/4,pd/h,x6/2,s8,x11/12,pg/e,x15/7,ph/f,x13/5,s12,x10/1,s4,x8/3,s1,x5/15,s10,x4/0,pj/b,x14/9,s8,x0/6,s14,x8/12,pl/e,x7/6,s9,x11/9,s13,x4/2,s4,x1/10,pj/g,x4/3,pl/o,x1/15,s2,x9/0,pg/k,s10,x15/4,s8,x12/5,pj/n,x14/15,s15,x2/10,s6,x7/9,pi/p,x6/11,s3,x10/14,po/f,s9,pd/m,x11/1,pc/i,s3,x6/3,s14,x15/14,pa/l,x8/13,s4,x5/0,s8,x2/12,s3,x5/8,s7,x2/3,s14,x12/14,s10,x2/10,s3,x8/13,s7,x9/1,s2,x5/15,s8,x7/9,pj/f,x4/6,s1,x7/14,pn/i,s13,po/b,s15,x13/2,s7,x6/10,pl/a,x3/7,s15,x11/6,pk/g,s1,x4/13,pi/f,x6/0,pp/h,x4/13,pj/n,x5/15,pf/o,x1/4,pm/k,x0/6,pb/j,x12/4,s9,x3/8,s3,x2/11,s3,x13/7,s7,x10/14,pg/d,s5,x11/5,s4,x1/0,s9,x7/6,pc/j,x3/14,pk/d,s1,x4/7,s3,x9/15,s5,x12/7,s11,x14/8,pe/n,x1/7,s13,x11/13,po/b,x2/15,pf/g,x3/1,s3,x4/13,s7,x1/12,s1,x7/9,pn/b,x2/15,s15,x12/11,s5,x2/15,s11,x12/13,s1,x4/10,s8,x14/3,s9,x15/13,ph/a,x11/7,s11,x3/13,pd/p,x7/8,s10,x1/0,s12,x13/11,s13,x8/0,s4,x11/12,s6,x10/4,s5,x7/0,s12,x9/12,pa/c,x0/1,pl/k,x8/15,pn/a,x0/2,s14,x6/10,s4,x4/8,pm/f,x10/15,s13,x5/8,s4,x14/4,pn/d,x10/2,s14,pi/k,x6/15,s1,x9/4,s5,x6/8,s11,x15/0,s7,x5/10,pa/d,x8/6,po/e,s9,x4/10,s9,x14/13,s5,x11/3,pa/p,x4/1,s6,x7/12,pc/o,x6/9,s9,x11/3,s5,x4/8,s2,x9/1,s13,x2/12,s5,x5/8,s4,x1/4,s7,x5/2,pg/k,x13/9,pl/c,x10/8,s7,x7/9,s14,x10/2,s10,x1/9,po/e,x13/15,pb/i,x4/1,po/n,x13/12,pj/e,x15/3,s3,x14/11,s9,x1/5,s2,x7/14,s7,pi/m,x10/9,s10,x5/2,s3,x14/12,s11,x15/5,s12,x6/1,pb/a,x13/5,pd/j,x4/15,pg/a,x11/7,pp/l,x2/5,pg/h,x1/0,s4,x5/10,pa/m,x1/15,s13,x9/14,s13,pl/n,x12/2,s1,x15/6,s10,x9/13,s1,pa/f,x1/8,s8,x13/7,pg/p,x4/0,s3,x15/8,s8,x7/10,s9,x4/1,s12,x0/2,s14,x9/5,s11,x1/13,s3,x15/10,s13,x2/8,s2,x14/3,s11,x13/6,pb/i,x12/9,s14,pe/g,x6/2,pl/b,x14/4,pa/j,x1/5,pf/h,x8/7,pn/b,x11/4,s6,x0/8,s13,x5/6,s9,x7/1,s15,x8/6,s11,x11/10,s11,x4/14,pg/d,x9/7,s9,x2/8,s5,x13/14,s15,x1/2,s1,x13/9,pn/k,x8/4,po/c,s4,x6/10,s10,x15/2,s3,x4/10,s9,x9/0,s4,x3/8,pj/e,x12/9,s7,x5/10,pd/b,x3/11,s11,x15/9,pe/j,x4/3,s12,x5/14,pf/a,x8/15,pk/c,x12/5,pi/b,x0/10,pd/p,x6/3,s9,x8/7,s4,x5/10,s12,x13/14,pg/m,x0/5,s1,x15/2,s9,x7/8,s12,x15/4,pn/f,x9/10,pb/o,x11/13,s12,x12/5,pl/a,x3/13,s8,x8/14,s8,x7/5,s8,x15/13,pe/b,x12/4,pn/f,x14/10,s10,x7/4,s7,x14/13,s14,x11/12,pb/k,x6/15,pd/e,x4/14,pg/l,s13,x0/7,pc/h,x5/10,pf/p,x11/0,pg/n,x5/3,s14,x12/4,s2,x8/10,pc/i,x3/4,pd/m,x1/11,s7,x12/5,pi/o,x15/9,s5,x10/1,pj/k,x6/7,s9,x12/1,s9,x10/6,s12,x5/3,s11,x1/10,s3,x0/7,s14,x4/10,s15,x9/14,s12,x4/15,s15,x5/0,s7,x3/14,s9,x6/4,s3,x8/14,pd/m,x2/11,s2,x14/12,pk/j,x8/11,s3,x0/3,s13,x10/2,s5,x8/6,s1,x9/15,pn/h,s10,x12/1,pe/p,s9,pc/m,x3/10,pa/g,x0/15,s12,x8/1,s14,x10/6,s4,x9/4,s9,x7/11,ph/d,x8/2,s4,x15/9,s12,x8/1,s5,x6/12,s13,x4/14,s6,x8/10,s14,x13/7,s15,x3/15,s15,x2/10,s9,x0/15,pe/b,x13/4,s7,x3/6,pm/c,x15/2,s4,x13/10,pn/g,x9/3,s7,x1/14,s12,ph/l,s2,x9/0,pg/n,x12/8,s5,x10/7,pl/m,x6/9,pg/a,x3/4,s12,x12/14,s9,x11/7,s8,x8/2,pi/j,x11/1,s13,x10/5,s14,x9/3,pd/l,x11/13,s1,x14/12,s15,x4/6,s4,x11/14,pg/c,s3,pn/l,x10/2,pb/c,x15/14,pj/f,x8/11,s15,x2/10,pe/b,x4/6,pi/k,s13,x8/10,pd/b,x14/7,s14,pf/l,s14,x4/0,s8,x13/7,s1,x5/11,s7,pc/d,x0/9,pg/p,x13/2,s6,x8/10,pb/i,x5/2,s6,x15/14,pk/a,x13/1,pg/l,x2/4,pn/m,x8/7,pd/o,x6/1,s7,pb/e,x9/5,s11,pa/o,x0/7,s14,x10/2,s5,ph/m,x15/11,s8,x4/2,pi/k,x0/12,s4,x5/15,s13,x14/0,pd/l,x4/10,s2,x2/9,s3,x13/12,pc/m,x3/9,s12,x10/13,s1,x2/3,s3,x15/6,pl/i,x4/13,s2,x6/1,ph/c,x8/14,pa/o,s5,x15/2,pl/b,s11,x7/9,s8,pm/g,x15/1,s3,x0/6,ph/b,x5/8,s3,x0/4,pl/d,x8/7,s11,x9/10,pi/j,s4,x2/11,pp/a,x5/9,po/b,x10/15,s14,x6/3,ph/i,x13/8,s4,x14/0,s14,x12/7,s9,pn/e,x2/6,s6,x14/4,s12,x15/0,s13,x1/2,pf/h,x8/13,pk/c,x4/14,s15,x7/0,s11,x14/4,pp/j,x2/0,s3,x14/11,pg/i,x4/2,s10,pc/f,x0/8,pp/d,x1/2,pi/g,s14,x4/12,pj/b,x8/11,pp/o,x13/10,s12,pd/i,x2/15,s9,x7/13,pm/p,x4/10,s9,pk/j,x12/8,s7,x0/11,s12,x3/4,pl/o,s1,x8/7,s8,x14/5,pp/e,x9/13,s15,x5/11,s11,pd/i,x14/2,pc/g,x4/11,s8,x1/9,s6,x12/13,ph/e,x4/3,s13,x11/8,pf/o,x7/5,pm/d,x1/12,s5,x14/5,pe/p,x3/7,s14,x10/15,s10,x1/5,pj/k,x9/15,s4,x8/10,s13,x13/6,pc/e,x14/15,pk/a,x7/4,s4,x12/9,s13,x13/10,pc/f,x7/5,ph/n,s15,x4/12,s10,x8/14,s1,x11/12,pa/d,x4/13,pg/n,s15,x0/5,s9,x3/9,pc/a,x0/13,pi/h,x10/2,s11,pj/p,x3/5,s5,x7/11,s11,x15/3,s8,x14/8,s7,x3/4,s1,x5/13,s8,pc/l,x7/3,pi/p,x12/10,pk/m,x15/9,s15,x4/2,s2,x15/5,s4,x13/14,s13,x1/8,s5,x4/11,s8,x2/9,s10,x6/3,s9,x1/14,s2,x10/0,pi/f,x4/6,pc/h,x13/9,pn/k,x10/4,pj/e,x1/0,s14,x3/4,s9,x10/14,s7,x12/5,pi/l,x7/13,s2,x11/8,s5,x3/4,pm/n,x2/11,s3,x7/10,s11,x4/9,s1,x3/7,pp/j,x12/6,s4,x0/13,pb/d,x11/1,s15,pg/n,x2/4,pi/l,x7/13,pm/d,x3/11,pe/f,x6/2,pg/d,x12/11,s13,x13/0,pb/n,x1/11,s1,x3/0,s3,pd/c,x6/15,s12,x5/2,pj/i,x4/15,s11,x3/13,pm/h,x7/5,s11,x0/9,pj/k,x13/7,pm/g,x12/1,ph/o,x5/3,pp/i,s10,x11/6,s15,x1/13,pj/a,x10/15,s5,x14/5,s6,pb/o,x0/1,s4,x11/9,s15,x3/7,s6,x11/0,s4,pi/c,x12/6,s6,x10/1,s8,x15/2,pg/l,s14,x7/4,s7,x15/13,s13,x10/0,pk/j,x7/6,s7,x11/2,s12,pb/h,s11,x4/1,pn/l,x6/15,s4,x5/3,pd/p,x9/14,s10,x12/3,s7,x1/13,s10,pl/o,x0/3,pi/k,x15/2,pf/h,x10/11,pm/k,x7/12,s8,x15/5,s13,x6/13,s14,x3/7,s6,x13/1,s13,x7/11,s13,x9/3,s1,x5/12,s3,x11/4,s6,x2/14,s2,x0/1,s14,x12/10,s10,x1/14,pl/f,x15/9,pm/i,x12/1,s4,x7/8,pn/a,x2/4,pp/b,s6,x13/1,s1,x6/7,pf/o,x12/13,s6,pl/j,x0/5,s7,x4/3,s15,x6/11,s3,x1/8,s14,pp/b,x14/10,s14,x5/15,s10,x1/9,pe/j,x10/2,pd/a,x12/6,pe/c,x8/15,pj/f,x14/6,s1,x1/7,pk/i,s13,x13/8,s13,x5/10,s11,x6/11,s6,x9/13,pg/h,x5/14,pd/f,x9/1,pa/k,x7/13,s4,x0/9,s3,x7/13,pj/h,x15/14,pg/p,x13/3,pb/f,x1/10,s9,x12/5,ph/d,x0/1,s5,x5/14,s4,x9/6,s2,x2/12,s11,pa/k,x13/1,pf/l,x10/0,s8,x4/13,s1,pp/o,x1/2,pi/n,x13/12,s9,x8/5,s9,x4/7,pe/p,x0/14,s9,x11/13,s3,x14/2,pc/j,x9/7,s11,x11/8,pn/m,x7/3,po/c,x14/4,pi/a,x5/10,pn/j,x13/0,ph/l,x7/14,pj/p,x8/3,pd/i,x14/2,s3,x12/13,s10,x3/4,pc/l,x7/2,po/n,x14/11,s3,x9/10,s10,pd/a,x14/12,po/p,x8/10,pi/m,x3/1,s14,po/n,x13/14,s3,x15/8,s7,x0/7,pf/d,x3/15,s12,x1/8,s10,x3/2,s2,x14/15,pi/n,x7/11,pl/d,s12,x6/10,s2,x8/13,s7,x10/3,pk/i,x12/0,s5,x3/2,pd/f,x7/6,s2,x11/12,s7,pl/c,x8/0,s2,pg/f,x5/2,s14,x8/1,s5,x14/13,pi/o,x11/10,pl/p,x7/8,s10,x5/14,s12,x0/12,pk/i,x3/5,s8,x14/0,s10,x3/6,pe/o,x11/15,pd/b,x0/13,pf/j,x12/2,s1,x14/10,s12,x1/8,pn/l,x2/3,s4,x0/10,pm/d,x4/6,s13,x15/1,pp/l,x4/9,pc/o,x0/10,pd/l,x8/6,s13,x7/1,s15,x11/12,pa/n,x9/5,s3,x0/7,s12,x9/1,pf/p,x7/13,pl/k,x11/3,pm/b,s11,x15/1,pa/k,x6/3,s3,x12/9,pd/l,x1/14,pp/m,x6/5,s4,x12/15,pb/h,x8/7,pd/g,x13/6,s7,x3/12,s14,x5/0,pc/h,x7/1,s6,x6/5,s6,x2/7,s5,x5/9,s9,x4/8,pk/b,x9/13,s4,x14/2,s9,pf/m,x15/5,pj/n,x2/6,s9,x7/4,s7,x13/14,pk/f,x8/7,s1,x10/2,s14,x6/3,s9,x5/7,s8,x1/13,pa/d,x11/0,s4,x6/4,pn/g,x15/9,s10,x12/0,pb/a,s12,x3/6,s4,x1/9,pk/p,x7/2,pi/f,x14/15,s4,x0/10,pj/d,x15/3,s14,x12/0,pa/k,s5,x10/6,s5,x2/14,s6,x7/15,s8,pg/m,x10/3,pa/d,x2/12,s6,x7/0,pj/n,x3/8,s7,x1/6,pp/f,x15/9,s1,x2/14,pn/l,x8/7,pd/m,x10/2,s8,x4/5,pb/n,x14/0,s6,x2/7,pg/c,x14/11,s6,x13/6,pj/m,x12/10,s13,x9/11,pg/n,s4,x0/4,s12,x11/1,s4,pa/l,x10/9,pp/c,x12/5,pg/n,x4/3,s4,x8/12,pe/a,s4,ph/d,x15/7,pe/j,x4/3,pn/f,x11/9,s6,x12/7,pj/e,x5/1,s5,x15/10,s3,x11/8,s15,x14/10,pn/o,s5,x4/15,ph/g,x5/10,s2,x14/9,pf/d,x0/2,pg/p,s10,x14/12,s10,x13/0,pc/h,s15,x9/2,pk/i,x8/4,pd/p,x9/14,s2,x8/4,s7,x9/15,s1,x13/5,s7,x15/8,pg/h,x5/11,s8,x7/1,s8,x10/2,s6,x8/11,s15,x12/6,s10,x4/7,s5,x10/5,pj/a,s14,x14/13,pn/h,x11/5,pc/o,x4/9,s9,x0/3,s14,x9/14,s9,x1/7,s9,x10/12,pf/e,x2/11,pg/o,x9/8,s15,x6/14,s15,x12/1,s15,x0/5,s5,x15/10,s14,x0/6,s4,x13/9,s8,x8/14,s2,x1/15,s7,x6/2,pj/m,x15/8,s15,x7/2,s5,x3/8,pf/n,x10/15,s13,x2/0,s15,x6/4,s11,x9/15,pg/c,x2/3,pp/m,x0/12,s14,x7/15,s11,x0/6,s5,x4/2,s2,x6/9,s14,x12/4,s4,x8/13,s8,x3/14,s4,x10/5,s8,x6/0,s10,x9/11,s12,x14/6,s14,pd/a,x8/5,po/k,x2/9,s9,x13/3,s12,x9/11,s15,pj/e,x1/3,pf/a,x2/5,s15,x7/3,s12,x14/15,s13,x8/11,pb/i,x10/6,s6,ph/g,x11/7,s10,x6/10,s10,x5/11,pd/b,x8/15,s9,x14/2,pk/e,s10,x5/6,s7,x12/8,s14,x0/11,pc/o,x10/8,s8,x7/1,pp/k,x15/12,pn/b,s15,pc/h,x10/11,s3,x4/7,pi/f,x1/5,s5,x0/8,s11,x10/5,ph/a,x8/14,s4,x6/12,s12,x8/15,pj/d,x12/7,s10,x11/4,s1,x3/12,pf/o,s6,x10/9,pm/b,x2/3,pg/a,s5,x1/7,s9,x5/13,pk/p,x0/8,s14,x13/15,s3,x0/8,s5,x14/7,pa/j,x9/10,pc/n,x1/11,pi/b,x9/3,s5,x11/4,s11,x6/14,pc/p,s9,x8/4,s3,x3/2,pd/f,x10/6,pc/j,x1/8,s4,x4/11,s3,x8/9,s4,x11/3,s12,x10/12,pi/b,x8/1,s13,x9/15,s3,pd/k,x10/5,s3,x11/2,s15,x14/7,s4,x0/9,pl/c,x11/7,s12,x4/3,s8,x1/6,s9,x13/10,s1,x3/2,s10,x6/7,pi/a,x14/2,s8,x3/11,s3,pc/f,s10,x15/5,s6,x2/8,s4,x15/9,s2,x14/4,s10,x7/11,s15,x3/15,s8,x11/10,pd/l,x0/4,s14,x12/2,s13,x7/3,s8,x1/10,s10,x3/7,s8,x8/6,s5,x5/0,s14,x10/4,pa/c,x7/14,pd/n,s8,x1/11,s3,x6/14,s11,x4/15,s12,x13/10,s15,x3/15,pi/j,s8,x9/10,pe/a,x5/13,s14,x3/8,pb/m,x11/6,po/a,x15/0,pl/g,x8/3,po/k,x2/1,pb/a,x9/0,pl/i,x2/8,s15,x10/3,s12,x8/2,s1,x14/5,s2,x9/4,s9,x0/15,s9,x10/4,s6,x15/0,po/p,x13/2,pe/i,x10/15,pa/n,x14/4,s10,x3/0,pk/j,x1/4,s9,x5/14,s11,x3/0,s1,x7/15,s4,pm/n,x10/11,s5,x14/3,s10,x7/8,s8,x9/11,s4,x6/15,s7,x11/12,s3,x1/13,s5,x6/4,s7,pl/i,s8,x10/5,pf/g,x13/0,s5,x5/15,s3,x0/13,s1,x2/15,s11,x6/14,pb/k,x13/1,s7,x15/7,s9,x6/4,pn/c,x9/7,pp/f,x11/2,pb/d,x12/14,pf/c,x2/3,s13,x6/4,pm/b,x3/12,s11,x11/7,pp/e,x14/10,pd/n,x3/7,s3,x4/12,pa/f,s14,x0/2,s15,x12/3,s15,x0/9,s8,x1/8,s3,x3/6,s1,x14/0,pg/m,x2/13,s13,x3/4,pf/d,x8/6,s1,x11/12,pg/j,x1/9,s4,x2/7,pc/m,x8/5,s12,x4/11,pi/d,x7/5,pf/a,x13/2,s4,x10/14,ph/l,x2/9,s4,x14/3,pd/o,x7/9,s13,x8/10,s3,x4/2,s5,x0/12,s12,pk/m,x15/11,s15,x3/9,s12,x4/8,s1,x12/9,s2,x6/4,s15,x10/2,ph/n,x12/13,s10,x14/11,pb/j,x8/4,pp/d,x9/0,s1,pk/m,x8/4,s14,x2/13,s9,x8/12,s13,x13/6,pg/e,s10,pa/k,x11/7,pj/l,x2/4,po/c,s9,x13/9,s10,x15/7,s3,x1/5,pk/m,x11/8,s8,pe/j,x3/13,s10,x7/10,pc/l,s15,pd/k,x0/4,pi/h,x3/2,s4,x7/12,s4,x15/11,s12,x0/7,s10,x3/14,pc/g,x4/7,s12,x11/5,pk/i,x12/14,s10,pj/p,s11,x10/7,pg/n,x6/3,pa/e,x15/11,pi/b,x14/5,pf/c,x15/13,s11,x2/1,s11,pa/n,x4/8,pi/p,x5/14,pj/n,x7/13,s5,x10/8,ph/p,x7/5,s9,x4/14,s7,x12/5,s3,x6/4,pn/i,x3/9,pl/g,x14/12,pa/i,x6/1,s6,x3/9,s15,x2/10,s2,x12/1,pe/p,x8/14,pc/l,x1/4,s8,x2/15,s5,x13/8,pm/i,x9/11,s9,x12/15,s4,x9/0,pg/e,x1/15,s15,x6/9,po/i,s5,x11/10,s8,x12/3,pd/e,x5/4,pp/o,x12/1,s9,x7/14,s6,x4/0,s14,x7/11,pi/l,x0/13,pb/g,x8/3,pn/j,x7/0,po/a,s7,x15/10,s6,x12/0,pi/k,x14/15,s6,x7/1,s9,x5/2,s12,x0/10,pl/e,x2/11,s4,x4/14,s3,x12/5,pp/c,x1/15,s7,x3/13,pa/d,x0/10,pi/p,x1/7,s1,x11/13,pc/e,x5/4,s11,x12/1,pm/i,x2/9,s1,x14/0,s8,x1/4,s14,x11/12,pg/b,x14/7,pk/l,x8/0,pj/f,x13/10,pm/p,x12/1,pn/d,s15,x13/3,pa/g,x5/11,s10,x4/1,s8,pb/e,x8/11,s14,x14/9,s3,x1/5,s14,x13/0,pd/o,x14/7,s12,x13/10,pp/l,x5/3,s8,x14/0,s14,pn/c,x6/12,s14,x13/7,po/p,x8/11,s12,x1/4,s12,x6/10,pe/g,x12/9,s11,ph/m,x2/7,s13,x12/13,pi/j,x15/5,s14,x3/4,s13,x10/6,po/h,s4,x7/9,s12,x0/4,pg/l,x8/3,s15,x7/15,s10,x2/5,pc/b,x11/6,s7,x9/0,s12,x5/12,s7,x4/11,s14,x3/0,s5,x14/5,pd/f,x7/4,pm/j,x11/14,s1,x0/7,s3,x4/6,s4,pi/h,x12/10,s12,x15/14,s7,x0/1,s12,x14/15,s6,x13/9,pl/e,s11,x4/2,s3,x10/15,s6,x12/4,s13,x10/8,s12,x2/14,s2,x15/3,s1,x12/11,s9,pc/i,x14/2,s13,x1/12,s14,x4/10,pg/m,x1/11,pb/e,x7/6,s11,x12/5,ph/d,x14/0,s5,x7/12,s2,x13/11,pf/b,x5/0,s3,x1/14,pn/m,x0/13,s1,pp/g,s1,x11/2,s14,x3/9,s15,x8/1,pb/e,x7/5,s4,x3/8,pp/l,x4/12,s9,x14/7,pd/a,x8/12,s4,x11/14,s5,x2/5,s14,x11/6,s11,x13/5,s2,x8/6,s12,x11/12,s7,x9/2,s14,pj/p,x4/14,pe/m,x11/2,s1,x1/4,s7,x5/6,pa/f,x9/11,po/l,x6/0,s13,x4/3,s7,x12/15,pg/k,x4/2,s6,x6/10,po/n,x9/14,pi/g,x4/2,s5,x3/10,s7,x7/6,s4,x14/8,s10,x12/11,s14,x1/4,s10,x3/8,pf/m,x14/7,pb/a,x3/0,s11,x6/7,s6,x10/11,pf/e,x4/2,s10,x15/6,s2,x7/3,s15,pa/d,x8/12,pi/j,s11,x4/10,pp/a,x13/14,pl/e,x0/10,s6,x13/12,s15,x7/2,s2,x10/8,po/d,x11/12,s11,pi/j,x15/4,s13,x6/7,pg/m,x12/9,s6,x5/1,s5,pd/i,x6/11,pj/a,x2/5,s6,x14/7,s10,x2/6,ph/c,x0/7,pg/a,x15/9,s2,pn/o,x5/10,s10,x0/7,s10,x6/9,s7,x15/7,s6,x4/5,pi/e,x6/7,s14,x13/8,pb/f,x6/2,s9,x8/3,s9,x5/14,pg/e,x13/11,pn/k,x8/4,pi/p,x12/2,pc/o,x15/7,s4,x9/11,s14,pg/e,x8/7,pd/i,s7,x3/12,s1,x9/10,pe/f,x4/2,pk/g,x14/12,pp/m,x5/15,s10,x6/8,s6,x1/2,pl/f,s8,x6/14,s10,x4/15,s12,x8/5,s12,x1/15,s5,pk/j,x12/6,s9,x2/3,s8,x15/0,s13,pg/l,x5/4,s2,x14/3,s11,x4/15,s3,x2/7,pj/k,s14,x0/12,s9,ph/i,x8/1,pj/f,x5/2,ph/e,x11/15,s11,x5/8,s9,x6/12,s14,x1/4,s7,x5/13,s3,x10/9,pc/p,x14/7,s11,x8/1,s13,pb/g,x6/14,s1,x12/5,po/d,x7/3,s15,x14/12,s15,pe/h,x9/10,s11,x12/2,pj/m,x11/14,s10,x7/6,s6,x0/4,s7,x9/15,s5,x6/7,pd/f,x8/10,pm/c,x9/4,pk/j,s7,x15/2,s7,x14/1,pa/d,x6/5,s5,x9/14,pc/g,x13/1,po/j,x4/7,pn/h,s11,x15/1,pi/b,x12/7,po/g,x13/15,pc/d,x11/1,s14,x7/3,pl/g,x12/2,pb/i,x4/9,s8,x14/2,s2,x7/3,s8,x1/10,pd/l,x7/9,s4,x12/0,pb/f,x5/8,s7,x1/11,s14,x7/0,po/m,x15/1,pp/j,x12/2,s6,x3/8,pc/l,x5/0,s4,x9/14,pe/g,s14,x12/2,po/n,x0/15,pd/a,x2/14,ph/b,x10/9,pm/j,x12/11,s7,x15/4,s1,x14/5,s6,pb/p,x13/11,pi/o,x6/10,pc/g,x2/7,s12,x12/3,s4,x13/7,s9,x12/8,s1,x13/2,s5";
		ProgramsDance programsDance = new ProgramsDance(16);
		System.out.println("Programs dance result is:");
		System.out.println(programsDance.getOrder(programsDanceInput));
		programsDance = new ProgramsDance(16);
		System.out.println("Programs dance result billion is:");
		System.out.println(programsDance.danceBillionCorrectandEffective(programsDanceInput, 1000000000));
*/
		final SpinLock spinLock = new SpinLock();
		System.out.println("spin lock result is:");
		System.out.println(spinLock.getNext(2018, 335));
		System.out.println("spin lock after 50 mils result is:");
		System.out.println(spinLock.getValueEffective(50000001, 335));

		final Duet duet = new Duet();
		final String duetInput = "set i 31\n" +
				"set a 1\n" +
				"mul p 17\n" +
				"jgz p p\n" +
				"mul a 2\n" +
				"add i -1\n" +
				"jgz i -2\n" +
				"add a -1\n" +
				"set i 127\n" +
				"set p 618\n" +
				"mul p 8505\n" +
				"mod p a\n" +
				"mul p 129749\n" +
				"add p 12345\n" +
				"mod p a\n" +
				"set b p\n" +
				"mod b 10000\n" +
				"snd b\n" +
				"add i -1\n" +
				"jgz i -9\n" +
				"jgz a 3\n" +
				"rcv b\n" +
				"jgz b -1\n" +
				"set f 0\n" +
				"set i 126\n" +
				"rcv a\n" +
				"rcv b\n" +
				"set p a\n" +
				"mul p -1\n" +
				"add p b\n" +
				"jgz p 4\n" +
				"snd a\n" +
				"set a b\n" +
				"jgz 1 3\n" +
				"snd b\n" +
				"set f 1\n" +
				"add i -1\n" +
				"jgz i -11\n" +
				"snd a\n" +
				"jgz f -16\n" +
				"jgz a -19";
		System.out.println("Duet result is:");
//		System.out.println(duet.getFirstRecoveredFrequency(duetInput));
		System.out.println("Duet multithread is:");
		System.out.println(duet.getNumberOfSends(duetInput));
	}
}
