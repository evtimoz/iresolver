package com.koval.jresolver.common.api.configuration.bean;

import com.koval.jresolver.common.api.configuration.bean.reporters.HtmlReporterConfiguration;
import com.koval.jresolver.common.api.configuration.bean.reporters.TextReporterConfiguration;


public class ReportersConfiguration {

  private HtmlReporterConfiguration html;
  private TextReporterConfiguration text;

  public HtmlReporterConfiguration getHtml() {
    return html;
  }

  public void setHtml(HtmlReporterConfiguration html) {
    this.html = html;
  }

  public TextReporterConfiguration getText() {
    return text;
  }

  public void setText(TextReporterConfiguration text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "ReportersConfiguration{"
        + "html=" + html
        + ", text=" + text
        + '}';
  }
}