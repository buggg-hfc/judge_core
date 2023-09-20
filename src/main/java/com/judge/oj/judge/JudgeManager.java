package com.judge.oj.judge;

import com.judge.oj.judge.codesandbox.model.JudgeInfo;
import com.judge.oj.judge.strategy.DefaultJudgeStrategy;
import com.judge.oj.judge.strategy.JavaLanguageJudgeStrategy;
import com.judge.oj.judge.strategy.JudgeContext;
import com.judge.oj.judge.strategy.JudgeStrategy;
import com.judge.oj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
