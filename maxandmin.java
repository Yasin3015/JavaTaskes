import  java.util.Scanner;;
public class maxandmin{
    public static void main(String[] args) {
        System.err.println("Find Max and Min Value in the array : ");
        Scanner len = new Scanner(System.in);
        System.err.print("Enter the length of the array : ");
        int length = Integer.parseInt(len.nextLine());
        double theArray[] = new double[length];
        for(int i = 0 ; i < length ; i++){
            Scanner ele = new Scanner(System.in);
            System.out.print("Enter the element number " + (i+1) + " of the array : ");
            theArray[i] = Double.parseDouble(ele.nextLine());
        }
        getMaxAndMinVal obj = new getMaxAndMinVal();
        obj.maxAndMin(theArray);
    }
}
class getMaxAndMinVal{
    public void maxAndMin( double array[]) {
        double sortedArray[] = array;
        double Variable = 0;
        for(int i = 0 ; i < sortedArray.length ; i++){
            for(int j = i ; j < sortedArray.length ; j++ ){
                if(sortedArray[i]>sortedArray[j]){
                    Variable = sortedArray[j];
                    sortedArray[j]=sortedArray[i];
                    sortedArray[i] = Variable;
                }
            }
        }
        System.err.println("The minimum value is : " + sortedArray[0] + "\n");
        System.err.println("The maxmum value is : " + sortedArray[(sortedArray.length)-1]);
    }
}