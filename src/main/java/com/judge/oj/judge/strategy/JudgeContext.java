package com.judge.oj.judge.strategy;

import com.judge.oj.judge.codesandbox.model.JudgeInfo;
import com.judge.oj.model.dto.question.JudgeCase;
import com.judge.oj.model.entity.Question;
import com.judge.oj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
