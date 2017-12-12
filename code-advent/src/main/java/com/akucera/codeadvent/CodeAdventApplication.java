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
	}
}
