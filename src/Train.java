public class Train {
   private Train next=null;
    private Train prev=null;
    int trainNumber;
   private String destination;
   private int arrivalTime;
   private int transferTime;



    public Train() {


    }

    public Train(int arrival) {
        this.arrivalTime=arrival;

    }

    public Train(int train, String destin, int arrival, int transfer) {
        this.arrivalTime=arrival;
        this.destination=destin;
        this.transferTime=transfer;
        this.trainNumber=train;
    }

    public void setNext(Train n) {
        this.next = n;
    }

    public void setPrev(Train n) {
        this.prev = n;
    }


    public int getarrivalTime(){
         return this.arrivalTime;
    }

    public Train getNext(){
        return this.next;
    }
    public Train getPrev(){
        return this.prev;
    }

    public int getTrainNumber(){
        return this.trainNumber;
    }

    public int getTransferTime(){
        return this.transferTime;
    }

    public String getDestination(){
        return this.destination;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Train tr = (Train)obj;
        return this.trainNumber == tr.trainNumber;
    }

    @Override
    public String toString(){
        return this.getTrainNumber() + " " +this.getarrivalTime() + " " + this.getTransferTime()+this.getDestination();
    }
}


