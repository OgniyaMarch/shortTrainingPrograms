package wordle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Dictionary {
    private List<Word> wordlist = new ArrayList<>(30);
    public Dictionary(){
        wordlist.add(new Word(Arrays.asList("about", "above", "abuse", "actor", "acute", "admit","adopt","adult","after",
                "again","agent","agree","ahead","alarm","album","alert","alike","alive","allow","alone","along","alter","among",
                "anger","angle","angry","apart","apple","apply","arena","argue","arise","array","aside","asset","audio","audit","avoid","award","aware")));
        wordlist.add(new Word(Arrays.asList("badly","baker","bases","basic","basis","beach","began","begin","begun","being","below",
                "bench","billy","birth","black","blame","blind","block","blood","board","boost","booth","bound","brain","brand","bread","break","breed",
                "brief","bring","broad","broke","brown","build","built","buyer")));
        wordlist.add(new Word(Arrays.asList("cable","calif","carry","catch","cause","chain","chair","chart","chase","cheap","check","chest",
                "chief","child","china","chose","civil","claim","class","clean","clear","click","clock","close","coach","coast","could","count","court",
                "cover","craft","crash","cream","crime","cross","crowd","crown","curve","cycle")));
        wordlist.add(new Word(Arrays.asList("daily","dance","dated","dealt","death","debut","delay","depth","doing","doubt","dozen","draft","drama","drawn",
                "dream","dress","drill","drink","drive","drove","dying")));
        wordlist.add(new Word(Arrays.asList("eager","early","earth","eight","elite","empty","enemy","enjoy","enter","entry","equal","error","event","every",
                "exact","exist","extra")));
        wordlist.add(new Word(Arrays.asList("faith","fault","fibre","field","fifth","fifty","fight","final","first","fixed","flash","fleet","floor","fluid",
                "focus","force","forth","forty","forum","found","frame","frank","fraud","fresh","front","fruit","fully","funny")));
        wordlist.add(new Word(Arrays.asList("giant","given","glass","globe","going","grace","grade","grand","grant","grass","great","green","gross","group",
                "grown","guard","guess","guest","guide")));
        wordlist.add(new Word(Arrays.asList("happy","harry","heart","heavy","hence","horse","hotel","house","human")));
        wordlist.add(new Word(Arrays.asList("ideal","image","index","inner","input","irony","issue")));
        wordlist.add(new Word(Arrays.asList("joint","judge","juice")));
        wordlist.add(new Word(Arrays.asList("known")));
        wordlist.add(new Word(Arrays.asList("label","large","laser","later","laugh","layer","learn","lease","least","leave","legal","level","light",
                "limit","local","logic","loose","lower","lucky","lunch","lying")));
        wordlist.add(new Word(Arrays.asList("magic","major","maker","march","match","mayor","meant","media","metal","might","minor","minus","mixed",
                "model","money","month","moral","motor","mount","mouse","mouth","movie","music")));
        wordlist.add(new Word(Arrays.asList("needs","never","newly","night","noise","north","noted","novel","nurse")));
        wordlist.add(new Word(Arrays.asList("occur","ocean","offer","often","order","other","ought")));
        wordlist.add(new Word(Arrays.asList("paint","panel","paper","party","peace","phase","phone","photo","piece","pilot","pitch","place","plain",
                "plane","plant","plate","point","pound","power","press","price","pride","prime","print","prior","prize","proof","proud","prove")));
        wordlist.add(new Word(Arrays.asList("queen", "quick", "quiet", "quite")));
        wordlist.add(new Word(Arrays.asList("radio", "raise", "range", "rapid", "ratio", "reach", "ready", "refer", "right", "rival", "river",
                "roman", "rough", "round", "route", "royal", "rural")));
        wordlist.add(new Word(Arrays.asList("scale", "scene", "scope", "score", "sense", "serve", "seven", "shall", "shape", "share", "sharp", "sheet",
                "shelf", "shell", "shift", "shirt", "shock", "shoot", "short", "shown", "sight", "since", "sixth", "sixty", "sized", "skill", "sleep",
                "slide", "small", "smart", "smile", "smith", "smoke", "solid", "solve", "sorry", "sound", "south", "space", "spare", "speak", "speed",
                "spend", "spent", "split", "spoke", "sport", "staff", "stage", "stake", "stand", "start", "state", "steam", "steel", "stick", "still",
                "stock", "stone", "stood", "store", "storm", "story", "strip", "stuck", "study", "stuff", "style", "sugar", "suite", "super", "sweet")));
        wordlist.add(new Word(Arrays.asList("table", "taken", "taste", "taxes", "teach", "teeth", "texas", "thank", "theft", "their", "theme", "there",
                "these", "thick", "thing", "think", "third", "those", "three", "threw", "throw", "tight", "times", "tired", "title", "today", "topic",
                "total", "touch", "tough", "tower", "track", "trade", "train", "treat", "trend", "trial", "tried", "tries", "truck", "truly", "trust",
                "truth", "twice")));
        wordlist.add(new Word(Arrays.asList("under", "undue", "union", "unity", "until", "upper", "upset", "urban", "usage", "usual")));
        wordlist.add(new Word(Arrays.asList("valid", "value", "video", "virus", "visit", "vital", "voice")));
        wordlist.add(new Word(Arrays.asList("waste", "watch", "water", "wheel", "where", "which", "while", "white", "whole", "whose", "woman", "world",
                "worry", "worse", "worst", "worth", "would", "wound", "write", "wrong", "wrote")));
        wordlist.add(new Word(Arrays.asList("xenon", "xerox")));
        wordlist.add(new Word(Arrays.asList("yield", "young", "youth")));
        wordlist.add(new Word(Arrays.asList("zebra")));
    }

    public List<Word> getWordlist() {
        return wordlist;
    }


    public void setWordlist(List<Word> wordlist) {
        this.wordlist = wordlist;
    }

    public boolean checkContainsWord(int indexOfList, String userInputWord){
        Word tempWord = wordlist.get(indexOfList);
        return tempWord.checkContain(userInputWord);
    }
}
