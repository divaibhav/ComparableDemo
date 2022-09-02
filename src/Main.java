public class Main {
    public static void main(String[] args) {
        Address callingObject = new Address();
        callingObject.setName("vaibhav");
        callingObject.setCity("Bhopal");
        callingObject.setStreet("Kolar");
        callingObject.setCountry("India");
        callingObject.setZipCode(123456);

        Address argumentObject = new Address();
        argumentObject.setName("vaibhavqqq");
        argumentObject.setCity("Bhopal");
        argumentObject.setStreet("Kolar");
        argumentObject.setCountry("India");
        argumentObject.setZipCode(111111);

        int result = callingObject.compareTo(argumentObject);
        if(result == 0){
            System.out.println("both object are similar");
        }else if(result > 0 ){
            System.out.println("calling object is greater");
        }else{
            System.out.println("calling object is smaller than argument object");
        }

    }
}
