CREATE TABLE `merchants` (
                             `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                             `name` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '商戶名稱',
                             `logo_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT '商户 logo',
                             `business_license_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT '商戶營業執照',
                             `phone` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '商戶聯繫電話',
                             `address` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '商戶地址',
                             `is_audit` BOOLEAN NOT NULL COMMENT '是否通過審核',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;