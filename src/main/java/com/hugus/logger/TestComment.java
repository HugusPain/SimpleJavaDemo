package com.hugus.logger;

import java.util.logging.Logger;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName TestComment
 * @Description Just Test Comment Func
 * @Author hugus
 * @Date 2022/8/1 21:37
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2022/8/1 21:37     V1.0           Initial class
 */
public class TestComment {

    /**
     * @Description //TODO
     * @Author HugusPain
     * @Date 2022/8/1 21:37
     * @param args
     * @returnType void
    */
    public static void main(String[] args) {
        Logger log = Logger.getLogger("TestComment");
        log.info("Just Test");
    }
}

