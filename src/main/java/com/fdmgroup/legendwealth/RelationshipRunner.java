package com.fdmgroup.legendwealth;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.legendwealth.dal.AssetDao;
import com.fdmgroup.legendwealth.dal.AssetTypeDao;
import com.fdmgroup.legendwealth.dal.BrokerDao;
import com.fdmgroup.legendwealth.dal.PortfolioDao;
import com.fdmgroup.legendwealth.dal.TradeDao;
import com.fdmgroup.legendwealth.entity.Asset;
import com.fdmgroup.legendwealth.entity.AssetType;
import com.fdmgroup.legendwealth.entity.Broker;
import com.fdmgroup.legendwealth.entity.Portfolio;
import com.fdmgroup.legendwealth.entity.Trade;
public class RelationshipRunner {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("legend_wealth");
		AssetTypeDao assetTypeDao = new AssetTypeDao(entityManagerFactory);
		AssetDao assetDao = new AssetDao(entityManagerFactory);
		BrokerDao brokerDao = new BrokerDao(entityManagerFactory);
//		PortfolioAssetDao portfolioAssetDao = new PortfolioAssetDao(entityManagerFactory);
		PortfolioDao portfolioDao = new PortfolioDao(entityManagerFactory);
		TradeDao tradeDao = new TradeDao(entityManagerFactory);
		
		AssetType at1 = new AssetType("Cash");
		AssetType at2 = new AssetType("Stock");
		AssetType at3 = new AssetType("Bank deposits");
		AssetType at4 = new AssetType("Securities");
		
