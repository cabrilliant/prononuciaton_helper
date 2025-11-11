package com.pronunciationhelper;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            Map.entry("Guthix", "GUTH-icks"),

            // H
            Map.entry("Harralander", "HAH-ruh-land-er"),
            Map.entry("Hazeel", "HAZ-eel"),

            // I
            Map.entry("Iban", "ee-BAHN"),
            Map.entry("Icthlarin", "ICK-thlar-in"),
            Map.entry("Ikov", "i-KOV"),
            Map.entry("Isafdar", "ISS-aff-dar"),

            // J
            Map.entry("Jagex", "JAG-ecks"),
            Map.entry("Jhallan", "Jah-LAN"),

            // K
            Map.entry("K'ril Tsutsaroth", "KRILL TUTT-zee-roth"),
            Map.entry("Kalphite", "KAL-fight"),
            Map.entry("Kandarin", "kan-DAR-in"),
            Map.entry("Karamja", "ker-RAM-jar"),
            Map.entry("Karil", "KAH-ril"),
            Map.entry("Kree'Arra", "KREE-ah-ruh"),

            // L
            Map.entry("Lletya", "LLE-to-ah"),
            Map.entry("Lumbridge", "LUM-bridge"),

            // M
            Map.entry("Mahjarrat", "MAH-jer-att"),
            Map.entry("Marimbo", "mah-RIM-bo"),
            Map.entry("Menaphos", "men-AH-foz"),
            Map.entry("Misthalin", "MISS-thah-lin"),
            Map.entry("Morytania", "mor-ee-TAY-nee-ah"),
            Map.entry("Mos Le’Harmless", "MOH-s lee-HARM-less"),

            // N
            Map.entry("Naragi", "Na-RAH-gee"),
            Map.entry("Neitiznot", "NAY-tizz-not"),

            // O
            Map.entry("Ocellus", "Oh-SELL-us"),
            Map.entry("Ozan", "OH-zan"),

            // P
            Map.entry("Pollnivneach", "POL-niv-neech"),
            Map.entry("Port Phasmatys", "PORT faz-MAT-iss"),
            Map.entry("Prifddinas", "prive-THEE-nuss"),

            // R
            Map.entry("Ranarr", "Ran-AH"),
            Map.entry("Rellekka", "rell-eh-KAH"),

            // S
            Map.entry("Saradomin", "sa-ra-DOME-in"),
            Map.entry("Senntisten", "sen-TISS-ten"),
            Map.entry("Seren", "SEH-run"),
            Map.entry("Sliske", "SLISS-kay"),
            Map.entry("Sophanem", "SOFF-uh-nem"),
            Map.entry("Statius", "STAY-shuss"),

            // T
            Map.entry("Taverley", "TAH-ver-lee"),
            Map.entry("Tirannwn", "TIR-an-un"),
            Map.entry("TokHaar", "TOK-har"),
            Map.entry("Torag", "TOR-agg"),
            Map.entry("Torstol", "TOR-stoll"),
            Map.entry("Tumeken", "TOO-meh-ken"),
            Map.entry("Tuska", "TUSS-kah"),
            Map.entry("TzHaar", "ZAR"),
            Map.entry("TzTok-Jad", "tuz-tok-JAD"),

            // V
            Map.entry("Varrock", "vah-ROCK"),
            Map.entry("Verac", "vuh-RACK"),

            // W
            Map.entry("Wahisietel", "WAH-hee-zee-tel"),

            // X
            Map.entry("Xenia", "ZEE-nyuh"),

            // Y
            Map.entry("Yanille", "ya-NEEL"),

            // Z
            Map.entry("Zamorak", "ZAM-or-ack"),
            Map.entry("Zilyana", "zil-YAR-nuh"),
            Map.entry("Zuriel", "ZUR-ee-ell")
    );
}
