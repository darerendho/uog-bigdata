package ae;

import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ToolRunner;

public class Test {
	public static void main(String[] args) throws Exception {
		String article = "REVISION 12 30364918 Anarchism 2005-12-06T17:44:47Z RJII 141644\n" + 
				"CATEGORY Social_philosophy Political_theories Forms_of_government Anarchism Political_ideology_entry_points\n" + 
				"IMAGE Zerzan.jpeg Goldman-4.jpg Kropotkin.jpg BenjaminTucker.jpg Blkred_flag.png Bakuninfull.jpg JohannMost.jpg Murray_Rothbard_Smile.JPG LeoTolstoy.jpg Proudhon-young.jpg\n" + 
				"MAIN 467_BC Seattle,_Washington Edward_Abbey Félix_Guattari Head_of_state John_Brown_(abolitionist) Environmental_movement Auroville Peter_Kropotkin Peter_Kropotkin Peter_Kropotkin Peter_Kropotkin Public_key_cryptography Autonomism Zapatista_Army_of_National_Liberation Green_anarchism Green_anarchism Green_anarchism General_strike Ku_Klux_Klan Worker_control Nestor_Makhno Nestor_Makhno International_Workers_Association Sans-culottes Robert_Nozick Robert_Nozick Spanish_Civil_War Spanish_Civil_War Spanish_Civil_War Spanish_Civil_War Spanish_Civil_War Abolitionism First_World_War Self-interest Eco-anarchists Market_economy Punk_rock Bourgeois Protest Wolfi_Landstreicher Wolfi_Landstreicher Daniel_Guérin Open_source Bryan_Caplan Pacifism Pacifism Pacifism Pacifism Dielo_Truda List_of_anarchists Voluntaryism Voluntaryism Factory_occupation_movements Fugitive_Slave_Law Cost_the_limit_of_price Bertrand_Russell Lew_Rockwell The_Diggers The_Diggers Anarcho-pacifism Turn_the_other_cheek Joe_Peacott African_Anarchism Usenet Buddhist_Anarchism Science Freetown_Christiania The_Kingdom_of_God_is_Within_You Workers_Solidarity_Alliance Johann_Most Johann_Most Stephen_Pearl_Andrews Russian_Civil_War List_of_anarchist_organizations Killing_King_Abacus Http://melior.univ-montp3.fr/ra_forum/en/people/berry_david/fascism_or_revolution.html Sam_Mbah Benjamin_Tucker Benjamin_Tucker Benjamin_Tucker Benjamin_Tucker Benjamin_Tucker Colin_Ward Jakob_Mauvillon Stregheria American_individualist_anarchism Second-wave_feminism War Wiki 1703 Jason_McQuinn Radical_feminism Collectivization Federation 1999 Gare_Saint-Lazare 1864 Bakunin Anarcho-pacifists Monopoly_on_the_legitimate_use_of_physical_force Cell_phone Nonviolent_resistance Nonviolent_resistance Social_network Ukraine Willful_Disobedience Riot List_of_left-wing_internationals Mutualism_(economic_theory) Anti-Racist_Action 1936 Evolution Peter_Marshall Indymedia Emile_Pouget Emma_Goldman Emma_Goldman Emma_Goldman Emma_Goldman Emma_Goldman Emma_Goldman History_of_Western_philosophy Patriarchy Patriarchy Civil_disobedience State Antigone Anarchism_in_the_English_tradition Bob_Black Bob_Black Keith_Preston Nonviolence Nonviolence The_Machinery_of_Freedom Culture_jamming 1872 France Haymarket_Riot Haymarket_Riot Anti-war Anti-war Work Anarchism_and_religion List_of_anarchism_web_resources POUM Voline Ernesto_Laclau List_of_anarchist_concepts Anabaptist Anabaptist Communist_anarchism 1886 Herbert_Spencer Herbert_Spencer Herbert_Spencer Christian_anarchism Christian_anarchism Christian_anarchism Communist_anarchist May_1968 Todd_May Dutch_people Post-left_anarchy Post-left_anarchy Post-left_anarchy Post-left_anarchy 1848 Gift_economy Nationalists Technology Technology CNT CNT CNT Anarchist Class_struggle Elements_of_Refusal Racist Guy_Debord A_History_of_Anarchism Gerrard_Winstanley Neo-imperialism Anarchist_People_of_Color Credit_unions Hague_Congress_(1872) World_War_I Mary_Wollstonecraft National_anarchism Egoism Information_technology World_Economic_Forum Kronstadt_rebellion Kronstadt_rebellion Alfredo_M._Bonanno Wendell_Phillips Seven_Against_Thebes File_sharing Use-value Altruism Insurrection Insurrection Randolph_Bourne Veganism Jesus 1871 Edmund_Burke Thomas_Jefferson Civil_Disobedience_(Thoreau) Basque French_Revolution Ideology Money World_Trade_Organization Tai-Xu Liberty Anarcho-syndicalist Internet Aristippus Courts Police Murray_Bookchin Murray_Bookchin Anarchy:_A_Journal_of_Desire_Armed From_Bakunin_to_Lacan:_Antiauthoritarianism_and_the_Dislocation_of_Power Frederic_Bastiat's_debate_with_Proudhon David_Friedman David_Friedman Voltairine_de_Cleyre British_National_Party Worship Mutual_Aid:_A_Factor_in_Evolution Fields,_Factories_and_Workshops Anarchist_economics Albert_Jay_Nock Fascism Utilitarianism Rudolf_Rocker Leo_Tolstoy Leo_Tolstoy Leo_Tolstoy Leo_Tolstoy Leo_Tolstoy Chinese_Anarchism Utopia Ayn_Rand Emile_Pataud Thebes_(Greece) Libertarian_socialism Tax_resistance Tax_resistance Authoritarian Authoritarian Aeschylus Situationist Catalonia Copenhagen Diogenes_of_Sinope Catalan Propaganda_by_the_deed Soviet_Union Josiah_Warren Egotism Pierre-Joseph_Proudhon Pierre-Joseph_Proudhon Pierre-Joseph_Proudhon Ashanti_Alston Ashanti_Alston Ashanti_Alston Greek_language Cynic Anarcho-primitivism Anarchist_Federation 1968 Carlo_Cafiero White Natural_law Vegetarianism Paris_Commune Bolsheviks Denmark Anarcha-Feminism Victor_Yarros Iain_M._Banks Noam_Chomsky The_Ex Stalinists Owenism Francisco_Franco Anti-semitic Ricardo_Flores_Magón Native_Americans_in_the_United_States Popular_front The_Holy_Spirit Establishment Future_Primitive Plato's_Republic The_Ego_And_Its_Own Larry_Gambone Umanità_Nova Direct_action Direct_action Direct_action Autonomist The_Culture Ruling_class Ruling_class Workers_Solidarity_Movement Anarchist_objections_to_marxism Franz_Oppenheimer WTO_Meeting_of_1999 WTO_Meeting_of_1999 Leon_Czolgosz Autonomous_Marxism Wage_slavery Revolution Revolution Earth_Liberation_Front Earth_Liberation_Front Luther_Blissett_(nom_de_plume) What_is_Property? Eco-feminism Eco-feminism Joseph_Déjacque Isaac_Puente Robert_Heinlein Slavery Libertarian Louis-Armand_de_Lom_d'Arce_de_Lahontan,_Baron_de_Lahontan Activism Giuseppe_Mazzini Digital_media Free_association Temple Science_fiction Communists Industrial_action 16th_century August_Spies Anarchy_in_Action Spanish_syndical_elections Nuer Post-anarchism Christian Black_anarchism Archon Personal_computing Crypto-anarchism Mutualism Mutualism Greek_philosophy German_Empire Saul_Newman Saul_Newman International_Workingmen's_Association International_Workingmen's_Association Industrial_Workers_of_the_World Infoshop Classical_liberalism Q_(novel) Workers_councils Libertarianism Strike_action Political_philosophy Self-governance Henry_Meulen Situationism Leopold_Kohr William_B._Greene North_America North_America Mutual_Aid:_A_Factor_in_Evolution Lysander_Spooner Lysander_Spooner Lysander_Spooner Stoic_philosophy Political_spectrum Sri_Aurobindo 1862 History 1897 G8 Earth_First! Earth_First! Earth_First! Alexander_Berkman Alexander_Berkman Alexander_Berkman Cynicism Jan_Narveson Corporatocracy Social_Democratic_Party_of_Germany Murray_Rothbard Murray_Rothbard Murray_Rothbard Murray_Rothbard Non-aggression_principle Anarcho-primitivists Spanish_Revolution Statism_and_Anarchy Confederacion_General_del_Trabajo_de_España Anarcho-syndicalism Anarcho-syndicalism Anarcho-syndicalism Electro-anarchy Neo-Nazi Capitalists Kevin_A._Carson Consensus Consensus Taoism Situationists American_Indian_Movement Anti-nuclear First_International First_International First_International Max_Stirner Max_Stirner Max_Stirner Ancient_Greece 1840 American_individualist_Anarchism Ammon_Hennacy Division_of_labor Anti-German Modern_Times Contractarianism 1970s Assassination Assassination Assassination Coercive_monopolies New_Harmony Robert_Graham John_Zerzan John_Zerzan Gustave_de_Molinari Gustave_de_Molinari Gustave_de_Molinari Porfirio_Diaz 1921 Poststructuralist North_Eastern_Federation_of_Anarchist_Communists 1793 1793 Races World_Bank Anarchist_symbolism Anarcho_capitalism China The_Conquest_of_Bread The_Conquest_of_Bread Individualist_anarchism William_Godwin William_Godwin Stoicism Anarchism/Links Fascist Fascist 17th_century Solidarity_Federation 1817 Iroquois Henry_David_Thoreau Nonresistance Simple_living GNU Russian_Revolution_of_1917 Russian_Revolution_of_1917 Russian_Revolution_of_1917 Barcelona Barcelona Socialization Anarchism_in_Spain Anarchism_in_Spain Anarchism_in_Spain Anarchism_in_Spain Minarchism Latin_America Crass Globalisation Gilles_Deleuze Revolution_of_1848_in_France Anarchism_and_Society History_of_China Antifa Fiat_money Andrea_Costa God God Auberon_Herbert Auberon_Herbert Government Government Linux Anti-statism Anti-globalization CrimethInc Robert_Owen Girondins Parisian Past_and_present_anarchist_communities 1960s Austrian_economics Platform Voluntary Confederación_Nacional_del_Trabajo United_Kingdom Emile_Armand Individualist_anarchism_and_anarcho-capitalism Chicago,_Illinois Contract Anarchy Anarchy Anarchist_communism Anarchist_communism Anarchist_communism Anarchist_communism Emile_Henry Mazzini Lorenzo_Komboa_Ervin Hans-Hermann_Hoppe Vietnam_War Profit Profit Free_market Free_Spirit Space_travel Well-field_system Western_Europe Cypherpunk Food_Not_Bombs Food_Not_Bombs Platformism Walden Civilization Civilization Civilization Civilization Utopia_(anarchist_community) Mikhail_Bakunin Mikhail_Bakunin American_individualist_anarchist Bomb Hierarchy Natural_Law Communes CGT CGT Mexican_Revolution Middle_Ages Social_movement Zeno_of_Citium Zeno_of_Citium Free_software_movement Free_software_movement Errico_Malatesta Errico_Malatesta Errico_Malatesta Post-colonialism Anarcho-capitalism War_in_Iraq Anarcho-punk Hakim_Bey Labor_theory_of_property Dual-power_networks Labor_theory_of_value Ranters IWW IWW IWW Class_war Ulrich_von_Beckerath Subjective_Theory_of_Value Comintern Frederic_Bastiat Frederic_Bastiat Anarchism_(book) Eurasian Black_anarchist Russell_Means Desktop_publishing Terrorism Terrorism Feudalism Henry_Appleton Deep_ecology Deep_ecology\n" + 
				"TALK\n" + 
				"USER\n" + 
				"USER_TALK\n" + 
				"OTHER Eu:Anarkismo Ar:لاسلطوية No:Anarkisme Sl:Anarhizem Is:Stjórnleysisstefna Fa:دولت‌زدائی Lt:Anarchizmas Gl:Anarquismo It:Anarchismo Ru:Анархизм Tr:Anarşizm Da:Anarkisme De:Anarchismus Sr:Анархизам Ca:Anarquisme Ko:아나키즘 M:Wikisource:Walden Eo:Anarkiismo Es:Anarquismo Zh:无政府主义 Nl:Anarchisme Et:Anarhism Sk:Anarchizmus Th:ลัทธิอนาธิปไตย Nn:Anarkisme Pl:Anarchizm Bg:Анархизъм Wiktionary:& He:אנרכיזם Ro:Anarhism Sv:Anarkism Wikisource:Civil_Disobedience_-_Henry_David_Thoreau Pt:Anarquismo Hu:Anarchizmus Id:Anarkisme Fr:Anarchisme Ast:Anarquismu Ja:アナキズム Fi:Anarkismi Zh-min-nan:Hui-thóng-tī-chú-gī Cs:Anarchismus Simple:Anarchism\n" + 
				"EXTERNAL http://dwardmac.pitzer.edu/Anarchist_Archives/bright/berkman/comanarchism/whatis_toc.html http://www.retailworkers.org/ http://www.infoshop.org/inews/article.php?story=05/01/06/7640998 http://www.barefootsworld.net/nockoets0.html http://www.attackthesystem.com/capitalism.html http://joseph.dejacque.free.fr/ecrits/lettreapjp.htm http://flag.blackened.net/revolt/anarchists/malatesta/rev_haste.html http://www.toxicpop.co.uk/library/taoism.htm http://recollectionbooks.com/bleed/gallery/galleryindex.htm http://oll.libertyfund.org/Texts/LFBooks/Spencer0236/SocialStatics/0331_Bk.html http://www.opp.uni-wuppertal.de/oppenheimer/st/state0.htm http://dwardmac.pitzer.edu/Anarchist_Archives/godwin/PJfrontpiece.html http://flag.blackened.net/daver/anarchism/tucker/tucker37.html http://dwardmac.pitzer.edu/Anarchist_Archives/ http://www.iwa-ait.org/ http://www.gemineye.free-online.co.uk/toobig.htm http://oll.libertyfund.org/Texts/LFBooks/Burke0061/Vindication/0339_Bk.html http://www.voluntaryist.com/nonvoting/ethics_of_voting.php http://melior.univ-montp3.fr/ra_forum/en/people/berry_david/fascism_or_revolution.html http://anarchoblogs.protest.net/ http://anarchism.ws/postleft.html http://www.spunk.org/library/intro/practice/sp001689.html http://pdx.iww.org/preamble.html http://www.againstpolitics.com/market_anarchism/appleton_boston.htm http://ns52.super-hosts.com/~vaz1net/bill/anarchism/library/WhatIsProperty/ http://www.cs.bris.ac.uk/~stefan/culture.html http://www.spaz.org/~dan/individualist-anarchist/ac-vs-ia.html http://www.postanarchism.org/ http://upload.wikimedia.org/wikipedia/en/e/e6/Resto.jpg http://www.anarcha.org/sallydarity/Anarcho-FeminismTwoStatements.htm http://www.zmag.org/content/showarticle.cfm?SectionID=41&ItemID=4796 http://www.mises.org/rothbard/ethics/ethics.asp http://oll.libertyfund.org/ToC/0146.php http://www.blackcrayon.com/page.jsp/library/britt1910.html http://www.blackcrayon.com/page.jsp/library/britt1910.html http://www.ozarkia.net/bill/anarchism/library/thelaw.html http://dwardmac.pitzer.edu/Anarchist_Archives/goldman/GoldmanCW.html http://www.hartford-hwp.com/archives/41/index-hn.html http://dwardmac.pitzer.edu/Anarchist_Archives/bakunin/godandstate/godandstate_ch1.html http://www.mises.org/rothbard/mes.asp http://www.mises.org/rothbard/mes.asp http://www.iww.org/ http://flag.blackened.net/revolt/platform/plat_preface.html http://world.std.com/~bbrigade/badpp3.htm http://www.anarco-nyc.net/anarchistpanther/writing4.html http://www.anarco-nyc.net/anarchistpanther/writing4.html http://etext.lib.virginia.edu/cgi-local/DHI/dhi.cgi?id=dv1-12 http://struggle.ws/hist_texts/warhealthstate1918.html http://anarchism.ws/ http://web.bilkent.edu.tr/Online/www.english.upenn.edu/jlynch/Frank/Godwin/pjtp.html http://www.infoshop.org/afterleftism.html http://recollectionbooks.com/bleed/Encyclopedia/DejacqueJoseph.htm\n" + 
				"TEMPLATE Mergefrom Anarchism\n" + 
				"COMMENT /* The first self-labeled anarchist */ small clarification on expropriation\n" + 
				"MINOR 0\n" + 
				"TEXTDATA 11530";
		//		 System.out.println(article);
		
		String[] sp = new String[0]; 
		sp = article.split("\n", -1);
		String result = "";

		// Split article into line
		String[] line= article.split("\n", -1);
//		for(int i=0; i<line.length;i++) {
//			System.out.println(line[i]);
//		}
		
		for(int i=0; i<line.length;i++) {

			// Split REVISION line to array sp[]
			if(line[i].startsWith("REVISION")) {
				sp = line[i].split(" ", -1);
			}

			// Collect MAIN line
			if(line[i].startsWith("MAIN")) {
				String temp = line[i].substring(line[i].indexOf(" ")+1);
				result += temp;
				break;
			}

			

		}
		
		String one = "Anarchism 1 631";
		String token[]= one.toString().split(" ",-1);
		if(token.length>0) {
			if(token[0].equals(">")) {
				//outGoing = value.toString().substring(value.toString().indexOf(">")+1);
			}
			else {
				String v = token[0].toString();
				Double rate = Double.parseDouble(token[1]) / Double.parseDouble(token[2]);
				System.out.println("GO HOMEEE");
				//sum += rate;
			}
		}
		


//				 StringTokenizer st = new StringTokenizer(article);
//			     while (st.hasMoreTokens()) {
//			         System.out.println(st.nextToken());
//			     }
	}
}