		assetTypeDao.add(at1);
		assetTypeDao.add(at2);
		assetTypeDao.add(at3);
		assetTypeDao.add(at4);
		

//		https://www.nasdaq.com/screening/companies-by-industry.aspx?sortname=marketcap&sorttype=1&exchange=NASDAQ
		Asset a1	=	new	Asset("USD",1,assetTypeDao.getById(1));	
		Asset a2	=	new	Asset("HKD",1,assetTypeDao.getById(1));		
		Asset a3	=	new	Asset("EUR",1,assetTypeDao.getById(1));		
		Asset a4	=	new	Asset("GBP",1,assetTypeDao.getById(1));		
		Asset a5	=	new	Asset("AAPL",174.24,assetTypeDao.getById(2));		
		Asset a6	=	new	Asset("MSFT",107.14,assetTypeDao.getById(2));		
		Asset a7	=	new	Asset("AMZN",1581.42,assetTypeDao.getById(2));		
		Asset a8	=	new	Asset("GOOGL",1052.28,assetTypeDao.getById(2));		
		Asset a9	=	new	Asset("GOOG",1044.41,assetTypeDao.getById(2));		
		Asset a10	=	new	Asset("FB",135,assetTypeDao.getById(2));		
		Asset a11	=	new	Asset("INTC",48.07,assetTypeDao.getById(2));		
		Asset a12	=	new	Asset("CSCO",46.12,assetTypeDao.getById(2));		
		Asset a13	=	new	Asset("CMCSA",38.36,assetTypeDao.getById(2));		
		Asset a14	=	new	Asset("PEP",116.44,assetTypeDao.getById(2));		
		Asset a15	=	new	Asset("AMGN",197.1,assetTypeDao.getById(2));		
		Asset a16	=	new	Asset("NFLX",266.63,assetTypeDao.getById(2));		
		Asset a17	=	new	Asset("ADBE",232.25,assetTypeDao.getById(2));		
		Asset a18	=	new	Asset("COST",223.01,assetTypeDao.getById(2));		
		Asset a19	=	new	Asset("AVGO",235.83,assetTypeDao.getById(2));		
		Asset a20	=	new	Asset("PYPL",81.97,assetTypeDao.getById(2));		
		Asset a21	=	new	Asset("NVDA",153.73,assetTypeDao.getById(2));		
		Asset a22	=	new	Asset("TXN",96.28,assetTypeDao.getById(2));		
		Asset a23	=	new	Asset("FOX",48.89,assetTypeDao.getById(2));		
		Asset a24	=	new	Asset("GILD",67.44,assetTypeDao.getById(2));		
		Asset a25	=	new	Asset("BKNG",1824.61,assetTypeDao.getById(2));		
		Asset a26	=	new	Asset("SBUX",66.08,assetTypeDao.getById(2));		
		Asset a27	=	new	Asset("WBA",83.52,assetTypeDao.getById(2));		
		Asset a28	=	new	Asset("CHTR",317.64,assetTypeDao.getById(2));		
		Asset a29	=	new	Asset("CME",194.15,assetTypeDao.getById(2));		
		Asset a30	=	new	Asset("QCOM",55.57,assetTypeDao.getById(2));		
		Asset a31	=	new	Asset("BIIB",323.81,assetTypeDao.getById(2));		
		Asset a32	=	new	Asset("MDLZ",44.54,assetTypeDao.getById(2));		
		Asset a33	=	new	Asset("QQQ",163.44,assetTypeDao.getById(2));		
		Asset a34	=	new	Asset("ADP",145.32,assetTypeDao.getById(2));		
		Asset a35	=	new	Asset("KHC",51.8,assetTypeDao.getById(2));		
		Asset a36	=	new	Asset("FOXA",49.1,assetTypeDao.getById(2));		
		Asset a37	=	new	Asset("CSX",70.41,assetTypeDao.getById(2));		
		Asset a38	=	new	Asset("TSLA",343.92,assetTypeDao.getById(2));		
		Asset a39	=	new	Asset("TMUS",67.49,assetTypeDao.getById(2));		
		Asset a40	=	new	Asset("ISRG",496.86,assetTypeDao.getById(2));		
		Asset a41	=	new	Asset("ESRX",99.54,assetTypeDao.getById(2));		
		Asset a42	=	new	Asset("INTU",198.75,assetTypeDao.getById(2));		
		Asset a43	=	new	Asset("BIDU",182.79,assetTypeDao.getById(2));		
		Asset a44	=	new	Asset("CELG",69.19,assetTypeDao.getById(2));		
		Asset a45	=	new	Asset("ILMN",321.79,assetTypeDao.getById(2));		
		Asset a46	=	new	Asset("VRTX",175.45,assetTypeDao.getById(2));		
		Asset a47	=	new	Asset("MU",37,assetTypeDao.getById(2));		
		Asset a48	=	new	Asset("MAR",119.97,assetTypeDao.getById(2));		
		Asset a49	=	new	Asset("AMOV",12.28,assetTypeDao.getById(2));		
		Asset a50	=	new	Asset("CTSH",69.9,assetTypeDao.getById(2));		
		Asset a51	=	new	Asset("ATVI",50.75,assetTypeDao.getById(2));		
		Asset a52	=	new	Asset("AABA",64.16,assetTypeDao.getById(2));		
		Asset a53	=	new	Asset("REGN",353.59,assetTypeDao.getById(2));		
		Asset a54	=	new	Asset("BND",78.01,assetTypeDao.getById(2));		
		Asset a55	=	new	Asset("AMAT",36,assetTypeDao.getById(2));		
		Asset a56	=	new	Asset("ADI",89.58,assetTypeDao.getById(2));		
		Asset a57	=	new	Asset("MNST",57.76,assetTypeDao.getById(2));		
		Asset a58	=	new	Asset("ROST",82.73,assetTypeDao.getById(2));		
		Asset a59	=	new	Asset("FISV",77.17,assetTypeDao.getById(2));		
		Asset a60	=	new	Asset("EQIX",382.11,assetTypeDao.getById(2));		
		Asset a61	=	new	Asset("ADSK",140.16,assetTypeDao.getById(2));		
		Asset a62	=	new	Asset("WDAY",138.75,assetTypeDao.getById(2));		
		Asset a63	=	new	Asset("AMTD",53.08,assetTypeDao.getById(2));		
		Asset a64	=	new	Asset("ORLY",353.08,assetTypeDao.getById(2));		
		Asset a65	=	new	Asset("EBAY",28.74,assetTypeDao.getById(2));		
		Asset a66	=	new	Asset("SIRI",6.1,assetTypeDao.getById(2));		
		Asset a67	=	new	Asset("ALXN",120.93,assetTypeDao.getById(2));		
		Asset a68	=	new	Asset("XEL",51.74,assetTypeDao.getById(2));		
		Asset a69	=	new	Asset("EA",85.04,assetTypeDao.getById(2));		
		Asset a70	=	new	Asset("UAL",93.38,assetTypeDao.getById(2));		
		Asset a71	=	new	Asset("PAYX",69.16,assetTypeDao.getById(2));		
		Asset a72	=	new	Asset("NXPI",80.89,assetTypeDao.getById(2));		
		Asset a73	=	new	Asset("TROW",94.87,assetTypeDao.getById(2));		
		Asset a74	=	new	Asset("LRCX",146.83,assetTypeDao.getById(2));		
		Asset a75	=	new	Asset("XLNX",88.89,assetTypeDao.getById(2));		
		Asset a76	=	new	Asset("NTRS",97.45,assetTypeDao.getById(2));		
		Asset a77	=	new	Asset("PCAR",60.57,assetTypeDao.getById(2));		
		Asset a78	=	new	Asset("AMD",21.05,assetTypeDao.getById(2));		
		Asset a79	=	new	Asset("VCSH",77.69,assetTypeDao.getById(2));		
		Asset a80	=	new	Asset("WLTW",157.03,assetTypeDao.getById(2));		
		Asset a81	=	new	Asset("HBANO",25.38,assetTypeDao.getById(2));		
		Asset a82	=	new	Asset("INFO",50.97,assetTypeDao.getById(2));		
		Asset a83	=	new	Asset("VRSK",121.69,assetTypeDao.getById(2));		
		Asset a84	=	new	Asset("CTAS",183.35,assetTypeDao.getById(2));		
		Asset a85	=	new	Asset("DLTR",81.82,assetTypeDao.getById(2));		
		Asset a86	=	new	Asset("LBTYB",25.01,assetTypeDao.getById(2));		
		Asset a87	=	new	Asset("JD",20.84,assetTypeDao.getById(2));		
		Asset a88	=	new	Asset("CERN",57.95,assetTypeDao.getById(2));		
		Asset a89	=	new	Asset("LBTYA",25.09,assetTypeDao.getById(2));		
		Asset a90	=	new	Asset("SBAC",165.2,assetTypeDao.getById(2));		
		Asset a91	=	new	Asset("DISCB",35.64,assetTypeDao.getById(2));		
		Asset a92	=	new	Asset("LBTYK",24.58,assetTypeDao.getById(2));		
		Asset a93	=	new	Asset("VCIT",82.13,assetTypeDao.getById(2));		
		Asset a94	=	new	Asset("VRSN",150.8,assetTypeDao.getById(2));		
		Asset a95	=	new	Asset("TEAM",74.66,assetTypeDao.getById(2));		
		Asset a96	=	new	Asset("ULTA",296.83,assetTypeDao.getById(2));		
		Asset a97	=	new	Asset("FITB",27.06,assetTypeDao.getById(2));		
		Asset a98	=	new	Asset("ALGN",220.71,assetTypeDao.getById(2));		
		Asset a99	=	new	Asset("AAL",38.29,assetTypeDao.getById(2));		
		Asset a100	=	new	Asset("NTES",230.33,assetTypeDao.getById(2));		
		Asset a101	=	new	Asset("EXPE",117.54,assetTypeDao.getById(2));		
		Asset a102	=	new	Asset("MCHP",73.71,assetTypeDao.getById(2));		
		Asset a103	=	new	Asset("MYL",33.49,assetTypeDao.getById(2));		
		Asset a104	=	new	Asset("BMRN",96.37,assetTypeDao.getById(2));		
		
