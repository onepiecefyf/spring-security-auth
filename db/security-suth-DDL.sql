DROP TABLE if EXISTS `user_info`;
CREATE TABLE `user_info`
(
    `id`          bigint       NOT NULL COMMENT '主键',
    `username`    varchar(128) NOT NULL DEFAULT '' COMMENT '用户姓名',
    `password`    varchar(128) NOT NULL DEFAULT '' COMMENT '用户姓名',
    `create_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='注册用户基本信息';


DROP TABLE if EXISTS `persistent_logins`;
CREATE TABLE `persistent_logins`
(
    `username`    varchar(128) NOT NULL DEFAULT '' COMMENT '用户姓名',
    `series`    varchar(128) NOT NULL DEFAULT '' COMMENT '序列号',
    `token`    varchar(128) NOT NULL DEFAULT '' COMMENT 'token',
    `create_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `last_used` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`series`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='注册用户基本信息';






