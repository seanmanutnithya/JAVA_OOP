package lab02;

// part2
public  class Model{
    // #2.11
    public static void main(String[] aStrings){
        IDCard idc = new IDCard();
        idc.cardNumber = 000001;
        idc.name = "Nithya";
        idc.issuedDate = "12-Dec-2020";
        idc.expireDate = "12-Dec-2030";
        idc.dob = "12-Dec-2000";

        FacebookPost fbp = new FacebookPost();
        fbp.postID = 0001;
        fbp.postUrl = "facebook.come";
        fbp.postDate = "21-Oct-2026";
        fbp.like = 1000000;
        fbp.title = "My familiy trip";
        fbp.desc = "I visited Koh Rong";

        Phone ph = new Phone();
        ph.userID = 1001;
        ph.phoneNum = 12345678;
        ph.userName = "Sean";
        ph.MONs = "Smart";
        ph.registerDate = "2026-10-21";

        IDCard[] idcArr = new IDCard[1];
        idcArr[0] = idc;

        FacebookPost[] fbpArr = new FacebookPost[1];
        fbpArr[0] = fbp;

        Phone[] phArr = new Phone[1];
        phArr[0] = ph;


    }

}
class IDCard{
    int cardNumber;
    String name;
    String issuedDate;
    String expireDate;
    String dob;
}
class FacebookPost{
    int postID;
    String postUrl;
    String postDate;
    int like;
    String title;
    String desc;
}
class Phone{
    int userID;
    int phoneNum;
    String userName;
    String MONs;
    String registerDate;
}
class Book{
    String title;
    double price;
    String produceDate;
    int page;
    String desc;
}