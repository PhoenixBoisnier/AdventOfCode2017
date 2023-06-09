import java.util.ArrayList;

public class Day4 {

	public static void main(String[] args) {

		String input = "bdwdjjo avricm cjbmj ran lmfsom ivsof\r\n" + 
				"mxonybc fndyzzi gmdp gdfyoi inrvhr kpuueel wdpga vkq\r\n" + 
				"bneh ylltsc vhryov lsd hmruxy ebnh pdln vdprrky\r\n" + 
				"fumay zbccai qymavw zwoove hqpd rcxyvy\r\n" + 
				"bcuo khhkkro mpt dxrebym qwum zqp lhmbma esmr qiyomu\r\n" + 
				"qjs giedut mzsubkn rcbugk voxk yrlp rqxfvz kspz vxg zskp\r\n" + 
				"srceh xdwao reshc shecr\r\n" + 
				"dcao isz wwse bbdgn ewsw qkze pwu\r\n" + 
				"lbnvl lviftmr zqiv iadanl fdhrldn dlaani lxy dhfndrl fkoukx\r\n" + 
				"raovmz pdysjsw hqps orsyqw rrwnzcz vrzoam jjljt\r\n" + 
				"wgt gzi icpwp qeefgbe msadakj jbbrma sbj dufuujx zex\r\n" + 
				"cfzx bvyu eswr hafcfy klw bgnhynv qrf aop\r\n" + 
				"rzlq atrzcpb hpl pajjw cdxep ean aptzcrb rzcbapt\r\n" + 
				"xogpf ucc nsukoz umtfbw xfvth ozusnk fopxg ubp iflb\r\n" + 
				"xot nqcdyu kpwix szo cyxv hpmp hwtrc zso nyuqdc aha\r\n" + 
				"mkzf cat tkjprc izxdggf obspan lmlbg bsyspf twox\r\n" + 
				"lfmfrd ooclx tcl clt\r\n" + 
				"dxvnyd nxwojj arutn eyqocj swzao tmh juvpezm\r\n" + 
				"teu eman rlmdmk xkbodv fvrcm zorgy wmwe\r\n" + 
				"hmo fdayx duciqf cgt duciqf\r\n" + 
				"imjnv vfmsha cyrusow xjswoq nclrmjy sjxowq ynjrcml\r\n" + 
				"rwbsay alsi bmzpvw ozq aduui nihwx glwdiz ixmkgfx\r\n" + 
				"vtjzc ntkh zekj qrbkjhn zekj lyfnbg\r\n" + 
				"afaig jqhli oie lhwyduh kqfnraz nfrzaqk mayfg iljqh\r\n" + 
				"inb zum zmu dnl zjxg vrdziq ypdnsvt\r\n" + 
				"uhbzmre mpdxm alkbmsq aopjmkl mqxenry ayvkrf zxvs qkfqva\r\n" + 
				"fimjr ccv cnug crdsv\r\n" + 
				"bqyve lhxdj ydu qbyve vihwjr vyodhc\r\n" + 
				"vmng dyttyf noagpji tdtyfy ewiest ogg\r\n" + 
				"kgscfj klmsv vmksl vmlks\r\n" + 
				"qlvh veo wruft wtm fbrlvjr evo wvwmny dhp bvrlrfj lvt vgzuyyw\r\n" + 
				"mxuro orxmu tivu tjdq ojjvju cdd\r\n" + 
				"kjexme gxbysxp yxrum hinrklv fxehytd qkt tqk umryx nim\r\n" + 
				"kywnux wab tzrft dsaz jgwuw dubarmi fle wjguvr umjp uzncwj mzz\r\n" + 
				"qokwh zrda xywufk tbxhhj eejqaoa hwoqk zer hwt hbjxth xyf hmh\r\n" + 
				"eregs qdx tdequa agrlrg mwwpba qjie yrjvhr txujk\r\n" + 
				"iyot fxwdcb zvwfv vfzwv wvkw ncwbr wdejrr ltcdza\r\n" + 
				"waix eza znmonya ldfghws ialwfvc dey ubsz uhbnh svgekg nonzyam\r\n" + 
				"bryz tfbqn xznfmw xiplgww wwxigpl jxzcgxl rzyb\r\n" + 
				"cqvl rrcoqxs staeuqr hzzow cwv tsvol dio coc ddavii uuojy\r\n" + 
				"txbn qvkkyh gbqnjtq ndpkqr srt bkpqfmm ytycev ypcv bpqmmfk\r\n" + 
				"uqkjmul dour zgq ztango yrrjhrg ufxnmuw\r\n" + 
				"ekxbcv vkxbec xbcevk jiq bar\r\n" + 
				"wczff qdu cwffz hhk wlvyg\r\n" + 
				"zjlconc osgsro dajzo hqih ehml\r\n" + 
				"hnio shccluw cpu ivaby tormn vkef abv vkef ivaby\r\n" + 
				"xgbdeso xiizs omqwy sbtnnt khago evviclw xyu dtvg wsyxfuc humewp\r\n" + 
				"cnzu bia vdyqrf wwb qveum hmh ouupgc owli\r\n" + 
				"pjpmfxa dvd lxgh ndy gwph oebfkqv vtlxdg efl ekj dyn\r\n" + 
				"mvan nmdkc ucyshia mavn ecst poo\r\n" + 
				"oybm pjwm bmyo wovgu xykziaq obmy eiirhqd\r\n" + 
				"xkvomx yxvv oxxpth elh vxvy lhe ycn\r\n" + 
				"okxglw gmaangx gnxaamg yduzrr nzwxtnd rcxcu xjjvno yat cin gaxnamg yss\r\n" + 
				"oicgs rrol zvnbna rrol\r\n" + 
				"abb edpnxuo peoudxn bab ceay\r\n" + 
				"ncpkfz gvwunb fckpzn caafx pkcfzn tsfl\r\n" + 
				"fnrt ymenkpq wodubcm niv nvi ziluu cuowbdm zocg pdakwt mlzxkex nuxqclo\r\n" + 
				"uouxcgl stgua otadr ideannq wizxunv iqsdpj mxddt ldst ucxogul\r\n" + 
				"rbrwyhk wqoz zqwo ikwgexl atpu iza\r\n" + 
				"smo yolp pcahlu muljxkq cbkljmz zlbcmkj zvbmgz eaiv ncv zplifm yplo\r\n" + 
				"ocutdhz zmnaap llgv llzpl loavju guzkfq saay rxyhng cwxzx lcv anrnzs\r\n" + 
				"etyzx tcm upxrtvd imyoiu rdpj fed dmm\r\n" + 
				"gonqa szteh szteh razdqh phyff upf knfqfaf knfqfaf fpsgl kakag\r\n" + 
				"mcju mixskop isrwat lcr nfyi lcr aaevr nfyi pqrbk gnful\r\n" + 
				"xfmr fkmnq fbnhd mxrf litniid xbae frxm zcenf\r\n" + 
				"yuh lzojtj rqsh hyu\r\n" + 
				"vbjgql yeshsuv lokt efqota wpwjfu ykyq rxc fxxh ycqfkk gndts vdf\r\n" + 
				"wnylmr kkuruxm azr xukrkum dohkwx dmdb\r\n" + 
				"bjiyrwf dvf fdv vdf gnokekr\r\n" + 
				"jsaq hcww iayqtu llv gdpxdrd hwlo nosjit wpm lcab fcgwr\r\n" + 
				"fxjp bys nnf xzllckh bys hvojw zcwtgwz wye ccyvjv\r\n" + 
				"grafa hbb ghk wkdpsf ufa uoqmysd\r\n" + 
				"yvacf kssbff iovrm mvrio cfbpb avh zzje\r\n" + 
				"gqd qmsen wkvrfz vhtsa zrwfkv gul zkvwrf\r\n" + 
				"hrbi svaogb aogsvb bgrk hibr jbtkr\r\n" + 
				"ljl ryc mrewrge yky\r\n" + 
				"fcqyymt emk qcmyytf mcfvusb luy qany cbsvumf\r\n" + 
				"oknt mcozuc ccmuoz uoccmz\r\n" + 
				"uziil xobutwf acnof iqgwl diso\r\n" + 
				"sekq fxbtsuv ddnnqg rnemlt dngnqd hhgjfus stxvubf\r\n" + 
				"lajcp qgiw fyz blrlcd pviwv buh wnkk\r\n" + 
				"wolqfk nvpapfc rwcqxfz xobno yzjfz irpj wolqfk wbnwjt\r\n" + 
				"vmabj noiljne hhqf holxkbk swwzx ylgj lnmxy lqodhk abjvm bmsrf\r\n" + 
				"bpnp yrz pjepxxs jlmhuy vihlx zacm inuazhc xsxjepp\r\n" + 
				"tryl kryh eonvaad ucevssk umkxg lqej nswopjj svkeucs bmh stosxxz\r\n" + 
				"cfdwd dmfdrvm ibuhsz nwtgmb pjt dmfdrvm cqdcm fzjjz afa ibuhsz\r\n" + 
				"erwp abn jwx ynmkkj rhgg abn epd atqhs rst rhgg\r\n" + 
				"jtnp cegdsoy gfuvfbg gdmn ahlsc\r\n" + 
				"jgrp diu jrgp onjnml nojmnl vxockc\r\n" + 
				"lakqyuw khq dcpiwt ykwlqua hkq plklx ujbckec hjcvur jnp pvyf\r\n" + 
				"usuvoo jkih ylafyy yhio jureyj\r\n" + 
				"uazisdf cnwlfnf ewodatr woaddkd wbla qmn atdrowe\r\n" + 
				"bnyepaa ntqh xppe ydtsw ppex\r\n" + 
				"yewjwsp jxylmtk ijese ewry ijese kbja nfml zeuwcsh juimz\r\n" + 
				"qbvmf nca zsfreo uurgaiz twe fbqmv ncwi etdcsk atowfp\r\n" + 
				"jeotslx kgdpzp wxlcww pdd dcn ddp\r\n" + 
				"macllv ldl kyluine lbt hbxbr wxcaspp ezwvc qxkeu\r\n" + 
				"ivg gxv zsf ucr uff yrz\r\n" + 
				"tdlwbny bqlrlz tbynwdl lwtbdny\r\n" + 
				"tnekq pdaievs ttwpfh xfm fcaa\r\n" + 
				"zqqhl zbf fbz uqrv bfz ffwavhk foccg\r\n" + 
				"vcw ebqdd cwv eddbq nrmq\r\n" + 
				"hpiusz sizphu xzq sgyehk wgagkv hsygek\r\n" + 
				"vagkxa iou frqdnnr ipcg uxvh vvh eskf katgpiq aqktigp gzvseyi\r\n" + 
				"xkwgd kzfxk pgdy fmtvq ngf rshx zti pamviob ely knz\r\n" + 
				"hwo rteohu qzwoe rotuhe wzb\r\n" + 
				"bsqgg tid dti gtats dit\r\n" + 
				"sjtux djwxv dljwjq xwvjd xnqfvx veqdrtl uxtsj nnkjn wnhilaf unirrp\r\n" + 
				"fruuqjk gtote gooklg bzwhim zfnccmm ezipnf cxwdxa wfu fdca\r\n" + 
				"zcyxb byzxc cxbyz pgcqco ivlxz\r\n" + 
				"wrjh zfdinsf ihw xwosiah hdg xpiabno bilyy azdeczg javuwa\r\n" + 
				"rinlv dcpt qhencba mmb njxw gadc\r\n" + 
				"qwcpua qzyzt cxjsgh kumh byiimas qhsgf qytzz rqqruwp ismyiba xydcxz rwkscqa\r\n" + 
				"xbzefi hltca ibzxfe fkx xizbfe wvaynts\r\n" + 
				"oyuce vzk ouxvj gfh efgbv ubc nyb bxnbhd mtwboe whksy ovmrt\r\n" + 
				"ljrebp tacn bpjler utphw wmfw rcnha\r\n" + 
				"drdnic eyodes rcnidd yseeod\r\n" + 
				"umxmsf kfroz ukhjin awpnnnu ooyyohh tuv rafano jze\r\n" + 
				"bakz lfzpjyg gfkqcgn kzh zwpvk gqfngck\r\n" + 
				"jpaony ojpnya hmro xaaz tovary aaxz iel pbg\r\n" + 
				"swvbgc bbhjp yvrcddd rhj clfu eao afrkegn qvvb yvcx nxjmdo rcvtx\r\n" + 
				"conbjy jeqtri wvujt jeqtri rkhllgw tsdt zowreo qxr qbpragn kuzmplw wvujt\r\n" + 
				"jrpxyp hchljy rkowqb eeaf ltllebb gtksrwx iazx vnsfmc zzrxw hlcjyh\r\n" + 
				"piehb cjdzt eqn kuje rls oaewoz lrqwt lcrrq\r\n" + 
				"hdjowxv uknhlv hluknv pokxg\r\n" + 
				"txiqxfr fyyp pyyf xfxtrqi tvm rtvby cfx trx nwrf kqrxtat alwot\r\n" + 
				"wdaadr stexpow ardawd uejqxc\r\n" + 
				"wwgwjel wwgwjel mtjt wwgwjel\r\n" + 
				"mczx uua lgceb dqru vkcea tcet ruz\r\n" + 
				"jkt yroojr qdrtdu wze ovwz fdmqnr xxsyfd kchytwl hctlkwy gyd\r\n" + 
				"eif irnrce iamhxgh bmis uxye azrwdi sznv yuowb vdlqqxu\r\n" + 
				"dxdjyj hngqwzs yhwku qhsctfe rhbc rchb tqhcfse\r\n" + 
				"fxyxnzs qtxevin rvtxtc iqnxtve\r\n" + 
				"zgbpk mwzxx bgpkz wkpkn\r\n" + 
				"rjiym iub lcyw agbtlb bzhx osv rbtf\r\n" + 
				"emmyu uoflio tinih skpqaj rbor gezbhhv ine mij qlqte uuj ycns\r\n" + 
				"owmwc uhxv pyho ftjh jzsg blqn bszyo bob trbycy mkru\r\n" + 
				"mwgz bbqsmpp fgzs bihhg bbn pjxxexs qrqmt htsxfwo qltqp vqqaxi\r\n" + 
				"lpr wcvy sxjqq ltd rftdgv pdnog ymu\r\n" + 
				"qhcos shuy icdhucu lrikh rwslv yxbgibl rcomhn wakirz\r\n" + 
				"civdmee owlzocl vedecim rogmjnn pix pohcmk dsjm yworm\r\n" + 
				"vzdpxp lvt inufv yofqt omm qfoty qrlseqy amkt kjcvg vgkjc\r\n" + 
				"huhq quhh levzsws sjuun ofgqr cjhp nfxbbft rnt wtbd tbzab\r\n" + 
				"tjftkx xpfcv hvftvhw lpypbjg batrn fhwhtvv uthl arbtn brb sthv\r\n" + 
				"ogr uyuxdco bpjgir edztxv sxtgu jzfmx ihnauz zwegqkr kvkw\r\n" + 
				"mhxthf pervvn gshy jig ezjteq ckkcpy gww\r\n" + 
				"tiljyki rpe prcojy tjkylii moxu\r\n" + 
				"pjsdqc lgqydfd lohck emrtejw axwmo wuuv rfi qzyncmw gjijdfb bljfd xrs\r\n" + 
				"ywjab gynzi relf kziy xmsby izyk ocwoho kqnyh bwayj\r\n" + 
				"bhjlz uonz jhmzuq eiajoos zjnbj tomj bmyv hjlbz fgw jjbnz\r\n" + 
				"kszz xzw xzw prtznyb\r\n" + 
				"ghzk vxhwt thxwv slwpayp qxegmi dawdwo kgzh\r\n" + 
				"ibpcvuf wnuwxu sbf jsj bfjynl cdp jbylnf\r\n" + 
				"epaxr vfhf hvff azepadz pwf sbo pgfzya hslyo rqqj rmklw hwtta\r\n" + 
				"yyolko pwbvxvg xdwl yfje hftep kzzsr kho jeyf yvslxpw kfyv\r\n" + 
				"xmk juyjxy eqno mdwklum reg dgn cirh wmxfyj bnxlgo dlobk\r\n" + 
				"oyv gshqyot jgcqe dsf gyohqst gqgeojo egoogjq dmqpyp\r\n" + 
				"sypianq yss lmhu ulmh itilh ndkda lhiit\r\n" + 
				"qbxxl bxxql ikald nfap qixwbqq\r\n" + 
				"jtqhqty ljysnl nwoj toa bmmyj pal\r\n" + 
				"ahktew sxody nkvsf pbxyt baws wgwfwej bevgzm jus hcvajfy kzrb jwgwewf\r\n" + 
				"jzsb szbj ujngwf nfuuf lfiuxdu uufnf orsy\r\n" + 
				"vgo hto isstyul gau wsmxoqw\r\n" + 
				"uxw itwf epaw hec wape hemol rpwyosc xzxmrll eetz zui kagca\r\n" + 
				"mjncux muv rygdeis rygdeis\r\n" + 
				"qgkqjvf iprzibd fkvqqgj llcrl vbh vlf lllrc zwrunt\r\n" + 
				"dslsa wvoex eqbwj tjem gbx ayn xcan fnacl xggxon gnwjlh\r\n" + 
				"yzosv hcxjiz yvon gcgd\r\n" + 
				"bixpny ecln sda eymt bjiwk\r\n" + 
				"rlcad lrdca adoqfzs rgty mds pwb kmwj\r\n" + 
				"wkai pmryffq rrdmodc wgyx taz yxwg nkap\r\n" + 
				"auynzwc vzg uapdv qkrh\r\n" + 
				"ldmuysp oyu kpn ejbl mfifa bzs hwyn brlw qpzqx uyilao ysdumpl\r\n" + 
				"czoxoj pwnultl wezolbw lyk aonesgb\r\n" + 
				"nqy nhb nle yycp lgtbo ojf dytwyh ufa\r\n" + 
				"rwr eph obg peh pejret prjtee ovgz\r\n" + 
				"vdqf vdqf ycjrg ovzl lelbe vdqf\r\n" + 
				"gvagdqm gvdgqam dmb zaxe nepzwn\r\n" + 
				"emwh bkkbgec qwdgk mhvfsrf wmdfpp ekzuua\r\n" + 
				"mbqw lgkyazt ckyhvnq uladwo owt\r\n" + 
				"qwiwd pbo tkjoqda zapo dygqopv zzdlwfn\r\n" + 
				"qty dhb iinncba ytq kvh idgoevt chx waq\r\n" + 
				"ulffsvk vplsz ulffsvk uxsh cpwgxd ikgcacx nrirke uowcjvn\r\n" + 
				"gknmxr grkxnm fco dilyyj grmxkn\r\n" + 
				"saqxkh uhue nvu fef xsuxq ekyyoc bcaavd\r\n" + 
				"qltwqa vrmpv vhra nof yprauc vkreojm eaq igiy mec\r\n" + 
				"wvheiyg uthy gpvcs nhnjrne mqaejr tfnsly zfbhn entcc nystfl cpq\r\n" + 
				"zxv jzk dwsjgrd gqqxhp xqxu naunwc yeh qzpkz awcnnu aoosa icadax\r\n" + 
				"vpmqmg qmvpgm tqs mvpqmg\r\n" + 
				"inehzu zwxeoy jxia fcyzxc hwikd\r\n" + 
				"bzwnp kamsen ajpn kdls bzh xqcb bzwnp cmjnfa wmgx\r\n" + 
				"hbuhc qgvhxy smzkxh zzebox hbcuh net wyrdppc yvgxqh\r\n" + 
				"oeum oemu iyags xaipdi euom\r\n" + 
				"tqljgoq ghtdhw xhnni lux qltojqg lki zxztda pcqjif acpzvwy\r\n" + 
				"ydijaq kbyjxpu onyd hsfgz geqvbg\r\n" + 
				"rwoih xog dtbzyr ryzbdt tdbyzr\r\n" + 
				"vcdxf zosw pardxfz bmb mscmain lwfc jvq hbszcqh fxomsmm ahnugx\r\n" + 
				"zutsemg pqzil ddv nsstz gmeuzst bedvy xkzzjpw xlqbd\r\n" + 
				"xxf ltnnu yeb hbml agj meovtjr qrul kexerkw xxf\r\n" + 
				"tqrpd hhcx bmdv nlmr pnu pajdtc rpatqi yekedx oeiuew epsshog\r\n" + 
				"ttbfpv plairk toh jagfsg njnqpa tmwh vwqp irtxv\r\n" + 
				"vdky uwc tkkkztp vdky vdky qlcw lza\r\n" + 
				"rzie yundymy pwgx wtwtbg kpiw mewnb liveysj uvsbn\r\n" + 
				"jgfvyny hacg pzra arpz uowswu puzsfu hoe heo vrq naup\r\n" + 
				"hqv vrl uko qgpikho lligvxa wdld qgpikho\r\n" + 
				"whvby yomxwj dieffc jkprinh dsaqy yfrnba woyq yexeb mjn cbszn xeswvvo\r\n" + 
				"wowtgu rciyg rlas bra quyfec ihe thuu asxhscu bsbdpbi ogxosu\r\n" + 
				"vydsaet tvnkjq piedkzj foeiqz zqivt iatsju tjnqvk drauaf vqitz invoz\r\n" + 
				"cppn jqzw zmxr qksuas iifmjg xtkgf cppn cppn jpsd\r\n" + 
				"nkifpsq cxdx bokxhm ebww kghagrp bofhrl grc cheuzyj\r\n" + 
				"ibgrlvm hrcx jjuoh ipmt\r\n" + 
				"hcoqkh fzt rgravb cimauj jxjq blct qhc vjxw pqpg qzp\r\n" + 
				"jycxz xcv czxjy vxc\r\n" + 
				"liljaur cgmg neldxb xfummcq yfhiukd dnqhl iolxn cmewhb\r\n" + 
				"hpvoihj fkwokod txy uuktw vmqqb dpldzh yxmcay cyaxmy xycaym wekr\r\n" + 
				"ccnaf wuxc ecadb vbgpt ccntf sezo skjdkbf fnctc\r\n" + 
				"hqdtwho kdhyman bjtcjvr bwllva ncyffyr\r\n" + 
				"xprn jrrvmj pdw yvexm ewbflbe eapml rvrmjj xmevy rxyzhf\r\n" + 
				"wjcbpy qdgtcp cfjh muww fhg sgfdleo nelpte yucqa aavev\r\n" + 
				"rci vqypsqt xmg rzii\r\n" + 
				"gramh wwprtc ampdhw dajr\r\n" + 
				"ovrm mdyhpbl mdylbph aykz\r\n" + 
				"cbmo fxs nuugu guunu upt ljjuhjw nituh utp kxqc\r\n" + 
				"rhabal rhabal rhabal vah lfrs\r\n" + 
				"nrq qway ftzp rtjcks mbygdtd hsiqbh wypqb rtjcks cllp hsiqbh\r\n" + 
				"ywa anhcf nvd puqkwg molrwck wsctx xvd molrwck\r\n" + 
				"wox jzq jfen wcvus cswvu oxw irg lmu tpj viahm jesic\r\n" + 
				"qenad neqad smlgi ydwzq ppdemvs ucyuf qtunm eoqx jlgv\r\n" + 
				"sucpl nrdwbl ltvetok npbw ozzw hafyay sjmui sjmui jkqlq pyn pbuopx\r\n" + 
				"nxgaiu ybyl meo kgh saqjaz xhbqr otelcyp vkwc\r\n" + 
				"iqrl ldjlwvl ajhrl dnhutr gkknyqs mcvluet fgyu ogiz cxo aiunl orb\r\n" + 
				"psd cyq xpoyqny yqc kozqh vonfd uhozwz pds hcpw\r\n" + 
				"tvaxder tulwmw qiw avddbmh irog vynjzcc refx efxr emnvk\r\n" + 
				"myjx npqk whm egw kpy igrrohg ukglx ldnuqw caqg ynx fckhnsh\r\n" + 
				"dafv bkdoqg zcqvbco xgikoac cvbqczo\r\n" + 
				"rtzhpwk ukuyp bayhzp upkuy ahbpyz\r\n" + 
				"oarcuv pnlkxvw fqdkj hwzsz nauwl lpufibz vzfbgc unkluxy rwh xuknuyl\r\n" + 
				"vxhsaj ppdxw qrswqtu ulwv uqtqwsr ppxwd\r\n" + 
				"cww cww cww scu\r\n" + 
				"wiiikwa bfpewt zbgxfkl iqpk tpbwfe aazdcxj ipqk icggn fwn fjr\r\n" + 
				"net ovxuwpz yvzmzd yvzmzd\r\n" + 
				"xgar czuhp vuhisaq fgrqxy evvrtf mnmar lsk\r\n" + 
				"hld mxuedug itswju vmmejqx snzslqj toe bbmugph mgubhpb mowj nrjnzu\r\n" + 
				"qbz ouhye hsldmp lcf hyhlrb ewvle zko\r\n" + 
				"cke mupaq quapm eck\r\n" + 
				"owu zdt lales tzd apjjo fhpx bmuktbw dvehpz\r\n" + 
				"libvl zxypk azazc vtsom ohdzycb\r\n" + 
				"kiowxnc scxygrf ckxnwio ycxsrgf\r\n" + 
				"vcjj fqz lfawfx mps zhv qykch vhz psu zud spu fnpvkx\r\n" + 
				"scfvum fuktgk tua ieosetl wwmjtt exnsw wwmttj plvd pfb kku pdbom\r\n" + 
				"wkfw snukd wkfw gyaojdf bjw htagy cdsp\r\n" + 
				"beh gatqxcu ibrooxr ssww orrioxb eenkqz\r\n" + 
				"jlv affah mtbemf tylh aafhf\r\n" + 
				"zqfajd uwzrw csouuip qzadjf\r\n" + 
				"gsnlrw tcel hha tfbzrp ild aenqa\r\n" + 
				"iirfxef kdux yvj vbzgj\r\n" + 
				"ibx pfll rgkp nancij llpf xib gbkfy\r\n" + 
				"uvw kkbavj pznsnk okigtxl ogitxkl eobbs xhaz wroabn ltogxki\r\n" + 
				"bivdf lotvmoh vrb kpaeeue tdab qhukcb qmy kuqf kesu\r\n" + 
				"egs hbsfeu esg twxko uib\r\n" + 
				"ocraimu qilp ijmx eco nhevqp juxf ksejr bcqqau uhpt\r\n" + 
				"pyx jmpglf juokd dxszjw cml vcjge pfg\r\n" + 
				"gxwrt btmimse dkpbha idmz mtignka ngakmti\r\n" + 
				"dpjhm jyalra hukf imocr lkgt rqywn quhe fukh\r\n" + 
				"nbau xyc bdh yni xaawxm cyx xwaaxm akx gyodqe htbifc\r\n" + 
				"bywdxe bfrp rvb rndl onal jghiwb nuta aint qlciwcx\r\n" + 
				"fpic yrqce land soxhci qzc zoebsq hcdohcc fzhcl iyxb dqinum hchdcoc\r\n" + 
				"zok ghgp zok lmk\r\n" + 
				"ozfz zofz dkdekzb sqc\r\n" + 
				"gfti zuqvg cexmtyl qwuqnj stepb erduqhy cuoizcs qudyreh kqvfdd guzqv\r\n" + 
				"jrugz jzugr lmqu jgihgo hjfbz duxkn unxkd\r\n" + 
				"ckiys dbqmi ckiys ckiys\r\n" + 
				"iylp uvvdp pluifaa djo\r\n" + 
				"esxec rwvel djxppqf jymwt ilm aiz upn aiz wrfefwi rwvel\r\n" + 
				"nitgjr pokxuy puhdwg qtxpb veylp zqvzkbd lrvpcgu zuy rnigjt ibci\r\n" + 
				"jboyzq ogcldr hlon ywav jqqtz qjzqt vyaw cok\r\n" + 
				"aqdw jxn hqknh azbylg\r\n" + 
				"jya qpxtmsj hqrtsgg qjtpxsm\r\n" + 
				"pofcs sxw dlvru dlvur swx\r\n" + 
				"yphvvb qqyyfsp sjkbff dqyerxe jxzes oof\r\n" + 
				"pwbya txk bbwsj ywgimd kmdpc bawpy lbnt\r\n" + 
				"bkbazff ldmaq tyfl acqurpy ndnrp\r\n" + 
				"asw ctiv mnxzyc weeuwb gsn bzk irbyhxl cgqomj izy zbk\r\n" + 
				"yrxcrbt bcrryxt pofe wwzl\r\n" + 
				"vuaqez kbtuyai vuaqez dxqud uvo gmhtg dxqud\r\n" + 
				"tpzs gqdxpxo zzpgta uurjx xpqxodg\r\n" + 
				"cil lsv vznqw vro zqzvjhm jhgauzw uxnwk lci zpgpu frjvyzo tsv\r\n" + 
				"zfvcuim gwn gnw dxfppok\r\n" + 
				"btb goof iwadca aac tbb jha uvzi\r\n" + 
				"qah ned ipmure kyta ffhrwe njz paq kaag xmlui\r\n" + 
				"rkmw vrblwyy gpax hxsf zpbza gypuwf jbib ypcjwd vrlybyw\r\n" + 
				"yfjljn uxpvg huik jsnah nkhsg yfjljn lqzsz\r\n" + 
				"hagjlqx agnax jqalxgh rvjgtc mjrmph azznzcq gxajlqh\r\n" + 
				"ipki bhoabp rmiyl dmjyxl zzsmap aju\r\n" + 
				"tyjrr rigrf ciq qic avmwu jtr wpq\r\n" + 
				"vuf cosgytm toycgms ufv qzpcbrs\r\n" + 
				"epzgxr lydrsj ezxrpg expzgr\r\n" + 
				"ecm prj kmak makk jpr\r\n" + 
				"ccwyq txy okj matxa socoa\r\n" + 
				"zrjphq gigayv ywkfmru yrwukmf fxjjrha gqkxx zhjy tisutx kufrywm izjfj igg\r\n" + 
				"lfhgsro gsroflh wrpo lofhgsr\r\n" + 
				"kgkgj wkhnab ubrjaoa ubrjaoa ubrjaoa ggdgh\r\n" + 
				"hztutpn epnqmz ffcroq mnqpez niibpn kdloak xjui ozttj lyzsc pzgq inpnib\r\n" + 
				"kruz sjqp mmd hhdxjgc mauouma asevvo upjwqi hxcgjhd etqzagp\r\n" + 
				"zylf qime cho oraid svytv gqrjufv mker cho vnkyiin tjms\r\n" + 
				"dotjul qyv hnh cibtg gdpauyx wzp\r\n" + 
				"fabtira ejxoeor cqyethv ndjrq hnxn joq otng lrr csytrub\r\n" + 
				"txhgepd fwdaanm nawdamf pxine qqrn pronw exnip qwkimt rvy\r\n" + 
				"kuxzhi jln urzxtw rzu ebsuylm tscru qwlhfgq nnu nuchvz vuht\r\n" + 
				"cqgu camlr umkltcf stx izp rtdwxff wkfvs\r\n" + 
				"jhje cxix lefcrsu nebv idfzhic xqri xkft\r\n" + 
				"utzxb znb ietupd uqgbhje aobip oawjwm hetyan uqtqv hpwzyri kwxyu\r\n" + 
				"jvzvbt xuyvp aegdkb srbw bzabpf lyfriez cruyfu\r\n" + 
				"nhi nih aeb ihn\r\n" + 
				"hcf zypt djcm pkjx pvhh\r\n" + 
				"rhvxcfk exydvk ids hybme hnk yfchvs mjbo meocn\r\n" + 
				"rpboxr rxoprb hdzje zhedj\r\n" + 
				"ziildbo apzvatr vsv isndq ebxyy ntm tdttg wkvdh qnids vkdhw xxolip\r\n" + 
				"ywu uyw ipcjz pjzci xjn kvgk vsocprw\r\n" + 
				"euzo njlpv ndrlhi drlnhi ivmjkb fjrtxta skvgmrd\r\n" + 
				"gbyvj dkck gevpfvb lhadhx rgjcdn yraxh bdk oen vqryd bkr\r\n" + 
				"vgkp hncttxb wgxh gdyjo bbdfzvc xhgw rznzgda yxrrlo gxhw\r\n" + 
				"ifjlb fpecyic svhjp ilmj oxgr svhaf\r\n" + 
				"vbqky lhccj xtmm xzjyykn oqmdq qywir bswly\r\n" + 
				"euxxziv totzer vsxfx leo djho uoeaz edaig fbu lumbi\r\n" + 
				"ooqtwq pvo kid vpo jxin bod btqc fbyuz\r\n" + 
				"jhabi mronu htqqyz umjcbv sgnbp wyn cetmt pcjf\r\n" + 
				"tnrkcyl dduuhxh rylkctn pwj rtynkcl mzzfomr\r\n" + 
				"rxx ldqffi ulappk nltawbn tplhb kyb cqyi\r\n" + 
				"vzkw gviooah vxh xeae ohvcad oaiwcj dkx\r\n" + 
				"sdofdjt hcifv dqws sia mlwm vfich kavh myzue roops mzuye\r\n" + 
				"uxs nlbmjp nlbmjp tlaxa tlaxa\r\n" + 
				"ynnisp twx xtw jgkc yinpns\r\n" + 
				"kumorsm wav xhx bpvz clqc ffmadzl ndny ymslo lobv\r\n" + 
				"ljzabj tqhves mezh pwn wue dwfqq lynvtt boeknvi xqbd pkud tzlanis\r\n" + 
				"lgq qiikzl oihnsr pivtjmu qhic yvmeebg rxu qgl yuxnqse dvu faxqez\r\n" + 
				"ldk mlwja vmdqr yzlxiua amlubt ejmzfx nonm zhkxbn gaqbnqq\r\n" + 
				"ttc ctt kneknx smtnaft abljip tct\r\n" + 
				"uybhbiw zwojzlm cfxoopp abulenj znz zzn opllzmm yufk witwxzp\r\n" + 
				"qvkybwi rdbxb qiuizmo fqgne jgot jxz dqhapn\r\n" + 
				"vzinf ehaley amnk laheye invfz\r\n" + 
				"pedakl ivld agzyhr wmzba tzzzg bazwm wjwgux thrnxkn\r\n" + 
				"cmyhae nwfs nfsw kmh pxkaffq\r\n" + 
				"vdf szupev tyunp qiiu deevxmy wozvtt nelnr kgdexy gparqj hajavz biizn\r\n" + 
				"pwspk skpwp ontbjee pkspw cfbj\r\n" + 
				"ihsmh djxtak wkzllao oyr djxtak prc\r\n" + 
				"uhvihqq jrgf hdfek pdrfpt tghz gthz awae wcygi wujti svq fhedk\r\n" + 
				"gnfhsj odqlt netmsul rviio nkzw nkzw\r\n" + 
				"xyvc clxw cyxv lxcw\r\n" + 
				"duegck pkviu npwsp zdx wpvn dmxgnv ixv fybs xteru\r\n" + 
				"vih kgk hads boaddu daiwo hozoufv nef vtcplc isiw\r\n" + 
				"tzqoo dqlgvno jzlay sywx ecej addt ecej addt mnfcu\r\n" + 
				"ymgmby zegudpx ipsjai ger wcwjw brzebb\r\n" + 
				"eqekxlx itra xekelxq exqkexl\r\n" + 
				"rciu ojaa ircu nxjga puvmwou remgu\r\n" + 
				"sltth pprimb slnxopq avtir hvpv ppww fhfap wisn kzs jcuuuuf\r\n" + 
				"xbppc ydpbq zhjh oym iljzvk vsb\r\n" + 
				"ueye shtps uccehi ccheiu dqm yeeu\r\n" + 
				"gwywf lcpv qza qza gzuovj jfzffyh oybfxqv\r\n" + 
				"aawi ynsvdco azdoz cqr tnyquq xlyvbx eca kcalpes\r\n" + 
				"zumgzhy rou kguqa vubw bwgd qprxcg etnbev nqmi\r\n" + 
				"fyd tuoz uwclqn cgl lrpkf irz dizv nxze clg jghx jbpt\r\n" + 
				"kwuanos eorjr tcahp kwuanos cyrpfji zxayggd kwuanos jkqt qqvbork lizk\r\n" + 
				"vtu ovje vhg ovje vtu zcy hrhtr puawfgv\r\n" + 
				"bliz exp wot svxv epx\r\n" + 
				"jiqgxwj yips hjsatc jgsrno msfp vxvbt bba bqmw xjgpgog\r\n" + 
				"vpvypp ggwp wggp gndp hedpse afji hcqgof\r\n" + 
				"hxueubt hiynoa qqzaj ohb qway\r\n" + 
				"akq nfnes sdrlza nfnes weq\r\n" + 
				"udxpdpx gctuv llhxuow rqtetm hdbnpte oebapv civy oeobu ftgivd pykj\r\n" + 
				"pbgbvn jgmr xrz dfn gosjobw ndf\r\n" + 
				"gnf dtbsnc fwcmml tscdnb fgn qgadusl eifpk\r\n" + 
				"vmnv yuxrup qcphi tanc tnca kjrv cphqi\r\n" + 
				"hclggs sghglc fgplp odn pfglp emkrulf whwtmbs qnuyg\r\n" + 
				"wcxtr ani ain sha hsa zxbkf bzxokat qezo ljqxi xqcwfmd dxo\r\n" + 
				"waiq smpbu dbyka uibxjrg nze wiqa rfpts ddjsjv jqqjez bpusm\r\n" + 
				"lpcxf vsbj owjwc tuqj vkrgrh jsjdepv oil lxrjox frsxsi clr\r\n" + 
				"vzunp prwk nnd rfs vpuzn\r\n" + 
				"pqpqv lvsk sqxf nhobsm hakbn ywj\r\n" + 
				"xxu uxx szqnmi lnwtmx\r\n" + 
				"akq nmlw fupwsth jduvhva\r\n" + 
				"nac wwlxqck hpbce vxxqa fyp xvxqa kxwclqw yvlmv bfwi\r\n" + 
				"pzxjbj nvwv mdooiez vvftp enjrsck iypu uhru fpx omtd\r\n" + 
				"llxgp qwf pwaj cuhb scloot hbcu jgp vjw ooclst\r\n" + 
				"sisd akawvzd wvdzkaa gyoij ikt eeeosb jiwiup\r\n" + 
				"tche vxj sbctqv jvx gosur usgor ibo yqxo qqgd zspl\r\n" + 
				"cidd welisl fxblxqk qxbklfx fbdoqcz glhq iylodvz zvds ghlq\r\n" + 
				"cnsa hrxst mrnkqtj bptq jmi cpbcofs kveyeur uzmga modphm rtx kntqjrm\r\n" + 
				"dvyup usfaq rtghoec bvcos fqsua zohwwg\r\n" + 
				"onf vncybi dlaxni oqyqqkn\r\n" + 
				"okfwa qyyx ebnv llql nphq etdt ytgivlo jwgwz kiob\r\n" + 
				"ann vqnqvpx wth lpwid bjvzw xpwqxcj azg ioeyzzp onwf\r\n" + 
				"smy epzomx xep yid zctvrfj astdj cfg fgc eriuxt\r\n" + 
				"rljqgin wzobzrh cuwtx vcsbx tmg tuysq vxipgho\r\n" + 
				"ewp rsrnsj wgeyin lrji ddgt utol xxwut fjiwopa\r\n" + 
				"upu ftvqbk tfkvbq fdwga rmu puu hbiasjw\r\n" + 
				"cfl lmqkb lfc wbtlfi uqsjs ejgmphi tbliwf nzcela gzb\r\n" + 
				"zop unwmiu acull mkwh hvruknw rfk mmhaz iqmenq fifino\r\n" + 
				"iczua bjut tlgf zicau jtbu\r\n" + 
				"mtka ipd mdifj kps\r\n" + 
				"irqkysw xfsjl tedx yckkbx iktxb sqxn pbfvubv uudzppz\r\n" + 
				"mdrn cihat wcext kufs awwtjok pfjg\r\n" + 
				"wdevt tyo zzbp pqlqq wdevt\r\n" + 
				"yhatqkv ntuhw tdfd buxazh xbcsv bas gkv rbzi tddf jbj bsa\r\n" + 
				"malip hiiy qezz yhii wlfojre\r\n" + 
				"zqnfll bssveq lprwbep bhqml tztbt\r\n" + 
				"npnxotu yupdytb jptqo klfydfe fpucmfq svxcqr unopxnt\r\n" + 
				"gdpz gwj iytiohu efk ctjzf asade abhotq brmhu tbtdur zzksbh\r\n" + 
				"kxft klzslf tjdzciy lzslkf\r\n" + 
				"ejei ezmemvg xlt zte tbwhz dgnfpao zotck wus uaz gbwbb\r\n" + 
				"dgednf vypmbs eiytot empfmny\r\n" + 
				"uopmui uehue wdvzt adpfcif mutl ifaztka vydi xumtz orstno\r\n" + 
				"dleero olxiq gxnlfm nfmxlg wloeavr olhrwg hrjd yicj ymyeex qav gxyjgfq\r\n" + 
				"hevj rqcne zycgb qgqtn rqcne ptfvu yyyu zlm hevj\r\n" + 
				"zrkhuh sttnkt hkuzhr vqtu\r\n" + 
				"ppsfm kcao qjq dgadglx cxaawjn pbucfu fed qgioarc dfe ricoaqg\r\n" + 
				"vmawf oktunea zraoir gkt zraoir jcvkqoq\r\n" + 
				"mqgml ecawug ugwace szwul iwbmooj owmiojb\r\n" + 
				"auggaw cypcuw npci vuyxijd pofswjx vdkrgx xylk rom ksj\r\n" + 
				"qmwx jgsrdj ikva xzxw avik\r\n" + 
				"zzhcqu rbg pywjdn wyndpj zchuqz\r\n" + 
				"wzd wqycftu yldezp zovuy oydia hovewe\r\n" + 
				"kfid qkkk thak qhbf rvzlzvu uuxh pbj hkat gow oeqcw knqqzha\r\n" + 
				"sua itv hfpg bdqye bznlrk hfpg bdqye kvir kaai ggtz jqn\r\n" + 
				"ulggl guitamm tkpckso fupacz otxtqpd jxnqc\r\n" + 
				"ueesb ndyik vjftz jgqqv nrcf\r\n" + 
				"krh dqpmsw fybzynl zhjbvkw exefc rhs neq ldprb bhhvxm pjwirun\r\n" + 
				"ymavl qwxr yavml wagwc ekokrpq zewppw iumcgin cxdvwx\r\n" + 
				"wwdukav kuawvwd kowv dkwvuwa\r\n" + 
				"eazot bil tzu vdwwbm fvauwrq\r\n" + 
				"esq tixokph yspf ztoxfut lgzush pwv swh pwv auqhuu tixokph\r\n" + 
				"pdbeyxi poio mugfkb brwbbx aao uszw fokjeb uswz\r\n" + 
				"sbs ryjr ptispi tvnhu htunv vthnu\r\n" + 
				"czjmg hbdjhvi jrkoy fpgwc syafy aar kvnq eaecsb wqzpx\r\n" + 
				"twtp dvl uvyje qtlzj dsvyr qpjnj eyoigx bhgpccy gwn dtuf\r\n" + 
				"mxit xunctu vbyks wmqc jriuupl ybvks uncutx nsoxwrb ykt prc\r\n" + 
				"yye mgf uhc irowpc dsdv iwaxod ftavlj dxzp tcch tcch mefz\r\n" + 
				"rxe xwrrgl xwrrgl duu rxe xbbgoe\r\n" + 
				"ucsz akswcd ojrmqq cox hgfh lxwu ltnnf cenikcp\r\n" + 
				"opjhdp svwezr svwezr opjhdp\r\n" + 
				"qojlkl ircxqnt utfmdg fcvr vehkcvt ufmzcpv xwlh ddavv xel bwlz fii\r\n" + 
				"rzkayeh iursm zhily hdnq fqydfvt uwoy hptpiqu tdqy bgr xdr\r\n" + 
				"ymruz umzry hbltwya jhwhzk flh tahylbw bdbaimb qscbp ntkuf\r\n" + 
				"uxpato owsqyao vaog oenomkc usrmnc epua vzkppls\r\n" + 
				"qxqczbk qyguz alawj xgjawtw wxtjgwa snfcdmz\r\n" + 
				"fjfgos rmpd mgs vbk dlls jkljao eoovdfb ucdvaoq qmjmqku ney porr\r\n" + 
				"nmcrqz zcoxpk dlnzksd ymh zyg spxss ruyk bychq gsgv eusiuid mnrqcz\r\n" + 
				"jbzadnx lzl sdamer okoico frqisrm lxet agriw\r\n" + 
				"xceoqr qai vahc jjzifsn exg\r\n" + 
				"igjpn wfy ukn aag quro wklsq cjq bgtjrdz gmub wyhh\r\n" + 
				"fzlwnm mygfn vkzwvw zvhsex gfki\r\n" + 
				"ijvzgai ebmeq wssfmbq uguh sfuutm nwkgmex dxael liakdxs rnf sky yowpxc\r\n" + 
				"bjzkyjh fced nji esowk qxsubsk qgtts\r\n" + 
				"nkdgo bbjfq fgnxnhd gfjchl jetdb xubsgj eiju ldlm oxsx znft bbqfj\r\n" + 
				"xovcnob pxfe pmstes yzkdm iqlvha nmcziix fexp ivqalh rxecqps\r\n" + 
				"xpyew xudfud wwqe qhfjlcu epv fnrbgyv ihli qngtx yjlfg ozqbzn esp\r\n" + 
				"timl gcohx vqzic gzm shwlkkv icqzv urchuc\r\n" + 
				"xpqq gaqzwo cci dowahsr gaqzwo\r\n" + 
				"jjsagdl umbpxre kyre zvaryft tmw pxpnjy\r\n" + 
				"aqovcz nunq nnuq xjrvvh autjmit jiatumt\r\n" + 
				"elg lps lge zjjot hwz tmqrup xaxxmo zlbzp uftd fukdad kvpymsm\r\n" + 
				"iokwzal ywti zbdmzbu lprywe wbgbwza ypogbga kzliwao wstqi eqm keaeaj gbabwwz\r\n" + 
				"lwfpk mhufe eddzgd ljxyqy vhzkct uemhf\r\n" + 
				"lwqil fzugdo faq feppo usl llwqi\r\n" + 
				"nje hthr ropq qvcepu bexszfj avmzjvv zajmvvv fhcd xnc cnx qnuaux\r\n" + 
				"kvksn dphbyz nsx wrcc ccrw\r\n" + 
				"nzpa pzzunfv ygzjy gxrrtcj hrt trh pwxpg yifgjmo fnupzzv wbzx\r\n" + 
				"aepti rbojui ypvhe ubojri tcema aan dntkw qjx bfvmyos tcm hvoqytn\r\n" + 
				"qpwq exu jvsiwj gsw avr vbemldy\r\n" + 
				"xsbzpf xbzyvx xax sxh vpxt gccy xxa zhgbwoa hwwxoky fhvdxfc pvtx\r\n" + 
				"pnsa ovtjolz tyutl eyjjzt jvtoolz owbypvr tytlu ewtzgec\r\n" + 
				"cyg dwwk eihsp aeuk bbnay aluwyz hdmv uaek mwt ihpse wjhnkeg\r\n" + 
				"fhzx vjetz vjub tejvz\r\n" + 
				"ewwyb jidhu pyvyenn igtnyd tiwr akwkkbi myz xxjwb jjrdeg\r\n" + 
				"jbkuw kwir rkiw ubwkj\r\n" + 
				"bltffuw lftwufb hhsh wfbtulf nrxaa rlszi toijxnz czlci\r\n" + 
				"bqrm pga zgblgcw pgwhhn lcgzwbg bcgzlgw yqb\r\n" + 
				"mhjj vjoa gnjlc kclcr ito ofksy giavy fpqeioj\r\n" + 
				"bkiqmif izidbui sttxxi bswhkxp sduuw\r\n" + 
				"mjgnvw mjgwnv ojzyuv gvj\r\n" + 
				"qxn kkhc whd fgwk auzugg augzgu kqfov wfgk\r\n" + 
				"spdxbnu xpfofsb bpfsoxf ahjywql spbxoff\r\n" + 
				"bwqxhlm wbqlxmh kqgpl fyzgf guhkvgx ovk qhmp gnrmu wvd wedj\r\n" + 
				"vvwf hcnc vvwsngj qedzoxm hcnc qedzoxm kjthdi cbwqep qtvu\r\n" + 
				"gio iqklmro noqablo bab jiqc rwebyg rqkloim wzmgs uunl amqs iwj\r\n" + 
				"snxj szobqt zcgvwv wiyqknu\r\n" + 
				"uto jteikwd cew gqsks hmvjtcy sach\r\n" + 
				"zpgl qnkoex amhufmr figns upv xezrl rjleak nwrna\r\n" + 
				"pzkvrdz dtonazj gtr gfxucuf lstjl lsjtl rgkope kzpdzrv lyptn zfxjys ttk\r\n" + 
				"ddxgm lumlgki jhv doft kok swy ckds swy ddxgm lbfbdv\r\n" + 
				"qfs rcufzgz iaiqw qfs qfs\r\n" + 
				"nvkbo sgv mquwb ritpye nbkov poex hraorm qrrr qdt qefl\r\n" + 
				"irxannd fiud ehyb ggx plqg pvvn uuptop tcvbm abuf bcfnmw\r\n" + 
				"qwya ukblz epmbfr vmlon yqwa\r\n" + 
				"hlo mmv vmm mvm\r\n" + 
				"svzpxun yugbbe sbbpxs dmy xspbbs zhpovyf fyovhzp cpbt pke\r\n" + 
				"zgk gft zybs zrgcoo ypu bue htgo\r\n" + 
				"xnesq srsx pkzaoh cfqzugh\r\n" + 
				"lntd nvxetbv clykjpd svmibpx evxtvnb yldkpjc\r\n" + 
				"jsqq tzwak hephg eqwczd ioisa yim tmdifn mceip\r\n" + 
				"kuwqz wzkqu zwchmj lfec uexne iztp llityt\r\n" + 
				"kvamkpc pvbryqh ion cwizjde gln kcpvmak pzzlw gnl\r\n" + 
				"ydeqf bfaab sydqhbp smsxdjr pynrs cqymt\r\n" + 
				"onb eiab bno nob\r\n" + 
				"mqslq scnelxv hyllrf scnelxv mqslq wmnbk\r\n" + 
				"pttu kubby lgop bbyuk gsk skg ikktlbb inbyvz\r\n" + 
				"xznvl zwtdj vbxdyd clhw\r\n" + 
				"hgy zudelp ickc drfjgn iyws xhc\r\n" + 
				"zzv wik iorhat qkb kjb lykdz vrce yjsjwj\r\n" + 
				"gyw xzgbi efus uuy\r\n" + 
				"hwcy ujdun bjjuvd jbdvju onnk xeyy mmp onkn qyzl\r\n" + 
				"jwfm ptjwrbl hhuv uolz adyweh qpj wxyogp igvnojq jmfw pqs fsnirby\r\n";
		ArrayList<String> arr = Day4.inputToList(input);
		int valid = 0;
		for(String s: arr) {
			if(!Day4.repeats(Day4.parseWords(s))) {
				valid++;
			}
		}
		System.out.println(arr.get(503));
		System.out.println(Day4.parseWords(arr.get(503)));
		System.out.println(Day4.repeats(Day4.parseWords(arr.get(503))));
		System.out.println(""+valid);
		
		System.out.println();
		int validAna = 0;
		for(String s: arr) {
			if(!Day4.hasAnagram(Day4.parseWords(s))) {
				validAna++;
			}
		}
		System.out.println(arr.get(503));
		System.out.println(Day4.parseWords(arr.get(503)));
		System.out.println(Day4.hasAnagram(Day4.parseWords(arr.get(503))));
		System.out.println(""+validAna);

	}

