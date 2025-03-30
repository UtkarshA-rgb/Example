import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {





        List<Integer> Name = List.of(1,2);
        String name  = "Utkarsh Amin";
        int sum = Name.stream().mapToInt(x -> x ).sum();
        System.out.println(sum);

        Map<Character, Integer> frq = new HashMap<>();















//        //String name = "Utkarsh Amin";
//        List<String> listOfName = List.of("Utkarsh", "James", "Brian", "Jamie","Aakash");
//        Map<Character, Integer> freq = new HashMap<>();
//
//        listOfName.forEach((eachName) -> {
//            System.out.println("For name as " + eachName + ":");
//            String lowercaseName = eachName.toLowerCase();
//            for (int i = 0; i < lowercaseName.length(); i++){
//                char c  = lowercaseName.charAt(i);
//                freq.put(c, freq.getOrDefault(c,0) +1);
//            }
//            freq.forEach((key, value) -> System.out.println("char :" + key + " Frequency : " + value));
//            freq.clear();
//        });


//        for (int i = 0; i < name.length(); i++){
//            char c  = name.charAt(i);
//            freq.put(c, freq.getOrDefault(c,0) +1);
//        }
//
//        freq.forEach((key, value) -> System.out.println(key + "-"+ value ));


//       Runnable objRunnable = () -> {
//           System.out.printf("Thread of the runnable." + Thread.currentThread().getName());
//
//           try {
//               Thread.sleep(5000);
//           } catch (InterruptedException e) {
//               throw new RuntimeException(e);
//           }
//       };
//
//       Thread objThread = new Thread(objRunnable,"Using Runnable interface");
//       objThread.start();

        /************************************ Executor Service  *******************************************************/
//        // single thread executor services
//        ExecutorService
//        = Executors.newSingleThreadExecutor();
//        System.out.println("Single Thread Executor: ");
//
//        for(int i = 1; i <= 5; i++){
//            final int taskId = i;
//            singleThreadExecutor.execute(()-> {
//                System.out.println("Single Thread Task " + taskId + " Executed by " + Thread.currentThread().getName());
//            });
//        }
//
//        singleThreadExecutor.shutdown();
//
//        // fixed thread executors
//        ExecutorService FixThreadExecutor = Executors.newFixedThreadPool(3);
//        System.out.println("Single Thread Executor: ");
//
//        for(int i = 1; i <= 5; i++){
//            final int taskId = i;
//            FixThreadExecutor.execute(()-> {
//                System.out.println("Fixed Thread Task " + taskId + " Executed by " + Thread.currentThread().getName());
//            });
//        }
//
//        FixThreadExecutor.shutdown();
//
//        // cached thread executors
//        ExecutorService CachedThreadExecutor = Executors.newCachedThreadPool();
//
//
//        for(int i = 1; i <= 5; i++){
//            final int taskId = i;
//            CachedThreadExecutor.execute(()-> {
//                System.out.println("cached Thread Task " + taskId + " Executed by " + Thread.currentThread().getName());
//            });
//        }
//        CachedThreadExecutor.shutdown();

    }



}