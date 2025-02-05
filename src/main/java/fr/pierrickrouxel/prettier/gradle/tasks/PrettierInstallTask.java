package fr.pierrickrouxel.prettier.gradle.tasks;

import com.github.gradle.node.npm.task.NpmTask;

public abstract class PrettierInstallTask extends NpmTask {

  public static final String TASK_NAME = "prettierInstall";
  public static final String TASK_DESCRIPTION = "Install prettier in project.";

  public PrettierInstallTask() {
    super();
    setDescription(TASK_DESCRIPTION);
    getArgs()
      .addAll("install", "--save-dev", "prettier", "prettier-plugin-java");
  }
}
