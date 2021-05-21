public class Station{

    private Track head=null;
    private Track tail=null;
    private Track cursor=null;

    public Station(){

    }

    public void addTrack(Track newTrack){

        Track node = new Track();
        node=newTrack;

        if(head==null){
            head=node;
            tail=node;
        }

        if(node.getTrackNumber()<head.getTrackNumber()){
            node.setNext(head);
            head.setPrev(node);
            if(head.getNext()==null){tail = head;}
            head=node;
            cursor=head;
            //System.out.println("I am printing" + cursor.getNext().getarrivalTime());
        }

        Track temp1=null;
        Track temp3=head;
        while(temp3!= null && node.getTrackNumber()>temp3.getTrackNumber()){
            temp1=temp3;
            if(temp3.getNext()!=null && node.getTrackNumber()<temp3.getNext().getTrackNumber()){
                node.setNext(temp3.getNext());
                node.setPrev(temp3);
                temp1.setNext(node);
                temp1.getNext().setPrev(node);
                //cursor=node;
            }
            temp3=temp3.getNext();
            //cursor=cursor.getNext();
        }
        if(temp3==null){
            temp1.setNext(node);
            node.setPrev(temp1);
            //cursor=node;
            tail=node;
        }
        //tail=temp3;
        cursor=head;
    }
    @Override
    public String toString(){
        Track obj1 = new Track();
        obj1=head;
        String consolidated = "";
        //Station Obj2=null;
        while(obj1!=null){
        consolidated =  consolidated + obj1.toString() + "\n";
        obj1=obj1.getNext();
        }
        return consolidated;
    }

    public void printSelectedTrack(){
        System.out.println(cursor.toString());
    }
/*
    public boolean selectNextTrack(){
        if(cursor.getNext()!=null){cursor=cursor.getNext(); return true;}
        else{return false;
            //throw exception;
        }
    }


    public boolean SelectPrevTrack(){
        if(cursor.getPrev()!=null){cursor=cursor.getPrev(); return true;}
        else{return false;
            //throw exception;
        }
    }

 */

    public boolean selectTrack(int trackToSelect){
        Track object1=head;
        while(object1.getTrackNumber()!=trackToSelect)
        {
            object1=object1.getNext();
        }
        if(object1==null){
            return false;
        }
        else
        {cursor=object1;
        return true;}
    }




    public Track removeSelectedTrack() {
        Track object1=cursor;
        object1.getNext().setPrev(object1.getPrev());
        object1.getPrev().setNext(object1.getNext());


        return object1;
    }

    }