		assetDao.add(a1);
		assetDao.add(a2);
		assetDao.add(a3);
		assetDao.add(a4);
		assetDao.add(a5);
		assetDao.add(a6);
		assetDao.add(a7);
		assetDao.add(a8);
		assetDao.add(a9);
		assetDao.add(a10);
		assetDao.add(a11);
		assetDao.add(a12);
		assetDao.add(a13);
		assetDao.add(a14);
		assetDao.add(a15);
		assetDao.add(a16);
		assetDao.add(a17);
		assetDao.add(a18);
		assetDao.add(a19);
		assetDao.add(a20);
		assetDao.add(a21);
		assetDao.add(a22);
		assetDao.add(a23);
		assetDao.add(a24);
		assetDao.add(a25);
		assetDao.add(a26);
		assetDao.add(a27);
		assetDao.add(a28);
		assetDao.add(a29);
		assetDao.add(a30);
		assetDao.add(a31);
		assetDao.add(a32);
		assetDao.add(a33);
		assetDao.add(a34);
		assetDao.add(a35);
		assetDao.add(a36);
		assetDao.add(a37);
		assetDao.add(a38);
		assetDao.add(a39);
		assetDao.add(a40);
		assetDao.add(a41);
		assetDao.add(a42);
		assetDao.add(a43);
		assetDao.add(a44);
		assetDao.add(a45);
		assetDao.add(a46);
		assetDao.add(a47);
		assetDao.add(a48);
		assetDao.add(a49);
		assetDao.add(a50);
		assetDao.add(a51);
		assetDao.add(a52);
		assetDao.add(a53);
		assetDao.add(a54);
		assetDao.add(a55);
		assetDao.add(a56);
		assetDao.add(a57);
		assetDao.add(a58);
		assetDao.add(a59);
		assetDao.add(a60);
		assetDao.add(a61);
		assetDao.add(a62);
		assetDao.add(a63);
		assetDao.add(a64);
		assetDao.add(a65);
		assetDao.add(a66);
		assetDao.add(a67);
		assetDao.add(a68);
		assetDao.add(a69);
		assetDao.add(a70);
		assetDao.add(a71);
		assetDao.add(a72);
		assetDao.add(a73);
		assetDao.add(a74);
		assetDao.add(a75);
		assetDao.add(a76);
		assetDao.add(a77);
		assetDao.add(a78);
		assetDao.add(a79);
		assetDao.add(a80);
		assetDao.add(a81);
		assetDao.add(a82);
		assetDao.add(a83);
		assetDao.add(a84);
		assetDao.add(a85);
		assetDao.add(a86);
		assetDao.add(a87);
		assetDao.add(a88);
		assetDao.add(a89);
		assetDao.add(a90);
		assetDao.add(a91);
		assetDao.add(a92);
		assetDao.add(a93);
		assetDao.add(a94);
		assetDao.add(a95);
		assetDao.add(a96);
		assetDao.add(a97);
		assetDao.add(a98);
		assetDao.add(a99);
		assetDao.add(a100);
		assetDao.add(a101);
		assetDao.add(a102);
		assetDao.add(a103);
		assetDao.add(a104);
	
