package csu.noname.system_backend.VO;

import lombok.Data;

@Data
public class ScoreVO {
    private Integer courseId;

    private Integer studentId;

    private double totalScore;

    private double userScore;

    private double finalScore;

    private double usualPercentage;

    private double finalPercentage;
}
