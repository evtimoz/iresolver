package com.koval.jresolver.processor;

import java.util.Collection;

import com.atlassian.jira.rest.client.api.domain.Attachment;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.User;

public class IssueProcessingResult {

  private Issue issue;
  private Collection<Issue> issues;
  private Collection<String> labels;
  private Collection<User> users;
  private Collection<Attachment> attachments;
  private Collection<String> advices;

  public Issue getIssue() {
    return issue;
  }

  public void setIssue(Issue issue) {
    this.issue = issue;
  }

  public Collection<Issue> getIssues() {
    return issues;
  }

  public void setIssues(Collection<Issue> issues) {
    this.issues = issues;
  }

  public Collection<String> getLabels() {
    return labels;
  }

  public void setLabels(Collection<String> labels) {
    this.labels = labels;
  }

  public Collection<User> getUsers() {
    return users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
  }

  public Collection<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(Collection<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Collection<String> getAdvices() {
    return advices;
  }

  public void setAdvices(Collection<String> advices) {
    this.advices = advices;
  }
}
