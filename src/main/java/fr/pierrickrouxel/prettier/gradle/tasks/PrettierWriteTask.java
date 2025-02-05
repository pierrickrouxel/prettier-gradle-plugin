package fr.pierrickrouxel.prettier.gradle.tasks;

import org.gradle.language.base.plugins.LifecycleBasePlugin;

import com.github.gradle.node.npm.task.NpxTask;

public abstract class PrettierWriteTask extends NpxTask {

  public static final String TASK_GROUP =
    LifecycleBasePlugin.VERIFICATION_GROUP;
  public static final String TASK_NAME = "prettierWrite";
  public static final String TASK_DESCRIPTION =
    "Format project with prettier --write.";

  public PrettierWriteTask() {
    super();
    setGroup(TASK_GROUP);
    setDescription(TASK_DESCRIPTION);
    dependsOn(PrettierInstallTask.TASK_NAME);
    getCommand().value("prettier");
    getArgs().addAll(".", "--write");
  }
}
