package fr.pierrickrouxel.prettier.gradle.tasks;

import org.gradle.language.base.plugins.LifecycleBasePlugin;

import com.github.gradle.node.npm.task.NpxTask;

/**
 * Prettier Write Task.
 */
public abstract class PrettierWriteTask extends NpxTask {

  /**
   * The group of the task.
   */
  public static final String TASK_GROUP =
    LifecycleBasePlugin.VERIFICATION_GROUP;
  /**
   * The name of the task.
   */
  public static final String TASK_NAME = "prettierWrite";
  /**
   * The description of the task.
   */
  public static final String TASK_DESCRIPTION =
    "Format project with prettier --write.";

  /**
   * Apply prettier --write to the whole project.
   */
  public PrettierWriteTask() {
    super();
    setGroup(TASK_GROUP);
    setDescription(TASK_DESCRIPTION);
    dependsOn(PrettierInstallTask.TASK_NAME);
    getCommand().value("prettier");
    getArgs().addAll(".", "--write");
  }
}
