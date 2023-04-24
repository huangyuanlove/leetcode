package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class ContainsDuplicate_ii_219 {

    public static void main(String[] args) {

//        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
//        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
        new ContainsDuplicate_ii_219().a_containsNearbyDuplicate(new int[]{1,0,1,1},1);
    }


    public  boolean a_containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1){
            return false;
        }
        if(k==0){
            return false;
        }


        HashTable hashTable = new HashTable(k);
        for (int i = 0;i<k && i<nums.length;i++){
            if(!hashTable.add(nums[i])){
                return true;
            }
        }
        for(int i = k; i<nums.length ;i++){


            if(hashTable.add(nums[i])){
                hashTable.remove(nums[i-k]);
            }else{
                return true;

            }


        }
        return false;




    }


    class HashTable {
        int k;
        Integer hash[];
        public HashTable(int k) {
            this.k = k;
            hash = new Integer[k];
        }
        public boolean add(int num){
            int hashValue = hash(num);
            if(hash[hashValue]==null){
                hash[hashValue] = num;
                return true;
            }else{
                if(hash[hashValue] == num){
                    return false;
                }else{
                    while (hash[hashValue] != null){
                        if(hash[hashValue] == num){
                            return false;
                        }else{
                            hashValue++;
                        }
                    }
                    hash[hashValue] = num;
                    return true;
                }
            }
        }
        public void remove(int num){
            int hashValue = hash(num);
            if(hash[hashValue] != null){
                if(hash[hashValue] == num){
                    hash[hashValue] = null;
                }else{
                    while (hash[hashValue] ==null || hash[hashValue]!= num ){
                        hashValue++;
                    }
                    hash[hashValue] = null;
                }


            }
        }

        public int hash(int num){
            return num % k;
        }

    }





    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1){
            return false;
        }
        if(k==0){
            return false;
        }
        HashMap<Integer, Object> map = new HashMap<>();
        for (int i = 0;i<k && i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],null);
            }
        }
        for(int i = k; i<nums.length ;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.remove(nums[i-k]);
                map.put(nums[i],null);

            }
        }

        return false;

    }
}
