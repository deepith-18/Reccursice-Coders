package RaghuSir.javaPrograms.Collections.Maps.TreeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmpMain {

    public static void main(String[] args) {


        Employee [] employees = {
                new Employee(201,"Hemanth","Test Engg"),
                new Employee(202,"Deepi","Soft Engg"),
                new Employee(203,"Deekshi","Web Engg"),
                new Employee(204,"Sara","Frontend Engg"),
                new Employee(205,"Gagana","Test Engg"),
                new Employee(206,"Logt","Soft Engg"),
                new Employee(207,"Araav","Frontend Engg"),
                new Employee(208,"Feere","Backend Engg"),
                new Employee(209,"John","Backend Engg"),
                new Employee(210,"Doe","Test Engg"),
                new Employee(211,"WASeer","Soft Engg"),
                new Employee(212,"mrrge","Test Engg"),

        };


        TreeMap<String, List<Employee>> map = new TreeMap<>();

        for (Employee employee : employees) {
            String deptartement;

            if(employee.getDept() == "Test Engg"){
                deptartement = "Test Engg";
            }else if(employee.getDept() == "Soft Engg"){
                deptartement = "Soft Engg";
            }else if(employee.getDept() == "Web Engg"){
                deptartement = "Web Engg";
            }else  if(employee.getDept() == "Frontend Engg"){
                deptartement = "Frontend Engg";
            }else if(employee.getDept() == "Backend Engg"){
                deptartement = "Backend Engg";
            }else{
                deptartement = "Unknown";
            }

            if(!map.containsKey(deptartement)){
                map.put(deptartement,new ArrayList<>());
            }

            map.get(deptartement).add(employee);
        }

        for(Map.Entry<String, List<Employee>> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue()+" = "+entry.getValue().size());
        }

    }
}
