class MultidimensionalArrays
{
    public static void main(String args[])
    {
        int arr[][] = {{2,7,9},{1,3,5},{6,7,9}};

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Element at index "+i+","+j+" is : "+ arr[i][j]);
            }
            System.out.println();
        }
    }
}