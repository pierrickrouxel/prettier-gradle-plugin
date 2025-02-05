package fr.pierrickrouxel.prettier.gradle.tasks;

import org.gradle.language.base.plugins.LifecycleBasePlugin;

import com.github.gradle.node.npm.task.NpxTask;

public abstract class PrettierCheckTask extends NpxTask {

  public static final String TASK_GROUP =
    LifecycleBasePlugin.VERIFICATION_GROUP;
  public static final String TASK_NAME = "prettierCheck";
  public static final String TASK_DESCRIPTION =
    "Check project format with prettier --check.";

  public PrettierCheckTask() {
    super();
    setGroup(TASK_GROUP);
    setDescription(TASK_DESCRIPTION);
    dependsOn(PrettierInstallTask.TASK_NAME);
    getCommand().value("prettier");
    getArgs().addAll(".", "--check");
  }
}
