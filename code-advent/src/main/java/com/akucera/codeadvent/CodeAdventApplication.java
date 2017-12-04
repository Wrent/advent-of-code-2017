package com.akucera.codeadvent;

import com.akucera.codeadvent.advent01.CaptchaSolver;
import com.akucera.codeadvent.advent02.SpreadsheetChecksum;
import com.akucera.codeadvent.advent03.SpiralData;
import com.akucera.codeadvent.advent04.PassPhraseChecker;
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
	}
}
