package perry_4_game;

import java.util.Scanner;

public class Perry_4_Game {
    static Scanner answers = new Scanner(System.in);
    static Scanner A = new Scanner(System.in);
    static Scanner B = new Scanner(System.in);
    static Scanner C = new Scanner(System.in);
    static Scanner D = new Scanner(System.in);
    static Scanner E = new Scanner(System.in);
    static Scanner F = new Scanner(System.in);
    static Scanner G = new Scanner(System.in);
    static Scanner H = new Scanner(System.in);
    static Scanner J = new Scanner(System.in);
    static Scanner K = new Scanner(System.in);
    static Scanner L = new Scanner(System.in);
    static Scanner M = new Scanner(System.in);
    static Scanner N = new Scanner(System.in);
    static Scanner O = new Scanner(System.in);
    static Scanner P = new Scanner(System.in);
    static Scanner Q = new Scanner(System.in);
    static Scanner R = new Scanner(System.in);
    static Scanner S = new Scanner(System.in);
    static Scanner T = new Scanner(System.in);
    static Scanner U = new Scanner(System.in);
    static Scanner V = new Scanner(System.in);
    static Scanner W = new Scanner(System.in);
    static Scanner X = new Scanner(System.in);
    static Scanner Y = new Scanner(System.in);
    static Scanner Z = new Scanner(System.in);
    static Scanner A1 = new Scanner(System.in);
    static Scanner B1 = new Scanner(System.in);
    static Scanner C1 = new Scanner(System.in);
    static Scanner D1 = new Scanner(System.in);
    static Scanner E1 = new Scanner(System.in);
    static Scanner F1 = new Scanner(System.in);
    static Scanner G1 = new Scanner(System.in);
    static Scanner H1 = new Scanner(System.in);
    static Scanner I1 = new Scanner(System.in);
    static Scanner J1 = new Scanner(System.in);
    static Scanner K1 = new Scanner(System.in);
    static Scanner L1 = new Scanner(System.in);
    static Scanner M1 = new Scanner(System.in);
    static Scanner N1 = new Scanner(System.in);
    static Scanner O1 = new Scanner(System.in);
    static Scanner P1 = new Scanner(System.in);
    static Scanner Q1 = new Scanner(System.in);
    static Scanner R1 = new Scanner(System.in);
    static Scanner S1 = new Scanner(System.in);
    static Scanner T1 = new Scanner(System.in);
    static Scanner U1 = new Scanner(System.in);
    static Scanner V1 = new Scanner(System.in);
    static Scanner W1 = new Scanner(System.in);
    static Scanner X1 = new Scanner(System.in);
    static Scanner Y1 = new Scanner(System.in);
    static Scanner Z1 = new Scanner(System.in);
    static Scanner A2 = new Scanner(System.in);
    static Scanner B2 = new Scanner(System.in);
    static Scanner C2 = new Scanner(System.in);
    static Scanner D2 = new Scanner(System.in);
    static Scanner E2 = new Scanner(System.in);
    static Scanner F2 = new Scanner(System.in);
    static Scanner G2 = new Scanner(System.in);
    static Scanner H2 = new Scanner(System.in);
    static Scanner I2 = new Scanner(System.in);
    static Scanner J2 = new Scanner(System.in);
    static Scanner K2 = new Scanner(System.in);
    static Scanner L2 = new Scanner(System.in);
    static Scanner M2 = new Scanner(System.in);
    static Scanner N2 = new Scanner(System.in);
    static Scanner O2 = new Scanner(System.in);
    static Scanner P2 = new Scanner(System.in);
    static Scanner Q2 = new Scanner(System.in);
    static Scanner R2 = new Scanner(System.in);
    static Scanner S2 = new Scanner(System.in);
    static String answer;
    static boolean game;
    
    public static void main(String[] args) {
        A();
    }
    
