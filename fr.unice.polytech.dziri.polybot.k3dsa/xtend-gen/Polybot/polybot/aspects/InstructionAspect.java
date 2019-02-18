package Polybot.polybot.aspects;

import Polybot.polybot.aspects.InstructionAspectInstructionAspectProperties;
import Polybot.polybot.aspects.NamedElementAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import polybot.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public abstract class InstructionAspect extends NamedElementAspect {
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static void exec(final Instruction _self) {
    final Polybot.polybot.aspects.InstructionAspectInstructionAspectProperties _self_ = Polybot.polybot.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.IfObjectDetectedAspect
    		if (_self instanceof polybot.IfObjectDetected){
    			Polybot.polybot.aspects.IfObjectDetectedAspect.exec((polybot.IfObjectDetected)_self);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.IfObjectDetectedAspect
    	// BeginInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.MoveAspect
    		if (_self instanceof polybot.Move){
    			Polybot.polybot.aspects.MoveAspect.exec((polybot.Move)_self);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.MoveAspect
    	// BeginInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.IfObstacleDetectedAspect
    		if (_self instanceof polybot.IfObstacleDetected){
    			Polybot.polybot.aspects.IfObstacleDetectedAspect.exec((polybot.IfObstacleDetected)_self);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.IfObstacleDetectedAspect
    	// BeginInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.TakeDropObjectAspect
    		if (_self instanceof polybot.TakeDropObject){
    			Polybot.polybot.aspects.TakeDropObjectAspect.exec((polybot.TakeDropObject)_self);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.TakeDropObjectAspect
    	// BeginInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.WhileAspect
    		if (_self instanceof polybot.While){
    			Polybot.polybot.aspects.WhileAspect.exec((polybot.While)_self);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.InstructionAspect#void exec() from Polybot.polybot.aspects.WhileAspect
    // #DispatchPointCut_before# void exec()
    if (_self instanceof polybot.Instruction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.InstructionAspect._privk3_exec(_self_, (polybot.Instruction)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Instruction", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
