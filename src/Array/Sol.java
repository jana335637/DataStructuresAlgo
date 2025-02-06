package Array;

import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);num.add(2); num.add(3);num.add(4);num.add(5);num.add(6);num.add(7);num.add(8);
        num.stream().filter((val -> val % 2 == 0)).map(val -> val*3).forEach(System.out::println);
        //{1, 2, 0, 4, 3, 0, 5, 0}
        //{1, 2, 4, 3, 5, 0, 0, 0}
        printArray(moveZeroes(new int[]{1, 2, 0, 4, 3, 0, 5, 0}));
    }
    public static int[] moveZeroes(int[] nums) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        while(i<nums.length){
            nums[i++]=0;
        }
        return nums;
    }
    static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    //Spring
    // REST API
    // ROle: rbac:
    // OncePerRequestFilter : User: doFilter (chain.filter) , return 403: /emplyee/*
    // /create, //
    // Interceptor
    // timeline, iam, orders, docker, no of
    // SUP, :
    // PR develop: RE team : Rehearsal, Smoke, : Prod : liquibase, alpha, ->  beta, :
    // AWS : EC2
    // Shipmett , order,
    // Rabbitmq:
    // Consumers: Consi, Throttling: sliding wind ratelimitj, 1min, :
    // clinet1 : 100/Min  thr : 1000/min:
    // UI, TDI/BDI :
    // CI/CD :solo, : commit Id, promote, union :deve: union: : sonarqube (snyk, smells, optimi, &&, || , ): < 80 :
    // ale, sre_al, slow queries, explain : ,  1/2, PErf suite, dynatrace:
    // Apache camel: Migration : BS :: --> conect: Db: data ex: vali : modif: Employee : 123 , Pay, 401k, : -> push
    // Cross team : Func O2O linking, ModMed: Java, spring, JSP :
    // API Gateway(Auth, Rate) : Load balancer: error, round
    //
}
