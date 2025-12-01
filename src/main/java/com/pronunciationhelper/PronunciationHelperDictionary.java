package com.pronunciationhelper;

import java.util.*;

public class PronunciationHelperDictionary
{
    public static final Map<String, String> PRONUNCIATIONS = Map.ofEntries(
            // A
            Map.entry("Acheron", "ASH-uh-ron"),
            Map.entry("Ahrim", "AH-rim"),
            Map.entry("Akthanakos", "AK-THAN-ah-koss"),
            Map.entry("Al Kharid", "al khar-ID (rhymes with 'hid')"),
            Map.entry("Aluft Gianne", "ah-LUFT JEE-an"),
            Map.entry("Amascut", "AH-mass-cut"),
            Map.entry("Apmeken", "AP-muh-ken"),
            Map.entry("Arandar", "AH-ran-dar"),
            Map.entry("Ardougne", "arr-DOYN"),
            Map.entry("Ariane", "ah-ree-ANN"),
            Map.entry("Armadyl", "ARM-uh-dill"),
            Map.entry("Arposandra", "AR-po-SAN-drah"),
            Map.entry("Arrav", "AH-rav"),
            Map.entry("Ascertes", "ASS-er-tees"),
            Map.entry("Asgarnia", "as-GAR-nee-uh"),
            Map.entry("Avantoe", "av-an-TOE"),
            Map.entry("Awowogei", "AH-woo-woo-gee"),
            Map.entry("Azzanadra", "AZ-an-ah-druh"),

            // B
            Map.entry("Bal’lak", "ba-LACK"),
            Map.entry("Bandos", "BAN-doss"),
            Map.entry("Bedabin", "BED-uh-bin"),
            Map.entry("Bilrach", "BILL-rack"),
            Map.entry("Brimhaven", "BRIM-hay-vun"),
            Map.entry("Burgh De Rott", "BUR der ROT"),

            // C
            Map.entry("Canifis", "CAN-ih-fiss"),
            Map.entry("Catherby", "CATH-er-bee"),
            Map.entry("Chaeldar", "KAY-ull-dar"),
            Map.entry("Cithara", "SITH-er-uh"),
            Map.entry("Citharede", "sith-er-EED"),
            Map.entry("Crondis", "CRON-diss"),

            // D
            Map.entry("Daemonheim", "DEE-mon-hime"),
            Map.entry("Daquarius", "da-KAR-ee-us"),
            Map.entry("Darkmeyer", "DARK-my-er"),
            Map.entry("Dharok", "DA-rock"),
            Map.entry("Dionysius", "dy-oh-NY-see-us"),
            Map.entry("Dorgesh-Kaan", "door-gesh-KARN"),
            Map.entry("Dorgeshuun", "DOOR-gesh-oon"),
            Map.entry("Drakan", "DRACK-ahn"),

            // E
            Map.entry("Efaritay", "EFF-our-ee-TAY"),
            Map.entry("Elid", "eh-LID"),
            Map.entry("Elidinis", "eh-LID-in-iss"),
            Map.entry("Elysian", "i-LIZ-ee-uhn"),
            Map.entry("Enakhra", "ee-NACK-ra"),
            Map.entry("Entrana", "en-TRAR-nuh"),
            Map.entry("Etceteria", "ETT-suh-tare-ee-ah"),

            // F
            Map.entry("Falador", "FAL-ah-door"),
            Map.entry("Fenkenstrain", "FEN-ken-strain"),
            Map.entry("Fremennik", "FREM-eh-nick"),
            Map.entry("Freneskae", "FRE-ness-kay"),

            // G
            Map.entry("Gielinor", "GILL-in-or"),
            Map.entry("Glacors", "GLAY-soars"),
            Map.entry("Glough", "GLUFF"),
            Map.entry("Glouphrie", "GLUFF-ree"),
            Map.entry("Golem", "GO-lum"),
            Map.entry("Gorajo", "gore-AH-ho"),
            Map.entry("Graardor", "GRAAR-door"),
            Map.entry("Gulega", "gu-LAY-guh"),
            Map.entry("Gunnarsgrun","GUH-nars-grun"),
            Map.entry("Gu’tanoth","goo-TAN-oth"),
            Map.entry("Guthix", "GUTH-icks"),
            Map.entry("Guam", "GWAM"),

            // H
            Map.entry("Haasgehnahk", "has-GEN-ack"),
            Map.entry("Har-aken", "har-ACK-un"),
            Map.entry("Har’laak", "HAR-lack"),
            Map.entry("Harralander", "HAH-ruh-land-er"),
            Map.entry("Hazeel", "HAZ-eel"),
            Map.entry("Heim Crab", "HYME CRAB"),
            Map.entry("Hemenster", "HEH-men-ster"),

            // I
            Map.entry("Iban", "ee-BAHN"),
            Map.entry("Icthlarin", "ICK-thlar-in"),
            Map.entry("Icyene", "i-SEEN"),
            Map.entry("Ihlakizan", "i-LACK-ee-zan"),
            Map.entry("Ikov", "i-KOV"),
            Map.entry("Irit", "ih-RIT"),
            Map.entry("Isafdar", "ISS-aff-dar"),

            // J
            Map.entry("Jagex", "JAG-ecks"),
            Map.entry("Jaldroacht", "JAL-dro-akt"),
            Map.entry("Jaleustrophos", "jal-YUS-tro-foss"),
            Map.entry("Jalsavrah", "jal-SAV-rah"),
            Map.entry("Jatizso", "yah-TIZZ-so"),
            Map.entry("Jhallan", "Jah-LAN"),
            Map.entry("Jiggig", "jih-GIG"),

            // K
            Map.entry("K'ril Tsutsaroth", "KRILL TUTT-zee-roth"),
            Map.entry("Kal’gerion", "KAL-gare-ee-on"),
            Map.entry("Kalphite", "KAL-fight"),
            Map.entry("Kandarin", "kan-DAR-in"),
            Map.entry("Karambwan", "ker-RAM-bwan"),
            Map.entry("Karambwanji", "ker-RAM-bwan-jee"),
            Map.entry("Karamja", "ker-RAM-jar"),
            Map.entry("Karil", "KAH-ril"),
            Map.entry("Keldagrim", "KELL-duh-grim"),
            Map.entry("Kethsi", "KETH-see"),
            Map.entry("Kharazi", "KUH-rah-zee"),
            Map.entry("Kharidian", "kar-RID-ian"),
            Map.entry("Khigohrahk", "ki-go-RACK"),
            Map.entry("Kharshai", "KAR-shy"),
            Map.entry("Khazard", "kah-ZARD"),
            Map.entry("Kinshra", "kin-SHRAH"),
            Map.entry("Korasi", "kor-AH-zee"),
            Map.entry("Koschei", "KOSH-i"),
            Map.entry("Kree'Arra", "KREE-ah-ruh"),
            Map.entry("Kwuarm", "KWARM"),

            // L
            Map.entry("Lakhrahnaz", "LAH-kruh-naz"),
            Map.entry("Lantadyme", "LANT-er-deem"),
            Map.entry("Linza", "LIN-zuh"),
            Map.entry("Lletya", "LLE-to-ah"),
            Map.entry("Lucien", "LOO-see-yun"),
            Map.entry("Lumbridge", "LUM-bridge"),

            // M
            Map.entry("McGrubor", "muh-GROO-ber"),
            Map.entry("Mahjarrat", "MAH-jer-att"),
            Map.entry("Marimbo", "mah-RIM-bo"),
            Map.entry("Marrentill", "mah-ren-TILL"),
            Map.entry("Mazchna", "mash-ner"),
            Map.entry("Meiyerditch", "my-er-DITCH"),
            Map.entry("Menaphos", "men-AH-foz"),
            Map.entry("Miscellanea", "miss-ell-AY-nee-ah"),
            Map.entry("Misthalin", "MISS-thah-lin"),
            Map.entry("Mort’ton", "MOR-tonn"),
            Map.entry("Mort Myre", "MORT My-er"),
            Map.entry("Morytania", "mor-ee-TAY-nee-ah"),
            Map.entry("Mos Le’Harmless", "MOH-s lee-HARM-less"),
            Map.entry("Musa", "MOO-sah"),
            Map.entry("Muspah", "MOOSE-pa"),
            Map.entry("Myreque", "my-er-KEY"),

            // N
            Map.entry("Naragi", "Na-RAH-gee"),
            Map.entry("Nardah", "NAR-duh"),
            Map.entry("Neitiznot", "NAY-tizz-not"),

            // O
            Map.entry("Ocellus", "Oh-SELL-us"),
            Map.entry("Oo’glog", "OO-glog"),
            Map.entry("Owen", "OH-win"),
            Map.entry("Ozan", "OH-zan"),

            // P
            Map.entry("Pawya", "POOR-yuh"),
            Map.entry("Piscatoris", "piss-kah-TOR-iss"),
            Map.entry("Pollnivneach", "POL-niv-neech"),
            Map.entry("Port Phasmatys", "PORT faz-MAT-iss"),
            Map.entry("Prifddinas", "prive-THEE-nuss"),

            // R
            Map.entry("Ranarr", "Ran-AH"),
            Map.entry("Reldo", "RELL-doh"),
            Map.entry("Rellekka", "rell-eh-KAH"),

            // S
            Map.entry("Safalaan", "SAFF-ah-lan"),
            Map.entry("Sagittare", "SAJ-ee-tare"),
            Map.entry("Sanguinesti", "sang-gwin-NEST-tee"),
            Map.entry("Saradomin", "sa-ra-DOME-in"),
            Map.entry("Scabaras", "SCAB-ah-rass"),
            Map.entry("Scimitar", "SIM-mit-tar"),
            Map.entry("Senntisten", "sen-TISS-ten"),
            Map.entry("Seren", "SEH-run"),
            Map.entry("Sharathteerk", "SHA-rath-tea-erk"),
            Map.entry("Shukarhazh", "SHOO-kuh-raz"),
            Map.entry("Skargaroth", "SCAR-gah-roth"),
            Map.entry("Sliske", "SLISS-kay"),
            Map.entry("Sophanem", "SOFF-uh-nem"),
            Map.entry("Statius", "STAY-shuss"),
            Map.entry("Strykewyrm", "STRIKE-worm"),

            // T
            Map.entry("Tai Bwo Wannai", "TIE BWO ONE-i"),
            Map.entry("Tarromin", "TAH-roe-min"),
            Map.entry("Taverley", "TAH-ver-lee"),
            Map.entry("Tirannwn", "TIR-an-un"),
            Map.entry("To’kash", "toh-CASH"),
            Map.entry("TokHaar", "TOK-har"),
            Map.entry("Torag", "TOR-agg"),
            Map.entry("Torstol", "TOR-stoll"),
            Map.entry("Triskelion", "Tri-SKEL-li-on"),
            Map.entry("Trollweiss", "TROLL-vice"),
            Map.entry("Tumeken", "TOO-meh-ken"),
            Map.entry("Tuska", "TUSS-kah"),
            Map.entry("TzHaar", "ZAR"),
            Map.entry("TzTok-Jad", "tuz-tok-JAD"),

            // U
            Map.entry("Ugthanki", "UG-thank-ee"),
            Map.entry("Uzer", "OO-zer"),

            // V
            Map.entry("Vanescula", "VAN-ess-cue-la"),
            Map.entry("Vannaka", "VAN-ah-kuh"),
            Map.entry("Varrock", "vah-ROCK"),
            Map.entry("Veliaf", "VELL-ee-aff"),
            Map.entry("Verac", "vuh-RACK"),

            // W
            Map.entry("Wahisietel", "WAH-hee-zee-tel"),

            // X
            Map.entry("Xenia", "ZEE-nyuh"),

            // Y
            Map.entry("Yanille", "ya-NEEL"),
            Map.entry("Yk’lagor", "YUK-lag-gor"),

            // Z
            Map.entry("Zamorak", "ZAM-or-ack"),
            Map.entry("Zanaris", "zuh-NAR-iss"),
            Map.entry("Zemouregal", "ZEM-or-ee-gal"),
            Map.entry("Zenevivia", "zen-uh-VIV-ee-ah"),
            Map.entry("Zilyana", "zil-YAR-nuh"),
            Map.entry("Zuriel", "ZUR-ee-ell")
    );
}
