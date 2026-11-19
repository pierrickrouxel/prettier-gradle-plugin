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
   * The pinned version of Prettier to install.
   */
  public static final String PRETTIER_VERSION = "3.10.1";
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
      .addAll("install", "--save-dev", "--save-exact", "prettier@" + PRETTIER_VERSION, "prettier-plugin-java");
  }
}