    public static void A() {
        System.out.println("Do you want to play a game?");
        answer = B.nextLine().toLowerCase();
        if(answer.contains("y")) {
            System.out.println("Great, let's go!");
            D();
        }else if (answer.contains("n")) {
            System.out.println("Bye!");
        }else {
            System.out.println("I don't understand.");
            A();
        }
    }
    
    public static void D() {
        System.out.println("You come across two doors. The right one says, None shall enter, and the left one says, Enter if you dare. Which door shall you pick?");
        answer = E.nextLine().toLowerCase();
        if(answer.contains("l")) {
            System.out.println("You've entered the door on the left.");
            G();
        } else if (answer.contains("r")) {
            System.out.println("You open the right door.");
            B2();
        }else {
            System.out.println("Please answer the question.");
            D();
        }
    }
    
    public static void G() {
        System.out.println("The door slams shut. Lights flicker on and there is a chest and another door saying, You'll not survive. Do you want to leave without looking into the chest, or pick whatever is in the chest and open the door?");
        answer = H.nextLine().toLowerCase();
        if(answer.contains("l")) {
            System.out.println("You've left without checking the chest.");
            K();
        } else if (answer.contains("p")) {
            System.out.println("You grab a flashlight out of the chest.");
            V1();
        } else {
            System.out.println("Please answer the question.");
            G();
        }
    }
    
    public static void K() {
        System.out.println("You walk through the door and a faded light above the door turns on, what awaits you is complete darkness and you can't see a thing, but you do hear a small sound, you can't make it out but what it sounds like is something scratching against metal and whispering to you, look what you have done. Do you want to walk forward or stand still?");
        answer = M.nextLine().toLowerCase();
        if(answer.contains("f")) {
            System.out.println("You walk into the darkness.");
            N();
        } else if (answer.contains("s")) {
            System.out.println("You stand still in the light and you hear a laugh and see strange green gas flowing into you on the floor, you start coughing and getting weak, you reach for the knob but you get dragged into the darkness. You've lost. Sorry.");
            A();
        } else {
            System.out.println("Please answer the question.");
            K();
        }
    }
    
    public static void N() {
        System.out.println("You hear bones cracking and a screaming child. Do you want to run back or continue walking forward.");
        answer = P.nextLine().toLowerCase();
        if(answer.contains("w")) {
            System.out.println("You've decided to continue walking");
            S();
        } else if (answer.contains("r")) {
            System.out.println("You've decided to run back");
            Q();
        } else {
            System.out.println("Please answer the question.");
            N();
        }
    }
    
    public static void Q() {
        System.out.println("You hear is loud pounding from behind you. You try ignoring it and running away from it but something catches you and drags you into a dark hole and something crushes you. You lost, please try again or a different way.");
        A();
    }
    
    public  static void S() {
        System.out.println("You walking into the blinding darkness, not aware of what is in front of you. You feel a cold hand rub against you back and causes you to jump forward a little and hit a wall. Do you want to follow this wall to the left or to the right?");
        answer = U.nextLine().toLowerCase();
        if(answer.contains("r")) {
            System.out.println("You start rubbing to the right of the wall.");
            V();
        } else if (answer.contains("l")) {
            System.out.println("You start rubbing to the left of the wall.");
            H1();
        } else {
            System.out.println("Please answer the question.");
            S();
        }
    }
    
    public  static void V() {
        System.out.println("Moving your hand up and down the right side of the wall, you come across a wooden texture, you then realize it is a door and you start trying to find the knob, once you've found it you think weither to open the door or to just stay in the room with whatever is out there.");
        answer = U.nextLine().toLowerCase();
        if(answer.contains("o")) {
            System.out.println("You open the door.");
            A1();
        } else if (answer.contains("s")) {
            System.out.println("You hear a loud pounding from behind you and reaches for your neck and strangles you until you stop moving and breathing. You've died, sorry.");
            A();
        } else {
            System.out.println("Please answer the question.");
            V();
        }
    }
    
