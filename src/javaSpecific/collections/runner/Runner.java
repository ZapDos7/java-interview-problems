package javaSpecific.collections.runner;

import javaSpecific.collections.problems.Problem;
import javaSpecific.collections.problems.problem1.PatternMatchingProblem;
import javaSpecific.collections.problems.problem2.ReverseOrderProblem;
import javaSpecific.collections.problems.problem3.CalculateAverageProblem;
import javaSpecific.collections.problems.problem4.WordsWithCharsProblem;
import javaSpecific.collections.problems.problem5.IndicesOfSumProblem;

import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        List<Problem> problems = List.of(
                new PatternMatchingProblem(),
                new ReverseOrderProblem(),
                new CalculateAverageProblem(),
                new WordsWithCharsProblem(),
                new IndicesOfSumProblem()
        );

        problems.stream()
                .sorted(Comparator.comparingInt(Problem::getId))
                .forEach(problem -> {
                    System.out.println("=== Problem " + problem.getId() + " ===");
                    problem.run();
                });
    }
}
