package org.jl.jlhellospringbootstarterconfigure.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 纪磊
 * 2022/6/3 23:16
 * HelloProperties
 * 用途:
 * 版本： 1.0
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
   private String prefix;
   private  String  suffix;

 public String getPrefix() {
  return prefix;
 }

 public void setPrefix(String prefix) {
  this.prefix = prefix;
 }

 public String getSuffix() {
  return suffix;
 }

 public void setSuffix(String suffix) {
  this.suffix = suffix;
 }
}