    public  static void A1() {
        System.out.println("Opening the door, the lights turn on and there is no windows or other doors, but you do find a few years supply for you to live there if you decide to stay here or if you decide to turn around.");
        answer = U.nextLine().toLowerCase();
        if(answer.contains("s")) {
            System.out.println("You've decide to stay here and live what is left or your life in the room that was designed for you to live. You eat and drink regularly and you hear a lock from the door and a voice saying that you will never come out. So you continue living there, hearing laughs and faint cries for help, which concern you who else could be in this hell hole with you. You die 10 years later from diseases and insanity. You won the game, The 'Lone life' ending. There are different endings that you can choose from, please explore if you'd like.");
            A();
        } else if (answer.contains("l")) {
            System.out.println("You've decided to turn around and closed the door behind you and you hear a lock and a laugh saying, Fool. You could've lived staying in the room I made for you. But no, you decide to turn around and 'leave' me here. Well I won't let you live long enough, you then start to cough and feel your lungs getting hard. You hear someone laughing as you start to slowly die from a gas they've sprayed into the room.");
            A();
        } else {
            System.out.println("Please answer the question.");
            A1();
        }
    }
    
    public  static void H1() {
        System.out.println("Moving your hand up and down the left side of the wall, you come across a wooden texture, you then realize it is a door and you start trying to find the knob, once you've found it you think weither to open the door or to just stay in the room with whatever is out there.");
        answer = U.nextLine().toLowerCase();
        if(answer.contains("o")) {
            System.out.println("You open the door.");
            M1();
        } else if (answer.contains("s")) {
            System.out.println("You hear a loud pounding from behind you and reaches for your neck and strangles you until you stop moving and breathing. You've died, sorry.");
            A();
        } else {
            System.out.println("Please answer the question.");
            H1();
        }
    }
    
    public  static void M1() {
        System.out.println("Opening the door, the lights turn on and there is no windows or other doors, but you do find a few years supply for you to live there if you decide to stay here or if you decide to turn around.");
        answer = U.nextLine().toLowerCase();
        if(answer.contains("s")) {
            System.out.println("You've decide to stay here and live what is left or your life in the room that was designed for you to live. You eat and drink regularly and then a female falls from the roof. You run over and help her up and she can't remember anything. You decide to tell her that you've been down here with no way out and that she could be stuck there too. You two get along well, a few fights here and there, but end up growing old and dying of old age. Thank you for playing the game. You found The 'Welcome to Hell' ending.");
            A();
        } else if (answer.contains("l")) {
            System.out.println("You've decided to turn around and closed the door behind you and you hear a lock and a laugh saying, Fool. You could've lived staying in the room I made for you. But no, you decide to turn around and 'leave' me here. Well I won't let you live long enough, you then start to cough and feel your lungs getting hard. You hear someone laughing as you start to slowly die from a gas they've sprayed into the room.");
            A();
        } else {
            System.out.println("Please answer the question.");
            A1();
        }
    }
    
    public static void V1() {
        System.out.println("You walk through the door and you shine the light down the room and see two doors, you start walking but see the roof open up and green gas slowly crawling down, will you run to the right door or to the left door?");
        answer = H.nextLine().toLowerCase();
        if(answer.contains("r")) {
            System.out.println("You charge at the right door.");
            A2();
        } else if (answer.contains("l")) {
            System.out.println("You charge at the left door.");
            Z1();
        } else {
            System.out.println("Please answer the question.");
            V1();
        }
    }
    
    public static void Z1() {
        System.out.println("You charge for the left door but you then hear locking and a laugh, You try to open the door but you can't budge it open, you slowly try to make it to the right door but before you could make it, you collapse and die from posionous gas. Try again.");
        A();
    }
    
    public static void A2() {
        System.out.println("You charge for the right door and hear faint cries for help, you make it to the door and swing it open and close the door, you hear someone behind you and you shine your light down towards them, it looks like a lady and she smiles and thanks you for coming into the room, you hear a lock from behind the door and she explains that there is no way out and she has supplies that could last you two for a few years, you start freaking out but after a few weeks you calm down, realizing that there was no way out and you and the lady have to stay down there for the rest of your life. You have completed the 'Panic Attack' ending. Please find all the ending if you like the game.");
        A();
    }
    
