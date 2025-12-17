package fr.pierrickrouxel.prettier.gradle.tasks;

import org.gradle.language.base.plugins.LifecycleBasePlugin;

import com.github.gradle.node.npm.task.NpxTask;

/**
 * Prettier Check Task.
 */
public abstract class PrettierCheckTask extends NpxTask {

  /**
   * The group of the task.
   */
  public static final String TASK_GROUP =
    LifecycleBasePlugin.VERIFICATION_GROUP;
  /**
   * The name of the task.
   */
  public static final String TASK_NAME = "prettierCheck";
  /**
   * The description of the task.
   */
  public static final String TASK_DESCRIPTION =
    "Check project format with prettier --check.";

  /**
   * Apply prettier --check to the whole project.
   */
  public PrettierCheckTask() {
    super();
    setGroup(TASK_GROUP);
    setDescription(TASK_DESCRIPTION);
    dependsOn(PrettierInstallTask.TASK_NAME);
    getCommand().value("prettier");
    getArgs().addAll(".", "--check");
  }
}
