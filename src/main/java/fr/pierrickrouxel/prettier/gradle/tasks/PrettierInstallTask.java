package fr.pierrickrouxel.prettier.gradle.tasks;

import com.github.gradle.node.npm.task.NpmTask;

/**
 * Prettier Install Task.
 */
public abstract class PrettierInstallTask extends NpmTask {

  /**
   * The name of the task.
   */
  public static final String TASK_NAME = "prettierInstall";
  /**
   * The description of the task.
   */
  public static final String TASK_DESCRIPTION = "Install prettier in project.";

  /**
   * Install prettier and prettier-plugin-java as dev dependencies.
   */
  public PrettierInstallTask() {
    super();
    setDescription(TASK_DESCRIPTION);
    getArgs()
      .addAll("install", "--save-dev", "prettier", "prettier-plugin-java");
  }
}
