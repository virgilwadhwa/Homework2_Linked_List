
public class Track {

    private Train head=null;
    private Train tail=null;
    private Train cursor=null;
    private Track next=null;
    private Track prev=null;
    private double utilizationNumber;
    int trackNumber;

    public void setNext(Track node){
        this.next=node;
    }

    public void setPrev(Track node){
        this.prev=node;
    }

    public void setUtil(int util){
        this.utilizationNumber=util;
    }

    public void setTrackNumber(int trackNo){
        this.trackNumber=trackNo;
    }


    public Track getNext(){
        return this.next;
    }
    public Track getPrev(){
        return this.prev;
    }

    public double getUtilNumber(){
        return this.utilizationNumber;
    }

    public int getTrackNumber(){
        return this.trackNumber;
    }

    public void insertNode(Train nextTrain){
        Train node = new Train();
        node=nextTrain;

        if(head==null){
            head=node;
            tail=node;
        }

        if(node.getarrivalTime()<head.getarrivalTime()){
            node.setNext(head);
            head.setPrev(node);
            if(head.getNext()==null){tail = head;}
            head=node;
            cursor=head;
            //System.out.println("I am printing" + cursor.getNext().getarrivalTime());
        }

        Train temp1=null;
        Train temp3=head;
        while(temp3!= null && node.getarrivalTime()>temp3.getarrivalTime()){
            temp1=temp3;
            if(temp3.getNext()!=null && node.getarrivalTime()<temp3.getNext().getarrivalTime()){
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

    public void printList(){
        Train temp2=head;
        while(temp2!=null){
            System.out.println(temp2.getarrivalTime());
       temp2=temp2.getNext();
        }
    }

    public void printReverseList() {
        Train temp2 = tail;
        while (temp2 != null) {
            System.out.println(temp2.getarrivalTime());
            temp2 = temp2.getPrev();
        }
    }

    @Override
    public String toString(){
        return this.getTrackNumber() + " " +this.getUtilNumber();
    }

    public void printSelectedTrain(){
        System.out.println(cursor.toString());
    }

    public boolean selectNextTrain()  {
    if(cursor.getNext()!=null){cursor=cursor.getNext(); return true;}
    else{return false;
    }
    }

    public boolean SelectPrevTrain(){
        if(cursor.getPrev()!=null){cursor=cursor.getPrev(); return true;}
        else{return false;
            //throw exception;
        }
    }

    public Train removeSelectedTrain(){
        Train temp1=head;
        Train temp2=head;
        while(temp1!=cursor){
             temp1=temp1.getNext();
        }

        temp2=temp1;
        temp1.getPrev().setNext(temp1.getNext());
        temp1.getNext().setPrev(temp1.getPrev());
        return temp2;
    }


}