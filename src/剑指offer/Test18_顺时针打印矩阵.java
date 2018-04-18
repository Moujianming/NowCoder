package ��ָoffer;

import java.util.ArrayList;

/**
 * 
 *2018-4-2����02:49:50
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 *  �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 */
public class Test18_˳ʱ���ӡ���� {

	public ArrayList<Integer> printMatrix(int [][] matrix) { 
		
	    int width = matrix.length;
	    int length  = matrix[0].length;
	    ArrayList<Integer> result = new ArrayList<Integer>(width*length);
	 /*   if(width==1||length==1)
	    {
	    	for(int i=0;i<width;i++)
	    	{
	    		for(int j=0;j<length;j++)
	    		{
	    			result.add(matrix[i][j]);
	    		}
	    	}
	    	return result;
	    }*/
	    
	    int width_begin = 0;
	    int length_begin = 0;
	    //int i = 0,j = 0;
	    int state = 1;
	    while(width!=0&&length!=0)
	    {
	    	if(state%4== 1&&width>=0)
	    	{
	    		for(int i=length_begin;i<length_begin+length;i++)
	    		{
	    			result.add(matrix[width_begin][i]);
	    		}
	    		width_begin++;
	    		width--;
	    	
	    	}
	    	if(state%4 == 2&&length>=0)
	    	{
	    		for(int i=width_begin;i<width_begin+width;i++)
	    		{
	    			result.add(matrix[i][length_begin+length-1]);
	    		}
	    		length--;
	    		    		
	    	}
	    	if(state%4==3&&length>=0)
	    	{
	    		for(int i = length_begin+length-1;i>=length_begin;i--)
	    		{
	    			result.add(matrix[width+width_begin-1][i]);
	    		}
	    		width--;
	    	}
	    	if(state%4==0&&width>=0)
	    	{
	    		for(int i = width+width_begin-1;i>=width_begin;i--)
	    		{
	    			result.add(matrix[i][length_begin]);
	    		}
	    		length--;
	    		length_begin++;
	    	}
	    	state++;
	    }
	    
	    return result;
    }


	//����2
		 public ArrayList<Integer> printMatrixII(int [][] array) {
		ArrayList<Integer> result = new ArrayList<Integer> ();
		if(array.length==0) return result;
		int n = array.length,m = array[0].length;
		if(m==0) return result;
		int layers = (Math.min(n,m)-1)/2+1;//����ǲ���
		for(int i=0;i<layers;i++){
		for(int k = i;k<m-i;k++) result.add(array[i][k]);//������
		for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//����������
		for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//������
		for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//����������
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] m = {{1},{3},{5},{7},{9}};
		ArrayList<Integer> printMatrix = new Test18_˳ʱ���ӡ����().printMatrix(m);
		System.out.println(printMatrix);
	}
}
