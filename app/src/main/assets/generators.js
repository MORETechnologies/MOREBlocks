Blockly.JavaScript['move'] = function(block) {
  var direction = block.getFieldValue('direction');
  var speed = block.getFieldValue('speed');
  var code = JSON.stringify({
  command : "move",
  data : direction + speed
  });
  return code;
};

Blockly.JavaScript['delay'] = function(block) {
  var time = block.getFieldValue('time');
  var code = JSON.stringify({
  command : "sleep",
  data : time
  });
  return code;
};