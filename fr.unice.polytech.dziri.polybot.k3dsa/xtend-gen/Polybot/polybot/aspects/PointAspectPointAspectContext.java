package Polybot.polybot.aspects;

import Polybot.polybot.aspects.PointAspectPointAspectProperties;
import java.util.Map;
import polybot.Point;

@SuppressWarnings("all")
public class PointAspectPointAspectContext {
  public final static PointAspectPointAspectContext INSTANCE = new PointAspectPointAspectContext();
  
  public static PointAspectPointAspectProperties getSelf(final Point _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.PointAspectPointAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Point, PointAspectPointAspectProperties> map = new java.util.WeakHashMap<polybot.Point, Polybot.polybot.aspects.PointAspectPointAspectProperties>();
  
  public Map<Point, PointAspectPointAspectProperties> getMap() {
    return map;
  }
}
