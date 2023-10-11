package wordle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Dictionary {
    private List<Word> wordlist = new ArrayList<>(30);
    Dictionary(){
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
        wordlist.add(new Word(Arrays.asList("Scale", "Scene", "Scope", "Score", "Sense", "Serve", "Seven", "Shall", "Shape", "Share", "Sharp", "Sheet",
                "Shelf", "Shell", "Shift", "Shirt", "Shock", "Shoot", "Short", "Shown", "Sight", "Since", "Sixth", "Sixty", "Sized", "Skill", "Sleep",
                "Slide", "Small", "Smart", "Smile", "Smith", "Smoke", "Solid", "Solve", "Sorry", "Sound", "South", "Space", "Spare", "Speak", "Speed",
                "Spend", "Spent", "Split", "Spoke", "Sport", "Staff", "Stage", "Stake", "Stand", "Start", "State", "Steam", "Steel", "Stick", "Still",
                "Stock", "Stone", "Stood", "Store", "Storm", "Story", "Strip", "Stuck", "Study", "Stuff", "Style", "Sugar", "Suite", "Super", "Sweet")));
        wordlist.add(new Word(Arrays.asList("Table", "Taken", "Taste", "Taxes", "Teach", "Teeth", "Texas", "Thank", "Theft", "Their", "Theme", "There",
                "These", "Thick", "Thing", "Think", "Third", "Those", "Three", "Threw", "Throw", "Tight", "Times", "Tired", "Title", "Today", "Topic",
                "Total", "Touch", "Tough", "Tower", "Track", "Trade", "Train", "Treat", "Trend", "Trial", "Tried", "Tries", "Truck", "Truly", "Trust",
                "Truth", "Twice")));
        wordlist.add(new Word(Arrays.asList("Under", "Undue", "Union", "Unity", "Until", "Upper", "Upset", "Urban", "Usage", "Usual")));
        wordlist.add(new Word(Arrays.asList("Valid", "Value", "Video", "Virus", "Visit", "Vital", "Voice")));
        wordlist.add(new Word(Arrays.asList("Waste", "Watch", "Water", "Wheel", "Where", "Which", "While", "White", "Whole", "Whose", "Woman", "World",
                "Worry", "Worse", "Worst", "Worth", "Would", "Wound", "Write", "Wrong", "Wrote")));
        wordlist.add(new Word(Arrays.asList("Yield", "Young", "Youth")));
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
