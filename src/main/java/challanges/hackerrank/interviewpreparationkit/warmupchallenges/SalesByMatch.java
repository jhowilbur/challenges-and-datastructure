package challanges.hackerrank.interviewpreparationkit.warmupchallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SalesByMatch {

    // https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        System.out.println(sockMerchant(9, ar));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        List<Integer> sortedList = ar.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < ar.size(); i++) {
            int iPlus = i+1;
            if (sortedList.size()-1 < iPlus) break;

            for (int j = iPlus; Objects.equals(sortedList.get(i), sortedList.get(j)); j++) {
                count++;
                break;
            }
            i = iPlus;
        }
        return count;
    }
}
