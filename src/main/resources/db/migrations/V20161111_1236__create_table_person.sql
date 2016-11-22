CREATE TABLE `tgtb`.`person` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Table Identifier  ',
  `personname` VARCHAR(45) NULL COMMENT 'Person name',
  `personage` VARCHAR(45) NULL COMMENT 'Person age',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
