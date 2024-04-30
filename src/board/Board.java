package board;

public class Board {
    int size;
    char matrix[][];

    //constructor 
    public Board(int size)
    {
        this.size=size;
        matrix=new char[size][size];


        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                matrix[i][j] = '-';
            }
        }

    }
    public void printboardconfi()
    {
        int n=this.size;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
