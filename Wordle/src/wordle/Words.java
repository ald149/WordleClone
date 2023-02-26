/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
/**
 *
 * @author adarb
 */
public class Words {
    
    // 5 letter word bank 472 words 
    String[] w = {"about","above","abuse","actor","acute","admit","adopt","adult","after","again","agent",
            "agree","ahead","alarm","album","alert","alike","alive","allow","alone","along","alter","among","anger",
            "angle","angry","apart","apple","apply","arena","argue","arise","array","aside","asset","audio","audit","avoid","award",
            "aware","badly","baker","bases","basic","basis","beach","began","begin","begun","being","below","bench","billy","birth",
            "black","blame","blind","block","blood","board","boost","booth","bound","brain","brand","bread"," breed","brief",
            "bring","broad","broke","brown","build","built","buyer","cable","calif","carry","cause","chain","chair","chart",
            "chase","cheap","check","chest","chief","child","china","chose","civil","claim","clean","clear","click","clock",
            "close","coach","coast","could","count","court","cover","craft","crash","cream","crime","cross","crowd","crown","curve",
            "cycle","daily","dance","dated","dealt","death","debut","delay","depth","doing","doubt","dozen","draft","drama","drawn",
            "dream","dress","drill","drink","drive","drove","dying","eager","early","earth","eight","elite","empty","enemy","enjoy",
            "enter","entry","equal","error","event","every","exact","exist","extra","faith","fault","fiber","field","fifth",
            "fifty","fight","first","fixed","flash","fleet","floor","fluid","focus","force","forth","forty","forum","found",
            "frame","frank","fraud","fresh","front","fruit","fully","funny","giant","given","glass","globe","going","grace","grade",
            "grand","grant","grass","great","green","gross","group","grown","guard","guess","guest","guide","happy","harry","heart",
            "heavy","hence","henry","horse","hotel","house","human","ideal","image","index","inner","input","issue","japan","jimmy",
            "joint","jones","judge","known","label","large","laser","later","laugh","layer","learn","lease","least","leave","legal",
            "level","lewis","light","limit","links","lives","local","logic","loose","lower","lucky","lunch","lying","magic","major",
            "maker","march","maria","match","maybe","mayor","meant","media","metal","might","minor","minus","mixed","model","money",
            "month","moral","motor","mount","mouse","mouth","movie","music","needs","never","newly","night","noise","north","noted",
            "novel","nurse","occur","ocean","offer","often","order","other","ought","paint","panel","paper","party","peace","peter",
            "phase","phone","photo","piece","pilot","pitch","place","plain","plane","plant","plate","point","pound","power","press",
            "price","pride","prime","print","prior","prize","proof","proud","prove","queen","quick","quiet","quite","radio","raise",
            "range","rapid","ratio","reach","ready","refer","right","rival","river","robin","roger","roman","rough","round","route",
            "royal","rural","scale","scene","scope","score","sense","serve","seven","shall","shape","share","sharp","sheet","shelf",
            "shell","shift","shirt","shock","shoot","shown","sight","since","sixth","sixty","sized","skill","sleep","slide",
            "small","smart","smile","smith","smoke","solid","solve","sorry","sound","south","space","spare","speak","speed","spend",
            "spent","split","spoke","sport","staff","stage","stake","stand","start","state","steam","steel","stick","still","stock",
            "stone","stood","store","storm","story","strip","stuck","study","stuff","style","sugar","suite","sweet","table","taken",
            "taste","taxes","teach","teeth","terry","texas","thank","theft","their","theme","there","these","thick","thing","think",
            "third","those","three","threw","tight","times","tired","title","today","topic","total","touch","tough","tower","track",
            "trade","train","treat","trend","trial","tried","tries","truck","truly","trust","truth","twice","under","undue","union",
            "unity","until","upper","upset","urban","usage","usual","valid","value","video","virus","visit","vital","voice","waste",
            "watch","water","wheel","where","which","white","whole","whose","woman","women","world","worry","worse","worst","worth",
            "would","wound","write","wrong"}; 
    static int LETTERS = 5;
   
public Words(){
    
}
    // works for what its doing, but need to change it to return the solution word to GUI_W
    public String getWord(JTextField realAnswer){
        Random rand = new Random();
        String currWord; 
        int randSelect = rand.nextInt(472);
        currWord = w[randSelect];
        realAnswer.setText(currWord);
        return currWord;
    }
    
// check if word is in list
    public boolean isWord(String playerGuess){
        boolean inList = false;
        for(String listWord : w  ){
            if(listWord.equals(playerGuess)){
                return true;
            }
        }
        
        return inList;
        
    }
    
}
