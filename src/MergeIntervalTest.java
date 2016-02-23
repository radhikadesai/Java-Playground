import org.junit.Test;

/**
 * Created by radhikadesai on 22/02/2016.
 */
public class MergeIntervalTest {
    @Test
    public void itTestsForMerging(){
        //given
        Interval i= new Interval(3,11);
        Interval i2= new Interval(17,25);
        Interval i3= new Interval(58,73);
        Interval i4= new Interval(6,18);
        Interval i5= new Interval(40,47);

        i.next=i2;i2.next=i3;
        i4.next=i5;
        //when
        MergeInterval m= new MergeInterval();
        Interval mergedList = m.mergeIntervals(i,i4);
        //then
        //it should give me --- output
        while(mergedList!=null) {
            System.out.print(" "+mergedList.getStart()+","+mergedList.getEnd());
            mergedList=mergedList.next;
        }
       /* assert mergedList.getStart()==3;
        assert mergedList.getEnd()==25;
        assert mergedList.next.getStart()==40;
        assert mergedList.next.getEnd()==47;
        assert mergedList.next.next.getStart()==58;
        assert mergedList.next.next.getEnd()==73;*/
    }
}
