public class HomeWork2 {

    public static void main(String[] args){

       // System.out.println(" Homework2 has started");
        //Station obj1 = new Station();
        //Track obj1 = new Track();





        Train ob= new Train(3);
        Train ob1= new Train(2);
        Train ob2= new Train(4);
        Train ob3= new Train(5);
        Train ob4= new Train(6);
        Train ob5= new Train(7);
        Train ob6= new Train(8);
        Train ob7= new Train(1);

        Track obj1= new Track();
        obj1.insertNode(ob);
        obj1.insertNode(ob1);
        obj1.insertNode(ob2);
        obj1.insertNode(ob3);
        obj1.insertNode(ob4);
        obj1.insertNode(ob5);
        obj1.insertNode(ob6);
        obj1.insertNode(ob7);
        obj1.printList();
        obj1.printReverseList();
        //obj1.removeSelectedTrain();
        //obj1.printSelectedTrain();


}

}