	public static String getWord(String s, int i) {
		
		String output = "";
		int begin = i;
		int end = i+1;
		
		while(end<s.length() && !s.substring(end-1, end).equals(" ")) {
			end++;
		}
		output = s.substring(begin, end);
		
		return output.trim();
		
	}
	
	public static ArrayList<String> parseWords(String s) {
		
		ArrayList<String> output = new ArrayList<>();
		int index = 0;
		
		while(index<s.length()) {
			output.add(Day4.getWord(s, index));
			index += Day4.getWord(s, index).length()+1;
		}
		
		return output;
		
	}
	
	public static boolean repeats(ArrayList<String> list) {
		for(int q = 0; q<list.size(); q++) {
			for(int a = 0; a<list.size(); a++) {
				if(list.get(q).equals(list.get(a))&&q!=a) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<String> inputToList(String s){
		ArrayList<String> result = new ArrayList<>();
		int index = 0;
		int begin = 0;
		while(index<s.length()) {
			if(s.substring(index, index+1).equals("\n")) {
				result.add(s.substring(begin, index));
				begin = index;
			}
			index++;
		}
		return result;
	}
	
	public static boolean hasAnagram(ArrayList<String> list) {
		for(int q = 0; q<list.size(); q++) {
			for(int a = 0; a<list.size(); a++) {
				if(q!=a&&Anagram.check(list.get(q), list.get(a))) {
					return true;
				}
			}
		}
		return false;
	}
}
