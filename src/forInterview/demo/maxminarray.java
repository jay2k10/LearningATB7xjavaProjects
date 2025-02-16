package forInterview.demo;

class maxminarray {

    static int findmax[] = {10, 324, 45, 90, 9808};

    static int max() {
        int i;
        int max = findmax[0];
        for (i = 1; i < findmax.length; i++)
            if (findmax[i] > max)
                max = findmax[i];
        return max;
    }

    static int min() {
        int i;
        int min = findmax[0];
        for (i = 1; i < findmax.length; i++)
            if (findmax[i] < min)
                min = findmax[i];
        return min;

    }

    public static void main(String[] args) {

        System.out.println("largest element is:" + max() + "\n" + "smallest element is:" + min());

    }


}
