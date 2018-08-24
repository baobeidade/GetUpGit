package shellSort;

// shellSort.java
// demonstrates shell sort
// to run this program: C>java ShellSortApp
//--------------------------------------------------------------
class ArraySh {
    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items

    //--------------------------------------------------------------
    public ArraySh(int max)           // constructor
    {
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }

    //--------------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }

    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++)    // for each element,
            System.out.print(theArray[j] + " ");  // display it
        System.out.println("");
    }

    //--------------------------------------------------------------
    public void shellSort() {
        int inner, outer;
        long temp;

        int h = 1;                     // find initial value of h
        while (h <= nElems / 3)
            h = h * 3 + 1;                // (1, 4, 13, 40, 121, ...)

        while (h > 0)                     // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }  // end for
            h = (h - 1) / 3;              // decrease h
        }  // end while(h>0)
    }  // end shellSort()


    function shellSort(arr) {
        var len = arr.length,
                temp,
                gap = 1;
        while (gap < len / 3) {          // 动态定义间隔序列
            gap = gap * 3 + 1;
        }
        for (gap; gap > 0; gap = Math.floor(gap / 3)) {
            for (var i = gap; i < len; i++) {
                temp = arr[i];
                for (var j = i - gap; j > 0 && arr[j] > temp; j -= gap) {
                    arr[j + gap] = arr[j];
                }
                arr[j + gap] = temp;
            }
        }
        return arr;
    }

    void shellSort(vector<int> &nums) {
        int n = nums.size();
        int gap, i, j;

        for (gap = n / 2; gap > 0; gap /= 2) {
            //插入排序简洁写法
            for (i = gap; i < n; i++) {
                int num = nums[i];
                for (j = i - gap; j >= 0 && nums[j] > num; j -= gap)
                    nums[j + gap] = nums[j];
                nums[j + gap] = num;
            }
        }
    }

//--------------------------------------------------------------
}  // end class ArraySh

////////////////////////////////////////////////////////////////
class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 10;             // array size
        ArraySh arr;
        arr = new ArraySh(maxSize);   // create the array

        for (int j = 0; j < maxSize; j++)  // fill array with
        {                          // random numbers
            long n = (int) (Math.random() * 99);
            arr.insert(n);
        }
        arr.display();                // display unsorted array
        arr.shellSort();              // shell sort the array
        arr.display();                // display sorted array
    }  // end main()
}  // end class ShellSortApp
////////////////////////////////////////////////////////////////
