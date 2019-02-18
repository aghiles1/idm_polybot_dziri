package Polybot.polybot.aspects;

import Polybot.polybot.aspects.IfObstacleDetectedAspectIfObstacleDetectedAspectProperties;
import Polybot.polybot.aspects.InstructionAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.IfObstacleDetected;

/**
 * Si on detect un obstacle
 */
@Aspect(className = IfObstacleDetected.class)
@SuppressWarnings("all")
public class IfObstacleDetectedAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final IfObstacleDetected _self) {
    final Polybot.polybot.aspects.IfObstacleDetectedAspectIfObstacleDetectedAspectProperties _self_ = Polybot.polybot.aspects.IfObstacleDetectedAspectIfObstacleDetectedAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof polybot.IfObstacleDetected){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.IfObstacleDetectedAspect._privk3_exec(_self_, (polybot.IfObstacleDetected)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "IfObstacleDetected", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final IfObstacleDetectedAspectIfObstacleDetectedAspectProperties _self_, final IfObstacleDetected _self) {
    InputOutput.<String>println("IfObstacleDetected");
  }
}
