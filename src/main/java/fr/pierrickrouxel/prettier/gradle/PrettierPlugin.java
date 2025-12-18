package fr.pierrickrouxel.prettier.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.language.base.plugins.LifecycleBasePlugin;

import com.github.gradle.node.NodeExtension;
import com.github.gradle.node.NodePlugin;

import fr.pierrickrouxel.prettier.gradle.tasks.PrettierCheckTask;
import fr.pierrickrouxel.prettier.gradle.tasks.PrettierInstallTask;
import fr.pierrickrouxel.prettier.gradle.tasks.PrettierWriteTask;

/**
 * Prettier Gradle Plugin.
 */
public class PrettierPlugin implements Plugin<Project> {

  @Override
  public void apply(Project project) {
    project.getPlugins().apply(NodePlugin.class);
    project.getExtensions().configure(NodeExtension.class, nodeExtension -> {
      nodeExtension.getDownload().set(true);
    });

    project
      .getTasks()
      .register(PrettierInstallTask.TASK_NAME, PrettierInstallTask.class);
    project
      .getTasks()
      .register(PrettierCheckTask.TASK_NAME, PrettierCheckTask.class);
    project
      .getTasks()
      .register(PrettierWriteTask.TASK_NAME, PrettierWriteTask.class);

    // Make sure there's a `check` task
		project.getPlugins().apply(LifecycleBasePlugin.class);

    project
      .getTasks().named(LifecycleBasePlugin.CHECK_TASK_NAME)
      .configure(task -> task.dependsOn(PrettierCheckTask.TASK_NAME));
  }
}