		Broker b1= new Broker("Brian","Leung","brian.leung","brian.leung123");
		Broker b2= new Broker("Wilson","Chung","wilson.chung","wilson.chung123");
		Broker b3= new Broker("Bertha","Chui","bertha.chui","bertha.chui123");
		Broker b4= new Broker("Karthik","Asokan","karthik.asokan","karthik.asokan123");
		Broker b5= new Broker("Kabir","Rajput","kabir.rajput","kabir.rajput123");
		Broker b6= new Broker("Denisse","Sitoe","denisse.sitoe","denisse.sitoe123");
		Broker b7= new Broker("Andrew","Hu","andrew.hu","andrew.hu123");
		Broker b8= new Broker("Chris","Spencer","chris.spencer","chris.spencer123");
		Broker b9= new Broker("Darren","Ng","darren.ng","darren.ng123");
		Broker b10= new Broker("Grace","Jason","grace.jason","grace.jason123");
		Broker b11= new Broker("Bernardine","Knudtson","bernardine.knudtson","bernardine.knudtson123");
		Broker b12= new Broker("Stephania","Nickles","stephania.nickles","stephania.nickles123");
		Broker b13= new Broker("Catherine","Vaquera","catherine.vaquera","catherine.vaquera123");
		Broker b14= new Broker("Tyrone","Heckard","tyrone.heckard","tyrone.heckard123");
		Broker b15= new Broker("Mozella","Vanderbilt","mozella.vanderbilt","mozella.vanderbilt123");
		Broker b16= new Broker("Roselee","Ngo","roselee.ngo","roselee.ngo123");
		Broker b17= new Broker("Elvis","Whitney","elvis.whitney","elvis.whitney123");
		Broker b18= new Broker("Rana","Riggenbach","rana.riggenbach","rana.riggenbach123");
		Broker b19= new Broker("Rogelio","Arsenault","rogelio.arsenault","rogelio.arsenault123");
		Broker b20= new Broker("Meryl","Lossett","meryl.lossett","meryl.lossett123");

		
		brokerDao.add(b1);
		brokerDao.add(b2);
		brokerDao.add(b3);
		brokerDao.add(b4);
		brokerDao.add(b5);
		brokerDao.add(b6);
		brokerDao.add(b7);
		brokerDao.add(b8);
		brokerDao.add(b9);
		brokerDao.add(b10);
		brokerDao.add(b11);
		brokerDao.add(b12);
		brokerDao.add(b13);
		brokerDao.add(b14);
		brokerDao.add(b15);
		brokerDao.add(b16);
		brokerDao.add(b17);
		brokerDao.add(b18);
		brokerDao.add(b19);
		brokerDao.add(b20);