    public static void B2() {
        System.out.println("You find a knife and a note saying, Kill her, on a table next to the next room. Do you want to take the knife with you or leave without it?");
        answer = H.nextLine().toLowerCase();
        if(answer.contains("t")) {
            System.out.println("You take the knife with you.");
            E2();
        } else if (answer.contains("l")) {
            System.out.println("You leave without the knife and move to the next room.");
            K2();
        } else {
            System.out.println("Please answer the question.");
            B2();
        }
    }
    
    public static void E2() {
        System.out.println("You hear a loud screaming, you quickly turn around, noticing a female standing right behind you with a knife in her hand and screams at you. You get ready to either strike at her or let her strike first.");
        answer = H.nextLine().toLowerCase();
        if(answer.contains("w")) {
            System.out.println("She lunges at you and you strike with your knife as she is charging at you, you hear the screaming stop and blood running down your hand. You've killed the witch, you run out of the place and never return to the haunted place again. You have acheived the 'Murder' ending. Please go back and finish all the endings.");
            A();
        } else if (answer.contains("f")) {
            System.out.println("You charge at her and she swings around with the knife, before you can back up quick enough, she digs the knife into your chest and laughs at your decision and kicks you away. Always let the enemy strike first... You've died from the witch.");
            A();
        } else {
            System.out.println("Please answer the question.");
            E2();
        }
    }
    
     public static void K2() {
        System.out.println("When you walk through the door, you find blood spilled everywhere on the floor. You find a hole in the wall and another door, and what you can make out, you see a shadow and lights flickering from behind the door. Do you want to see what is behind the door, or go through the wall?");
        answer = H.nextLine().toLowerCase();
        if(answer.contains("w")) {
            System.out.println("You crawl through the hole and check what is in it.");
            N2();
        } else if (answer.contains("d")) {
            System.out.println("You ignore the wall and open the door checking what/who is behind the door.");
            S2();
        } else {
            System.out.println("Please answer the question.");
            K2();
        }
    }
    
    public static void N2() {
        System.out.println("You crawl through the hole into the wall and you reach the end finding a letter in a bloody hand, saying sorry to someone. Do you want to save the letter for later or leave without it?");
        answer = H.nextLine().toLowerCase();
        if(answer.contains("t")) {
            System.out.println("You pick the letter up and hold it in your hand as you crawl back out.");
            V2();
        } else if (answer.contains("l")) {
            System.out.println("You leave without the letter and crawl back out the door.");
            Q2();
        } else {
            System.out.println("Please answer the question.");
            N2();
        }
    }
    
    public static void Q2() {
        System.out.println("You left without the letter and go back to the door, when you open it you find a girl crying saying that it is all your fault, before you can say anything, she attacks you with a knife, stabbing into you over and over. You are left defenceless and end up dying. You've lost, please try again.");
        A();
    }
     
    public static void V2() {
        System.out.println("You take the letter that was covered in blood, and go to the door, before you open the door you hear crying, and whispers but arent to sure what it is saying, so without any other choice, you open the door and find a girl crying saying it was your fault, she looks at you with her watery eyes and sees a note in your hand. You give her the note and you hear that she is feeling better, she takes you by the hand and lead you out of the hell hole into an opening on the side of the mountian and says to go and not come back. You leave without saying anything and are left to find your way home. You've acheived the 'Welcome Home.' ending, please look back and see which ones you have missed.");
        A();
    }
    
    public static void S2() {
        System.out.println("You walk to the door and hear someone whispering something, when you open it you find a girl crying saying that it is all your fault, before you can say or do anything, she attacks you with a knife, stabbing into you over and over as she cries. You fall to the floor with the first strike, unsure what as happened and are left defenceless and end up dying. Please try again.");
        A();
    }
}
