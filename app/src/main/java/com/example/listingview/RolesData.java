package com.example.listingview;

import java.util.ArrayList;

public class RolesData {
    public static String[][] data = new String[][]{
            {"Kikyo", "Limited from Inuyasha Event", "https://vignette.wikia.nocookie.net/onmyoji/images/4/4a/319skin1.png/revision/latest?cb=20190201110422", "...To live is to die. To die is to live. My name is Kikyō. I am a priestess who is unable to leave this world and reach the sacred place. No, that is not entirely the truth. Once I was a priestess. Now I am but a corpse with a cursed, false existence. No matter how much I desire to do good and help others, the truth is I live off the souls of the dead. Pure is impure. Impure is pure. Good is evil. Evil is good. Or is it?"},
            {"Futakuchi", "9888 Coins or 38 Tickets", "https://vignette.wikia.nocookie.net/onmyoji/images/a/af/263skin1.png/revision/latest?cb=20170220213620", "You'll know this spirit by her constant apologies. She wants nothing more than to make friends. But everyone she gets close to disappears, one by one. She has no idea why. She knows she didn't do anything to them. Unbeknownst to her, there is something truly strange on the back of her head. Whatever you do, don't look at it... or you'll regret it."},
            {"Kanko", "888 Gold or 18 Tickets", "https://vignette.wikia.nocookie.net/onmyoji/images/1/17/236skin1.png/revision/latest?cb=20170401022022", "This fox spirit lives in a narrow bamboo pipe. Like a friend, or perhaps a pet, it is always loyally by its master's side. When needed, it always steps up to protect its master. Not just any fox can become a Kanko, but having any fox at one's side always brings happiness and peace of mind."},
            {"Jikikaeru", "1888 Gold or 18 Tickets", "https://vignette.wikia.nocookie.net/onmyoji/images/7/7a/250skin1.png/revision/latest?cb=20170220220813", "This frog spirit spends its time sitting on a porcelain pot. It often says that gambling is the only thing that gives life meaning. Deep down, it knows that gambling can't give it everything it wants. It is very protective of what it treasures and jealous of what it desires. In this respect, it is just like a human."},
            {"Hakuro", "Free Login Bonus", "https://onmyojiguide.com/wp-content/uploads/2017/01/White-Wolf-Onmyoji-Shikigami-300x300.png", "When I first transformed, a sorcer saved my life. That filthy monster opened its gaping jaws and I thought that I would be the end of me. But the sorceror's arrow pierced the monster's throat. The huge beast came crashing down. Behind me, the sorcerer still had his bow raised."},
            {"Youko", "9888 Coins or 38 Tickets", "https://vignette.wikia.nocookie.net/onmyoji/images/8/8a/254skin1.png/revision/latest?cb=20170401223239", "A male fox spirit who wears a mask and carries a fan. Refined and polite, he always conducts himself with noble bearing. He is a fount of knowledge on many topics and likes to talk to anyone who will listen. He is not exactly how he seems, however. Whether you're a human or a spirit, it is best to be on your guard around him."},
            {"Komatsu", "12888 Coins or 48 Tickets", "https://onmyojiguide.com/wp-content/uploads/2018/01/Squirrelly-Onmyoji-Shikigami.png", "Sigh! Here comes another group of humans! You humans are such strange beings. I've told you explicitly that this forest is dangerous, and that you should never come anywherenear here. But still you insist on barging into our land of spirits, time and time again. You wrongly assume you're safe here just because how peaceful it seems."},
            {"Kubinashi", "12888 Coins or 48 Tickets", "https://en.onmyojigame.com/pc/fab/20171211105017/data/shishen_big_beforeAwake/244.png", "I walk with my head bowed, and look around, but there’s nowhere to go. I knew where to go, once. I have a good sense of direction, so I’m never lost. Be it the path for my feet, or the path for my heart, I stay true. In an age ravaged by war, a good man must fight for his country. I didn’t hesitate to join the war effort. I became a military courier. My keen sense of direction always got me to my destination quickly. The officers soon recognized that I was a reliable courier; wherever they sent me, I never got lost."},
            {"Chin", "5888 Gold or 38 Tickets", "https://onmyojiguide.com/wp-content/uploads/2018/01/Snake-Eater-2-Onmyoji-Shikigami.png", "His lips turned purple and his skin started to swell. He looked at me. Eyes filled with fear. He opened his mouth, shivering, but not a single word came out. \"I told you from the beginning, didn't I ?\" I looked at him. \"These resplendent feathers are lethal.\" He lost his focus. And then, there was silence, \"... The feather of Chin, the feather of mine.\"."},
            {"Miketsu", "12888 Coins or 48 Tickets", "https://vignette.wikia.nocookie.net/onmyoji/images/1/13/304skin1.png/revision/latest?cb=20171220053232", "Before I embarked on my voyage, the Master came to talk to me, \"Kyoto is no longer the serene and beautiful place it once was. The place you're heading for is a living hell. Are you prepared for that?\" I looked at his dignified yet cold face and replied firmly, \"I understand.\" But my hands were sweating so that I could barely hold my bow. The Master sighed and said, \"If you are ever in danger, run for your life. Your mission is to be there when everything is over. To bring new life and blessings to that ruined place. But until the time comes, you must hide well and protect yourself.\" I was about to say something, but he continued, \"I will protect you when it is necessary.\" I held tight my bow and nodded in silence."},
    };

    public static ArrayList<Roles> getListData(){
        Roles roles = null;
        ArrayList<Roles> list = new ArrayList<>();
        for (String[] aData : data) {
            roles = new Roles();
            roles.setName(aData[0]);
            roles.setRemarks(aData[1]);
            roles.setPhoto(aData[2]);
            roles.setDeskrip(aData[3]);

            list.add(roles);
        }
        return list;
    }
}
