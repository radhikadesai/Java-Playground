/**
 * Created by radhikadesai on 22/02/2016.
 */
public class MergeInterval {

    public Interval mergeIntervals(Interval firstList, Interval secondList){
        Interval head=firstList;
        Interval previous=null;
        while(firstList!=null && secondList!=null){
            //no overlap
            if(secondList.getEnd()<firstList.getStart()){
                if(secondList.getEnd()<head.getStart()){
                    Interval tempSec = secondList.next;
                    secondList.next=head;
                    head=secondList;
                    secondList=tempSec;
                }
                else {
                    previous.next = secondList;
                    Interval tempSec = secondList.next;
                    secondList.next = firstList;
                    secondList = tempSec;
                }
            }
            else if(secondList.getStart()>firstList.getEnd()){
                Interval tempSec = secondList.next;
                secondList.next=firstList.next;
                firstList.next=secondList;
                secondList=tempSec;
            }
           //overlap
            else{
                int min = Math.min(firstList.getStart(),secondList.getStart());
                int max = Math.max(firstList.getEnd(),secondList.getEnd());
                firstList.setStart(min);
                firstList.setEnd(max);
                if(firstList.getEnd()>firstList.next.getStart()){
                    firstList.setEnd(firstList.next.getEnd());
                    //delete firstList.next
                    firstList.next=firstList.next.next;
                }
                secondList=secondList.next;
            }
            previous=firstList;
            firstList=firstList.next;
        }
        return head;
    }
}