		Portfolio p1 = new Portfolio("Rainbow Scheme",0.0);
		Portfolio p2 = new Portfolio("Conservative Fund", 0.0);
		Portfolio p3 = new Portfolio("Multi-Sector Equity ", 0.0);
		Portfolio p4 = new Portfolio("Age 65 Plus Fund", 0.0);
		Portfolio p5 = new Portfolio("Star Trek Plan", 0.0);
	
		portfolioDao.add(p1);
		portfolioDao.add(p2);
		portfolioDao.add(p3);
		portfolioDao.add(p4);
		portfolioDao.add(p5);

		
		tradeDao.add(new Trade(	brokerDao.getById(109)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-19 02:21:26	"	,	2300000.00	,	2300000.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-19 08:56:20	"	,	1900000.00	,	1900000.00	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(131)	,	assetDao.getById(5)	,	"	2018-11-19 09:18:29	"	,	3000000.00	,	3000000.00	));
		tradeDao.add(new Trade(	brokerDao.getById(112)	,	portfolioDao.getById(132)	,	assetDao.getById(5)	,	"	2018-11-19 09:57:11	"	,	2800000.00	,	2800000.00	));
		tradeDao.add(new Trade(	brokerDao.getById(113)	,	portfolioDao.getById(133)	,	assetDao.getById(5)	,	"	2018-11-19 14:36:02	"	,	2500000.00	,	2500000.00	));
		tradeDao.add(new Trade(	brokerDao.getById(114)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-19 15:13:03	"	,	-17424.00	,	-17424.00	));
		tradeDao.add(new Trade(	brokerDao.getById(114)	,	portfolioDao.getById(129)	,	assetDao.getById(9)	,	"	2018-11-19 15:13:03	"	,	100.00	,	17424.00	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-19 19:45:22	"	,	-52220.50	,	-52220.50	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(129)	,	assetDao.getById(13)	,	"	2018-11-20 01:15:30	"	,	50.00	,	52220.50	));
		tradeDao.add(new Trade(	brokerDao.getById(116)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-20 01:46:02	"	,	-433620.00	,	-433620.00	));
		tradeDao.add(new Trade(	brokerDao.getById(116)	,	portfolioDao.getById(129)	,	assetDao.getById(14)	,	"	2018-11-20 01:48:05	"	,	3212.00	,	433620.00	));
		tradeDao.add(new Trade(	brokerDao.getById(109)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-20 02:44:54	"	,	-341297.00	,	-341297.00	));
		tradeDao.add(new Trade(	brokerDao.getById(109)	,	portfolioDao.getById(130)	,	assetDao.getById(15)	,	"	2018-11-20 03:18:17	"	,	7100.00	,	341297.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(131)	,	assetDao.getById(5)	,	"	2018-11-20 04:49:25	"	,	-985500.00	,	-985500.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(131)	,	assetDao.getById(19)	,	"	2018-11-20 06:22:12	"	,	5000.00	,	985500.00	));
		tradeDao.add(new Trade(	brokerDao.getById(117)	,	portfolioDao.getById(133)	,	assetDao.getById(5)	,	"	2018-11-20 06:48:32	"	,	-599560.00	,	-599560.00	));
		tradeDao.add(new Trade(	brokerDao.getById(117)	,	portfolioDao.getById(133)	,	assetDao.getById(16)	,	"	2018-11-20 08:05:07	"	,	13000.00	,	599560.00	));
		tradeDao.add(new Trade(	brokerDao.getById(116)	,	portfolioDao.getById(132)	,	assetDao.getById(5)	,	"	2018-11-20 10:27:15	"	,	-66847.20	,	-66847.20	));
		tradeDao.add(new Trade(	brokerDao.getById(116)	,	portfolioDao.getById(132)	,	assetDao.getById(38)	,	"	2018-11-20 14:13:38	"	,	460.00	,	66847.20	));
		tradeDao.add(new Trade(	brokerDao.getById(119)	,	portfolioDao.getById(133)	,	assetDao.getById(5)	,	"	2018-11-20 14:23:31	"	,	-25260.00	,	-25260.00	));
		tradeDao.add(new Trade(	brokerDao.getById(119)	,	portfolioDao.getById(133)	,	assetDao.getById(82)	,	"	2018-11-20 15:51:20	"	,	1200.00	,	25260.00	));
		tradeDao.add(new Trade(	brokerDao.getById(123)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-20 16:13:01	"	,	-30106.35	,	-30106.35	));
		tradeDao.add(new Trade(	brokerDao.getById(123)	,	portfolioDao.getById(130)	,	assetDao.getById(22)	,	"	2018-11-20 21:39:44	"	,	135.00	,	30106.35	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-20 21:57:11	"	,	-111350.00	,	-111350.00	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(129)	,	assetDao.getById(36)	,	"	2018-11-21 00:19:10	"	,	2500.00	,	111350.00	));
		tradeDao.add(new Trade(	brokerDao.getById(114)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-21 00:39:00	"	,	-71555.04	,	-71555.04	));
		tradeDao.add(new Trade(	brokerDao.getById(114)	,	portfolioDao.getById(130)	,	assetDao.getById(12)	,	"	2018-11-21 10:42:36	"	,	68.00	,	71555.04	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(131)	,	assetDao.getById(5)	,	"	2018-11-21 12:51:54	"	,	-11411.12	,	-11411.12	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(131)	,	assetDao.getById(18)	,	"	2018-11-21 15:45:16	"	,	98.00	,	11411.12	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-21 19:27:10	"	,	-131535.00	,	-131535.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(129)	,	assetDao.getById(12)	,	"	2018-11-21 19:40:57	"	,	125.00	,	131535.00	));
		tradeDao.add(new Trade(	brokerDao.getById(116)	,	portfolioDao.getById(133)	,	assetDao.getById(5)	,	"	2018-11-22 06:29:30	"	,	-7137.94	,	-7137.94	));
		tradeDao.add(new Trade(	brokerDao.getById(116)	,	portfolioDao.getById(133)	,	assetDao.getById(27)	,	"	2018-11-22 09:05:20	"	,	146.00	,	7137.94	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(132)	,	assetDao.getById(5)	,	"	2018-11-22 13:35:17	"	,	-10655.52	,	-10655.52	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(132)	,	assetDao.getById(28)	,	"	2018-11-22 14:26:03	"	,	158.00	,	10655.52	));
		tradeDao.add(new Trade(	brokerDao.getById(118)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-22 20:38:37	"	,	-222056.73	,	-222056.73	));
		tradeDao.add(new Trade(	brokerDao.getById(118)	,	portfolioDao.getById(129)	,	assetDao.getById(24)	,	"	2018-11-22 21:20:38	"	,	2709.00	,	222056.73	));
		tradeDao.add(new Trade(	brokerDao.getById(112)	,	portfolioDao.getById(133)	,	assetDao.getById(5)	,	"	2018-11-23 00:42:59	"	,	-100263.36	,	-100263.36	));
		tradeDao.add(new Trade(	brokerDao.getById(112)	,	portfolioDao.getById(133)	,	assetDao.getById(13)	,	"	2018-11-23 02:02:48	"	,	96.00	,	100263.36	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(132)	,	assetDao.getById(5)	,	"	2018-11-23 03:30:08	"	,	-2589.15	,	-2589.15	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(132)	,	assetDao.getById(82)	,	"	2018-11-23 05:51:42	"	,	123.00	,	2589.15	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-23 06:38:04	"	,	-56998.48	,	-56998.48	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(130)	,	assetDao.getById(10)	,	"	2018-11-23 08:19:00	"	,	532.00	,	56998.48	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-23 10:03:39	"	,	-81686.36	,	-81686.36	));
		tradeDao.add(new Trade(	brokerDao.getById(115)	,	portfolioDao.getById(129)	,	assetDao.getById(36)	,	"	2018-11-23 10:25:29	"	,	1834.00	,	81686.36	));
		tradeDao.add(new Trade(	brokerDao.getById(113)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-23 13:09:37	"	,	-790710.00	,	-790710.00	));
		tradeDao.add(new Trade(	brokerDao.getById(113)	,	portfolioDao.getById(130)	,	assetDao.getById(11)	,	"	2018-11-23 13:55:05	"	,	500.00	,	790710.00	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(132)	,	assetDao.getById(5)	,	"	2018-11-23 14:56:16	"	,	-420912.00	,	-420912.00	));
		tradeDao.add(new Trade(	brokerDao.getById(111)	,	portfolioDao.getById(132)	,	assetDao.getById(12)	,	"	2018-11-23 17:25:45	"	,	400.00	,	420912.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(130)	,	assetDao.getById(5)	,	"	2018-11-23 18:03:12	"	,	-522205.00	,	-522205.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(130)	,	assetDao.getById(13)	,	"	2018-11-23 20:57:30	"	,	500.00	,	522205.00	));
		tradeDao.add(new Trade(	brokerDao.getById(114)	,	portfolioDao.getById(131)	,	assetDao.getById(5)	,	"	2018-11-23 22:11:43	"	,	-112483.80	,	-112483.80	));
		tradeDao.add(new Trade(	brokerDao.getById(114)	,	portfolioDao.getById(131)	,	assetDao.getById(15)	,	"	2018-11-24 00:52:09	"	,	2340.00	,	112483.80	));
		tradeDao.add(new Trade(	brokerDao.getById(117)	,	portfolioDao.getById(129)	,	assetDao.getById(5)	,	"	2018-11-24 01:20:01	"	,	-609840.00	,	-609840.00	));
		tradeDao.add(new Trade(	brokerDao.getById(110)	,	portfolioDao.getById(129)	,	assetDao.getById(9)	,	"	2018-11-24 04:43:46	"	,	3500.00	,	609840.00	));
		tradeDao.add(new Trade(	brokerDao.getById(118)	,	portfolioDao.getById(132)	,	assetDao.getById(5)	,	"	2018-11-24 09:10:20	"	,	-810236.16	,	-810236.16	));
		tradeDao.add(new Trade(	brokerDao.getById(118)	,	portfolioDao.getById(132)	,	assetDao.getById(16)	,	"	2018-11-24 11:08:12	"	,	17568.00	,	810236.16	));

		
		entityManagerFactory.close();

		
		
	}
}